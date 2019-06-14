import json
import web3
import datetime
# import sys
# sys.path.append(r'F:\study\code\blockchain\connect')
from web3 import Web3, HTTPProvider
from easysolc import Solc
# from . import readlog

class ReadLog :
    maxnode=0
    json_txt = []
    def readlog(self):
        with open('..\\5.json',"r") as f:
            load_dict = json.load(f)
            # print(load_dict[100]["_source"]["layers"]["frame"]["frame.time"])
            for i in load_dict:
                if int(i["_source"]["layers"]["ip"]["ip.src_host"]) > int(self.maxnode):
                    self.maxnode=int(i["_source"]["layers"]["ip"]["ip.src_host"])
                jsonobj = {}
                jsonobj["from"]= i["_source"]["layers"]["ip"]["ip.src_host"]
                jsonobj["time"]=int(round(float(i["_source"]["layers"]["frame"]["frame.time"])*10000))
                jsonobj["data"] = i["_source"]["layers"]["data"]["data.data"]
                self.json_txt.append(jsonobj)
            print (self.maxnode)
            print(self.json_txt)
starttime = datetime.datetime.now()
contractAddr=""
contract = ""
w3 = ""
compile1 = False
carnum = 4;
# 准备
def prepare():
    global w3
    w3 = Web3(HTTPProvider("http://localhost:8545"))
    w3.eth.defaultAccount = w3.eth.accounts[0]

# 编译和部署contract
def deploy():
    global contract
    global contractAddr
    solc = Solc()
    # 编译智能合约并放在当前目录
    solc.compile('..\\finallast.sol', output_dir='.')
    # 获取智能合约实例
    contract = solc.get_contract_instance(w3=w3, abi_file='.\\Final.abi', bytecode_file='.\\Final.bin')
    # 部署智能合约
    tx_hash = contract.constructor().transact()
    tx_receipt = w3.eth.waitForTransactionReceipt(tx_hash)
    # 获得智能合约部署在链上的地址
    contractAddr = tx_receipt.contractAddress
    # 写入文本文件
    with open("..\\contract address.txt", 'w') as f:
        f.write(contractAddr)
    print(tx_receipt.contractAddress)
    # 获取实例
    contract = solc.get_contract_instance(w3=w3, abi_file='.\\final.abi', bytecode_file='.\\final.bin',
                                          address=contractAddr)
# 通过合约地址获取contract
def getContract():
    global contract
    with open(".\\Final.abi", 'r') as f:
        ERC20_ABI = json.load(f)
        contract = w3.eth.contract(address=contractAddr, abi=ERC20_ABI)
# 操作
#添加车
def addCarToSystem(_no):
    tx_hash = contract.functions.addNewCar(_no,w3.eth.accounts[_no]).transact()
    print("start")
    w3.eth.waitForTransactionReceipt(tx_hash)
    print("end")
    # print('Default contract greeting: {}'.format(
    #     contract.functions.getAmount().call()
    # ))
    # print('Default contract greeting: {}'.format(
    #     contract.call().carAmountInSystem()
    # ))
#
def initialHead():

    tx_hash = contract.functions.transact()
    w3.eth.waitForTransactionReceipt(tx_hash)

# 查询是否已经部署
def checkAddr():
    global contractAddr
    with open("..\\contract address.txt", 'r', encoding='utf-8') as f:
        line0 = f.readline()
        print(line0)
    if line0 == "":
        return False
    else:
        contractAddr = line0
        return True

def changeAccount(addr):
    w3.eth.defaultAccount = addr

# def readLog():
#     with open("..\\log.txt","r",encoding='utf-8') as f:
#         lines = f.readlines()
#     operation(lines)

def operation(_time,_no):
    changeAccount(w3.eth.accounts[_no])
    contract.functions.addTime(_time, _no).transact()



if __name__ == '__main__':
    prepare()
    if False == checkAddr():
        deploy()
    getContract()
    w3.eth.sendTransaction({"from": w3.eth.accounts[0], "to": contractAddr, "value": 50342342300000000000});
    # contract.functions.pay().transact()

    # print('Default contract greeting: {}'.format(
    #     contract.functions.showbalance().transact()
    # ))

    # print('Default contract greeting: {}'.format(
    #     contract.functions.transfer1(w3.eth.accounts[3]).transact()
    # ))

    readlog = ReadLog()
    readlog.readlog()
    # tx=contract.functions.set_carAmount(int(readlog.maxnode),4).transact()
    num = int(readlog.maxnode)
    print("num="+str(num))
    for i in range(1, num+1):
        contract.functions.addNewCar(i,w3.eth.accounts[i]).transact()
    contract.functions.addClusterHead(1).transact()
    for i in range(2,num+1):
        contract.functions.addClusterMember(i,1).transact()


    # w3.eth.waitForTransactionReceipt(tx)
    print(contract.call().CarAmount())
    for log in readlog.json_txt:
        print(log)
        operation(int(log["time"]), int(log["from"]))
    contract.functions.exitCluster(1,w3.eth.accounts[1]).transact()
    endtime = datetime.datetime.now()
    print(str((endtime - starttime).seconds)+"seconds")
    # tx =contract.functions.sendMoney(w3.eth.accounts[2]).transact()
    # w3.eth.waitForTransactionReceipt(tx)
    # print(contract.call().T(3))

    # hashs = contract.transact({
    #     'from': web3.eth.accounts[0],
    #     'gas': 702438,
    # }).sendCoin('<insert account 2 here>', 231)
    #changeAccount(w3.eth.accounts[1])
    # log = readLog()
    # contract.functions.addCarToSystem(3).transact()
    # addCarToSystem(1)

    # with open("IncentiveMechanism.abi", 'r') as f:
    #     ERC20_ABI = json.load(f)
    #     contract = w3.eth.contract(address=w3.eth.accounts[1], abi=ERC20_ABI)
    # print(w3.eth.accounts[1])
    # addCarToSystem()
    # print(contract.all_functions())
    # print(w3.personal.newAccount('1'))
    # print("accountAmount"+"  "+str(len(w3.personal.listAccounts)))
    # w3.miner.start(2)





#include "client.h"
#include"some.h"
#include<qDebug>
#include<qstring.h>
void Client:: print1()//测试用输出
{

    cout<<cardno<<endl;
}
string Client:: returnname()//接口函数返回姓名
{
    return name;
}
string Client:: returncardno()//接口函数返回卡号
{
    return cardno;
}
string Client:: returnbankname()//接口函数返回银行名
{
    return bankname;
}
string Client::  returnpassword()//接口函数返回密码
{
    return password;
}
int Client:: returnbankno()//接口函数返回银行编号
{
    return bankno;
}
double Client:: returnmoney()//接口函数返回金额
{
    return money;
}

void Client:: changepassword() //改密码
{
    cout << "请输入6位密码，只允许数字,回车结束" << endl;
    char c;
    string s;

    while (1)
    {
        cin >> s;
        if (s.size() != 6)
            {
                cout << "输入不满6位，重新输入" << endl;
                continue;
            }
        if (!isnum1(s))
        {
            cout << "不是全数字，请重新输入" << endl;
            continue;
        }
        break;
    }
    password = s;
    cout << "\n成功！" << endl;
    _sleep(750);
    system("Cls");
}
void Client:: initial(string name1, string cardno1,string bankname1,string password1,int bankno1,double money1) //初始化个人数据
{
    name = name1;
    cardno = cardno1;
    bankname = bankname1;
    password = password1;
    bankno = bankno1;
    money = money1;
}
void Client:: save()//存钱（整数存）
{
    string k;
    int y;
    while (1)
    {
        cout << "输入要存的钱 只能是整数字" << endl;
                cin >> k;
                if (!isnum1(k))
                {
                    cout << "输入有误" << endl;
                    continue;
                }
                stringstream z;
                z << k;
                z >> y;
                money = money + y;
                break;
    }
    cout << "\n成功！" << endl;
    _sleep(750);
    system("Cls");
}
void Client:: withdraw()//取钱
{

    string k;
    int y;
    while (1)
    {
        cout << "输入要取的钱 只能是整数字" << endl;
        cin >> k;
        if (!isnum1(k))
        {
            cout << "输入有误" << endl;
            continue;
        }
        stringstream z;
        z << k;
        z >> y;
        if ((money - y) < 0)
        {
            cout << "您的余额不足" << endl;
            break;
        }

        money = money - y;
        cout << "\n成功！" << endl;
        break;
    }
    _sleep(750);
    system("Cls");

}
void Client:: showperson()//显示个人信息
{
    cout << "姓名："<<this->name<<"\t"<<"余额：" << this->money<<"\t"<<"银行："<<this->bankname<<"\t"<<"卡号:"<<this->cardno<<endl;
}

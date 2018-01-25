#include"getdater.h"
#include"client.h"
#include<sstream>
#include <algorithm>
#include<QString>
string stringchange;
string bankcheck(int n)//通过银行号找到银行
{
    vector<string> a;
    a.push_back ("光明");
    a.push_back ( "正大");
    a.push_back ( "邮政");
    auto k = a.begin();//当前的银行位置
    for (int i = 1; i < n; i++)
    {
        k++;
    }
    return *k;
}
bool mysort( Client &v1,  Client &v2)//自定义排序这里是根据银行号排序
{
    return v1.returnbankno() < v2.returnbankno();
}
void GetDate( vector<Client>& user) //从文件获取数据
{

    vector<string> value;
    string linestring;
    ifstream IN("S:\\aboutcode\\c++\\C++(1)\\bank.txt");
    if (!IN.is_open())
    {
        cout << "未成功打开文件" << endl;
        exit(0);
    }
    while (getline(IN, linestring))
    {
        value.push_back(linestring);
    }
    auto valuein = value.begin();//读取当前的使用人数
    auto kkk=value.begin();
    stringstream test11;
    string test22;
   for(;kkk != value.end();kkk++)
    {
       stringchange+=*kkk;
       stringchange+="#";
    }
    string usernum1;
    stringstream ss;
    usernum1 = *valuein;
    ss << usernum1;
    ss >> usernum;
    cout << usernum << endl;
    for (valuein++; valuein != value.end(); valuein++) //valuein是控制循环的auto参数
    {
        cout << *valuein;
        string s;
        s = *valuein;
        cout << s<< endl;
        char Name1[20];
        char CardNo1[20];
        char BankName1[10];
        char Password1[20];
        int BankNo;
        double Money;
        const char *p = s.data();
        sscanf(s.c_str(), "%s %s %s %s %d %lf", Name1,CardNo1,BankName1,Password1,&BankNo,&Money);//使用格式化读入将值文本的一行读出.
        string Name(Name1);
        string CardNo(CardNo1);
        string BankName(BankName1);
        string Password(Password1);
        Client A(Name,CardNo,BankName,Password,BankNo,Money);
        user.push_back(A);
    }
    sort(user.begin(), user.end(), mysort);//按银行号排序
    for (std::vector<Client>::iterator it = user.begin(); it != user.end(); it++)
        {
            it->print1();
        }
    IN.close();
}

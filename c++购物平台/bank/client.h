#ifndef CLIENT_H
#define CLIENT_H
#include<iostream>
#include<vector>
#include<sstream>
using namespace std;
extern int usernum;
class Client
{
    private:
            string name; //名字
            string cardno;//卡号（0，1，2·····自动生成）
            string bankname;//银行名
            string password;//密码
            int bankno;//银行编号
            double money;//余额

        public:
           explicit  Client() {}//构造函数
            explicit Client(string a, string b, string c, string d, int e, double f) :name(a), cardno(b), bankname(c), password(d), bankno(e), money(f) {}//构造函数
            void print1();//测试用输出

            string returnname();//接口函数返回姓名

            string returncardno();//接口函数返回卡号

            string returnbankname();//接口函数返回银行名

            string returnpassword();//接口函数返回密码

            int returnbankno();//接口函数返回银行编号

            double returnmoney();//接口函数返回金额


            void changepassword(); //改密码

            void initial(string name1, string cardno1,string bankname1,string password1,int bankno1,double money1) ;//初始化个人数据

            void save();//存钱（整数存）

            void withdraw();//取钱

            void showperson();//显示个人信息


};


#endif // CLIENT_H

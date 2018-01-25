#ifndef PLATFORMUSER_H
#define PLATFORMUSER_H
#include<QString>
#include"database/connection.h"
class platformuser
{
public:
     platformuser(int ,QString , QString ,double);
     platformuser(){}
     //返回私有成员的值
    int returnid();
    void setlistno(int,int);
    QString returnlogname();
    QString returnpassword();
    double returnwaitmoney();
    //写需要的钱
    void setwaitmoney(double);
private:
    int id;//database id
    QString logname; //database name
    QString password;//database password
    double waitmoney;//database money
    QSqlDatabase db;
    QSqlQuery *query;
};

#endif // PLATFORMUSER_H

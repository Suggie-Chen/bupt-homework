#include "platformuser.h"
#include<QDebug>
#include<QSqlError>
platformuser::platformuser(int a, QString b, QString c, double d)
{
     this->id=a;
    this->logname=b;
    this->password = c;
    this->waitmoney = d;
}
int platformuser::returnid()
{
    return id;
}
QString platformuser::returnlogname()
{
    return logname;
}
QString platformuser::returnpassword()
{
    return password;
}
double platformuser::returnwaitmoney()
{
    return waitmoney;
}
void platformuser ::setwaitmoney(double m)
{
    this->waitmoney=m;
}

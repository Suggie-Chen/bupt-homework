#include"goodshead/goods.h"
#include<QDebug>
#include<qsqlerror.h>
QString goods::returnname()
{
    return name;
}
int goods::returnNO()
{
    return NO;
}
int goods::returnnum()
{
    return num;
}
double goods::returnprice()
{
    return price;
}
double goods::returndiscard()
{
    return discard;
}
QString goods:: returndiscription()
{
    return discription;
}
QString goods::returntype()
{
    return type;
}
double books::getPrice()
{
    double a=returnprice();
    double b=returndiscard();
    int c=returnnum();
    return a*b*c;
}


void books::beaddtolist(platformuser* sp,int z)//加入购物车
{
    db=QSqlDatabase::database("PlatformUsers.db");
    query=new QSqlQuery(db);
    QString k=sp->returnlogname();
    QString sql_select;
    int k2=this->returnNO();
    QString k3=this->returntype();
    QString k4=this->returnname();
    int k5=this->returnnum();
    double  k6=this->returnprice();
    double k7=this->returndiscard();
    QString k8=this->returndiscription();
    sql_select=QString("INSERT INTO '%1' VALUES ('%2','%3','%4','%5','%6','%7')").arg(k).arg(k2).arg(k3).arg(z).arg(k5).arg(k6).arg(k7);
    if(query->exec(sql_select))
    {
        qDebug()<<query->lastError();
    }
}
double clothes::getPrice()
{
    double a=returnprice();
    double b=returndiscard();
    int c=returnnum();
    return a*b*c;
}

void clothes::beaddtolist(platformuser *sp,int z)//加入购物车
{
    db=QSqlDatabase::database("PlatformUsers.db");
    query=new QSqlQuery(db);
    QString k=sp->returnlogname();//数据库名
    QString sql_select;
    int k2=this->returnNO();
    QString k3=this->returnname();
    int k4=this->returnnum();
    double  k5=this->returnprice();
    double k6=this->returndiscard();
    QString k7=this->returndiscription();
    sql_select=QString("INSERT INTO '%1' VALUES ('%2','%3','%4','%5','%6','%7')").arg(k).arg(k2).arg(k3).arg(z).arg(k5).arg(k6).arg(k7);
    if(query->exec(sql_select))
    {
        qDebug()<<query->lastError();
    }
}
double snacks::getPrice()//重写函数
{
    double a=returnprice();
    double b=returndiscard();
    int c=returnnum();
    return a*b*c;
}

void snacks::beaddtolist(platformuser *sp,int z)//加入购物车
{
    db=QSqlDatabase::database("PlatformUsers.db");
    query=new QSqlQuery(db);
    QString k=sp->returnlogname();
    QString sql_select;
    int k2=this->returnNO();
    QString k3=this->returnname();
    int k4=this->returnnum();
    double  k5=this->returnprice();
    double k6=this->returndiscard();
    QString k7=this->returndiscription();
    sql_select=QString("INSERT INTO '%1' VALUES ('%2','%3','%4','%5','%6','%7')").arg(k).arg(k2).arg(k3).arg(z).arg(k5).arg(k6).arg(k7);
    if(query->exec(sql_select))
    {
        qDebug()<<query->lastError();
    }
}

#ifndef GOODS_H
#define GOODS_H
#include<iostream>
#include<QString>
#include"platformuser.h"
class goods {                    //基类
public:
        //good(no,type,name,num,price,discard,discription)
    goods(int a, QString b, QString  c, int d,double e,double f,QString g):NO(a),type(b),name(c),num(d),price(e),discard(f),discription(g){}
    goods(){}
    double virtual  getPrice(){}//重写的函数
    bool setlist(platformuser &m );
    //返回私有对象
    QString returnname();
    QString returntype();
    int returnnum();
    int returnNO();
    double returnprice();
    double returndiscard();
    QString returndiscription();
    //虚函数计入购物车
    void virtual beaddtolist(platformuser* sp){}

private:
    QString name;
    QString type;//类型
    int num;
    int NO;
    double price;
    double discard;
    QString discription;

};
class books  : public  goods {    //子类书
public:
    books(int a, QString b, QString  c, int d,double e,double f,QString g) 	:goods(a, b, c, d,e,f,g){}
    double  getPrice();
    void  beaddtolist(platformuser* sp,int z);
private:
    QSqlDatabase db;
    QSqlQuery *query;

};
class clothes : public  goods {   //子类服装
public:
    clothes(int a, QString b, QString  c, int d,double e,double f,QString g) :goods(a, b, c, d, e,f,g) {}
    double  getPrice();
   // QString returnsize();
    void  beaddtolist(platformuser* sp,int z);
private:
    QSqlDatabase db;
    QSqlQuery *query;


};
class snacks : public  goods {    //子类零食
public:
    snacks(int a, QString b, QString  c, int d,double e,double f,QString g) :goods(a, b, c, d, e,f,g) {}
    double  getPrice();    
    void  beaddtolist(platformuser* sp,int z);
private:
    QSqlDatabase db;
    QSqlQuery *query;
};
#endif // GOODS_H

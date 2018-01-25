#include "mainwindow.h"
#include <QApplication>
#include<QtSql/QSqlDatabase>
#include<QDebug>
#include<QStringList>
#include"database/connection.h"
#include"discard.h"
double dmoney;//满金额
double kmoney;//减多少
double ddiscard1;//打折率
double ddiscard2;//打折率
double ddiscard3;//打折率
int main(int argc, char *argv[])
{


    QApplication a(argc, argv);
    MainWindow w;
    if(!createConnection())
           return 1;
    QSqlDatabase db;
    QSqlQuery *query;
    db=QSqlDatabase::database("PlatformUsers.db");
    query=new QSqlQuery(db);
    query->setForwardOnly(true);
    query->exec("select *from discard");
    query->next();
    dmoney=query->value(0).toDouble();
    kmoney=query->value(1).toDouble();
    query->setForwardOnly(true);
    query->exec("select *from discardrate ");
    query->next();
    ddiscard1=query->value(0).toDouble();
    ddiscard2=query->value(1).toDouble();
    ddiscard3=query->value(2).toDouble();
    qDebug()<<"ddiscard1"<<ddiscard1;
    qDebug()<<"ddiscard2"<<ddiscard2;
    qDebug()<<"ddiscard3"<<ddiscard3;
    w.show();
    return a.exec();
}


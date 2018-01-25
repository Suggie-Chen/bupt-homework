#ifndef CONNECTION_H
#define CONNECTION_H
#include <QSqlDatabase>
#include <QSqlQuery>
#include <QSqlTableModel>
static bool createConnection()//创建数据库
{
    QSqlDatabase db1 = QSqlDatabase::addDatabase("QSQLITE");
    db1.setDatabaseName("PlatformUsers.db");//database name
    if(!db1.open()) return false;
    QSqlQuery query;
    query.exec("create table student (id INTEGER primary key , logname vchar,password vchar,waitmoney double)");
   // query.exec("insert into student values (0,'Lily','lily',)");
    //query.exec("insert into student values (1,'Jobs','jobs',)");
    //query.exec("insert into student values (2,'Robin','robin',)");

    QSqlQuery query2;
    query2.exec("create table goods (id INTEGER primary key ,type vchar,name vchar,num int,price double,discard double,description vchar)");
    query2.exec("insert into goods values (0,'book','C++ Primer',10,108.3,1,'《C++ Primer（中文版）（第5版）》所有示例均全部采用 C++11 标准改写，这在经典升级版中极其罕见——充分体现了 C++ 语言的重大进展及其全面实践。')");
    QSqlQuery query3;
    query3.exec("create table shoplist (id INTEGER primary key ,userid int,type vchar,name vchar,num int,description vchar,price double,discard double)");
    QSqlQuery query4;
    query4.exec("create table banklist (id INTEGER primary key ,userid int,cardno vchar)");
    QSqlQuery query5;
    query5.exec("create table discard ('满减金额' double,'减' double)");
    QSqlQuery query6;
    query6.exec("create table discardrate ('折扣系数book' double,'折扣系数clothes' double, '折扣系数snack' double)");
    QSqlQuery query7;
    query7.exec("create table paylist (id INTEGER primary key ,userid int,type vchar,name vchar,num int,description vchar,price double,discard double)");
    QSqlQuery query8;
    query8.exec("create table picture (id INTEGER primary key ,goodsid int,file vchar)");

    return true;
}
#endif // CONNECTION_H

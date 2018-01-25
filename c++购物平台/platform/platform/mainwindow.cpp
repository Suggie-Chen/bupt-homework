#include "mainwindow.h"
#include "ui_mainwindow.h"
#include"QString"
#include"database/connection.h"
#include <QMessageBox>
#include <QSqlError>
#include<QDebug>
#include"ui/two.h"
#include"platformuser.h"
MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{


     ui->setupUi(this);

}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_pushButton_clicked()//登陆
{

    QString m=ui->lineEdit->text();
    QString n=ui->lineEdit_2->text();
    db=QSqlDatabase::database("PlatformUsers.db");
   query=new QSqlQuery(db);
   query->setForwardOnly(true);
   QString select_sql = "select * from student ";
   if(!query->exec(select_sql))
   {
       qDebug()<<query->lastError();
   }
   else
   {

       QString name;
       QString password;
       int id;
       double waitmoney;
       while(query->next())
      {
            name = query->value(1).toString();
            password=query->value(2).toString();
          if(name==m&&password==n)
          {
               id =query->value(0).toInt();
               waitmoney=query->value(3).toDouble();
               platformuser m(id,name,password,waitmoney);
               //qDebug()<<m.returnlogname();
                 two k(m);
                 k.show();
                 k.exec();
              break;
          }
      }





   }
}

void MainWindow::on_pushButton_2_clicked()//注册
{
    db=QSqlDatabase::database("PlatformUsers.db");
   query=new QSqlQuery(db);
   query->setForwardOnly(true);
   QString m=ui->lineEdit->text();
   QString n=ui->lineEdit_2->text();
   ui->lineEdit->clear();
   ui->lineEdit_2->clear(); QString select_sql;
   if(!m.isEmpty()&&!n.isEmpty()&&m.size()>6&&m.size()<10&&n.size()==6)
   {
       select_sql=QString("select * from student where logname='%1'").arg(m);
       query->exec(select_sql);
       if(!query->next())
     {
           select_sql = QString("INSERT INTO student VALUES (null,'"+m+"', '"+n+"', 0.0)");
           if(!query->exec(select_sql))
           {
              qDebug()<<query->lastError();
           }
           else
           {
              ui->label_4->setText("success");
           }
     }
       else
       {
           QMessageBox message(QMessageBox::Warning,"警告","用户名已存在");
           message.exec();
       }

   }
   else
   {
       ui->label_4->setText("error");
   }
}

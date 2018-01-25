#include "two.h"
#include "ui_two.h"
#include <QSqlError>
#include<QString>
#include"time.h"
#include<QMessageBox>
#include"discard.h"
#include"picture.h"


two::two(platformuser &m,QWidget *parent) :
    QDialog(parent),
    ui(new Ui::two)
{
    ui->setupUi(this);
    db3=QSqlDatabase::database("PlatformUsers.db");
    query3=new QSqlQuery(db);
    query3->setForwardOnly(true);
    db4=QSqlDatabase::database("PlatformUsers.db");
    query4=new QSqlQuery(db);
    query4->setForwardOnly(true);
   sp=new platformuser(m.returnid(),m.returnlogname(),m.returnpassword(),m.returnwaitmoney());
   QString SETNUM;
   SETNUM.setNum(dmoney);
    ui->label_8->setText(SETNUM);
    SETNUM.setNum(kmoney);
    ui->label_14->setText(SETNUM);
    SETNUM.setNum(ddiscard1);
    ui->label_16->setText(SETNUM);
    SETNUM.setNum(ddiscard2);
    ui->label_18->setText(SETNUM);
    SETNUM.setNum(ddiscard3);
    ui->label_20->setText(SETNUM);
    //显示购物车
    ui->label_2->setText(m.returnlogname());
    int n=m.returnid();
    QString N1;
    N1.setNum(m.returnwaitmoney());
    ui->label_12->setText(N1);

    /*db=QSqlDatabase::database("PlatformUsers.db");
    query=new QSqlQuery(db);
    query->setForwardOnly(true);
    QString sql_select;
    sql_select=QString("select * from shoplist where userid='%1'").arg(n);
   // query->prepare(sql_select);
    //query->bindValue(":k",n);
    qDebug()<<n;
  if(!query->exec(sql_select))
  {
       qDebug()<<"购物车显示"<<query->lastError();
  }
  else
  {
      QString cc;
     while(query->next())
      {
         cc+=" 商品名: ";
         cc+=query->value(3).toString();
         cc+=" 数量";
         cc+=query->value(4).toString();
         cc+=" 单件价格";
         cc+=query->value(6).toString();
         ui->textBrowser->append(cc);
         cc="";
      }
  }*/
    model = new QSqlTableModel(this);
    model->setTable("shoplist");
    model->setEditStrategy(QSqlTableModel::OnManualSubmit);
    model->setFilter(QString("userid='%1'").arg(sp->returnid()));
    model->select(); //选取整个表的所有行
    ui->tableView_2->setModel(model);

  //显示商品
      model = new QSqlTableModel(this);
      model->setTable("goods");
      model->setEditStrategy(QSqlTableModel::OnManualSubmit);
      model->select(); //选取整个表的所有行
      ui->tableView->setModel(model);
  ;

}

two::~two()
{
    delete ui;
}

void two::on_pushButton_clicked()//刷新商品
{
    model = new QSqlTableModel(this);
    model->setTable("goods");
    model->setEditStrategy(QSqlTableModel::OnManualSubmit);
    model->select(); //选取整个表的所有行
    ui->tableView->setModel(model);
}

bool two::isDigitStr(QString src)
{
QByteArray ba = src.toLatin1();//QString 转换为 char*
const char *s = ba.data();
while(*s && *s>='0' && *s<='9') s++;
if (*s)
{ //不是纯数字
return false;
}
else
{ //纯数字
return true;
}
}
void two::on_pushButton_2_clicked()//添加购物车
{

    QString n=ui->spinBox->text();//商品个数
    ui->spinBox->clear();
    int n1=n.toInt();//转为整型
    if(!n.isEmpty()&&n1!=0)//不为空且不为0
    {

        //选择右边商品，返回商品ID
        int row = ui->tableView->currentIndex().row ();
        QAbstractItemModel *_2model = ui->tableView->model();
        QModelIndex index = _2model->index(row,0);//选中行第一列的内容
        QVariant data = _2model->data(index);
        QString k=data.toString();
        qDebug()<<"k"<<k;
        //打开数据库查商品
        db=QSqlDatabase::database("PlatformUsers.db");
        query=new QSqlQuery(db);
        query->setForwardOnly(true);
        QString sql_select;
        sql_select=QString("select * from goods where id= '%1'").arg(k);
        if(!query->exec(sql_select))
        {
           qDebug()<<"商品"<<query->lastError();
        }
        else//成功执行语句
        {
            //商品信息

            query->next();
            int a1=query->value(0).toInt();//id
            QString b1=query->value(1).toString();  //type
            QString c1=query->value(2).toString();//name
            int d1=query->value(3).toInt();//num
            double e1=query->value(4).toDouble();//price
            double f1=query->value(5).toDouble();//discard
            QString g1=query->value(6).toString();//description
            qDebug()<<"商品"<<c1;
            //打开自己购物车检查是否有此商品

            db1=QSqlDatabase::database("PlatformUsers.db");
            query1=new QSqlQuery(db);
            query1->setForwardOnly(true);
            QString sql_select1;
            sql_select1=QString("select * from shoplist where userid = '%1'and name ='%2'").arg(sp->returnid()).arg(c1);
            if(!query1->exec(sql_select1))
            {
                qDebug()<< query1->lastError();
            }
            else
            {
                if(!query1->next())
                {   if(n1<=d1)
                    {


                    sql_select1=QString("insert into shoplist values(null,'%1','%2','%3','%4','%5','%6','%7')").arg(sp->returnid()).arg(b1).arg(c1).arg(n1).arg(g1).arg(e1).arg(f1);
                    if(!query1->exec(sql_select1))
                    {
                       qDebug()<< query1->lastError();
                    }
                    else
                    {

                    }
                    }
                    else
                    {
                        ui->label_10->setText("error");
                    }
                }
                else
                {
                    int y=query1->value(4).toInt();

                      //  qDebug()<<"y"<<y;
                    if(y+n1<=d1)
                    {
                    sql_select1=QString("UPDATE shoplist SET num = '%1' WHERE name = '%2' ").arg(y+n1).arg(c1);
                    if(!query1->exec(sql_select1))
                    {
                       qDebug()<< query1->lastError();
                    }
                    else
                    {

                    }
                    }
                    else
                    {
                       ui->label_10->setText("error");
                    }
                }

            }
            qDebug()<<"检查购物车"<<sp->returnlogname();

        }//删除
    }//删除
    on_pushButton_3_clicked();
}//删除


void two::on_pushButton_3_clicked()//显示购物车
{
    model = new QSqlTableModel(this);
    model->setTable("shoplist");
    model->setEditStrategy(QSqlTableModel::OnManualSubmit);
    model->setFilter(QString("userid='%1'").arg(sp->returnid()));
    model->select(); //选取整个表的所有行
    ui->tableView_2->setModel(model);
}

void two::on_pushButton_4_clicked()//删除购物车
{
        int curRow = ui->tableView_2->currentIndex().row();
        if(curRow==-1)
        {
            QMessageBox::information(NULL, "警告", "您未选择删除的购物车");

        }
        else
        {


       //删除该行
          model = new QSqlTableModel(this);
         model->setTable("shoplist");
        model->setEditStrategy(QSqlTableModel::OnManualSubmit);
        model->select(); //选取整个表的所有行
       model->removeRow(curRow);

       int ok = QMessageBox::warning(this,tr("删除当前行!"),
                                     tr("你确定删除当前行吗？"),
                                     QMessageBox::Yes,QMessageBox::No);
       if(ok == QMessageBox::No)
       {
           model->revertAll(); //如果不删除，则撤销
       }
       else model->submitAll(); //否则提交，在数据库中删除该行
       on_pushButton_3_clicked();
}
}


void two::on_pushButton_6_clicked()//提交订单
{
    db=QSqlDatabase::database("PlatformUsers.db");
    query=new QSqlQuery(db);
    query->setForwardOnly(true);
    QString sql_select;
    sql_select=QString("select *from shoplist where userid= '%1' ").arg(sp->returnid());
    bool flaga=true;
    if(!query->exec(sql_select))
    {
        qDebug()<<query->lastError();
    }
    else
    {
        double money;
        bool flag=query->next();
        if(!flag)
        {
            ui->label_12->setText("0");

        }
        else
        {

        while(flag)
        {
          QString yyz;
          yyz=QString("select *from goods where name= '%1'").arg(query->value(2).toString());
          if(!query3->exec(yyz))
          {
              qDebug()<<"加goods"<<query3->lastError();
          }
          else
          {
              query3->next();
              int num=query3->value(3).toInt();
              if(query3->value(4).toInt()>=num)
              {
                  if(query->value(2).toString()=="book")
                    {
                      //good(no,type,name,num,price,discard,discription)
                      sp1=new books(0,"","",query->value(4).toInt(),query->value(6).toDouble(),ddiscard1,"");
                        qDebug()<<query->value(4).toInt()<<query->value(6).toDouble();
                        money+=sp1->getPrice();
                    }
                    if(query->value(2).toString()=="clothes")
                    {
                        sp2=new clothes(0,"","",query->value(4).toInt(),query->value(6).toDouble(),ddiscard2,"");
                        qDebug()<<query->value(4).toInt()<<query->value(6).toDouble();
                        money+=sp2->getPrice();
                    }
                    if(query->value(2).toString()=="snack")
                    {
                        sp3=new snacks(0,"","",query->value(4).toInt(),query->value(6).toDouble(),ddiscard3,"");
                        qDebug()<<query->value(4).toInt()<<query->value(6).toDouble();
                        money+=sp3->getPrice();
                    }

              }
              else
              {
                  flaga=false;
                  break;
              }



          }

            /*if(query->value(2).toString()=="book")
              {
                //good(no,type,name,num,price,discard,discription)
                sp1=new books(0,"","",query->value(4).toInt(),query->value(6).toDouble(),ddiscard1,"");
                  qDebug()<<query->value(4).toInt()<<query->value(6).toDouble();
                  money+=sp1->getPrice();
              }
              if(query->value(2).toString()=="clothes")
              {
                  sp2=new clothes(0,"","",query->value(4).toInt(),query->value(6).toDouble(),ddiscard2,"");
                  qDebug()<<query->value(4).toInt()<<query->value(6).toDouble();
                  money+=sp2->getPrice();
              }
              if(query->value(2).toString()=="snack")
              {
                  sp3=new snacks(0,"","",query->value(4).toInt(),query->value(6).toDouble(),ddiscard3,"");
                  qDebug()<<query->value(4).toInt()<<query->value(6).toDouble();
                  money+=sp3->getPrice();
              }*/


              flag=query->next();
        }
        if(flaga==true)
        {
            qDebug()<<"钱"<<money;
            QString cc1;
            if(money>=dmoney)
            {
                qDebug()<<money;
                money=money-kmoney;
                qDebug()<<money;
            }
            cc1.setNum(money);
            ui->label_12->setText(cc1);
            sp->setwaitmoney(money);
               sql_select=QString("update student set waitmoney= '%1'where id= '%2'").arg(money).arg(sp->returnid());
               if(!query->exec(sql_select))
               {
                   qDebug()<<query->lastError();
               }
               on_pushButton_3_clicked();

        }
        else{
            QMessageBox::information(this,"警告","商品不够");
        }


    }
}
    on_pushButton_3_clicked();
}
void two::on_pushButton_7_clicked()//撤销订单
{

    db=QSqlDatabase::database("PlatformUsers.db");
    query=new QSqlQuery(db);
    query->setForwardOnly(true);
    ui->label_12->clear();
    QString sql_select=QString("update student set waitmoney= 0 where id= '%1'").arg(sp->returnid());
    sp->setwaitmoney(0);
    if(!query->exec(sql_select))
    {
        qDebug()<<query->lastError();
    }
    ui->label_12->setText("0");
    sql_select=QString("delete from shoplist where userid= '%1'").arg(sp->returnid());
    if(!query->exec(sql_select))
    {
        qDebug()<<query->lastError();
    }
    on_pushButton_3_clicked();

}

void two::on_pushButton_8_clicked()
{
    model = new QSqlTableModel(this);
    model->setTable("goods");
    model->setEditStrategy(QSqlTableModel::OnManualSubmit);
    model->select();
    model->setFilter(QString("type = '%1'").arg("book"));
    ui->tableView->setModel(model);

}

void two::on_pushButton_9_clicked()
{
    model = new QSqlTableModel(this);
    model->setTable("goods");
    model->setEditStrategy(QSqlTableModel::OnManualSubmit);
    model->select();
    model->setFilter(QString("type = '%1'").arg("clothes"));
    ui->tableView->setModel(model);
}

void two::on_pushButton_10_clicked()
{
    model = new QSqlTableModel(this);
    model->setTable("goods");
    model->setEditStrategy(QSqlTableModel::OnManualSubmit);
    model->select();
    model->setFilter(QString("type = '%1'").arg("snack"));
    ui->tableView->setModel(model);
}

void two::on_pushButton_11_clicked()
{


}

void two::on_pushButton_5_clicked()//支付
{

}

void two::on_pushButton_12_clicked()
{
    this->close();
}

void two::on_tableView_clicked(const QModelIndex &index)
{
    qDebug()<<"index";
    qDebug()<<index.row();
    QAbstractItemModel *_3model = ui->tableView->model();
    QModelIndex index1 = _3model->index(index.row(),0);//选中行第一列的内容
    QVariant data = _3model->data(index1);
    QString k=data.toString();
    qDebug()<<"k"<<k;
    db=QSqlDatabase::database("PlatformUsers.db");
    query=new QSqlQuery(db);
    query->setForwardOnly(true);
    QString sql_select;
    sql_select=QString("select * from picture where id ='%1'").arg(k);
    QString yy;
    if(!query->exec(sql_select))
    {
        query->lastError();
    }
    else
    {
        query->next();
        yy=query->value(2).toString();
        qDebug()<<"yy"<<yy;
    }
    QPixmap myPix(yy);
     ui->label_6->setPixmap(myPix);
    ui->label_6->setScaledContents(true);
    ui->label_6->show();
}

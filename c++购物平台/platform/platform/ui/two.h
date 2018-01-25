#ifndef TWO_H
#define TWO_H

#include <QDialog>
#include"platformuser.h"
#include"database/connection.h"
#include<QDebug>
#include<QSqlTableModel>
#include"goodshead/goods.h"
#include <QImage>
#include <QGraphicsView>
#include <QGraphicsScene>
#include <QFileDialog>
namespace Ui {
class two;
}

class two : public QDialog
{
    Q_OBJECT

public:

   explicit two(platformuser &m,QWidget *parent = 0);

    ~two();
    bool isDigitStr(QString src)  ;

private slots:
    void on_pushButton_clicked();

    void on_pushButton_2_clicked();

    void on_pushButton_3_clicked();

    void on_pushButton_4_clicked();

    void on_pushButton_6_clicked();

    void on_pushButton_7_clicked();

    void on_pushButton_8_clicked();

    void on_pushButton_9_clicked();

    void on_pushButton_10_clicked();

    void on_pushButton_11_clicked();

    void on_pushButton_5_clicked();

    void on_pushButton_12_clicked();

    void on_tableView_clicked(const QModelIndex &index);

private:
    Ui::two *ui;
    //数据库指针
    QSqlDatabase db;
    QSqlQuery *query;
    QSqlDatabase db1;
    QSqlQuery *query1;
    QSqlDatabase db3;
    QSqlQuery *query3;
    QSqlDatabase db4;
    QSqlQuery *query4;
    //model指针
    QSqlTableModel * model;
    //自定义类指针
    platformuser *sp;
    books *sp1;
    clothes* sp2;
    snacks *sp3;
    QImage *image;

};

#endif // TWO_H

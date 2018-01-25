#ifndef CONNECTBANK_H
#define CONNECTBANK_H
#include"platformuser.h"
#include <QDialog>
#include <QTcpSocket>
namespace Ui {
class connectbank;
}

class connectbank : public QDialog
{
    Q_OBJECT

public:
    explicit connectbank(platformuser *s,QWidget *parent = 0);
    ~connectbank();

private:
    Ui::connectbank *ui;
    platformuser *sp;
    QTcpSocket *socket;
    QSqlDatabase db;
    QSqlQuery *query;
private slots:
     void socket_Read_Data();
     void socket_Disconnected();
    
     void on_pushButton_clicked();
     void on_pushButton_2_clicked();
};

#endif // CONNECTBANK_H

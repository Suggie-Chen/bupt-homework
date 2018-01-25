#include "_1.h"
#include "ui__1.h"

_1::_1(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::_1)
{
    ui->setupUi(this);
}

_1::~_1()
{
    delete ui;
}

void _1::on_pushButton_clicked()
{

}

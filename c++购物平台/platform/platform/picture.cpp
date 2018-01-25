#include "picture.h"
#include "ui_picture.h"

picture::picture(QString k,QWidget *parent) :
    QDialog(parent),
    ui(new Ui::picture)
{
    ui->setupUi(this);
    //resize(300,300);
    this->image = new QImage();


         QPixmap myPix(k);
        ui->label->setPixmap(myPix);
        ui->label->setScaledContents(true);
         ui->label->show();
}

picture::~picture()
{
    delete image;
    delete ui;
}

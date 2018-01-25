#include "mainwindow.h"
#include"getdater.h"
#include"client.h"
#include<vector>
#include <QApplication>
int usernum;
int main(int argc, char *argv[])
{
    QApplication a(argc, argv);

    MainWindow w;
    vector<Client> b;
    GetDate(b);
    w.show();

    return a.exec();
}

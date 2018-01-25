#include "mainwindow.h"
#include "ui_mainwindow.h"
#include"_1.h"
#include <QtNetwork>
#include"getdater.h"
MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    tcpServer = new QTcpServer(this);
    // 使用了IPv4的本地主机地址，等价于QHostAddress("127.0.0.1")
        if (!tcpServer->listen(QHostAddress::LocalHost, 6666)) {
            qDebug() << tcpServer->errorString();
            close();
        }
        connect(tcpServer, &QTcpServer::newConnection,
                this, &MainWindow::sendMessage);
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_pushButton_clicked()
{
    _1 b;
    b.show();
    b.exec();
}
void MainWindow::sendMessage()
{
    // 用于暂存要发送的数据
    QByteArray block;
    QDataStream out(&block, QIODevice::WriteOnly);


    // 设置数据流的版本，客户端和服务器端使用的版本要相同
    out.setVersion(QDataStream::Qt_5_6);
    out << (quint16)0;
    QString y=QString::fromStdString(stringchange); ;
    out << y;
    out << (quint16)(block.size() - sizeof(quint16));


    // 获取已经建立的连接的套接字
    QTcpSocket *clientConnection = tcpServer->nextPendingConnection();
    connect(clientConnection, &QTcpSocket::disconnected,
            clientConnection, &QTcpSocket::deleteLater);
    // clientConnection->write(block);
    clientConnection->write(block);
    clientConnection->disconnectFromHost();

    // 发送数据成功后，显示提示
  //  ui->label->setText(tr("成功!!!"));
}

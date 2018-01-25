#ifndef MAINWINDOW_H
#define MAINWINDOW_H
class QTcpServer;
#include <QMainWindow>
extern int usernum;
namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = 0);
    ~MainWindow();

private slots:
    void on_pushButton_clicked();
     void sendMessage();

private:
    Ui::MainWindow *ui;
    QTcpServer *tcpServer;
};

#endif // MAINWINDOW_H

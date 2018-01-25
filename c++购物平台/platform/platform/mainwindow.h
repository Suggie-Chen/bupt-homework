#ifndef MAINWINDOW_H
#define MAINWINDOW_H
#include"database/connection.h"
#include <QMainWindow>

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

    void on_pushButton_2_clicked();

private:
    Ui::MainWindow *ui;
   // QSqlTableModel *model;
        QSqlDatabase db;
        QSqlQuery *query;
        QSqlDatabase db1;
        QSqlQuery *query1;

};

#endif // MAINWINDOW_H

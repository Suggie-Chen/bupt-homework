#ifndef _1_H
#define _1_H

#include <QDialog>
extern int usernum;
namespace Ui {
class _1;
}

class _1 : public QDialog
{
    Q_OBJECT

public:
    explicit _1(QWidget *parent = 0);
    ~_1();

private slots:
    void on_pushButton_clicked();

private:
    Ui::_1 *ui;
};

#endif // _1_H

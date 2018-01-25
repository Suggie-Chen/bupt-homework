#ifndef PICTURE_H
#define PICTURE_H
#include <QImage>
#include <QGraphicsView>
#include <QGraphicsScene>
#include <QFileDialog>
#include <QDialog>

namespace Ui {
class picture;
}

class picture : public QDialog
{
    Q_OBJECT

public:
    explicit picture(QString k,QWidget *parent = 0);
    ~picture();

private:
    Ui::picture *ui;
    QImage *image;
};

#endif // PICTURE_H

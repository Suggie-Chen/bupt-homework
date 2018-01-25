/********************************************************************************
** Form generated from reading UI file 'picture.ui'
**
** Created by: Qt User Interface Compiler version 5.9.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_PICTURE_H
#define UI_PICTURE_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>

QT_BEGIN_NAMESPACE

class Ui_picture
{
public:
    QLabel *label;

    void setupUi(QDialog *picture)
    {
        if (picture->objectName().isEmpty())
            picture->setObjectName(QStringLiteral("picture"));
        picture->resize(269, 192);
        label = new QLabel(picture);
        label->setObjectName(QStringLiteral("label"));
        label->setGeometry(QRect(91, 60, 91, 81));
        label->setScaledContents(true);

        retranslateUi(picture);

        QMetaObject::connectSlotsByName(picture);
    } // setupUi

    void retranslateUi(QDialog *picture)
    {
        picture->setWindowTitle(QApplication::translate("picture", "Dialog", Q_NULLPTR));
        label->setText(QApplication::translate("picture", "TextLabel", Q_NULLPTR));
    } // retranslateUi

};

namespace Ui {
    class picture: public Ui_picture {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_PICTURE_H

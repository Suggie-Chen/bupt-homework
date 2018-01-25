/********************************************************************************
** Form generated from reading UI file 'pay.ui'
**
** Created by: Qt User Interface Compiler version 5.9.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_PAY_H
#define UI_PAY_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>

QT_BEGIN_NAMESPACE

class Ui_pay
{
public:
    QPushButton *pushButton;
    QLabel *label;
    QPushButton *pushButton_2;

    void setupUi(QDialog *pay)
    {
        if (pay->objectName().isEmpty())
            pay->setObjectName(QStringLiteral("pay"));
        pay->resize(400, 300);
        pushButton = new QPushButton(pay);
        pushButton->setObjectName(QStringLiteral("pushButton"));
        pushButton->setGeometry(QRect(70, 200, 93, 28));
        label = new QLabel(pay);
        label->setObjectName(QStringLiteral("label"));
        label->setGeometry(QRect(160, 110, 72, 15));
        pushButton_2 = new QPushButton(pay);
        pushButton_2->setObjectName(QStringLiteral("pushButton_2"));
        pushButton_2->setGeometry(QRect(220, 200, 93, 28));

        retranslateUi(pay);

        QMetaObject::connectSlotsByName(pay);
    } // setupUi

    void retranslateUi(QDialog *pay)
    {
        pay->setWindowTitle(QApplication::translate("pay", "Dialog", Q_NULLPTR));
        pushButton->setText(QApplication::translate("pay", "\345\256\214\346\210\220", Q_NULLPTR));
        label->setText(QApplication::translate("pay", "\350\257\267\347\255\211\345\276\205", Q_NULLPTR));
        pushButton_2->setText(QString());
    } // retranslateUi

};

namespace Ui {
    class pay: public Ui_pay {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_PAY_H

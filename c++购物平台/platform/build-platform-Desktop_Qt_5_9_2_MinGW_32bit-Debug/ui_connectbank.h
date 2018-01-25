/********************************************************************************
** Form generated from reading UI file 'connectbank.ui'
**
** Created by: Qt User Interface Compiler version 5.9.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_CONNECTBANK_H
#define UI_CONNECTBANK_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QGridLayout>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_connectbank
{
public:
    QWidget *widget;
    QVBoxLayout *verticalLayout;
    QGridLayout *gridLayout;
    QLabel *label;
    QLineEdit *lineEdit;
    QLabel *label_2;
    QLineEdit *lineEdit_2;
    QLabel *label_3;
    QPushButton *pushButton;
    QPushButton *pushButton_2;

    void setupUi(QDialog *connectbank)
    {
        if (connectbank->objectName().isEmpty())
            connectbank->setObjectName(QStringLiteral("connectbank"));
        connectbank->resize(483, 340);
        widget = new QWidget(connectbank);
        widget->setObjectName(QStringLiteral("widget"));
        widget->setGeometry(QRect(110, 80, 242, 147));
        verticalLayout = new QVBoxLayout(widget);
        verticalLayout->setObjectName(QStringLiteral("verticalLayout"));
        verticalLayout->setContentsMargins(0, 0, 0, 0);
        gridLayout = new QGridLayout();
        gridLayout->setObjectName(QStringLiteral("gridLayout"));
        label = new QLabel(widget);
        label->setObjectName(QStringLiteral("label"));

        gridLayout->addWidget(label, 0, 0, 1, 1);

        lineEdit = new QLineEdit(widget);
        lineEdit->setObjectName(QStringLiteral("lineEdit"));

        gridLayout->addWidget(lineEdit, 0, 1, 1, 1);

        label_2 = new QLabel(widget);
        label_2->setObjectName(QStringLiteral("label_2"));

        gridLayout->addWidget(label_2, 1, 0, 1, 1);

        lineEdit_2 = new QLineEdit(widget);
        lineEdit_2->setObjectName(QStringLiteral("lineEdit_2"));

        gridLayout->addWidget(lineEdit_2, 1, 1, 1, 1);


        verticalLayout->addLayout(gridLayout);

        label_3 = new QLabel(widget);
        label_3->setObjectName(QStringLiteral("label_3"));

        verticalLayout->addWidget(label_3);

        pushButton = new QPushButton(widget);
        pushButton->setObjectName(QStringLiteral("pushButton"));

        verticalLayout->addWidget(pushButton);

        pushButton_2 = new QPushButton(widget);
        pushButton_2->setObjectName(QStringLiteral("pushButton_2"));

        verticalLayout->addWidget(pushButton_2);


        retranslateUi(connectbank);

        QMetaObject::connectSlotsByName(connectbank);
    } // setupUi

    void retranslateUi(QDialog *connectbank)
    {
        connectbank->setWindowTitle(QApplication::translate("connectbank", "Dialog", Q_NULLPTR));
        label->setText(QApplication::translate("connectbank", "\351\223\266\350\241\214\350\264\246\346\210\267", Q_NULLPTR));
        label_2->setText(QApplication::translate("connectbank", "\345\257\206\347\240\201", Q_NULLPTR));
        label_3->setText(QString());
        pushButton->setText(QString());
        pushButton_2->setText(QApplication::translate("connectbank", "\350\277\224\345\233\236", Q_NULLPTR));
    } // retranslateUi

};

namespace Ui {
    class connectbank: public Ui_connectbank {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_CONNECTBANK_H

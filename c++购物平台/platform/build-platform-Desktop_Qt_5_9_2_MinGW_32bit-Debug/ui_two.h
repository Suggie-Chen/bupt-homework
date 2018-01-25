/********************************************************************************
** Form generated from reading UI file 'two.ui'
**
** Created by: Qt User Interface Compiler version 5.9.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_TWO_H
#define UI_TWO_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QSpinBox>
#include <QtWidgets/QTableView>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_two
{
public:
    QWidget *verticalLayoutWidget;
    QVBoxLayout *verticalLayout;
    QTableView *tableView;
    QPushButton *pushButton;
    QLabel *label_7;
    QPushButton *pushButton_2;
    QWidget *horizontalLayoutWidget_2;
    QHBoxLayout *horizontalLayout_2;
    QLabel *label_9;
    QSpinBox *spinBox;
    QLabel *label_10;
    QPushButton *pushButton_4;
    QWidget *horizontalLayoutWidget_4;
    QHBoxLayout *horizontalLayout_4;
    QLabel *label_13;
    QLabel *label_12;
    QWidget *horizontalLayoutWidget_5;
    QHBoxLayout *horizontalLayout_5;
    QLabel *label_2;
    QLabel *label;
    QWidget *horizontalLayoutWidget_6;
    QHBoxLayout *horizontalLayout_6;
    QPushButton *pushButton_3;
    QPushButton *pushButton_6;
    QPushButton *pushButton_7;
    QLabel *label_3;
    QPushButton *pushButton_8;
    QPushButton *pushButton_9;
    QPushButton *pushButton_10;
    QTableView *tableView_2;
    QLabel *label_4;
    QPushButton *pushButton_12;
    QLabel *label_6;
    QLabel *label_8;
    QLabel *label_11;
    QLabel *label_14;
    QLabel *label_21;
    QWidget *layoutWidget;
    QVBoxLayout *verticalLayout_2;
    QLabel *label_15;
    QLabel *label_16;
    QLabel *label_17;
    QLabel *label_18;
    QLabel *label_19;
    QLabel *label_20;

    void setupUi(QDialog *two)
    {
        if (two->objectName().isEmpty())
            two->setObjectName(QStringLiteral("two"));
        two->resize(1267, 685);
        verticalLayoutWidget = new QWidget(two);
        verticalLayoutWidget->setObjectName(QStringLiteral("verticalLayoutWidget"));
        verticalLayoutWidget->setGeometry(QRect(690, 40, 561, 312));
        verticalLayout = new QVBoxLayout(verticalLayoutWidget);
        verticalLayout->setObjectName(QStringLiteral("verticalLayout"));
        verticalLayout->setContentsMargins(0, 0, 0, 0);
        tableView = new QTableView(verticalLayoutWidget);
        tableView->setObjectName(QStringLiteral("tableView"));

        verticalLayout->addWidget(tableView);

        pushButton = new QPushButton(verticalLayoutWidget);
        pushButton->setObjectName(QStringLiteral("pushButton"));

        verticalLayout->addWidget(pushButton);

        label_7 = new QLabel(two);
        label_7->setObjectName(QStringLiteral("label_7"));
        label_7->setGeometry(QRect(230, 100, 72, 15));
        pushButton_2 = new QPushButton(two);
        pushButton_2->setObjectName(QStringLiteral("pushButton_2"));
        pushButton_2->setGeometry(QRect(990, 410, 93, 28));
        horizontalLayoutWidget_2 = new QWidget(two);
        horizontalLayoutWidget_2->setObjectName(QStringLiteral("horizontalLayoutWidget_2"));
        horizontalLayoutWidget_2->setGeometry(QRect(810, 410, 160, 80));
        horizontalLayout_2 = new QHBoxLayout(horizontalLayoutWidget_2);
        horizontalLayout_2->setObjectName(QStringLiteral("horizontalLayout_2"));
        horizontalLayout_2->setContentsMargins(0, 0, 0, 0);
        label_9 = new QLabel(horizontalLayoutWidget_2);
        label_9->setObjectName(QStringLiteral("label_9"));

        horizontalLayout_2->addWidget(label_9);

        spinBox = new QSpinBox(horizontalLayoutWidget_2);
        spinBox->setObjectName(QStringLiteral("spinBox"));
        spinBox->setMinimum(1);
        spinBox->setMaximum(5000);

        horizontalLayout_2->addWidget(spinBox);

        label_10 = new QLabel(two);
        label_10->setObjectName(QStringLiteral("label_10"));
        label_10->setGeometry(QRect(630, 330, 191, 16));
        pushButton_4 = new QPushButton(two);
        pushButton_4->setObjectName(QStringLiteral("pushButton_4"));
        pushButton_4->setGeometry(QRect(990, 460, 93, 28));
        horizontalLayoutWidget_4 = new QWidget(two);
        horizontalLayoutWidget_4->setObjectName(QStringLiteral("horizontalLayoutWidget_4"));
        horizontalLayoutWidget_4->setGeometry(QRect(10, 590, 91, 19));
        horizontalLayout_4 = new QHBoxLayout(horizontalLayoutWidget_4);
        horizontalLayout_4->setObjectName(QStringLiteral("horizontalLayout_4"));
        horizontalLayout_4->setContentsMargins(0, 0, 0, 0);
        label_13 = new QLabel(horizontalLayoutWidget_4);
        label_13->setObjectName(QStringLiteral("label_13"));

        horizontalLayout_4->addWidget(label_13);

        label_12 = new QLabel(horizontalLayoutWidget_4);
        label_12->setObjectName(QStringLiteral("label_12"));

        horizontalLayout_4->addWidget(label_12);

        horizontalLayoutWidget_5 = new QWidget(two);
        horizontalLayoutWidget_5->setObjectName(QStringLiteral("horizontalLayoutWidget_5"));
        horizontalLayoutWidget_5->setGeometry(QRect(30, 30, 160, 41));
        horizontalLayout_5 = new QHBoxLayout(horizontalLayoutWidget_5);
        horizontalLayout_5->setObjectName(QStringLiteral("horizontalLayout_5"));
        horizontalLayout_5->setContentsMargins(0, 0, 0, 0);
        label_2 = new QLabel(horizontalLayoutWidget_5);
        label_2->setObjectName(QStringLiteral("label_2"));

        horizontalLayout_5->addWidget(label_2);

        label = new QLabel(horizontalLayoutWidget_5);
        label->setObjectName(QStringLiteral("label"));

        horizontalLayout_5->addWidget(label);

        horizontalLayoutWidget_6 = new QWidget(two);
        horizontalLayoutWidget_6->setObjectName(QStringLiteral("horizontalLayoutWidget_6"));
        horizontalLayoutWidget_6->setGeometry(QRect(0, 400, 471, 89));
        horizontalLayout_6 = new QHBoxLayout(horizontalLayoutWidget_6);
        horizontalLayout_6->setObjectName(QStringLiteral("horizontalLayout_6"));
        horizontalLayout_6->setContentsMargins(0, 0, 0, 0);
        pushButton_3 = new QPushButton(horizontalLayoutWidget_6);
        pushButton_3->setObjectName(QStringLiteral("pushButton_3"));

        horizontalLayout_6->addWidget(pushButton_3);

        pushButton_6 = new QPushButton(horizontalLayoutWidget_6);
        pushButton_6->setObjectName(QStringLiteral("pushButton_6"));

        horizontalLayout_6->addWidget(pushButton_6);

        pushButton_7 = new QPushButton(horizontalLayoutWidget_6);
        pushButton_7->setObjectName(QStringLiteral("pushButton_7"));

        horizontalLayout_6->addWidget(pushButton_7);

        label_3 = new QLabel(two);
        label_3->setObjectName(QStringLiteral("label_3"));
        label_3->setGeometry(QRect(20, 510, 31, 16));
        pushButton_8 = new QPushButton(two);
        pushButton_8->setObjectName(QStringLiteral("pushButton_8"));
        pushButton_8->setGeometry(QRect(810, 370, 91, 28));
        pushButton_9 = new QPushButton(two);
        pushButton_9->setObjectName(QStringLiteral("pushButton_9"));
        pushButton_9->setGeometry(QRect(900, 370, 93, 28));
        pushButton_10 = new QPushButton(two);
        pushButton_10->setObjectName(QStringLiteral("pushButton_10"));
        pushButton_10->setGeometry(QRect(990, 370, 93, 28));
        tableView_2 = new QTableView(two);
        tableView_2->setObjectName(QStringLiteral("tableView_2"));
        tableView_2->setGeometry(QRect(0, 130, 471, 261));
        label_4 = new QLabel(two);
        label_4->setObjectName(QStringLiteral("label_4"));
        label_4->setGeometry(QRect(80, 550, 60, 17));
        pushButton_12 = new QPushButton(two);
        pushButton_12->setObjectName(QStringLiteral("pushButton_12"));
        pushButton_12->setGeometry(QRect(1100, 610, 93, 28));
        label_6 = new QLabel(two);
        label_6->setObjectName(QStringLiteral("label_6"));
        label_6->setGeometry(QRect(490, 20, 181, 201));
        label_8 = new QLabel(two);
        label_8->setObjectName(QStringLiteral("label_8"));
        label_8->setGeometry(QRect(50, 510, 61, 16));
        label_11 = new QLabel(two);
        label_11->setObjectName(QStringLiteral("label_11"));
        label_11->setGeometry(QRect(130, 510, 16, 16));
        label_14 = new QLabel(two);
        label_14->setObjectName(QStringLiteral("label_14"));
        label_14->setGeometry(QRect(160, 510, 72, 15));
        label_21 = new QLabel(two);
        label_21->setObjectName(QStringLiteral("label_21"));
        label_21->setGeometry(QRect(310, 530, 72, 15));
        layoutWidget = new QWidget(two);
        layoutWidget->setObjectName(QStringLiteral("layoutWidget"));
        layoutWidget->setGeometry(QRect(390, 490, 74, 133));
        verticalLayout_2 = new QVBoxLayout(layoutWidget);
        verticalLayout_2->setObjectName(QStringLiteral("verticalLayout_2"));
        verticalLayout_2->setContentsMargins(0, 0, 0, 0);
        label_15 = new QLabel(layoutWidget);
        label_15->setObjectName(QStringLiteral("label_15"));

        verticalLayout_2->addWidget(label_15);

        label_16 = new QLabel(layoutWidget);
        label_16->setObjectName(QStringLiteral("label_16"));

        verticalLayout_2->addWidget(label_16);

        label_17 = new QLabel(layoutWidget);
        label_17->setObjectName(QStringLiteral("label_17"));

        verticalLayout_2->addWidget(label_17);

        label_18 = new QLabel(layoutWidget);
        label_18->setObjectName(QStringLiteral("label_18"));

        verticalLayout_2->addWidget(label_18);

        label_19 = new QLabel(layoutWidget);
        label_19->setObjectName(QStringLiteral("label_19"));

        verticalLayout_2->addWidget(label_19);

        label_20 = new QLabel(layoutWidget);
        label_20->setObjectName(QStringLiteral("label_20"));

        verticalLayout_2->addWidget(label_20);


        retranslateUi(two);

        QMetaObject::connectSlotsByName(two);
    } // setupUi

    void retranslateUi(QDialog *two)
    {
        two->setWindowTitle(QApplication::translate("two", "Dialog", Q_NULLPTR));
        pushButton->setText(QApplication::translate("two", "Refresh", Q_NULLPTR));
        label_7->setText(QApplication::translate("two", "\350\264\255\347\211\251\350\275\246", Q_NULLPTR));
        pushButton_2->setText(QApplication::translate("two", "\346\267\273\345\212\240\350\264\255\347\211\251\350\275\246", Q_NULLPTR));
        label_9->setText(QApplication::translate("two", "\350\264\255\344\271\260\346\225\260\351\207\217", Q_NULLPTR));
        label_10->setText(QString());
        pushButton_4->setText(QApplication::translate("two", "\345\210\240\351\231\244\350\264\255\347\211\251\350\275\246", Q_NULLPTR));
        label_13->setText(QApplication::translate("two", "\345\276\205\344\273\230\346\254\276", Q_NULLPTR));
        label_12->setText(QString());
        label_2->setText(QString());
        label->setText(QApplication::translate("two", "\346\254\242\350\277\216\345\233\236\346\235\245", Q_NULLPTR));
        pushButton_3->setText(QApplication::translate("two", "\345\210\267\346\226\260\350\264\255\347\211\251\350\275\246", Q_NULLPTR));
        pushButton_6->setText(QApplication::translate("two", "\346\217\220\344\272\244\350\256\242\345\215\225", Q_NULLPTR));
        pushButton_7->setText(QApplication::translate("two", "\346\222\244\351\224\200\350\256\242\345\215\225", Q_NULLPTR));
        label_3->setText(QApplication::translate("two", "\346\273\241", Q_NULLPTR));
        pushButton_8->setText(QApplication::translate("two", "\346\230\276\347\244\272\344\271\246", Q_NULLPTR));
        pushButton_9->setText(QApplication::translate("two", "\346\230\276\347\244\272\350\241\243\346\234\215", Q_NULLPTR));
        pushButton_10->setText(QApplication::translate("two", "\346\230\276\347\244\272\351\233\266\351\243\237", Q_NULLPTR));
        label_4->setText(QString());
        pushButton_12->setText(QApplication::translate("two", "\346\263\250\351\224\200", Q_NULLPTR));
        label_6->setText(QString());
        label_8->setText(QString());
        label_11->setText(QApplication::translate("two", "\345\207\217", Q_NULLPTR));
        label_14->setText(QString());
        label_21->setText(QApplication::translate("two", "\346\211\223\346\212\230\346\203\205\345\206\265", Q_NULLPTR));
        label_15->setText(QApplication::translate("two", "book", Q_NULLPTR));
        label_16->setText(QString());
        label_17->setText(QApplication::translate("two", "clothes", Q_NULLPTR));
        label_18->setText(QString());
        label_19->setText(QApplication::translate("two", "snack", Q_NULLPTR));
        label_20->setText(QString());
    } // retranslateUi

};

namespace Ui {
    class two: public Ui_two {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_TWO_H

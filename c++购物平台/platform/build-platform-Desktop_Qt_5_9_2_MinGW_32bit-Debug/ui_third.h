/********************************************************************************
** Form generated from reading UI file 'third.ui'
**
** Created by: Qt User Interface Compiler version 5.9.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_THIRD_H
#define UI_THIRD_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>

QT_BEGIN_NAMESPACE

class Ui_third
{
public:
    QLabel *label;

    void setupUi(QDialog *third)
    {
        if (third->objectName().isEmpty())
            third->setObjectName(QStringLiteral("third"));
        third->resize(296, 185);
        label = new QLabel(third);
        label->setObjectName(QStringLiteral("label"));
        label->setGeometry(QRect(120, 90, 72, 15));

        retranslateUi(third);

        QMetaObject::connectSlotsByName(third);
    } // setupUi

    void retranslateUi(QDialog *third)
    {
        third->setWindowTitle(QApplication::translate("third", "Dialog", Q_NULLPTR));
        label->setText(QApplication::translate("third", "\346\210\220\345\212\237", Q_NULLPTR));
    } // retranslateUi

};

namespace Ui {
    class third: public Ui_third {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_THIRD_H

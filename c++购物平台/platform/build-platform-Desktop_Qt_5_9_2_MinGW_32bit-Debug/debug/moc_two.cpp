/****************************************************************************
** Meta object code from reading C++ file 'two.h'
**
** Created by: The Qt Meta Object Compiler version 67 (Qt 5.9.2)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#include "../../platform/ui/two.h"
#include <QtCore/qbytearray.h>
#include <QtCore/qmetatype.h>
#if !defined(Q_MOC_OUTPUT_REVISION)
#error "The header file 'two.h' doesn't include <QObject>."
#elif Q_MOC_OUTPUT_REVISION != 67
#error "This file was generated using the moc from 5.9.2. It"
#error "cannot be used with the include files from this version of Qt."
#error "(The moc has changed too much.)"
#endif

QT_BEGIN_MOC_NAMESPACE
QT_WARNING_PUSH
QT_WARNING_DISABLE_DEPRECATED
struct qt_meta_stringdata_two_t {
    QByteArrayData data[16];
    char stringdata0[321];
};
#define QT_MOC_LITERAL(idx, ofs, len) \
    Q_STATIC_BYTE_ARRAY_DATA_HEADER_INITIALIZER_WITH_OFFSET(len, \
    qptrdiff(offsetof(qt_meta_stringdata_two_t, stringdata0) + ofs \
        - idx * sizeof(QByteArrayData)) \
    )
static const qt_meta_stringdata_two_t qt_meta_stringdata_two = {
    {
QT_MOC_LITERAL(0, 0, 3), // "two"
QT_MOC_LITERAL(1, 4, 21), // "on_pushButton_clicked"
QT_MOC_LITERAL(2, 26, 0), // ""
QT_MOC_LITERAL(3, 27, 23), // "on_pushButton_2_clicked"
QT_MOC_LITERAL(4, 51, 23), // "on_pushButton_3_clicked"
QT_MOC_LITERAL(5, 75, 23), // "on_pushButton_4_clicked"
QT_MOC_LITERAL(6, 99, 23), // "on_pushButton_6_clicked"
QT_MOC_LITERAL(7, 123, 23), // "on_pushButton_7_clicked"
QT_MOC_LITERAL(8, 147, 23), // "on_pushButton_8_clicked"
QT_MOC_LITERAL(9, 171, 23), // "on_pushButton_9_clicked"
QT_MOC_LITERAL(10, 195, 24), // "on_pushButton_10_clicked"
QT_MOC_LITERAL(11, 220, 24), // "on_pushButton_11_clicked"
QT_MOC_LITERAL(12, 245, 23), // "on_pushButton_5_clicked"
QT_MOC_LITERAL(13, 269, 24), // "on_pushButton_12_clicked"
QT_MOC_LITERAL(14, 294, 20), // "on_tableView_clicked"
QT_MOC_LITERAL(15, 315, 5) // "index"

    },
    "two\0on_pushButton_clicked\0\0"
    "on_pushButton_2_clicked\0on_pushButton_3_clicked\0"
    "on_pushButton_4_clicked\0on_pushButton_6_clicked\0"
    "on_pushButton_7_clicked\0on_pushButton_8_clicked\0"
    "on_pushButton_9_clicked\0"
    "on_pushButton_10_clicked\0"
    "on_pushButton_11_clicked\0"
    "on_pushButton_5_clicked\0"
    "on_pushButton_12_clicked\0on_tableView_clicked\0"
    "index"
};
#undef QT_MOC_LITERAL

static const uint qt_meta_data_two[] = {

 // content:
       7,       // revision
       0,       // classname
       0,    0, // classinfo
      13,   14, // methods
       0,    0, // properties
       0,    0, // enums/sets
       0,    0, // constructors
       0,       // flags
       0,       // signalCount

 // slots: name, argc, parameters, tag, flags
       1,    0,   79,    2, 0x08 /* Private */,
       3,    0,   80,    2, 0x08 /* Private */,
       4,    0,   81,    2, 0x08 /* Private */,
       5,    0,   82,    2, 0x08 /* Private */,
       6,    0,   83,    2, 0x08 /* Private */,
       7,    0,   84,    2, 0x08 /* Private */,
       8,    0,   85,    2, 0x08 /* Private */,
       9,    0,   86,    2, 0x08 /* Private */,
      10,    0,   87,    2, 0x08 /* Private */,
      11,    0,   88,    2, 0x08 /* Private */,
      12,    0,   89,    2, 0x08 /* Private */,
      13,    0,   90,    2, 0x08 /* Private */,
      14,    1,   91,    2, 0x08 /* Private */,

 // slots: parameters
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void, QMetaType::QModelIndex,   15,

       0        // eod
};

void two::qt_static_metacall(QObject *_o, QMetaObject::Call _c, int _id, void **_a)
{
    if (_c == QMetaObject::InvokeMetaMethod) {
        two *_t = static_cast<two *>(_o);
        Q_UNUSED(_t)
        switch (_id) {
        case 0: _t->on_pushButton_clicked(); break;
        case 1: _t->on_pushButton_2_clicked(); break;
        case 2: _t->on_pushButton_3_clicked(); break;
        case 3: _t->on_pushButton_4_clicked(); break;
        case 4: _t->on_pushButton_6_clicked(); break;
        case 5: _t->on_pushButton_7_clicked(); break;
        case 6: _t->on_pushButton_8_clicked(); break;
        case 7: _t->on_pushButton_9_clicked(); break;
        case 8: _t->on_pushButton_10_clicked(); break;
        case 9: _t->on_pushButton_11_clicked(); break;
        case 10: _t->on_pushButton_5_clicked(); break;
        case 11: _t->on_pushButton_12_clicked(); break;
        case 12: _t->on_tableView_clicked((*reinterpret_cast< const QModelIndex(*)>(_a[1]))); break;
        default: ;
        }
    }
}

const QMetaObject two::staticMetaObject = {
    { &QDialog::staticMetaObject, qt_meta_stringdata_two.data,
      qt_meta_data_two,  qt_static_metacall, nullptr, nullptr}
};


const QMetaObject *two::metaObject() const
{
    return QObject::d_ptr->metaObject ? QObject::d_ptr->dynamicMetaObject() : &staticMetaObject;
}

void *two::qt_metacast(const char *_clname)
{
    if (!_clname) return nullptr;
    if (!strcmp(_clname, qt_meta_stringdata_two.stringdata0))
        return static_cast<void*>(this);
    return QDialog::qt_metacast(_clname);
}

int two::qt_metacall(QMetaObject::Call _c, int _id, void **_a)
{
    _id = QDialog::qt_metacall(_c, _id, _a);
    if (_id < 0)
        return _id;
    if (_c == QMetaObject::InvokeMetaMethod) {
        if (_id < 13)
            qt_static_metacall(this, _c, _id, _a);
        _id -= 13;
    } else if (_c == QMetaObject::RegisterMethodArgumentMetaType) {
        if (_id < 13)
            *reinterpret_cast<int*>(_a[0]) = -1;
        _id -= 13;
    }
    return _id;
}
QT_WARNING_POP
QT_END_MOC_NAMESPACE

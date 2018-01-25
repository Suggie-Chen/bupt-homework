#include<iostream>
using namespace std;
#include<sstream>
bool isnum1(string s)//判断是不是数字如果是则返回true，反之false
{
    stringstream sin(s);
    double t;
    char p;
    if (!(sin >> t))
        return false;
    if (sin >> p)
        return false;
    else
        return true;
}

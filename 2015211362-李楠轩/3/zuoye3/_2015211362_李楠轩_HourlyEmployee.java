package salary;

public class _2015211362_李楠轩_HourlyEmployee extends _2015211362_李楠轩_Employee
{
    private double wage;
    private double hours;

    public _2015211362_李楠轩_HourlyEmployee()
    {
        wage=0.0;
        hours=0.0;
    }

    public _2015211362_李楠轩_HourlyEmployee(double w,double h,String f,String l,String s)
    {
        super(f,l,s);
        wage=w;
        hours=h;
    }
    public final double getWage()
    {
        return wage;
    }

    public final double getHours()
    {
        return hours;
    }

    public final void setWage(double w)
    {
        wage=w;
    }

    public final void setHours(double h)
    {
        hours=h;
    }

    @Override

    public int earning() {
        return (int)Math.floor(wage*hours);//向下取整再int
    }

    public String toString()
    {
        StringBuilder hour= new StringBuilder("");
        hour.append(super.toString());
        hour.append("\n工作时间："+getHours());
        hour.append("\n时薪："+getWage());
        hour.append("本月工资："+earning());
        return hour.toString();
    }
}

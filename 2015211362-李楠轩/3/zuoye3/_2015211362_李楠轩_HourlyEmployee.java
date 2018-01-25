package salary;

public class _2015211362_�����_HourlyEmployee extends _2015211362_�����_Employee
{
    private double wage;
    private double hours;

    public _2015211362_�����_HourlyEmployee()
    {
        wage=0.0;
        hours=0.0;
    }

    public _2015211362_�����_HourlyEmployee(double w,double h,String f,String l,String s)
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
        return (int)Math.floor(wage*hours);//����ȡ����int
    }

    public String toString()
    {
        StringBuilder hour= new StringBuilder("");
        hour.append(super.toString());
        hour.append("\n����ʱ�䣺"+getHours());
        hour.append("\nʱн��"+getWage());
        hour.append("���¹��ʣ�"+earning());
        return hour.toString();
    }
}

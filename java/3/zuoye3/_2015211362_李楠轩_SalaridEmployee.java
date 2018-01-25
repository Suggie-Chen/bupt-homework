package salary;

public class _2015211362_李楠轩_SalaridEmployee extends _2015211362_李楠轩_Employee
{
    private double weeklySalary;

    public _2015211362_李楠轩_SalaridEmployee()
    {
        weeklySalary=0.0;
    }

    public _2015211362_李楠轩_SalaridEmployee(double w,String f,String l,String s)
    {
        super(f,l,s);
        weeklySalary=w;
    }
    public final double getWeeklySalary() { return weeklySalary; }

    public final void setWeeklySalary(double w)
    {
        weeklySalary=w;
    }

    @Override

    public int earning() {
        return (int)Math.floor(4.0*weeklySalary);//向下取整再int
    }

    public String toString()
    {
        StringBuilder commision= new StringBuilder("");
        commision.append(super.toString());
        commision.append("\n周薪："+getWeeklySalary());
        commision.append("本月工资："+earning());
        return commision.toString();
    }
}
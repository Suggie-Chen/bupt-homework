package salary;

public class _2015211362_李楠轩_BasePlusCommisionEmployee extends  _2015211362_李楠轩_CommisionEmployee
{
    private double baseSalary;

    public _2015211362_李楠轩_BasePlusCommisionEmployee()
    {
       baseSalary=0.0;
    }

    public _2015211362_李楠轩_BasePlusCommisionEmployee(double b,double c,double g,String f,String l,String s)
    {
        super(c,g,f,l,s);
        baseSalary=b;
    }
    public final double getBaseSalary()
    {
        return baseSalary;
    }

    public final void setBaseSalary(double c)
    {
        baseSalary=c;
    }

    @Override

    public int earning() {
        return super.earning()+(int)Math.floor(baseSalary);//向下取整再int
    }

    public String toString()
    {
        StringBuilder base= new StringBuilder("");
        base.append(super.toString());
        base.append("\n基本工资："+getBaseSalary());
        base.append("本月工资："+earning());
        return base.toString();
    }
}
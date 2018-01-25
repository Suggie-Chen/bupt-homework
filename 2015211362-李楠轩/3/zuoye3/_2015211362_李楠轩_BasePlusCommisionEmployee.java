package salary;

public class _2015211362_�����_BasePlusCommisionEmployee extends  _2015211362_�����_CommisionEmployee
{
    private double baseSalary;

    public _2015211362_�����_BasePlusCommisionEmployee()
    {
       baseSalary=0.0;
    }

    public _2015211362_�����_BasePlusCommisionEmployee(double b,double c,double g,String f,String l,String s)
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
        return super.earning()+(int)Math.floor(baseSalary);//����ȡ����int
    }

    public String toString()
    {
        StringBuilder base= new StringBuilder("");
        base.append(super.toString());
        base.append("\n�������ʣ�"+getBaseSalary());
        base.append("���¹��ʣ�"+earning());
        return base.toString();
    }
}
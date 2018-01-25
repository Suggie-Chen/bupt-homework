package salary;

public class _2015211362_�����_CommisionEmployee extends _2015211362_�����_Employee
{
    private double commissionRate;
    private double grossSales;

    public _2015211362_�����_CommisionEmployee()
    {
        commissionRate=0.0;
        grossSales=0.0;
    }

    public _2015211362_�����_CommisionEmployee(double c,double g,String f,String l,String s)
    {
        super(f,l,s);
        commissionRate=c;
        grossSales=g;
    }
    public final double getcommissionRate()
    {
        return commissionRate;
    }

    public final double getGrossSales()
    {
        return grossSales;
    }

    public final void setCommissionRate(double c)
    {
        commissionRate=c;
    }

    public final void setGrossSales(double g)
    {
        grossSales=g;
    }

    @Override

    public int earning() {
        return (int)Math.floor(grossSales*commissionRate);//����ȡ����int
    }

    public String toString()
    {
        StringBuilder commision= new StringBuilder("");
        commision.append(super.toString());
        commision.append("\n���۶"+getGrossSales());
        commision.append("\nӶ���ʣ�"+getcommissionRate());
        commision.append("���¹��ʣ�"+earning());
        return commision.toString();
    }
}
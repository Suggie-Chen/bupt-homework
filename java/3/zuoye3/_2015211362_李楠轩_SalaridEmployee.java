package salary;

public class _2015211362_�����_SalaridEmployee extends _2015211362_�����_Employee
{
    private double weeklySalary;

    public _2015211362_�����_SalaridEmployee()
    {
        weeklySalary=0.0;
    }

    public _2015211362_�����_SalaridEmployee(double w,String f,String l,String s)
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
        return (int)Math.floor(4.0*weeklySalary);//����ȡ����int
    }

    public String toString()
    {
        StringBuilder commision= new StringBuilder("");
        commision.append(super.toString());
        commision.append("\n��н��"+getWeeklySalary());
        commision.append("���¹��ʣ�"+earning());
        return commision.toString();
    }
}
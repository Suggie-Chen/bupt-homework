package salary;

public class CommisionEmployee extends Employee{
private double grossSales;//(���۶�)
private double commissionRate;//(��ɱ���)
public CommisionEmployee()//������������
{
	super();
	grossSales = 0 ;
	commissionRate = 0 ;
}

public CommisionEmployee(String first, String last, String number, double GrossSales, double rate)//����������
{
	super(first, last, number) ;
	grossSales = GrossSales ;
	commissionRate = rate ;
}
public double earning()//��дearning
{
	return grossSales * commissionRate ;
}

public double returnGrossSales()
{
	return grossSales ;
}

public double returnCommissionRate()
{
	return commissionRate ;
}

public void setGrossSales(double GrossSgross)
{
	grossSales = GrossSgross ;
}

public void setCommissionRate(double rate)
{
	commissionRate = rate ;
}

public String toString()
{
	return super.toString() + " grossSales:" + grossSales + " commissionRate:" + commissionRate ;
}
}

package salary;

public class CommisionEmployee extends Employee{
private double grossSales;//(销售额)
private double commissionRate;//(提成比率)
public CommisionEmployee()//不带参数构造
{
	super();
	grossSales = 0 ;
	commissionRate = 0 ;
}

public CommisionEmployee(String first, String last, String number, double GrossSales, double rate)//带参数构造
{
	super(first, last, number) ;
	grossSales = GrossSales ;
	commissionRate = rate ;
}
public double earning()//改写earning
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

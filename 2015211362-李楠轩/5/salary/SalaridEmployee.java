package salary;

public class SalaridEmployee extends Employee {
	private double weeklySalary;
	public SalaridEmployee()//������������
	{
		super() ;
		weeklySalary = 0 ;
	}
	public SalaridEmployee(String first, String last, String number, double salary)//����������
	{
		super(first, last, number) ;//Employee ����;
		weeklySalary = salary ;
	}
	public double earning()//��дearning
	{
		return weeklySalary*4 ;
	}
	
	public double returnWeeklySalary()
	{
		return weeklySalary * 4 ;
	}
	
	public void setWeeklySalary(double salary)
	{
		weeklySalary = salary ;
	}
	public String toString()
	{
		return super.toString() + " weeklySalary:" +returnWeeklySalary();
	}
}

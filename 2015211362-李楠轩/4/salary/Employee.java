package salary;

public abstract class Employee {

		public abstract double earning() ;
		private String firstName ;
		private String lastName ;
		private String socialSecurityNumber ;//ss����
		
		public Employee()//���캯��
		{
			firstName = "" ;
			lastName = "" ;
			socialSecurityNumber = "" ;
		} 
		
		public Employee(String first, String last, String number)//���������캯��
		{
			firstName = first ;
			lastName = last ;
			socialSecurityNumber = number ;
		}
		
		
		public void setLastName(String last)
		{
			lastName = last ;
		}
		public String returnLastName()
		{
			return lastName ;
		}
		public void setFirstName(String first)
		{
			firstName = first ;
		}
		public String returnFirstName()
		{
			return firstName ;
		}
		public String returnSocialSecurityNumber()
		{
			return socialSecurityNumber ;
		}
		public String toString()
		{
			return ("firstName:" + firstName + " lastName:" + lastName + " socialSecurityNumber:" + socialSecurityNumber) ;
		}
}

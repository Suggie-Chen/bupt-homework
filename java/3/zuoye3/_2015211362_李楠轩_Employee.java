package salary;

public abstract class _2015211362_�����_Employee
{
    private String firstname;
    private String lastname;
    private final String socialSecurityNumber;

    public _2015211362_�����_Employee()//�޲�������
    {
        firstname="f";
        lastname="l";
        socialSecurityNumber="s";
    }

    public _2015211362_�����_Employee(String f,String l,String s)//�в�������
    {
        firstname=f;
        lastname=l;
        socialSecurityNumber=s;
    }

    public abstract int earning();//���е����������д�˷���

    public final String getfirstname()
    {
        return firstname;
    }

    public final void setFirstname(String F)
    {
        firstname=F;
    }

    public final String getLastname()
    {
        return lastname;
    }

    public final void setLastname(String L)
    {
        lastname=L;
    }

    public final String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }


    public String toString()
    {
        StringBuilder employ=new StringBuilder("");
        employ.append("\nFirst name:"+getfirstname());
        employ.append("\nLast name:"+getLastname());
        employ.append("\nSocial security number:"+getSocialSecurityNumber());
        employ.append("���¹��ʣ�"+earning());
        return employ.toString();
    }
}
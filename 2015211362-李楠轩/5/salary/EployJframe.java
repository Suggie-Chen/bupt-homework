package salary;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;

import javax.print.attribute.standard.RequestingUserName;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EployJframe  extends JFrame
{
	private HashMap<String,Employee > employees;
	private double returnaverage()
	{
		if(employees.size()==0)
			return 0;
		else
		{
			double num=0;
			Iterator iterator=employees.keySet().iterator();
			while(iterator.hasNext())
			{
				String key=(String)iterator.next();
				num+=employees.get(key).earning();
			}
			return num/employees.size();
		}
	}
	class wenti1 extends JDialog//出错则弹出
	{
		 public wenti1()
	        {
	            super();
	           wentishow();
	        }

	        private void wentishow()
	        {
	            this.add(new JLabel("Invalid input! Please try again", JLabel.CENTER));
	            this.pack();
	            setTitle ("Error!");
	            setDefaultCloseOperation (DISPOSE_ON_CLOSE);
	            setLocationRelativeTo (getParent());
	            setSize(200, 100);
	            this.setModal(true);
	        }
	}
	class jBasePlusCommisionEmployee extends JDialog
	{
		public jBasePlusCommisionEmployee(JFrame Z)
		{
			super(Z);
			
			showui();
		}
		private void showui() 
		{
			/*创建面板，以及去中的按钮显示框*/
			
			JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(8, 2));
			panel.add(new JLabel("First Name"));
			JTextField First_Name=new JTextField();
			panel.add(First_Name);
			panel.add(new JLabel("Second Name"));
			JTextField Second_Name=new JTextField();
			panel.add(Second_Name);
			panel.add(new JLabel("Social Number"));
			JTextField Social_Number=new JTextField();
			panel.add(Social_Number);
			panel.add(new JLabel("Gross Sales"));
			JTextField Gross_Sales=new JTextField();
			panel.add(Gross_Sales);
			panel.add(new JLabel("Commission Rate"));
			JTextField Commission_Rate=new JTextField();
			panel.add(Commission_Rate);
			panel.add(new JLabel("salary"));
			JTextField salary=new JTextField();
			panel.add(salary);
			JButton aButton=new JButton("ok");
			panel.add(aButton);
			aButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						/*判断social_Number是不是有数据，没数据则抛出错误，弹框。
						结束后删除这个窗口在内存中的数据*/
		
						if (Social_Number.getText().equals(""))
	                        throw new IllegalArgumentException();
						Employee aEmployee=new BasePlusCommisionEmployee( First_Name.getText(),
	                            Second_Name.getText(),
	                            Social_Number.getText(),
	                            Double.parseDouble(Gross_Sales.getText()),
	                            Double.parseDouble(Commission_Rate.getText()),
	                            Double.parseDouble(salary.getText()));
						if(addEmployee(aEmployee)!=null)
						{
							employees.put(Social_Number.getText(),aEmployee);
						}
						else
						{
							throw new IllegalArgumentException();
						}
						jBasePlusCommisionEmployee.this.dispose();
						//System.out.println(employees.get("123").returnFirstName());
						
						} catch (Exception e2) {
						wenti1 log = new wenti1();
	                    log.setVisible(true);
						// TODO: handle exception
					}
					
				}
			});
			 	this.add(panel);
	            this.pack();
	            setTitle ("Create BasePlusCommision Employee");
	            setDefaultCloseOperation (DISPOSE_ON_CLOSE);
	            setLocationRelativeTo (getParent ());
	            setSize(320,300 );
		}
	}
	Employee addEmployee(Employee stu)
	{
		//boolean flag=true;
		Iterator it = employees.keySet().iterator();  
		//System.out.println("yy");
	    while(it.hasNext()) 
	    {  
	        String key = (String)it.next(); 
	       // System.out.println("key:" + key);  
	     //   System.out.println(stu.returnSocialSecurityNumber());
	        String yString=stu.returnSocialSecurityNumber();
	       // System.out.println(yString);
	        if(yString.equals(key))
	        {
	        	//flag=false;
	        	//System.out.println("break key:" + key);  
	           // System.out.println("value:" + employees.get(key));  
	        	//System.out.println("yyyyy");
	            return null;
	        }
	       
	       // System.out.println("value:" + employees.get(key));  
	    }  
		return stu;
	}
	class jCommisionEmployee extends JDialog
	{
		public jCommisionEmployee(JFrame Z)
		{
			super(Z);
			
			showui();
		}
		private void showui() 
		{
			/*创建面板，以及去中的按钮显示框*/
			
			JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(7, 2));
			panel.add(new JLabel("First Name"));
			JTextField First_Name=new JTextField();
			panel.add(First_Name);
			panel.add(new JLabel("Second Name"));
			JTextField Second_Name=new JTextField();
			panel.add(Second_Name);
			panel.add(new JLabel("Social Number"));
			JTextField Social_Number=new JTextField();
			panel.add(Social_Number);
			panel.add(new JLabel("Gross Sales"));
			JTextField Gross_Sales=new JTextField();
			panel.add(Gross_Sales);
			panel.add(new JLabel("Commission Rate"));
			JTextField Commission_Rate=new JTextField();
			panel.add(Commission_Rate);
			JButton aButton=new JButton("ok");
			panel.add(aButton);
			aButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						/*判断social_Number是不是有数据，没数据则抛出错误，弹框。
						结束后删除这个窗口在内存中的数据*/
		
						if (Social_Number.getText().equals(""))
	                        throw new IllegalArgumentException();
						Employee aEmployee=new CommisionEmployee( First_Name.getText(),
	                            Second_Name.getText(),
	                            Social_Number.getText(),
	                            Double.parseDouble(Gross_Sales.getText()),
	                            Double.parseDouble(Commission_Rate.getText()));
						if(addEmployee(aEmployee)!=null)
						{
							employees.put(Social_Number.getText(),aEmployee);
						}
						else
						{
							throw new IllegalArgumentException();
						}
						jCommisionEmployee.this.dispose();
						//System.out.println(employees.get("123").returnFirstName());
						
						} catch (Exception e2) {
							wenti1 log = new wenti1();
							log.setVisible(true);
						// TODO: handle exception
					}
					
				}
			});
			 	this.add(panel);
	            this.pack();
	            setTitle ("Create Commision Employee");
	            setDefaultCloseOperation (DISPOSE_ON_CLOSE);
	            setLocationRelativeTo (getParent ());
	            setSize(320,300 );
		}
	}
	public class showaverage extends JDialog
	{
		public showaverage(JFrame z)
		{
			super(z);
			ashow();
		}
		void ashow()
		{
			double num=returnaverage();
			JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(5, 2));
			panel.add(new JLabel("人数"));
			int people=employees.size();
			panel.add(new JLabel(Integer.toString(people)));
			panel.add(new JLabel("平均工资"));
			panel.add(new JLabel(Double.toString(num)));
			this.add(panel);
            this.pack();
            setTitle ("平均工资");
            setDefaultCloseOperation (DISPOSE_ON_CLOSE);
            setLocationRelativeTo (getParent ());
            setSize(320,300 );
		}
	}
	private void menulist()
	{
		JMenuBar aBar=new JMenuBar();
		JMenu EmployeeInfoInput=new JMenu("EmployeeInfoInput");
		JMenuItem Search=new JMenuItem("Search");
		Search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("123");
				showaverage yy=new showaverage(EployJframe.this);
				yy.setVisible(true);
				// TODO Auto-generated method stub
				
			}
		});
		JMenuItem aBasePlusCommisionEmployee = new JMenuItem("BasePlusCommisionEmployee");
		aBasePlusCommisionEmployee.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jBasePlusCommisionEmployee yy=new jBasePlusCommisionEmployee(EployJframe.this);
						yy.setVisible(true);
			}
		});
		JMenuItem aCommisionEmployee = new JMenuItem("CommisionEmployee");
		aCommisionEmployee.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jCommisionEmployee yy=new jCommisionEmployee(EployJframe.this);
				yy.setVisible(true);
			}
		});
		EmployeeInfoInput.add(aBasePlusCommisionEmployee);
		EmployeeInfoInput.add(aCommisionEmployee);
		aBar.add(EmployeeInfoInput);
		aBar.add(Search);
		//粘贴到主页面上
		this.setJMenuBar(aBar);
	}
	public EployJframe()
	{
		employees=new HashMap<String,Employee>();
		Mainui();
		
	}
	 private void Mainui()
	    {
	        // 菜单栏
		   menulist();

	        // 基本设置
	        this.setTitle ("员工信息");
	        this.setSize (600,400);
	        this.setLocationRelativeTo (null);
	        this.setDefaultCloseOperation (EXIT_ON_CLOSE);
	    }
	public static void main(String[] args)
	{
		EployJframe UI=new EployJframe();
		UI.setVisible(true);
	}
}
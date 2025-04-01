package core;

public class emp1 {
	String name;
	String title;
	int salary;
	int hyear;
	public emp1(String name, String title, int salary,int hyear) {
		this.name = name;
		this.title = title;
		this.salary = salary;
		this.hyear=hyear;
	}
	
	void show()
	{
		System.out.println(" Employee name : "+name);
		System.out.println(" Job title : "+title);
		System.out.println(" Original salary : "+salary);
		System.out.println(" Hired year : "+hyear);

	}
	int pyear;
	void dec(int pyear)
	{
		int d =pyear-hyear;
		if(d<3)
		{
			System.out.println(" Temporary Employee");
		}
		else
		{
			System.out.println(" Permanent Employee");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       emp1 e1=new emp1("Venkat","Java Developer",65000,2024);
       e1.show();
       e1.dec(2025);
	}

}

package core;

public class emp {
	String name;
	String title;
	int salary;
	public emp(String name, String title, int salary) {
		this.name = name;
		this.title = title;
		this.salary = salary;
	}
	
	void show()
	{
		System.out.println(" Employee name : "+name);
		System.out.println(" Job title : "+title);
		System.out.println(" Original salary : "+salary);
	}
	
	
	int ta;
	int da;
	int hra;
	void total(int ta,int da,int hra)
	{
		int tsal=salary+ta+da+hra;
		System.out.println(" Total salary with Benefits : "+tsal);
	}





	public static void main(String[]args)
	{
		emp e=new emp("Venkat","Java Developer",65000);
		e.show();
		e.total(1000,2500, 500);
	}

}

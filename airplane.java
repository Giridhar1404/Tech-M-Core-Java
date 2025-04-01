package core;

public class airplane {
	
	int fnumber;
	String start;
	String dest;
	double exptime;
	

	public airplane(int fnumber, String start, String dest, double exptime) {
		
		this.fnumber = fnumber;
		this.start = start;
		this.dest = dest;
		this.exptime = exptime;
	}
	void show()
	{
		System.out.println(" Flight no : "+fnumber);
		System.out.println(" From : "+start);
		System.out.println(" To : "+dest);
		System.out.println(" Departure Time : "+exptime+ "AM");
	}
	double boarding;
	double placing;
	
	void delay(double boarding,double placing)
	{
		double total=exptime+boarding+placing;
		if(total>exptime)
		{
			double del=total-exptime;
			System.out.println(" The flight had been delayed by : "+del+" hrs.");
			System.out.println(" The new Departure time is : "+total+ "AM");
		}
		else
		{
			System.out.println(" The flight is on time .");
		}
	}


	public static void main(String[] args) {
		airplane a=new airplane(12563,"Delhi","Goa",5.35);
		a.show();
		a.delay(0.11, 0.11);
		

	}

}

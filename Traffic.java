package core;

public class Traffic {
	String colour;
	int time;
	int n=30;
	void isred()
	{
		colour="Red";
		System.out.println("Traffic signal is "+colour);
	}
	void isgreen()
	{
		colour="Green";
		System.out.println("Traffic signal is "+colour);
	}
	void change()
	{
		
		colour="Red";
		if(colour=="Red")
		{
			colour="Green";
			System.out.println("Traffic signal is "+colour);
		}
		else
		{
			colour="Red";
			System.out.println("Traffic signal is "+colour);
		}
		
		
		
	
	}
	void setduration(int k)
	{
		n=k;
	}
	
	void check(int time)
	{
		while(time!=0)
		{
			if(time%n==0)
			{
			change();
			time=time+n;
			break;
			}
			else
			{
				change();
				time=time+n;
				break;
			}
		}
		
	}

	public static void main(String[]args)
	{
		Traffic t= new Traffic();
		t.check(1250);
	}
}

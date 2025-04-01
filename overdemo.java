package core;

class A1
{
	void add(int a ,int b)
	{
		System.out.println(a+b);	
	}
	void add(int a ,int b,int c)
	{
		System.out.println(a+b+c);	
	}
	void add(String a ,String b)
	{
		System.out.println(a+b);	
	}
		
}
public class overdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A1 a=new A1();
       a.add(2, 6);
       a.add("Mahesh", "venkat");
       a.add(2, 9, 5);
	}

}

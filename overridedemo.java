package core;
class One
{
	void display()
	{
		System.out.println("Venkat is handsome");
	}
}
class A2 extends One
{
	void display()
	{
		System.out.println("Venkat is a lover boy");
	}
}
public class overridedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         One a=new A2();
         a.display();
	}

}

package core;
abstract class shape
{
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
}
class circle extends shape
{

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		int r=5;
		double ar=2.17*r*r;
		System.out.println("The area of circle : "+ar);
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		int r=5;
		double ar=2*2.17*r;
		System.out.println("The perimeter of circle : "+ar);
	}
	
}
class Triangle extends shape
{

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		int h=5;
		int b=10;
		double ar=0.5*h*b;
		System.out.println("The area of triangle : "+ar);
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		int a=5;
		int b=5;
		int c=5;
		double ar=a+b+c;
		System.out.println("The perimeter of circle : "+ar);
	}
	
}
public class abs  {
	public static void main(String[]args)
	{
		circle c=new circle();
		c.calculateArea();
		c.calculatePerimeter();
		Triangle t=new Triangle();
		t.calculateArea();
		t.calculatePerimeter();
	}

	
}

package core;
abstract class shape2D
{
	public abstract void draw(); 
	public abstract void resize(); 
}
class Rectangle1 extends shape2D
{

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		System.out.println("reactangle had been resized");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("reactangle had been drawn");
	}
}
class circle1 extends shape2D
{

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		System.out.println("circle had been resized");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("circle had been drawn");
	}
}

public class abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rectangle1 r=new Rectangle1();
        r.draw();
        r.resize();
        circle1 c=new circle1();
        c.draw();
        c.resize();
	}

}

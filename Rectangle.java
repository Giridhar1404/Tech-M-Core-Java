package core;

public class Rectangle {

	int height;
	int width;
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	 void area()
	 {
		 int ar=height*width;
		 System.out.println(" THe area of rectangle is : "+ ar);
	 }
	 void peri()
	 {
		 int per=2*(height+width);
		 System.out.println(" THe perimeter of rectangle is : "+ per);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rectangle r=new Rectangle(10,20);
        r.area();
        r.peri();
	}

}

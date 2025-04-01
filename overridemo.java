package core;
class Vehicle
{
	void drive()
	{
		System.out.println("  Repairing a vehicle .");
	}
}
class Car extends Vehicle
{
	void drive()
	{
		System.out.println(" Repairing a car .");
	}
}
public class overridemo extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vehicle v=new Car();
       v.drive();
       
	}

}

package core;

public class Dog {
     String name;
     String breed; 
	public Dog(String name, String breed) {
		
		this.name = name;
		this.breed = breed;
	}
	void setdog(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
		show();
	}
	void show()
	{
		System.out.println(" Name : "+name);
		System.out.println(" Breed : "+breed);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Dog d=new Dog("Harry","Labrador");
         Dog d1=new Dog("Benny","Golden Retriver");
         d.show();
         d1.show();
         d.setdog("Chimtu","Chimtu");
         
         
	}

}

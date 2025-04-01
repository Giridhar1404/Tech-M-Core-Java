package core;

public class person {

	String name;
	int age;
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void show()
	{
		System.out.println(" Name : "+name);
		System.out.println(" Age : "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        person p=new person("Venkat",20);
        person p1=new person("Shiva",21);
        p.show();
        p1.show();
	}

}

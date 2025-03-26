package core;

public class saloon {
	customer c;
	String sname;
	String p;
	
	public saloon(customer c, String sname, String p) {
		
		this.c = c;
		this.sname = sname;
		this.p = p;
	}
	void show()
	{
		System.out.println(" Id :"+c.cid);
		System.out.println( " Name :"+c.cname);
		System.out.println( " Visited for : "+ c.v);
		System.out.println( " Staff attended : " +sname);
		System.out.println( " Progress : "+p);
		System.out.println();
	}
	
	public static void main(String[] args) {
		int count =0;
		// TODO Auto-generated method stub
		customer c=new customer(101,"Hari","Massage");
		count++;
		saloon s=new saloon(c, "Sai", "completed");
		customer c1=new customer(102,"Giri","Massage");
		count++;
		saloon s1=new saloon(c1, "Pavan", "completed");
		customer c2=new customer(103,"Siva","Hair cut");
		count++;
		saloon s2=new saloon(c2, "Nikhi", "completed");
		customer c3=new customer(104,"Venkat","Beard");
		count++;
		saloon s3=new saloon(c3, "Sai", "In progress");
		customer c4=new customer(104,"Mahesh","Tan Removal");
		count++;
		saloon s4=new saloon(c4, "Pavan", "In progress");
		customer c5=new customer(106,"Mani","Massage");
		count++;
		saloon s5=new saloon(c5, "Nikhil", "In progress");
		System.out.println("Number of customers :"+count);
		s.show();
		s1.show();
		s2.show();
		s3.show();
		s4.show();
		s5.show();
        
	}

}


// output : 
//Number of customers :6
//Id :101
//Name :Hari
//Visited for : Massage
//Staff attended : Sai
//Progress : completed
//
//Id :102
//Name :Giri
//Visited for : Massage
//Staff attended : Pavan
//Progress : completed
//
//Id :103
//Name :Siva
//Visited for : Hair cut
//Staff attended : Nikhi
//Progress : completed
//
//Id :104
//Name :Venkat
//Visited for : Beard
//Staff attended : Sai
//Progress : In progress
//
//Id :104
//Name :Mahesh
//Visited for : Tan Removal
//Staff attended : Pavan
//Progress : In progress
//
//Id :106
//Name :Mani
//Visited for : Massage
//Staff attended : Nikhil
//Progress : In progress

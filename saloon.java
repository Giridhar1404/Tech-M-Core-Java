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
		System.out.println(" Bill amount : "+c.bill);
		if(c.bill>=1000)
		{
			System.out.println(" As your bill is above 1000 you had unlocked 10% discount");
			int disc= c.bill-(c.bill/10);
			System.out.println(" Bill after Discount : "+disc);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		customer c=new customer(101,"Hari","Massage",1500);
		saloon s=new saloon(c, "Sai", "completed");
		customer c1=new customer(102,"Giri","Massage",900);
		saloon s1=new saloon(c1, "Pavan", "completed");
		customer c2=new customer(103,"Siva","Hair cut",2000);
		saloon s2=new saloon(c2, "Nikhi", "completed");
		customer c3=new customer(104,"Venkat","Beard",1800);
		saloon s3=new saloon(c3, "Sai", "In progress");
		customer c4=new customer(104,"Mahesh","Tan Removal",1600);
		saloon s4=new saloon(c4, "Pavan", "In progress");
		customer c5=new customer(106,"Mani","Massage",2300);
		saloon s5=new saloon(c5, "Nikhil", "In progress");
		saloon k[]=new saloon[20];
		k[1]=s;
		k[2]=s1;
		k[3]=s2;
		k[4]=s3;
		k[5]=s4;
		k[6]=s5;
		int count=0;
		for(saloon f:k)
		{
			if(f!=null)
			{
				count++;
			}
			
		}
		
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
//Bill amount : 1500
//As your bill is above 1000 you had unlocked 10% discount
//Bill after Discount : 1350
//
//Id :102
//Name :Giri
//Visited for : Massage
//Staff attended : Pavan
//Progress : completed
//Bill amount : 900
//
//Id :103
//Name :Siva
//Visited for : Hair cut
//Staff attended : Nikhi
//Progress : completed
//Bill amount : 2000
//As your bill is above 1000 you had unlocked 10% discount
//Bill after Discount : 1800
//
//Id :104
//Name :Venkat
//Visited for : Beard
//Staff attended : Sai
//Progress : In progress
//Bill amount : 1800
//As your bill is above 1000 you had unlocked 10% discount
//Bill after Discount : 1620
//
//Id :104
//Name :Mahesh
//Visited for : Tan Removal
//Staff attended : Pavan
//Progress : In progress
//Bill amount : 1600
//As your bill is above 1000 you had unlocked 10% discount
//Bill after Discount : 1440
//
//Id :106
//Name :Mani
//Visited for : Massage
//Staff attended : Nikhil
//Progress : In progress
//Bill amount : 2300
//As your bill is above 1000 you had unlocked 10% discount
//Bill after Discount : 2070


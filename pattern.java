package demo1;
import java.util.*;
public class pattern {
	
	public void pattern1() 
	{
		for(int i=1 ;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
//OUTPUT:	
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	*
	public void pattern2() 
	{
		for(int i=1 ;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
//  OUTPUT:
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
	
	public void pattern3() 
	{
		int k=1;
		for(int i=1 ;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
	
// OUTPUT:
//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 
//	11 12 13 14 15 
	
	public void pattern4() 
	{
		
		for(int i=1 ;i<=5;i++)
		{
			int k=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
	
// OUTPUT:
//	1 
//	1 2 
//	1 2 3 
//	1 2 3 4 
//	1 2 3 4 5 
	
	public void pattern5() 
	{
		for(int i=1 ;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

//OUTPUT:
//	1 
//	1 2 
//	1 2 3 
//	1 2 3 4 
//	1 2 3 4 5 
	
	public void pattern6() 
	{
		for(int i=1 ;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
//OUTPUT:
//	1 
//	2 2 
//	3 3 3 
//	4 4 4 4 
//	5 5 5 5 5 
	
	public void pattern7() 
	{ 
		char c='A';
		for(int i=1 ;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}
	
//	OUTPUT:
//	A 
//	B C 
//	D E F 
//	G H I J 
//	K L M N O 
	
	public void pattern8() 
	{ 
		
		for(int i=1 ;i<=5;i++)
		{
			char c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}
	
//OUTPUT:
//	A 
//	A B 
//	A B C 
//	A B C D 
//	A B C D E 
	
	
	public void pattern9() 
	{ 
		char c='Z';
		for(int i=1 ;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c--;
			}
			System.out.println();
		}
	}
//OUTPUT:
//	Z 
//	Y X 
//	W V U 
//	T S R Q 
//	P O N M L
	
	
   public void fibonacci()
   {
	   int n1=0;
	   int n2=1;
	   System.out.print(n1+" "+n2+" ");
	   int n3;
	   for(int i=1;i<=10;i++)
	   {
		   n3=n1+n2;
		   System.out.print(n3+" ");
		   n1=n2;
		   n2=n3;
		   
	   }
   }

// OUTPUT : 0 1 1 2 3 5 8 13 21 34 55 89
   
   public void factorial() {
	   int fact=1;
	   for(int i=1;i<=5;i++)
	   {
		   fact=fact*i;
	   }
	   System.out.println(fact);
   }
  //OUTPUT : 120
   
   public void prime() {
	   int n=8;
	   int count=0;
	   for(int i=1;i<=n;i++)
	   {
		  count++;
		   
	   }
	   if(count==2)
	   {
		   System.out.println("prime");
	   }
	   else
	   {
		   System.out.println("not prime");
	   }
	   
   }
   
 //OUTPUT : not prime
   
   public void nprime() {
	   
	   
	   for(int i=1;i<=50;i++)
	   {
		   int count=0;
		  for(int j=1;j<=i;j++)
		  {
			  if(i%j==0)
			  {
				  count++;
			  }
		  }
		  if(count==2)
		   {
			   System.out.print(i+" ");
		   }
		   
	   }
	   
	   System.out.println();
	   
   }
   
   
 //OUTPUT : 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
   
   public void palindrome()
   {
	   int i =121;
	   int n=i;
	   int rem;
	   int rev=0;
	   while(i!=0)
	   {
		   rem=i%10;
		   rev=rev*10+rem;
		   i=i/10;
		     
	   }
	   
	   if(n==rev)
	   {
		   System.out.println("it's palindrome :"+rev);
	   }
	   else
	   {
		   System.out.println("it's not palindrome :"+rev);
	   }
	   
   }
   
   	//OUTPUT : it's palindrome :121
   
   public void spalindrome()
   {
	   String s ="madam";
	   String org=s;
	   String rev="";
	   int len=s.length();
	   for(int i=len-1;i>=0;i--)
	   {
		   rev=rev+s.charAt(i);
	   }
	   if(rev.equals(org))
	   {
		   System.out.println("it's palindrome :"+rev);
	   }
	   else
	   {
		   System.out.println("it's not palindrome :"+rev);
	   }
   }
   
  //OUTPUT : it's palindrome :madam
   
   public void armstrong()
   {
	   int i=153;
	   int org=i;
	   int r;
	   int arm=0;
	   while(i!=0)
	   {
		   r=i%10;
		   arm=arm+r*r*r;
		   i=i/10;
	   }
	   if(arm==org)
	   {
		   System.out.println("it's Armstrong :"+arm);
	   }
	   else
	   {
		   System.out.println("it's not Armstrong :"+arm);  
	   }
   }
   
   public void marmstrong()
   {
	   
	   for(int j=1;j<=1000;j++)
	   {
		   int length=0;
		   int r;
		   int arm=0;
		   int org=j;
		   while(org!=0)
		   {
			   org=org/10;
			   length++;
			   
		   }
	       org=j;
	       while(org!=0)
	      {
		     r=org%10;
		     arm=(int) (arm+Math.pow(r,length ));
		     org=org/10;
	       }
	       if(arm==j)
		   {
			   System.out.println(arm+" ");
		   }
	   
	   }
	   
	   
   }
   
   //OUTPUT : 1 2 3 4 5 6 7 8 9 153 370 371 407
   
   public void triangle()
   {
	   
	   for(int n=1;n<=5;n++)
	   {
		   char c ='A';
		   for(int j=5;j>n;j--)
		   {
			   
			   System.out.print(" ");
		   }
		   for(int k=1;k<=n;k++)
		   {
			  
			   System.out.print("*"+" ");
			   c++;
		   }
		  
//		   for(int l=2;l<=n;l++)
//		   {
//			   System.out.print("*");
//		   }
		   System.out.println();
		   
	   }
	   
   }
   
// OUTPUT : 
//	     A 
//	    A B 
//	   A B C 
//	  A B C D 
//	 A B C D E 
   public void pattern10()
   {
	   char c='A';
	   for(int i=1;i<=5;i++)
	   {
		   
		  for(int k=5;k>=i;k--)
		  {
			  System.out.print(" ");
		  }
		  for(int j=1;j<=i;j++)
		  {
			 
			  System.out.print(c+" ");
			  
		  }
		  c++;
		  System.out.println();
		  
	   }
   }
//   
//OUTPUT :
//    A 
//   B B 
//  C C C 
// D D D D 
//E E E E E
	   
   public void pattern11()
   {
	   
	   for(int i=1;i<=5;i++)
	   {
		   char c='A';
		  for(int k=5;k>=i;k--)
		  {
			  System.out.print(" ");
		  }
		  for(int j=1;j<=i;j++)
		  {
			 
			  System.out.print(c+" ");
			  c++;
		  }
		  
		  System.out.println();
		  
	   }
   }
   
//   OUTPUT :
//	   
//	      A 
//	     A B 
//	    A B C 
//	   A B C D 
//	  A B C D E 
   
   public void pattern12()
   {
	   int g=4;
	   for(int i=1;i<=4;i++)
	   {
		   for(int j=4;j>=i;j--)
		   {
			   System.out.print(g);
			   
		   }
		   g--;
		   
		   System.out.println();
	   }
   }
   
//   OUTPUT : 
//	   4444
//	   333
//	   22
//	   1
   
   public void pattern13()
   {
	   
	   for(int i=1;i<=4;i++)
	   {
		   int g=1;
		   for(int j=4;j>=i;j--)
		   {
			   System.out.print(" ");
			   
		   }
		   for(int k=1;k<=i;k++)
		   {
			   System.out.print(g);
			   g++;
		   }
		   System.out.println();
	   }
   }
   
//   OUTPUT : 
//	     1
//	    12
//	   123
//	  1234
   
   public void pattern14()
   {
	   for(int i=1;i<=3;i++)
	   {
		   for(int j=1;j<=3;j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
   }
   
//   OUTPUT : 
//	   ***
//	   ***
//	   ***

    public void calculator()
    {
    	Scanner sc=new Scanner(System.in);
    	char d='y';
    	do {
    		System.out.println("Enter first number :");
        	int a=sc.nextInt();
        	System.out.println("Enter second number :");
        	int b=sc.nextInt();
        	System.out.println("Enter your operation :");
        	char c=sc.next().charAt(0);
        	
    		switch(c)
    		{
    		case '+': System.out.println(a+b);
 	        break;
    		case '-': System.out.println(a-b);
            break;
    		case '*': System.out.println(a*b);
    		break;
    		case '/': System.out.println(a/b);
    		break;
    		
    		}
    		System.out.println("Press y to continue and n to terminate");
    		d=sc.next().charAt(0);
    	}while(d=='y');
    }
  
// output :
//    Enter first number :
//    	4
//    	Enter second number :
//    	6
//    	Enter your operation :
//    	+
//    	10
//    	Press y to continue and n to terminate
//    	y
//    	Enter first number :
    
    public void pap()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a number :");
    	int n=sc.nextInt();
    	sc.nextLine();
    	System.out.println("What do you want to check");
    	System.out.println("1 - Prime");
    	System.out.println("2 - Palindrome");
    	System.out.println("3 - armstrong");
    	System.out.println("4 - factorial");
    	int a=sc.nextInt();
    	switch(a)
    	{
    	case 1:
    		int count=0;
    		   for(int i=1;i<=n;i++)
    		   {
    			  if(n%i==0)
    			  {
    			   count++;
    			  }
    		   }
    		   if(count==2)
    		   {
    			   System.out.println("It is prime");
    		   }
    		   else
    		   {
    			   System.out.println("It is not prime");
    		   }
    		   break;
    	  case 2:
    		   int i=n;
    		   int rem;
    		   int rev=0;
    		   while(n!=0)
    		   {
    			   rem=n%10;
    			   rev=rev*10+rem;
    			   n=n/10;
    			     
    		   }
    		   
    		   if(i==rev)
    		   {
    			   System.out.println("it's palindrome :"+rev);
    		   }
    		   else
    		   {
    			   System.out.println("it's not palindrome :"+rev);
    		   }
    		   break;
    	  case 3:	 
    	   int length=0;
   		   int r;
   		   int arm=0;
   		   int org=n;
   		   while(org!=0)
   		   {
   			   org=org/10;
   			   length++;
   			   
   		   }
   	       org=n;
   	       while(org!=0)
   	      {
   		     r=org%10;
   		     arm=(int) (arm+Math.pow(r,length ));
   		     org=org/10;
   	       }
   	       if(arm==n)
   		   {
   			   System.out.println("It is armstrong");
   		   }
   	       else
   	       {
   	    	   System.out.println("It is not armstrong");
   	       }
    	break;
    	  case 4:
    		  int fact=1;
    		   for(int j=1;j<=n;j++)
    		   {
    			   fact=fact*j;
    		   }
    		   System.out.println("Factorial is :"+fact);
    		 break; 
    	}
   	
    }
    
//  output :
//    	Enter a number :
//    		153
//    		What do you want to check
//    		1 - Prime
//    		2 - Palindrome
//    		3 - armstrong
//    		4 - factorial
//    		3
//    		It is armstrong
    
    
	public static void main(String []args)
	{
		pattern p1 =new pattern();
		p1.pattern1();
		p1.pattern2();
		p1.pattern3();
		p1.pattern4();
		p1.pattern5();
		p1.pattern6();
		p1.pattern7();
		p1.pattern8();
		p1.pattern9();
		p1.fibonacci();
		p1.factorial();
		p1.prime();
		p1.nprime();
		p1.palindrome();
		p1.spalindrome();
		p1.armstrong();
		p1.marmstrong();
		p1.triangle();
		p1.pattern10();
		p1.pattern11();
		p1.pattern12();
		p1.pattern13();
		p1.pattern14();
//        p1.calculator();
		p1.pap();
	}

}

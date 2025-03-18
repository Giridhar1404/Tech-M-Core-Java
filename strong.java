package core;

public class strong {
  public static void main(String[]args)
  {
	  int n=145;
	  int k=n;
	  int sum=0;
	  while(n!=0)
	  {
         int a=n%10;
         int pro=1;
         for(int i=1;i<=a;i++)
         {
        	pro=pro*i;
        	
        	
         }
         sum=sum+pro;
         n=n/10;
      }
	  if(sum==k)
	  {
		  System.out.println(k+" is a strong number");
	  }
	  else
	  {
		  System.out.println(k+" is not a strong number");
	  }
  }
}

//output : 145 is a strong number
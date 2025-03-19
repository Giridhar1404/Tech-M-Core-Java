package core;
import java.util.*;
import java.lang.*;
public class array {
//Print the top 3 largest elements in an array
	public void a1()
	{
		int[] a= {65,1,89,35,14,67};
		Arrays.sort(a);
		System.out.println("1st Largest element : "+a[a.length-1]);
		System.out.println("2nd Largest element : "+a[a.length-2]);
		System.out.println("3rd Largest element : "+a[a.length-3]);
	}
//output : 
//	1st Largest element : 89
//	2nd Largest element : 67
//	3rd Largest element : 65
	
	
//Compare the 1st element of first array and the last element of second array	
	public void a2()
	{
		int[] b= {9,13,14,15,16};
		int[] c= {14,16,17,13,10};
		if(b[0]==c[c.length-1]) 
		{
		System.out.println("Both are equal");	
		}
		else if(b[0]>c[c.length-1])
		{
		System.out.println("Element 1 is larger");	
		}
		else
		{
			System.out.println("Element 1 is smaller");	
		}
	}
	
//output :
//	Element 1 is smaller
	
	public void unq()
	{
		int[]a= {1,2,3,1,2,4};
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(a[i]+" is unique");
			}
			
		}
	}
	
//output :
//	3 is unique
//	4 is unique
	
	public void dup()
	{
		int[]a= {1,2,3,2,4,3};
		for(int i=0;i<a.length;i++)
		{
			for(int k=i+1;k<a.length;k++)
			{
				if(a[i]==a[k])
				{
					System.out.println(a[i] + " is duplicate");
					break;
				}
			}
		}
	}
	
// output :
//	2 is duplicate
//	3 is duplicate

	public void left()
	{
		int[]a= {1,2,3,4,5};
		int b=a[0];
		int i;
		for(i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
			
		}
		a[i]=b;
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
			
		}
		
	}

// output : 2 3 4 5 1 
	
	public void right()
	{
		int[]a= {1,2,3,4,5};
		int b=a[a.length-1];
		int i;
		for(i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
			
		}
		a[i]=b;
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
			
		}
		
	}
	
// output : 5 1 2 3 4 	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		array a= new array();
		a.a1();
		a.a2();
		a.unq();
		a.dup();
		a.left();
		a.right();
	}

}

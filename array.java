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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		array a= new array();
		a.a1();
		a.a2();
	}

}

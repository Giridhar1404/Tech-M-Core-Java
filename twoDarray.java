package core;
import java.util.*;
public class twoDarray {
	public void upper()
	{
		Random r=new Random();
		int a[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=r.nextInt(10);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i>j)
				{
					System.out.print(0+" ");
				}
				else
				{
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
		
	}
	
// output :
//	2 3 1 
//	0 7 2 
//	0 0 2 
	
	public void lower()
	{
		Random r=new Random();
		int a[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=r.nextInt(10);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i<j)
				{
					System.out.print(0+" ");
				}
				else
				{
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
		
	}
// output : 
//	9 0 0 
//	3 1 0 
//	6 3 1 
	
	public void digsum()
	{
		Random r=new Random();
		int a[][]=new int[3][3];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=r.nextInt(10);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}
			
		}
		System.out.println("The sum of diagonal elements is "+sum);
	}
	
// output :	
//	1 3 5 
//	2 2 8 
//	4 1 2 
//	The sum of diagonal elements is 5
	
	public void rowsum()
	{
		Random r=new Random();
		int a[][]=new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=r.nextInt(10);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
                  sum=sum+a[i][j];
			}
			System.out.println("The sum of row "+ i +" is "+sum);
		}
		
	}
	
// output :
//	1 9 5 
//	1 0 3 
//	9 0 6 
//	The sum of row 0 is 15
//	The sum of row 1 is 4
//	The sum of row 2 is 15
	
	public void colsum()
	{
		Random r=new Random();
		int a[][]=new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=r.nextInt(10);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
                  sum=sum+a[j][i];
			}
			System.out.println("The sum of column "+ i +" is "+sum);
		}
		
	}
	
// output : 
//	6 6 5 
//	3 4 9 
//	9 2 2 
//	The sum of column 0 is 18
//	The sum of column 1 is 12
//	The sum of column 2 is 16
	
	public void add()
	{
		Random r=new Random();
		int a[][]=new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=r.nextInt(10);
			}
		}
        int b[][]=new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				b[i][j]=r.nextInt(10);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int c[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
// output : 
//	1 3 6 
//	7 1 7 
//	4 3 4 
//	
//	7 8 9 
//	8 0 1 
//	1 6 5 
//	
//	8 11 15 
//	15 1 8 
//	5 9 9 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        twoDarray t=new twoDarray();
        t.upper();
        t.lower();
        t.digsum();
        t.rowsum();
        t.colsum();
        t.add();
	}

}

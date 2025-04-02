package core;

import java.util.Scanner;

public class negative {
	
	public void age(int i) throws NegativeNumberException
	{
		if(i<0)
		{
			throw new NegativeNumberException("Entered number is negative");
		}
		else
		{
			System.out.println("Positive number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        negative n=new negative();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        int i=s.nextInt();
        try
        {
        n.age(i);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Enter a positive number .");
        }

}

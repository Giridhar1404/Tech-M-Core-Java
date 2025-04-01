package core;

public class string {
	
	public void s1()
	{
		String s="venkat";
		int v=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' )
			{
				v++;
			}
			
		}
		System.out.println("The count of vowels in given string is :" + v);
		System.out.println("The count of consonents in given string is :" + (s.length()-v));
		
	}

// output : 
//	The count of vowels in given string is :2
//	The count of consonants in given string is :4

	public void s2()
	{
		String s="vEnKaT";
		char[]c=s.toCharArray();
		char[]d=new char[c.length];
		for(int i=0;i<c.length;i++)
		{
			if(Character.isUpperCase(c[i]))
			{
				d[i]=Character.toLowerCase(c[i]);
			}
			else
			{
				d[i]=Character.toUpperCase(c[i]);
			}
		}
		for(int j=0;j<d.length;j++)
		{
			System.out.print(d[j]);
		}
		
	}
	
//   output : VeNkAt
	
	public void s3()
	{
		String s="venkat";
		String []a=s.split("");
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
	}
	
	public void s4()
	{
		String s="siva";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
	
	public void length()
	{
		String s="giri";
		char[]c=s.toCharArray();
		int count=0;
		for(char e:c)
		{
			count++;
		}
		System.out.println(count);
	}
	
	public void freq()
	{
		int i;
		
		String s="giri";
		for( i=0;i<s.length()-1;i++)
		{int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			System.out.println(s.charAt(i)+" - "+count);
		}
	}
	
//	output :
//		g - 1
//		i - 2
//		r - 1
	
	public void swap()
	{
		String s="palak";
		String a = "";
		if(s.length()%2==0)
		{
		for(int i=0;i<s.length()-1;i++)
		{
			a=a+s.charAt(i+1)+s.charAt(i);
			i++;
		}
		System.out.println(a);
		}
		else
		{
			for(int i=0;i<s.length()-1;i++)
			{
				a=a+s.charAt(i+1)+s.charAt(i);
				i++;
			}
			System.out.println(a+s.charAt(s.length()-1));
		}
	}
	
//	output : apalk
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          string s=new string();
//          s.s1();
//          s.s2();
//          s.s3();
//          s.s4();
//          s.length();
          s.freq();
          s.swap();
	}

}

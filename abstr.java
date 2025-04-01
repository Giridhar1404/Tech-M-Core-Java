package core;
abstract class bank
{
	public abstract void getrate();
}
class HDFC extends bank
{

	@Override
	public void getrate() {
		// TODO Auto-generated method stub
		int r=5;
	   System.out.println("The rate of interest for HDFC bank is : "+r+"% .");	
	}
	
}
class SBI extends bank
{

	@Override
	public void getrate() {
		// TODO Auto-generated method stub
		int r=8;
		   System.out.println("The rate of interest for SBI bank is : "+r+"% .");
	}
	
}

public class abstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HDFC h=new HDFC();
         h.getrate();
         SBI s=new SBI();
         s.getrate();
	}

}


// output : 
//	 The rate of interest for HDFC bank is : 5% .
//	 The rate of interest for SBI bank is : 8% .

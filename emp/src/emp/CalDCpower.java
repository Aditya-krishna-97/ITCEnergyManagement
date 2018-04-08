package emp;


public class CalDCpower extends CalACpower {
	public double u,p,famountDC,total;
	public void l()
	{
	System.out.println("Enter the number of units consumed using generator");	
	u=sc.nextDouble();
	}
	public void r()
	{
		System.out.println("Enter the price per each unit consumed through generator");
	p=sc.nextDouble();
	famountDC=u*p;
	System.out.println("The bill for the units consumed by DC power is"+famountDC);
	total=famountAC+famountDC;
	System.out.println("The final amount to be paid is (AC+DC) "+total);
	}
	public static void main(String[] args)
	{	
		CalDCpower h=new CalDCpower();
		h.units();
		h.price();
		h.CalACpower();
		h.l();
		h.r();
	}
}

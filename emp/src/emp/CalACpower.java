package emp;
import java.util.Scanner;
public class CalACpower
{
	Scanner sc=new Scanner(System.in);
	public double units,amount,famountAC,metercharge=50;
	double tax;
   public void units()
   {
	   System.out.println("Enter the number of units");
	   units=sc.nextFloat();
   }
   public void price()
   {
	   if(units>0 && units<=100)
			{
		   amount=units+metercharge+tax;
		   System.out.println("Electricity Bill");
	       System.out.println("The metercharge is "+metercharge);
	       System.out.println("Bill accumulated for the units consumed is "+amount);
	       }
		 else
		    {
		    	if(units>100 && units<=200)
		    	{
		    		amount=((units-100)*2)+100;
		    		System.out.println("amount is"+amount);
		    	}
		    	else
		    	{
		    	  if(units>200 && units<=300)
		    	    {
		    		 amount=((units-200)*3)+300;
		    		 System.out.println("amount for the units used without charges"+amount);
		    	    }
		    	  else
		    	      {
		    		     if(units>300 && units<=500){
		    		    	 amount=((units-300)*4)+600;
		    		    	 System.out.println("amount is"+amount);}
		    		     else{
		    		    	amount=((units-500)*5)+1400;
		    		    	System.out.println("amount is"+amount);
		    		         }
		    		   } 
		    	  }
		    	tax=amount*0.18;
		    	System.out.println("Electricity Bill");
		    	System.out.println("Meter charge is"+metercharge);
		    	System.out.println("tax is"+tax);
		    	 }  
   }
   public void CalACpower()
   {
	   famountAC=amount+metercharge+tax;
	   System.out.println("The total price to be paid for the units used under AC power with charges is "+famountAC);
   }
}
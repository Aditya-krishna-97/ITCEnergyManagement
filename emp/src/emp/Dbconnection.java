package emp;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Dbconnection{
	     public void Dbconnection(){
				try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.23.144:1521:orcl","cseb440","cseb440");
				Statement st=con.createStatement();
				//int a=rs.getInt(1);
				//String b=rs.getString(2);
				}  //end of try
				catch(Exception e)
				{
					System.out.println("Unable to connect to database please enter the correct details or check the connection"+e);
				}  //end of catch
             } //closed dbconnection()
	     public void insertingval(){
	    	 try {
	    	       Connection con;
			       Statement st=con.createStatement();  
	    	       st.executeUpdate("insert into JAVAPROJECT values(6,'Aditya krishna')");
	    	       }
	    	catch(Exception e){
	    		              System.out.println("Error in the way data is inserted.Please check the data given");
	    		              }
	    	}//closed insertion
	     public void show(){
				String sql="select * from JAVAPROJECT";
				ResultSet rs=st.executeQuery(sql);
				while(rs.next())
				{System.out.println(rs.getInt(1)+" "+rs.getString(2));
					Connection con;
					con.close();
				}
	     } //closed show
	public static void main(String args[])
	{  Scanner sc=new Scanner(System.in);
		Dbconnection h=new Dbconnection();
		h.Dbconnection();
		System.out.println("If you want to insert data enter 1");
		int p=sc.nextInt();
		if(p=1)
		{System.out.println("How many values do you want to enter");
		 int n=sc.nextInt();
		 for(i=1;i<=n;i++) {
		h.insertingval();}
		} //closed if
		else{
			System.out.println("Enter 2 to show the values entered");
			int x=sc.nextInt();
			  if(x=2)
				  {h.show();
				  }
		    }//closed else
		
     } //closed main
	}

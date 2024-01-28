package com.earn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ride2Earn 
{
	public static String s1;
	public static String s2;
	public static String s3;

	public static void main(String args[]) throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		   
		   
		   Statement stmt=con.createStatement();
		   
		   Ride2Safe obj=new Ride2Safe();
		   
		   System.out.println("Query executed....");
		   
//	       
		   
		   while(true)
		   {
			   System.out.println("---RIDING APP---");
			   System.out.println("Press 2. for a ride");
			   System.out.println("Press 3. to cancel a ride");
			   Scanner sc1 =new Scanner(System.in);
			   int choice=sc1.nextInt();
			   switch(choice)
			   {
			     case 2:
			    	obj.ride();
			    	stmt.execute(s1);
			    	
			    	break;
			    	
			     
			    	
			     case 3:
			    	 obj.cancelRide();
			    	 stmt.execute(s2);
				    	
				     break;
				    	
				    	
				    	
				 default:
					 System.out.println("You Entered Wrong Choice");
					 con.close();
					 break;
			    	
			   }
			   
			   
			   
		   }
		
	}

}

class Ride2Safe
{
	Scanner sc = new Scanner(System.in);
	public void ride()
	{
		Ride2Earn.s1="INSERT INTO STOREDATA VALUES(101,'Mohit','Shiv',4,'Chowk',56)";
	}
	
	
	
	public void cancelRide()
	{
		System.out.println("Enter id which you want to cancel:-");
		int id1=sc.nextInt();
		
		Ride2Earn.s2="DELETE FROM STOREDATA WHERE ID="+id1;
		
	}
}



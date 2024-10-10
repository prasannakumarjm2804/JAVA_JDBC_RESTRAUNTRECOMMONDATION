package com.restaurant.prasana;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class Store2 {
	  Restaurant com[];
	  Statement stmt;
	  ResultSet rs;
	  String qry=null;
//	  DButil db=new DButil();
	  Connection con;
	  List<Restaurant> list=new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      int i;
	  int e;
	  
	  public Connection getDBConnection()
		{
			Connection con=null;
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","prasanna","");
			}catch(Exception ex)
			{
				System.out.println("ex");
			}
			return con;
		}
      public void add(Restaurant c)
      {
//    	      c.setId(generateId(c));
//    	      list.add(c);
//    	      System.out.println("Successfully Added");
    
    	     try
    	     {
    	      	   Statement stmt;
    	    	   Connection con=getDBConnection();
    	    	   stmt = con.createStatement();
    	    	   int count = stmt.executeUpdate("insert into details(name,cuisine,location,phno,price,delavail,reviews,rating) values ('"+c.getName()+"','"+c.getCuisine()+"','"+c.getLocation()+"','"+c.getPhno()+"','"+c.getPrice()+"','"+c.getDelavail()+"','"+c.getReviews()+"','"+c.getRating()+"')");
   	    	     if(count==1)
   	    	     {    	    		  
   	    	    	 System.out.println("1 row inserted");
    	    	   }
    	    	  else 
    	    	  {
    	    		  throw new Exception();
    	    	  }
   	    	  } catch(Exception ex)
    	    		  {
    	    			   System.out.println(ex);
   	    		  }
    }
      public void show()
      {
//    	  System.out.println(list);
    	  Statement stmt;
    	  ResultSet rs;
//    	  DButil db=new DButil();
    	  Connection con;
   	     try {
         con=getDBConnection();
         stmt=con.createStatement();
         rs=stmt.executeQuery("select * from details");
         while(rs.next())
         System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getInt(7)+" "+rs.getFloat(8));
      }
      catch(Exception e) 
   	  {
      System.out.println(e.getMessage());
      }
      }
      
      public Restaurant search(String name)
      {
    	  
//    	  for(i=0;i<list.size();i++)
//    	  {
//    		  if(name.equals(list.get(i).getName()))
//    	         return list.get(i);
//    	  }
//		return null;
    	try {
			rs=stmt.executeQuery("select * from details where name='"+name+"'");
			while(rs.next())
		         System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getInt(7)+" "+rs.getFloat(8));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
      }
//    public String generateId(Restaurant c)
//    {
//    	String id;
//    	String n1=c.getName();
//        String n2=c.getLocation();
//    	n1=n.substring(0,2);
//    	n2=n2.substring(0,2);
//    	n1=n1.toUpperCase();
//    	id=n1+n2;
//    	return id;
//    }
     public void remove(String name)
     { 
    	 int i;
//    	 for(i=0;i<list.size();i++)
//   	  {
//   		  if(name.equals(list.get(i).getName()));
//   		  list.remove(i);
//        }
    	 try {
    		 con=getDBConnection();
             stmt=con.createStatement();
 			int count=stmt.executeUpdate("delete from details where name='"+name+"'");
 			if(count>0)
 				System.out.println("1 row is deleted");
 			else
 				System.out.println("No row is deleted");
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}  
    	
     }
     public void update(String name) throws SQLException
     {
    	 int count=0;
    	 Connection con=getDBConnection();
//    	 Restaurant cToUpdate = store.search(name);
//         if (cToUpdate != null) {
             System.out.println("1. Cuisine");
             System.out.println("2. location");
             System.out.println("3. Contact no");
             System.out.println("4. price_range");
             System.out.println("5. delivery available");
             System.out.println("6. no of reviews");
             System.out.println("7. Rating");
             System.out.println("Enter the update number: ");
             int idn = sc.nextInt();
             sc.nextLine(); 
             switch (idn) {
                 case 1:
                 	 System.out.println("Enter the cuisine:");
//                      cToUpdate.setCuisine(sc.next());
                 	stmt=con.createStatement();
                    count=stmt.executeUpdate("update details set cuisine='"+sc.next()+"' where name='"+name+"'");
                     break;
                 case 2:
                 	System.out.println("Enter the location:");
//                     cToUpdate.setLocation(sc.next());
                 	stmt=con.createStatement();
                    count=stmt.executeUpdate("update details set location='"+sc.next()+"' where name='"+name+"'");
                     break;
                 case 3:
                   	System.out.println("4. Contact No");
//                       cToUpdate.setDelavail(sc.next());
                   	stmt=con.createStatement();
                      count=stmt.executeUpdate("update details set phno='"+sc.nextLong()+"' where name='"+name+"'");
                       break;
                 case 4:
                 	System.out.println("Enter the price_range:");
//                     cToUpdate.setPrice(sc.nextLine());
                 	stmt=con.createStatement();
                    count=stmt.executeUpdate("update details set price='"+sc.next()+"' where name='"+name+"'");
                     break;
                 case 5:
                 	System.out.println("4. delivery available");
//                     cToUpdate.setDelavail(sc.next());
                 	stmt=con.createStatement();
                    count=stmt.executeUpdate("update details set delavail='"+sc.next()+"' where name='"+name+"'");
                     break;
                 case 6:
                 	System.out.println("5. no of reviews");
//                     cToUpdate.setReviews(sc.nextInt());
                 	stmt=con.createStatement();
                    count=stmt.executeUpdate("update details set reviews='"+sc.next()+"' where name='"+name+"'");
                     break;
                 case 7:
                 	System.out.println("5.Ratings");
//                     cToUpdate.setRating(sc.nextFloat());
                 	stmt=con.createStatement();
                    count=stmt.executeUpdate("update details set rating='"+sc.next()+"' where name='"+name+"'");
                     break;
                 default:
                     System.out.println("Invalid option. Please try again.");
             }
             if(count>0)
  				System.out.println("1 row is updated");
  			else
  				System.out.println("No row is update");
     }
}





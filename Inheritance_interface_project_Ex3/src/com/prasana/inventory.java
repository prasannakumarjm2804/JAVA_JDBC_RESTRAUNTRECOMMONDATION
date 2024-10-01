package com.prasana;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.util.*;

public class inventory {
    private List<mobile> mobiles;
    Connection con;
    DBCon db;
    Statement stmt;
    ResultSet res;
    private Scanner scanner;
    private int nextId;
    public inventory() {
        mobiles = new ArrayList<>();
        scanner = new Scanner(System.in);
        nextId = 1;
    }
    public void add(mobile cs) {
        /*System.out.println("Enter number of mobiles:");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Mobile Details [" + i + "]");
            String brand = scanner.nextLine();
            String model = scanner.nextLine();
            String price = scanner.nextLine();
            int quantity = scanner.nextInt();
            mobile mobile = new mobile(nextId++, brand, model, price, quantity);
            mobiles.add(mobile);
        }
        System.out.println("Added");*/
    	Statement stmt;
    	ResultSet rs;
    	String qry=null;
    	DBCon db=new DBCon();
    	boolean sts=false;
    	try
    	{
    		Connection con=db.getDBConnection();
    		stmt=con.createStatement();
    	    int count=stmt.executeUpdate("insert into menu(brand,"+ "model,price,quantity) values('"+cs.getBrand()+"','"+cs.getModel()+"','"+cs.getPrice()+"','"+cs.getQuantity()+"')");
    		System.out.println("INSERTED SUCCESFULLY");
        }
    	catch(Exception ex)
    	{
    		System.out.println(ex.getMessage());
    	}
      }
    }

    /*public void show() {
        if (mobiles.isEmpty()) {
            System.out.println("No mobiles in inventory.");
        } else {
            for (mobile mob : mobiles) {
                System.out.println(mob);
            }
        }
    }*/
    public void show() 
    {
    	Statement stmt;
    	ResultSet rs;
    	String qry=null;
    	DBCon db=new DBCon();
    	Connection con;
    	try
    	{
    		con=db.getDBConnection();
    		stmt=con.createStatement();
    		rs=stmt.executeQuery("select * from menu");
    		while(rs.next())
    		{
    			System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getInt(4));
    		}
    	}
    		catch(Exception ex)
    		{
    			System.out.println(ex.getMessage());
    		}
    }
    public void remove(String idStr){
        try {
            int id = Integer.parseInt(idStr);
            mobiles.removeIf(mobile -> mobile.getId() == id);
            System.out.println("Removed");
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format.");
        }
         /*try{
    		con=db.getDBConnection();
    		stmt=con.createStatement();
    		qry="delete from menu where idStr="+eid;
    		count=stmt.executeUpdate(qry);
    		if(count==1)	
            }*/
    public void update(String idStr){
    	/*boolean sts = false;
    	try
    	{
    	 con=db.getDBConnection();		
    	}
    }*/
        try {
            int id = Integer.parseInt(idStr);
            for (mobile mobile : mobiles) {
                if (mobile.getId() == id) {
                    System.out.println("Enter new details for mobile with ID " + id + ":");
                    System.out.print("Brand: ");
                    mobile.setBrand(scanner.nextLine());
                    System.out.print("Model: ");
                    mobile.setModel(scanner.nextLine());
                    System.out.print("Price: ");
                    mobile.setPrice(scanner.nextLine());
                    System.out.print("Quantity: ");
                    mobile.setQuantity(scanner.nextInt());
                    scanner.nextLine(); 
                    System.out.println("Updated");
                    return;
                }
            }
            System.out.println("Mobile with ID " + id + " not found.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format.");
        }
    public void search(String idStr) {
        try {
            int id = Integer.parseInt(idStr);
            for (mobile mobile : mobiles) {
                if (mobile.getId() == id) {
                    System.out.println("Mobile found: " + mobile);
                    return;
                }
            }
            System.out.println("Mobile with ID " + id + " not found.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format.");
        }
    }
}

package com.restaurant.prasana;

import java.sql.SQLException;
import java.util.Scanner;

public class main {
    private static final Store2 store = new Store2();
    private static final String ADMIN_USERNAME = "prasanna";
    private static final String ADMIN_PASSWORD = "2323";

    public static void main(String[] args) throws usererror {
        login loginSystem = new login();
   
        Scanner sc = new Scanner(System.in);
        User currentUser;

       
        loginSystem.addAdmin(ADMIN_USERNAME, ADMIN_PASSWORD);

        while (true) {
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Show Users");
            System.out.println("4. Exit");
            int opt = sc.nextInt();
            sc.nextLine(); 
            switch (opt) {
                case 1:
                    loginSystem.signUp();
                    break;
                case 2:
                    currentUser = loginSystem.authenticate();
                    if (currentUser != null) 
                    {
                        if ("admin".equals(currentUser.getRole()))
                        {
                            adminActions(sc, currentUser);
                        } 
                        else if ("user".equals(currentUser.getRole()))
                        {
                            userActions(sc, currentUser);
                        }
                    }
                    break;
                case 3:
                    loginSystem.showUsers();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    static void adminActions(Scanner sc, User admin) throws usererror {
        while (true) {
            System.out.println("Admin Menu:");
            System.out.println("1. Add restaurant");
            System.out.println("2. Update restaurant");
            System.out.println("3. Search restaurant");
            System.out.println("4. Remove restaurant");
            System.out.println("5. Show All restaurants");
            System.out.println("6. Exit");
            int option = sc.nextInt();
            sc.nextLine(); 
            switch (option) {
                case 1:
                    Restaurant c = new Restaurant();
                    System.out.println("Enter the rest Name:");
                    c.setName(sc.nextLine());
                    System.out.println("Enter the cuisine:");
                    c.setCuisine(sc.nextLine());
                    System.out.println("Enter the location:");
                    c.setLocation(sc.nextLine());
                    System.out.println("Enter the Contact No:");
                    c.setPhno(sc.nextLong());
                    System.out.println("Enter the price_range:");
                    c.setPrice(sc.next());
                    System.out.println("delivery available:");
                    c.setDelavail(sc.next());
                    System.out.println("Enter the no of reviews:");
                    c.setReviews(sc.nextInt());
                    System.out.println("Enter the rating:");
                    c.setRating(sc.nextFloat());
                    store.add(c);
                    break;
                case 2:
                    store.show();
                    System.out.println("Enter the restaurant name:");
				try {
					store.update(sc.next());
				} catch (SQLException e) {
					e.printStackTrace();
				}
//                    Restaurant cToUpdate = store.search(name);
//                    if (cToUpdate != null) {
//                        System.out.println("1. Cuisine");
//                        System.out.println("2. location");
//                        System.out.println("3. price_range");
//                        System.out.println("4. delivery available");
//                        System.out.println("5. no of reviews");
//                        System.out.println("6. Rating");
//                        System.out.println("Enter the update number:");
//                        int idn = sc.nextInt();
//                        sc.nextLine(); 
//                        switch (idn) {
//                            case 1:
//                            	 System.out.println("Enter the cuisine:");
//                                 cToUpdate.setCuisine(sc.next());
//                                
//                                break;
//                            case 2:
//                            	System.out.println("Enter the location:");
//                                cToUpdate.setLocation(sc.next());
//                                break;
//                            case 3:
//                            	System.out.println("Enter the price_range:");
//                                cToUpdate.setPrice(sc.nextLine());
//                                break;
//                            case 4:
//                            	System.out.println("4. delivery available");
//                                cToUpdate.setDelavail(sc.next());
//                                sc.nextLine(); 
//                                break;
//                            case 5:
//                            	System.out.println("5. no of reviews");
//                                cToUpdate.setReviews(sc.nextInt());
//                                break;
//                            case 6:
//                            	System.out.println("5.Ratings");
//                                cToUpdate.setRating(sc.nextFloat());
//                                break;
//                            default:
//                                System.out.println("Invalid option. Please try again.");
//                        }
//                    } else {
//                        System.out.println("restaurant not found.");
//                    }
                     break;
                case 3:
                    System.out.println("Enter the Restaurant name:");
                    String Name=sc.nextLine();
                    
                    store.search(Name);
                    
                  try {
						Restaurant cToSearch = store.search(Name);
                       if (cToSearch != null) 
                        {
                            System.out.println(cToSearch);
                        } 
                        else
                        {
                            throw new usererror("restaurant not found"); 
                        }
                    } catch (usererror e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    store.show();
                    System.out.println("Enter the restaurant name:");
                    String name = sc.next();
                    store.remove(name);
                    break;
                case 5:
                    store.show();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    static void userActions(Scanner sc, User user) {
        while (true) {
            System.out.println("User:");
            System.out.println("1. Search Restaurant");
            System.out.println("2. Show All Restaurant");
            System.out.println("3. Exit");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    store.show();
                    System.out.println("Enter the restaurant name:");
                    String name = sc.nextLine();
                    store.search(name);
                    break;
                case 2:
                    store.show();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

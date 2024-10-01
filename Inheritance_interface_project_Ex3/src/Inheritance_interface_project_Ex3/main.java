package Inheritance_interface_project_Ex3;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Book information:");
		String title=sc.next();
		int isbn=sc.nextInt();
		String author=sc.next();
		String link=sc.next();
		ebook eb=new ebook(title,isbn,author,link);
		eb.display_book_info();
		eb.display_ebook_info();
		
		
	}
	
  
}

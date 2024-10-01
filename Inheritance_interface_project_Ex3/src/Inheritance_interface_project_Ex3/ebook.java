package Inheritance_interface_project_Ex3;

public class ebook extends book{
	String book_link;
	public ebook(String title,int isbn,String author,String book_link)
	{
		super(title,isbn,author);
		this.book_link=book_link;
	}
	void display_ebook_info()
	{
		System.out.println(book_link);
	}
 
}

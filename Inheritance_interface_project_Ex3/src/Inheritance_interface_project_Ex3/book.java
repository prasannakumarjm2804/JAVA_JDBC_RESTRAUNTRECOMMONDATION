package Inheritance_interface_project_Ex3;

public class book {
  String title;
  String author;
  int isbn;
  book(String title,int isbn,String author)
  {
	  this.title=title;
	  this.isbn=isbn;
	  this.author=author;
  }
  void display_book_info()
  {
	  System.out.println(title+" "+isbn+" "+author);
  }
}

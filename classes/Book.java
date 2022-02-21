package classes;
import java.lang.*;

public class Book
{
	protected String isbn;
	protected String book_name;
	protected int pub_year;
	protected String aut_name;
	
	public Book(String isbn,String book_name, int pub_year, String aut_name)
	{
		this.isbn= isbn;
		this.book_name= book_name;
		this.pub_year= pub_year;
		this.aut_name= aut_name;
	}
	
	public String getisbn()
	{
		return isbn;
	}
	public String getbook_name()
	{
		return book_name;
	}
	public int getpub_year()
	{
		return pub_year;
	}
	public String getaut_name()
	{
		return aut_name;
	}
	
	public void setisbn(String isbn)
	{
		this.isbn= isbn;
	}
	public void setbook_name(String book_name)
	{
		this.book_name= book_name;
	}
	public void setpub_year(int pub_year)
	{
		this.pub_year= pub_year;
	}
	public void setaut_name(String aut_name)
	{
		this.aut_name= aut_name;
	}
	
	public void showdetails()
	{
	    System.out.println("ISBN: "+isbn);
		System.out.println("Book name: "+book_name);
		System.out.println("Publish year: "+pub_year);
		System.out.println("Author name: "+aut_name);
	}
}
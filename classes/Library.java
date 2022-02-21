package classes;
import java.lang.*;
import interfaces.ILibrary;

public class Library implements ILibrary
{
	protected String lib_phn_num;
	protected String lib_address;
	protected Person person[] = new Person[5];
	protected Book book[] = new Book[5];
	
	public Library(String lib_phn_num, String lib_address)
	{
		this.lib_phn_num= lib_phn_num;
		this.lib_address= lib_address;
	}
	
	public String getlib_phn_num()
	{
		return lib_phn_num;
	}
	public String getlib_address()
	{
		return lib_address;
	}
	
	public void setlib_phn_num(String lib_phn_num)
	{
		this.lib_phn_num= lib_phn_num;
	}
	public void setlib_address(String lib_address)
	{
		this.lib_address= lib_address;
	}
	
	
	public boolean insertperson(Person P)
	{
		boolean flag = false;
		for(int i = 0; i<person.length; i++)
		{
			if(person[i] == null)
			{
				person[i] = P;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeperson(Person P)
	{
		boolean flag = false;
		for(int i=0; i<person.length; i++)
		{
			if(person[i] == P)
			{
				person[i] = null;
				flag = true;
				break;
			}
		}
		return flag;		
	}
	public void showallperson()
	{
		for(int i=0; i<person.length; i++)
		{
			if(person[i] != null)
			{
				person[i].showdetails();
				System.out.println();
			}
			
		}
	}
	public Person searchperson(String id)
	{
		Person flag = null;
		for(int i=0; i<person.length; i++)
		{
			if(person[i] != null)
			{
				if(person[i].getid().equals(id))
				{
					flag = person[i];
					break;
				}
			}
		}
		return flag;
	}
	
	
	
	
	public boolean insertbook(Book B)
	{
		boolean flag = false;
		for(int i = 0; i<book.length; i++)
		{
			if(book[i] == null)
			{
				book[i] = B;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removebook(Book B)
	{
		boolean flag = false;
		for(int i=0; i<book.length; i++)
		{
			if(book[i] == B)
			{
				book[i] = null;
				flag = true;
				break;
			}
		}
		return flag;		
	}
	public void showallbook()
	{
		for(int i=0; i<book.length; i++)
		{
			if(book[i] != null)
			{
				book[i].showdetails();
				System.out.println();
			}
			
		}
	}
	public Book searchbook(String isbn)
	{
		Book flag = null;
		for(int i=0; i<book.length; i++)
		{
			if(book[i] != null)
			{
				if(book[i].getisbn().equals(isbn))
				{
					flag = book[i];
					break;
				}
			}
		}
		return flag;
	}
	
	public void showdetails()
	{
		System.out.println("Library phone number: "+lib_phn_num);
		System.out.println("Library address: "+lib_address);
	}
}
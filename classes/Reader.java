package classes;
import java.lang.*;

public class Reader extends Person
{
	protected String is_member;
	
	public Reader(String id, String name, String phn_num, String address, String is_member)
	{
	    super(id, name, phn_num, address);
		this.is_member= is_member;
	}
	
	public String getis_member()
	{
		return is_member;
	}
	
	public void setis_member(String is_member)
	{
		this.is_member= is_member;
	}
	
	public void showdetails()
	{
		System.out.println("Reader ID: "+id);
		System.out.println("Reader name: "+name);
		System.out.println("Reader phone number: "+phn_num);
		System.out.println("Reader nddress: "+address);
		System.out.println("Is reader member?: "+is_member);
	}
}	
package classes;
import java.lang.*;
public class Stuff extends Person
{
	protected String is_permanent;
	
	public Stuff(String id, String name, String phn_num, String address, String is_permanent)
	{
	    super(id, name, phn_num, address);
		this.is_permanent= is_permanent;
	}
	
	public String getis_permanent()
	{
		return is_permanent;
	}
	
	public void setis_permanent(String is_permanent)
	{
		this.is_permanent= is_permanent;
	}
	
	public void showdetails()
	{
		System.out.println("Stuff ID: "+id);
		System.out.println("Stuff name: "+name);
		System.out.println("Stuff phone number: "+phn_num);
		System.out.println("Stuff address: "+address);
		System.out.println("Is stuff permanent?: "+is_permanent);
	}
}	
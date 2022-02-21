package classes;
import java.lang.*;

public abstract class Person
{	
	protected String id;
	protected String name;
	protected String phn_num;
	protected String address;
	
	public Person(String id, String name, String phn_num, String address)
	{
	    this.id= id;
		this.name= name;
		this.phn_num= phn_num;
		this.address= address;
	}
	
	public String getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public String getphn_num( )
	{
		return phn_num;
	}
	public String getaddress( )
	{
		return address;
	}
	
	public void setname(String name)
	{
		this.name= name;
	}
	public void setphn_num(String phn_num)
	{
		this.phn_num= phn_num;
	}
	public void setaddress(String address)
	{
		this.address= address;
	}
	public void setid(String id)
	{
		this.id= id;
	}
	
	public abstract void showdetails();
}
import java.lang.*;
import classes.*;
import fileio.*;
import java.util.Scanner;
public class Start
{
	public static void main(String args[])
	{
		Library l= new Library("+8802","Dhaka");
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
        Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("###########################################");
		System.out.println( "WelCome to Library Management System");
		System.out.println("###########################################");
		System.out.println();
		System.out.println();
		
	    boolean repeat= true;
		
	    while(repeat)
		{
	        System.out.println("**********************************");
			System.out.println("What do you want to do?");
			System.out.println("\t1. Reader management");
			System.out.println("\t2. Stuff management");
			System.out.println("\t3. Book management");
			System.out.println("\t4. Issue book corner");
			System.out.println("\t5. Exit");
		    System.out.println("**********************************");
		    System.out.print("Your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{	
				///////
	            case 1:
				
				System.out.println("............................................");
				System.out.println("You have chose reader management");
				System.out.println("............................................");
				
				System.out.println("You have the following options:");
				System.out.println("\t1. Insert new reader");
				System.out.println("\t2. Remove existing reader");
				System.out.println("\t3. Search a reader");
				System.out.println("\t4. Show all reader");
				System.out.println("\t5. Go back");
				System.out.println("............................................");
				System.out.print("Your option: ");
				
				int option1 = sc.nextInt();
				
				switch(option1)
				{
					case 1:
					
					System.out.println("............................................");
					System.out.println("You have chose to insert new reader");
					System.out.println("............................................");
					
					System.out.print("Enter reader ID: ");
					String rid1 = sc.next();
					System.out.print("Enter reader Name: ");
					String rname1 = sc.next();
					System.out.print("Enter phone number: ");
					String rphn1 = sc.next();
					System.out.print("Enter address: ");
					String radd1 = sc.next();
					System.out.print("Is reader member of the library?: ");
					String rsal1 = sc.next();
					
					Reader r1= new Reader(rid1,rname1,rphn1,radd1,rsal1);
					
					if(l.insertperson(r1)){System.out.println(r1.getid() + " Inserted");}
					else{System.out.println(r1.getid() + " Not Inserted");}
					
					System.out.println();
					break;
					
					case 2:
					
					System.out.println("............................................");
					System.out.println("You have chose to remove an reader");
					System.out.println("............................................");
					
					System.out.print("Enter reader ID: ");
					String rid2 = sc.next();
					
					Person r2 = l.searchperson(rid2);
					
					if(r2 != null)
					{
						if(l.removeperson(r2)){System.out.println("Removed");}
					}
					else{System.out.println("Not removed");}
					System.out.println();
					break;
					
					case 3: 
					
					System.out.println("............................................");
					System.out.println("You have chose to search a reader");
					System.out.println("............................................");
					
					System.out.print("Enter reader ID: ");
					String rid3 = sc.next();
					
					Person r3= l.searchperson(rid3);
					
					if(r3 != null)
					{
						System.out.println("Reader found");
						System.out.println("Reader ID: " + r3.getid());
						System.out.println("Reader name: " + r3.getname());
						System.out.println("Reader phone number: " + r3.getphn_num());
						System.out.println("Reader address: " + r3.getaddress());
					    System.out.println("Is reader a member?: " + ((Reader)r3).getis_member());
					}
					else
					{
						System.out.println("Reader not found");	
					}
					System.out.println();
					break;
					
					case 4: 
					
					System.out.println("............................................");
					System.out.println("You have chose to search all reader");
					System.out.println("............................................");
					l.showallperson();
					System.out.println();
					break;
					
					case 5: 
					
					System.out.println("............................................");
					System.out.println("You have chose go back");
					System.out.println("............................................");
					break;
					
					default:
					
					System.out.println("............................................");
					System.out.println("Invalid option");
					System.out.println("............................................");
					break;
				}
				break;
				
				///////
				case 2:
				
				System.out.println("............................................");
				System.out.println("You have chose stuff management");
				System.out.println("............................................");
				
				System.out.println("You have the following options:");
				System.out.println("\t1. Insert new stuff");
				System.out.println("\t2. Remove existing stuff");
				System.out.println("\t3. Search a stuff");
				System.out.println("\t4. Show all stuff");
				System.out.println("\t5. Go back");
				System.out.println("............................................");
				System.out.print("Your Option: ");
				int option2 = sc.nextInt();
				
				switch(option2)
				{
					case 1:
					
					System.out.println("............................................");
					System.out.println("You have chose to insert new stuff");
					System.out.println("............................................");
					
					System.out.print("Enter stuff ID: ");
					String sid1 = sc.next();
					System.out.print("Enter stuff name: ");
					String sname1 = sc.next();
					System.out.print("Enter phone number: ");
					String sphn1 = sc.next();
					System.out.print("Enter address: ");
					String sadd1 = sc.next();
					System.out.print("Is stuff job permanent?: ");
					String ssal1 = sc.next();
					
					Stuff s= new Stuff(sid1,sname1,sphn1,sadd1,ssal1);
					
					if(l.insertperson(s)){System.out.println(s.getid() + " Inserted");}
					else{System.out.println(s.getid() + " Not inserted");}
					
					System.out.println();
					break;
					
					case 2:
					
					System.out.println("............................................");
					System.out.println("You have chose to remove an stuff");
					System.out.println("............................................");
					
					System.out.print("Enter stuff ID: ");
					String sid2 = sc.next();
					
					Person s2 = l.searchperson(sid2);
					
					if(s2 != null)
					{
						if(l.removeperson(s2)){System.out.println("Removed");}
					}
					else{System.out.println("Not removed");}
					System.out.println();
					break;
					
					case 3: 
					
					System.out.println("............................................");
					System.out.println("You have chose to search a stuff");
					System.out.println("............................................");
					
					System.out.print("Enter stuff ID: ");
					String sid3 = sc.next();
					
					Person s3 = l.searchperson(sid3);
					
					if(s3 != null)
					{
						System.out.println("Stuff found");
						System.out.println("Stuff ID: " + s3.getid());
						System.out.println("Stuff name: " + s3.getname());
						System.out.println("Stuff phone number: " + s3.getphn_num());
						System.out.println("Stuff address: " + s3.getaddress());
					    System.out.println("Stuff : " +((Stuff)s3).getis_permanent());
					}
					else
					{
						System.out.println("Stuff not found");	
					}
					System.out.println();
					break;
					
					case 4: 
					
					System.out.println("............................................");
					System.out.println("You have chose to search all stuff");
					System.out.println("............................................");
					l.showallperson();
					System.out.println();
					break;
					
					case 5: 
					
					System.out.println("............................................");
					System.out.println("You have chose go back");
					System.out.println("............................................");
					break;
					
					default:
					
					System.out.println("............................................");
					System.out.println("Invalid option");
					System.out.println("............................................");
					break;
				}
				break;	
				
				///////
				case 3:
				
				System.out.println("............................................");
				System.out.println("You have chose book management");
				System.out.println("............................................");
				
				System.out.println("You have the following options:");
				System.out.println("\t1. Insert new book");
				System.out.println("\t2. Remove existing book");
				System.out.println("\t3. Search a book");
				System.out.println("\t4. Show all book");
				System.out.println("\t5. Go back");
				System.out.println("............................................");
				System.out.print("Your option: ");
				int option3 = sc.nextInt();
				
				switch(option3)
				{
					case 1:
					
					System.out.println("............................................");
					System.out.println("You have chose to insert new book");
					System.out.println("............................................");
					
					System.out.print("Enter book ISBN: ");
					String bisbn1 = sc.next();
					System.out.print("Enter book name: ");
					String bname1 = sc.next();
					System.out.print("Enter publish year: ");
					int byear1 = sc.nextInt();
					System.out.print("Enter author name: ");
					String baname1 = sc.next();
					
					Book b= new Book(bisbn1,bname1,byear1,baname1);
					
					if(l.insertbook(b)){System.out.println(b.getisbn() + " Inserted");}
					else{System.out.println(b.getisbn() + " Not inserted");}
					
					System.out.println();
					break;
					
					case 2:
					
					System.out.println("............................................");
					System.out.println("You have chose to remove a book");
					System.out.println("............................................");
					System.out.print("Enter book ISBN: ");
					String bisbn2 = sc.next();
					
					Book b2 = l.searchbook(bisbn2);
					
					if(b2 != null)
					{
						if(l.removebook(b2)){System.out.println("Removed");}
					}
					else{System.out.println("Not removed");}
					System.out.println();
					break;
					
					case 3: 
					
					System.out.println("............................................");
					System.out.println("You have chose to search a book");
					System.out.println("............................................");
					
					System.out.print("Enter book ISBN: ");
					String bisbn3 = sc.next();
					
					Book b3 = l.searchbook(bisbn3);
					
					if(b3 != null)
					{
						System.out.println("Book found");
						System.out.println("Book ISBN: " + b3.getisbn());
						System.out.println("Book name: " + b3.getbook_name());
						System.out.println("Book publish year: " + b3.getpub_year());
						System.out.println("Book author name: " + b3.getaut_name());
					}
					else
					{
						System.out.println("Book not found");	
					}
					System.out.println();
					break;
					
					case 4: 
					
					System.out.println("............................................");
					System.out.println("You have chose to search all book");
					System.out.println("............................................");
					l.showallbook();
					System.out.println();
					break;
					
					case 5: 
					
					System.out.println("............................................");
					System.out.println("You have chose go back");
					System.out.println("............................................");
					break;
					
					default:
					
					System.out.println("............................................");
					System.out.println("Invalid option");
					System.out.println("............................................");
					break;
				}
				break;	
				
				///////
			    case 4:
				
				System.out.println("............................................");
				System.out.println("You have chose issue book corner");
				System.out.println("............................................");
				
				System.out.println("You have the following options:");
				System.out.println("\t1. Take loan a book");
				System.out.println("\t2. Return book");
				System.out.println("\t3. Loan history");
				System.out.println("\t4. Go back");
				System.out.println("............................................");
				System.out.print("Your option: ");
				int option4 = sc.nextInt();
				
				switch(option4)
				{
					case 1:
					
					System.out.println("............................................");
					System.out.println("You have chose to loan a book");
					System.out.println("............................................");
					
					System.out.println("Enter ID for loan book: ");
					String pi1 = sc.next();
					
					Person p1 = l.searchperson(pi1);
					
					
					if(p1 != null)
					{
						System.out.println("Enter book ISBN for loan book: ");
						String rb1 = sc.next();
						
						Book retbook1= l.searchbook(rb1);
						
						if(retbook1!=null)
						{
							System.out.println("Your loan accept");
							String f = "ISBN: "+ retbook1.getisbn()+ " book loan by ID: "+ p1.getid();
							
							frwd.writeInFile(f);
						}
						else
						{
							System.out.println("Not accept");
						}
						
					}
					else
                    {
                        System.out.println("Invalid person");
					}
					
					System.out.println();
					break;
					
					case 2:
					System.out.println("............................................");
					System.out.println("You have chose to return a book");
					System.out.println("............................................");
					
					System.out.println("Enter ID for return book: ");
					String pi = sc.next();
					
					Person p = l.searchperson(pi);
					
					
					if(p != null)
					{
						System.out.println("Enter book ISBN to return the book: ");
						String rb = sc.next();
						
						Book retbook= l.searchbook(rb);
						
						if(retbook!=null)
						{
							System.out.println("Current loan return");
							String f = "ISBN: "+ retbook.getisbn()+ " book return by ID: "+ p.getid();
							frwd.writeInFile(f);
						}
						else
						{
							System.out.println("Not return");
						}
						
					}
					else
                    {
                        System.out.println("Invalid person");
					}
					
					System.out.println();
					break;
					
					case 3: 
					
					System.out.println("............................................");
					System.out.println("You have chose to see all issue book history");
					System.out.println("............................................");
					frwd.readFromFile();
					System.out.println();
					break;
					
					case 4: 
					
					System.out.println("............................................");
					System.out.println("You have chose go back");
					System.out.println("............................................");
					System.out.println();
					break;
					
					default:
					
					System.out.println("............................................");
					System.out.println("Invalid option");
					System.out.println("............................................");
					break;
				}
				break;	
				///////
				case 5: 
				System.out.println("............................................");
				System.out.println("You have chose to exit");
				System.out.println("............................................");
				repeat = false;
				break;
				
				///////	   
				default:
				System.out.println("............................................");
				System.out.println("Invalid choice...............");
				System.out.println("............................................");
				break;
			}
			
		}
		
	}
}
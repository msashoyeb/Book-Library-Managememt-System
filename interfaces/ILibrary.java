package interfaces;
import java.lang.*;
import classes.Person;
import classes.Book;

public interface ILibrary
{
	boolean insertperson(Person P);
	boolean removeperson(Person P);
	void showallperson();
	Person searchperson(String id);
	
    boolean insertbook(Book B);
	boolean removebook(Book B);
	void showallbook();
	Book searchbook(String isbn);
}
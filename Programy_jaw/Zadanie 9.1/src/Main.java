import java.util.ArrayList;

import database.BookManager;
import database.IManager;
import database.MockDb;

import model.*;


public class Main {

	public static void main(String[] args) {

		Book book = new Book();

		book.setTitle("Thinking in java");
		book.setPublisher("PWN");
		book.setYear(2013);
		Author a = new Author();
		a.setName("Bruce");
		a.setSurname("Eckel");
		ArrayList<Author> authors = new ArrayList();
		authors.add(a);
		book.setAuthors(authors);

		Magazine m = new Magazine();
		m.setTitle("Programista");
		m.setNumber(10);
		m.setTypeOfMagazine(MagazineType.miesiecznik);
		m.setYear(2013);

		MockDb db = new MockDb();

		db.save(m);
		db.save(book);

		IManager<Book> bookMgr = new BookManager();

		for(LibraryItem item: bookMgr.getAll())
		{			
			System.out.println(item.show()+"\n");
		}


	}

}
import java.util.ArrayList;

import Part1Logic.Autor;
import Part1Logic.Book;
import Part1Logic.Magazine;
import Part1Logic.MagazineType;
import Part1Logic.library;
import Part2database.MockDB;



public class Main {
	public static void main(String[] args)
	{
		Book book = new Book();
		Book book2 = new Book();
		
		book.setTitle("Trink in wa");
		book.setWydawca("rwp");
		book.setYear(2013);
		Autor a = new Autor();
		a.setName("burs");
		a.setSurname("exel");
		ArrayList<Autor> autors = new ArrayList();
		autors.add(a);
		book.setAutors(autors);
		
		Magazine m = new Magazine();
		m.setTitle("progo");
		m.setNumber(10);
		m.setTypeofmagazine(MagazineType.miesiecznik);
		m.setYear(3201);
		MockDB db = new MockDB();
		
		db.save(m);
		db.save(book);
		
		for(library item: db.getAllItems())
		{
			System.out.println(item.show()+"\n");
		}
	}

}

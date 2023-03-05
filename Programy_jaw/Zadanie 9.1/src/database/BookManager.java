package database;

import java.util.List;

import model.Book;

public class BookManager implements IManager<Book>{

	@Override
	public void save(Book obj) {

		MockDb.save(obj);

	}

	@Override
	public void delete(Book obj) {
		MockDb.delete(obj);

	}

	@Override
	public Book get(int id) {
		List<Book> res = MockDb.getItemsByType(Book.class);
		for(Book b : res)
		{
			if(b.getId()==id)
				return b;
		}
		return null;
	}

	@Override
	public List<Book> getAll() {
		return MockDb.getItemsByType(Book.class);
	}

}
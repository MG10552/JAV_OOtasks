package database;

import java.util.List;

import model.LibraryItem;

public interface IManager<T extends LibraryItem> {

	public void save(T obj);
	public void delete(T obj);
	public T get(int id);
	public List<T> getAll();
}
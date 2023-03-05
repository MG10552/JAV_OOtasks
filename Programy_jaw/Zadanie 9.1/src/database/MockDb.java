package database;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class MockDb {

	private static ArrayList<LibraryItem> allItems = new ArrayList<LibraryItem>();
	private static int size;

	public static ArrayList<LibraryItem> getAllItems()
	{
		return allItems;
	}

	public static LibraryItem get(int id)
	{
		return allItems.get(id);
	}

	public static void save(LibraryItem item)
	{
		size++;
		item.setId(size);
		allItems.add(item);
	}

	public static void delete(LibraryItem item)
	{
		allItems.remove(item);
	}

	public static <T extends IManager<Book>> void saveItem(T obj)
	{

	}

	public static <T> String getName(){return null;}

	public static <T extends LibraryItem> List<T> getItemsByType(Class<T> c)
	{
		List<T> result = new ArrayList<T>();
		for(LibraryItem item: allItems)
		{
			if(item.getClass().getName().equals(c.getName()))
			{
				result.add((T)item);
			}
		}

		return result;
	}

}
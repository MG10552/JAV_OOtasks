package Part2database;
import java.util.*;

import Part1Logic.*;
public class MockDB {

	ArrayList<library> allItems;
	public MockDB()
	{
		allItems = new ArrayList();
	}
	public library get(int id)
	{
		return (library) allItems.get(id);
		
	}
	
/*	public ArrayList();
	{
		
	}
	*/
	
	public void save(library item)
	{
		allItems.add(item);
	}
	public void delete(library item)
	{
		allItems.remove(item);
		
	}
	public ArrayList getAll(Class c)
	{
		ArrayList result = new ArrayList();
		for (library item:allItems)
		{
			if (item.getClass().equals(c))
			{
				result.add(item);
			}
		}
		return result;
	}
	public Object getAllItems() {
		// TODO Auto-generated method stub
		return null;
	}
}

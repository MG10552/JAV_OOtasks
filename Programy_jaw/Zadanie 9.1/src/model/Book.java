package model;

import java.util.*;

public class Book extends LibraryItem {

	private ArrayList<Author> authors;
	private String publisher;

	@Override
	protected String showDetails() {

		String details;
		details="\nAutorzy:";
		for(Author a : authors)
		{
			details+="\nb"+a;
		}
		details+="Wydawca: "+this.publisher;
		return details;
	}

	public ArrayList<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<Author> arrayList) {
		this.authors = arrayList;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



}
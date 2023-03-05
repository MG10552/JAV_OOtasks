package model;

public abstract class LibraryItem {

	protected int id;
	protected String title;
	protected int year;

	public final String show()
	{
		String details;
		details="Tytul: "+this.title;
		details+="\nRok: "+this.year;
		details+=showDetails();

		return details;
	}

	protected abstract String showDetails();


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
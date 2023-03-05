package Part1Logic;

public abstract class library {

	protected String title;
	protected int year;
	
public String show()
{
	String details;
	details = "Tytul: "+this.title;
	details+="Year: " +this.year;
	details+=ShowDetails();
	return details;
}
	
	
	protected abstract String ShowDetails();

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
	
}

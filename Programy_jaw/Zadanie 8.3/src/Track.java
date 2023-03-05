public class Track {

	private int time;
	private String title;
	private Author author;
	private int id;

	public Track(String title, Author author, int time, int id)
	{
		this.time=time;
		this.author=author;
		this.title=title;
		this.id=id;
	}

	public String getDetails()
	{
		return "Title: " + title+
				"\nAuthor: " +author.getName()+
				"\nTime: " + time;
	}

	public int getTime() {
		return time;
	}

	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}

	public int getId() {
		return id;
	}



}
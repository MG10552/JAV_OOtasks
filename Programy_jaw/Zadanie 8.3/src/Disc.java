import java.util.ArrayList;


public class Disc {

	private String title;
	private ArrayList<Track> tracks;
	private int time;
	private int id;

	public Disc(String title, ArrayList<Track> tracks, int id)
	{
		this.id=id;
		this.title=title;
		this.tracks = tracks;
	}

	public int getTime()
	{
		if(this.time == 0)
		{
			for(Track t: this.tracks)
			{
				this.time+=t.getTime();
			}
		}
		return this.time;
	}

	public ArrayList<Author> getAuthors()
	{
		ArrayList<Author> result = new ArrayList<Author>();

		for(Track t : this.tracks)
		{
			if(!result.contains(t.getAuthor()))
				result.add(t.getAuthor());
		}

		return result;
	}

	public String getTitle() {
		return title;
	}

	public ArrayList<Track> getTracks() {
		return tracks;
	}

	public int getId() {
		return id;
	}


}
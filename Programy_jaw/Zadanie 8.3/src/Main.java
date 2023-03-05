import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {

		DiscDatabase metal = new DiscDatabase();

		Author a1 = new Author("Nirvana");
		Author a2 = new Author("Metallica");
		Author a3 = new Author("System of a down");

		ArrayList<Track> tracks = new ArrayList<Track>();
		Track t1 = new Track("Smells like teen spirit", a1, 240, 1);
		Track t2 = new Track("One", a2, 600, 2);
		Track t3 = new Track("Memeory Remains", a2, 300, 3);
		Track t4 = new Track("Chop Suey", a3, 210, 4);

		tracks.add(t4);
		tracks.add(t3);
		tracks.add(t2);
		tracks.add(t1);

		Disc cd1 = new Disc("Metal 1", tracks, 1);
		Disc cd2 = new Disc("Metal 2", tracks, 1);

		metal.addDisc(cd2);
		metal.addDisc(cd1);

		for(Author a : cd1.getAuthors())
		{
			System.out.println(a.getName());
		}

		for(Disc d: metal.getDiscs())
		{
			System.out.println(d.getTitle()+ " "+ d.getTime()+"" +
					"\n++++++++++++++++++++++++++++++++");
			for(Track t : d.getTracks())
			{
				System.out.println(t.getDetails()+"\n");
			}
		}

	}

}
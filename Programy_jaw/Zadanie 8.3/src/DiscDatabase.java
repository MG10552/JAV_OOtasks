 import java.util.ArrayList;


public class DiscDatabase {

	private ArrayList<Disc> discs;

	public DiscDatabase()
	{
		this.discs=new ArrayList<Disc>();
	}

	public ArrayList<String> getTitles()
	{
		ArrayList<String> result = new ArrayList<String>();
		for(Disc d : discs)
			result.add(d.getTitle());
		return result;
	}

	public void addDisc(Disc disc)
	{
		discs.add(disc);
	}

	public ArrayList<Disc> getDiscs() {
		return discs;
	}

	public void setDiscs(ArrayList<Disc> discs) {
		this.discs = discs;
	}


}
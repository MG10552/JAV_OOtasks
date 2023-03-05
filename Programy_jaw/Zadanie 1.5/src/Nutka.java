
public class Nutka {
	
	//nazwa, trwa, wykonawcy, kompozytor, nid
	
	private String nazwa;
	private int trwa;
	private String wykonawcy;
	private String kompozytor;
	private int nid;
	
	public Nutka()
	{

	}

	public Nutka(String nazwa)
	{
		this.nazwa=nazwa;
	}



	public Nutka(String nazwa, String wykonawcy)
	{
//		this(name,surname,0,"Brzegi 55");
	}

	public Nutka(String nazwa, int trwa, String wykonawcy, 
			String kompozytor, int nid)
	{
		this.nazwa=nazwa;
		this.trwa=trwa;
		this.wykonawcy=wykonawcy;
		this.kompozytor=kompozytor;
		this.nid=nid;
	}

	public String showDetails()
	{
		String result="Nazwa utworu: "+this.nazwa+"\n Wykonawca: "+this.wykonawcy+"\n Kompozytor: "+
					this.kompozytor+"\nThis song lasts: "+this.trwa+" mins.\n";
		return result;
	}



	public void setnazwa(String nazwa)
	{
		this.nazwa=nazwa;
	}

	public String getnazwa()
	{
		return this.nazwa;
	}

	public String getwykonawcy() 
	{
		return wykonawcy;
	}

	public void set(String wykonawcy) 
	{
		this.wykonawcy=wykonawcy;
	}

	public int gettrwa() 
	{
		return trwa;
	}

	public void settrwa(int trwa) 
	{
		this.trwa = trwa;
	}

	public String getkompozytor() 
	{
		return kompozytor;
	}

	public void setkompozytor(String kompozytor) 
	{
		this.kompozytor = kompozytor;
	}
	
	public int getnid() 
	{
		return nid;
	}

	public void setnid(int nid) 
	{
		this.nid = nid;
	}

}

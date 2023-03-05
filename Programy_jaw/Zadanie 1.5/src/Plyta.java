public class Plyta {

//	tytul, czas, listutworow, spisautorow, identyfikator
	
	private String tytul;
	private int czas;
	private String listautworow;
	private String spisautorow;
	private int identyfikator;
	
	public Plyta()
	{

	}

	public Plyta(String tytul)
	{
		this.tytul=tytul;
	}



	public Plyta(String tytul, String spisautorow)
	{
//		this(name,surname,0,"Brzegi 55");
	}

	public Plyta(String tytul, int czas, String listautworow, 
			String spisautorow, int identyfikator)
	{
		this.tytul=tytul;
		this.czas=czas;
		this.listautworow=listautworow;
		this.spisautorow=spisautorow;
		this.identyfikator=identyfikator;
	}

	public String showDetails()
	{
		String result="Nazwa plyty: "+this.tytul+"\n Autorzy: "+this.spisautorow+"\n Utwory: "+
					this.listautworow+"\nWhole Disk lasts: "+this.czas+" mins.\n";
		return result;
	}



	public void settytul(String tytul)
	{
		this.tytul=tytul;
	}

	public String gettytul()
	{
		return this.tytul;
	}

	public String getlistautworow() 
	{
		return listautworow;
	}

	public void set(String listautworow) 
	{
		this.listautworow = listautworow;
	}

	public int getczas() 
	{
		return czas;
	}

	public void setczas(int czas) 
	{
		this.czas = czas;
	}

	public String getspisautorow() 
	{
		return spisautorow;
	}

	public void setspisautorow(String spisautorow) 
	{
		this.spisautorow = spisautorow;
	}
	
	public int getidentyfikator() 
	{
		return identyfikator;
	}

	public void setidentyfikator(int identyfikator) 
	{
		this.identyfikator = identyfikator;
	}
}

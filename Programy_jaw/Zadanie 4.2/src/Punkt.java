
public class Punkt {
	
	public int x;
	public int y;
	
	public static int ostatnix;
	public static int ostatniy;
	private Punkt(){}
	
	public static Punkt utworzPunkt(int x, int y)
	{
		ostatnix = x;
		ostatniy = y;
		Punkt p = new Punkt();
		p.x = x;
		p.y = y;
		return p;
	}

}

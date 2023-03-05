package Part1Logic;

public class Magazine extends library {

	private int number;
	private MagazineType typeofmagazine;
	
	protected String ShowDetails()
	{
		String details;
		return details="numer magazynu";
	}
	
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public MagazineType getTypeofmagazine() {
		return typeofmagazine;
	}
	public void setTypeofmagazine(MagazineType typeofmagazine) {
		this.typeofmagazine = typeofmagazine;
	}
	
	
	
	
}

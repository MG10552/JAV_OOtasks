package model;

public class Magazine extends LibraryItem{

	private int number;
	private MagazineType typeOfMagazine;

	@Override
	protected String showDetails() {
		String details;
		details="\nNumer magazynu: "+this.number+"\n";
		details+="Typ: "+ typeOfMagazine;
		return details;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public MagazineType getTypeOfMagazine() {
		return typeOfMagazine;
	}

	public void setTypeOfMagazine(MagazineType typeOfMagazine) {
		this.typeOfMagazine = typeOfMagazine;
	}


}
package Part1Logic;

public class Autor {
	
	private String name;
	private String surname;
	
	public String toString()
	{
		return "Imie: "+this.name+"\n" + "Nazwisko: " +this.surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

}

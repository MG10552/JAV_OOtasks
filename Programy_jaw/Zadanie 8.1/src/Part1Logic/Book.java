package Part1Logic;

import java.util.*;
public class Book extends library {

		private ArrayList<Autor> autors;
		public String wydawca;

	@Override
	protected String ShowDetails() {
		String details;
		details="Autorzy";
		details+="Autorzy: ";
				for(Autor a : autors)
				{
					details+=a+"\n";
				}
				details+="Wydawca: "+ this.wydawca;
		return details;
	}
	
	public ArrayList<Autor> getAutors() {
			return autors;
		}


		public void setAutors(ArrayList<Autor> autors) {
			this.autors = autors;
		}


		public String getWydawca() {
			return wydawca;
		}


		public void setWydawca(String wydawca) {
			this.wydawca = wydawca;
		}


	

}

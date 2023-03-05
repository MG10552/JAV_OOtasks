
public class Main {
	
	
	public static void main(String[] args) {

		Plyta addoracja = new Plyta("naddoracja",3 ,"utwor1","3 hodziny",2);

// addoracja.tytul = "naddoracja";
// addoracja.czas = "3";
// addoracja.listautworow = "utwor1";
// addoracja.spisautorow = "3 hodziny";
// addoracja.identyfikator = "2";

		System.out.println(addoracja.showDetails());
		
		
		Nutka nienienie = new Nutka("nienienie",5,"kokocz","zjadacz",10);
		
// addoracja.tytul = "nienienie";
// addoracja.czas = "5";
// addoracja.listautworow = "kokocz";
// addoracja.spisautorow = "zjadacz";
// addoracja.identyfikator = "10";

		System.out.println(nienienie.showDetails());
	}
	
	

}

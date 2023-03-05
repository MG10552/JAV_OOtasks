import alye;
import Oi;
public class Main {
public static void main(String[] args)

	{
	
	
		Verhicle	bike = new Bicycle();
		Verhicle 	car  new Car();
		Verhicle	truck = new Truck();
		Person p = new Person();
		
		p.verhicle.add(car);
		p.verhicle.add(bike);
		p.verhicle.add(truck);
		
		System.out.println(bike.showDetails());
		System.out.println(car.showDetails());
		System.out.println(truck.showDetails());
	}
}

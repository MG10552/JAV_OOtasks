package operations;

import model.Car;

public class CleaningOperation implements OperationInterface{

	@Override
	public void doService(Car car) {

		System.out.println("Czyszczenie samochodu");
		car.setClean(true);

	}

	@Override
	public boolean checkForService(Car car) {
		if(car.isClean())
			System.out.println("nie trzeba czyścić");
		return !car.isClean();
	}

}
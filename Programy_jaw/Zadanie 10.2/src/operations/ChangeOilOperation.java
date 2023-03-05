package operations;

import model.Car;

public class ChangeOilOperation implements OperationInterface{

	@Override
	public void doService(Car car) {

		System.out.println("Dolano olej");
		car.setEnoughOil(true);

	}

	@Override
	public boolean checkForService(Car car) {

		if(car.isEnoughOil())
			System.out.println("nie trzeba dolewać oleju");
		return !car.isEnoughOil();
	}

}
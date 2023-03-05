package operations;

import model.Car;

public class ChangeTiresOperation implements OperationInterface{

	@Override
	public void doService(Car car) {

		System.out.println("Wykonano wymiane opon");
		car.setShouldChangeTires(true);

	}

	@Override
	public boolean checkForService(Car car) {
		if(car.isShouldChangeTires())
			System.out.println("nie trzeba zmieniac kół");
		return !car.isShouldChangeTires();
	}

}
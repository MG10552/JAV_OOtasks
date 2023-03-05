package model;

import operations.ChangeOilOperation;
import operations.ChangeTiresOperation;
import operations.CleaningOperation;

public class Main {

	public static void main(String[] args) {

		Car car = new Car(5);

		Garage garage = new Garage();

		garage.getServices().add(new ChangeOilOperation());
		garage.getServices().add(new ChangeTiresOperation());
		garage.getServices().add(new CleaningOperation());

		garage.setCar(car);

		garage.fullService();

		garage.fullService();

	}

}
package operations;

import model.Car;

public interface OperationInterface {

	public void doService(Car car);
	public boolean checkForService(Car car);
}
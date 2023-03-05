package model;

import java.util.ArrayList;
import java.util.List;

import operations.OperationInterface;

public class Garage {

	private Car car;

	private List<OperationInterface> services = new ArrayList<OperationInterface>();

	public void fullService()
	{
		for(OperationInterface service: services)
		{
			if(service.checkForService(car))
			{
				service.doService(car);
			}
		}
	}



	public List<OperationInterface> getServices() {
		return services;
	}



	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}


}
package model;

public class Car extends Vehicle
{
	private boolean isClean;
	private boolean shouldChangeTires;
	private boolean enoughOil;



	public Car(boolean isClean, boolean shouldChangeTires, boolean enoughOil) {
		super();
		this.isClean = isClean;
		this.shouldChangeTires = shouldChangeTires;
		this.enoughOil = enoughOil;
	}

	public Car(int places) {

		this.places=places;

	}

	public void speedUp(double speed)
	{
		 if(this.speed + speed < 150)
		 {
			super.speedUp(speed); 
		 }
	}



	@Override
	public final String getDetails() {

		return "This is a Car.";
	}

	public boolean isClean() {
		return isClean;
	}

	public void setClean(boolean isClean) {
		this.isClean = isClean;
	}

	public boolean isShouldChangeTires() {
		return shouldChangeTires;
	}

	public void setShouldChangeTires(boolean shouldChangeTires) {
		this.shouldChangeTires = shouldChangeTires;
	}

	public boolean isEnoughOil() {
		return enoughOil;
	}

	public void setEnoughOil(boolean enoughOil) {
		this.enoughOil = enoughOil;
	}


}
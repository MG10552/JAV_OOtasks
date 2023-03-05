package model;

public abstract class Vehicle {

	protected double speed;
	protected int places;


	public abstract String getDetails(); 

	public void speedUp(double speed)
	{
		this.speed+=speed;
	}

	public double getSpeed()
	{
		return this.speed;
	}

	public int getPlaces()
	{
		return this.places;
	}
}
package Oi;
import ayle;
public abstract class VerhicleQQ {

	private Person owner;
	protected int currentSpeed;
	//protected person; 
	public abstract void Speedup(int speed)
//	{
//		currentSpeed+=speed;
		
//	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
}

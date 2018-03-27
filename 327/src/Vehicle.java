
public class Vehicle {
	private int speed;
	public void setspeed(int speed){
		this.speed=speed;					
	}
	void turn(){}	
	public Vehicle(int speed){
		this.speed=speed;
	}
}
class Car extends Vehicle{
	private boolean sunroof;
	public boolean isSunroof() {
		return sunroof;
	}
	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}
	public Car(int speed, boolean sunroof){
		super(speed);
		this.sunroof=sunroof;
		
	}

}
class Truck extends Vehicle{
	private boolean freight;
	public boolean isFreight() {
		return freight;
	}
	public void setFreight(boolean freight) {
		this.freight = freight;
	}
	public Truck(int speed,boolean freight) {
		super(speed);
		this.freight=freight;
		
		// TODO Auto-generated constructor stub
	}
	
}
class Bus extends Vehicle{
     private boolean bell;
	public Bus(int speed,boolean bell) {
		super(speed);
		this.bell=bell;
		// TODO Auto-generated constructor stub
	}
	public boolean isBell() {
		return bell;
	}
	public void setBell(boolean bell) {
		this.bell = bell;
	}	
}
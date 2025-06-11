package Activites;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car(String color,String transmission,int make) {
		this.color=color;
		this.transmission=transmission;
		this.make=make;
		this.tyres=4;
		this.doors=4;
	}
	
	public void displayCharacteristics() {
		System.out.println("Car color:"+this.color);
		System.out.println("Transmission type:"+this.transmission);
		System.out.println("Car was made in:"+this.make);
		System.out.println("It has:"+this.tyres+"tyres and"+"It has:"+this.doors+"doors" );
		
	}
	void accelarate() {
		System.out.println("The car moves forward");
	}
	void brake() {
		System.out.println("The car has stopped");
	}
}

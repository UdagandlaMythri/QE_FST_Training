package Activites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane{
	private List<String> passengers;
	private final int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	
	public Plane(int maxPassengers) {
		this.maxPassengers=maxPassengers;
		this.passengers=new ArrayList<>();
	}
	public void onboard(String passengerName) {
		if(passengers.size()<=maxPassengers) {
			this.passengers.add(passengerName);
		}else {
			System.out.println("plane is full");
		}
	}
	public Date setTakeOff() {
		this.lastTimeTookOf=new Date();
		return lastTimeTookOf;
	}
	public void setLand() {
		this.lastTimeLanded=new Date();
		this.passengers.clear();
	}
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	public List<String> getPassengers(){
		return passengers;
	}
}
public class Activity6 {
	public static void main(String[] args) throws InterruptedException {
//		there is a plane with max 10 passengers
		Plane plane=new Plane(10);
//		add passengers on the list
		plane.onboard("john");
		plane.onboard("steve");
		plane.onboard("anna");
//		plane takes off
		System.out.println("plane took off at:"+plane.setTakeOff());
//		print list of people on board
		System.out.println("people on the plane:"+plane.getPassengers());
//		flying
		Thread.sleep(5000);
//		plane has landed
		plane.setLand();
//		plane lands
		System.out.println("plane landed at"+plane.getLastTimeLanded());
		System.out.println("people on the after landing"+plane.getPassengers());
	}

}

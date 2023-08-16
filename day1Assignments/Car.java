package week2.day1Assignments;

public class Car {
	
	private void driveCar() {
		System.out.println("Start and Run");
		
	}
	public void applyBrake() {
		System.out.println("Press Brake");
	}
	protected void soundHorn() {
		System.out.println("Press Horn");
	}
	public void isPuncture() {
		System.out.println("Check Tyres");
		
	}

	public static void main(String[] args) {
		Car obj =new Car();
		obj.applyBrake();
		obj.driveCar();
		obj.isPuncture();
		obj.soundHorn();
		

	}

}

package casetool;

public class vehicle_xxx {

	String brand;
	int speed;
	
	vehicle_xxx(String brand){
		this.brand=brand;
		this.speed=0;
	}
	int decrease_speed(int dec) {
		this.speed=speed - dec;
		return dec;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}


}

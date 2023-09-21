package cs176l;

public class CarTest {

	public static void main(String[] args) {
		Car ford = new Car(50); 
		ford.addGas(20); 
		ford.drive(100);
		double gasLeft = ford.getGasInTank(); 
		System.out.println("The gas left is " + ford.getGasInTank());
		
	}

}

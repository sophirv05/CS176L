package cs176l;

public class Car {
	public double efficiency;
	public double amountFuel = 0;
	
	public Car(double eff) {
		efficiency = eff;
	}
	public void addGas(double gallons) {
		amountFuel += gallons;
	}
	public double getGasInTank() {
		return amountFuel;
	}
	public void drive(double miles) {
		amountFuel -= (miles/efficiency);
	}

}

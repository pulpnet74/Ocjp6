abstract public class Employee { 
	protected abstract double getSalesAmount();
	public double getCommision() { 
		return getSalesAmount() * 0.15;
	} 
} 

class Sales extends Employee { 
// insert method here
//	double getSalesAmount() { return 1230.45; } 
//	public double getSalesAmount() { return 1230.45; } //OK
//	private double getSalesAmount() { return 1230.45; } 
	protected double getSalesAmount() { return 1230.45; } //OK
} 
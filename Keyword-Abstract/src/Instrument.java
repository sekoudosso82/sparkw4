
public abstract class Instrument {
	private String brand; 
	
	// getter 
	public String getBrand() {
		return this.brand;
	}
	// setter 
	public void getBrand(String brand) {
		this.brand = brand;
	}
	
	// abstract methods 
	
	public abstract void makeSound();

}

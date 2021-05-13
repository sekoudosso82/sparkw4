package interfaces;

public class InterfacesExample{
	public static void main(String[] args) {
		Domesticated domesticatedThing = new Dog();
		domesticatedThing.doWork();
	}
}

interface Domesticated {
	public void doWork();
}

class Animal {
	public void eat() {
		System.out.println("I eat food");
	}
}

class Wolf extends Animal{
	public void eat() {
		System.out.println("I eat fresh meat");
	}
}

class Dog extends Animal implements Domesticated{
	@Override // implement interface methods
	public void doWork() {
		System.out.println("I perform a trick!");	
	}
	// abstract methods
	public void eat() {
		System.out.println("I eat kibble");
	}
	
	
}

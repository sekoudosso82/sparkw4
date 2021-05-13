
public class PolymorphismExample {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal myDog = new Dog();
		
		myDog.eat();
		//		myDog.bark(); 
		// animal instance can't access dog method 
		// but dog instance can access all animal method
		System.out.println(myDog.hasFur);
		
		
	}

}

class Animal {
	public boolean hasFur = false;
	
	public void eat() {
		System.out.println("I eat food");
	}
}

class Dog extends Animal{
	public boolean hasFur = false; // inherited 
	
	public void eat() {
		System.out.println("I eat kibble");	
	}
	
	public void bark() {
		System.out.println("Woof!");	
	}
}



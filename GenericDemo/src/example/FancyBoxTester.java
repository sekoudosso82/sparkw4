package example;

public class FancyBoxTester {
	
	public static void main(String[] args) {
		
		FancyBox<String> myBox = new FancyBox<>();
		
		myBox.put(" This string is in FancyBox!");
		
		System.out.println(myBox.get());
		
		FancyBox<Integer> newBox = new FancyBox<>();
		newBox.put(1);
		
	}

}

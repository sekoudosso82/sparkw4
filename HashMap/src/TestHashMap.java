import java.util.HashMap;

public class TestHashMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> myMap = new HashMap<>();
		
		myMap.put(1, "value1");
		myMap.put(2, "value2");
		myMap.put(3, "Mary");
		
		
		System.out.println(" The string stored under the key \"3\" is: " + myMap.get(3));
	}

}

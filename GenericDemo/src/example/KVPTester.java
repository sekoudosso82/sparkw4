package example;

public class KVPTester {
	
	public static void main(String[] args) {
		KeyValuePair<Integer, String> pairOne = new KeyValuePair<>();
		
		KeyValuePair<Integer, String> pairTwo = new KeyValuePair<>();
		
		pairOne.put(1,  "James");
		pairTwo.put(2, "Mary");
		
		System.out.println(" Are pairOne and pairTwo the same? " + KVPUtilities.equality(pairOne, pairTwo));
		
		pairOne.put(2,  "Mary");
		System.out.println(" How about now? " + KVPUtilities.equality(pairOne, pairTwo));

		
	}

}

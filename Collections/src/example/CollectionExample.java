package example;

import java.util.ArrayList;

public class CollectionExample {
	
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		
		arrList.add("Hello");
		arrList.add(" ");
		arrList.add("word");
		arrList.add(3, "!");
		
		System.out.println("Value  at index 2: " + arrList.get(2) );
		System.out.println("Value  at index 3: " + arrList.get(3) );
		System.out.println(arrList);
		System.out.println("arrList size: " + arrList.size());
		
		System.out.println("remove first  element: " + arrList.remove(0));
		System.out.println(arrList);
		
		System.out.println("check if contains \"word\" : " + arrList.contains("word"));
		System.out.println(arrList);
		
		
	}

}

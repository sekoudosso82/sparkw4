package com.sekou.test;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
	public static void main(String[] args) {
		
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "A forbidden fruit");
        dictionary.put("banana", "A yellow fruit that can be peeled");
        dictionary.put("cantaloupe", "A melon fruit that has an orange flesh");
        System.out.println(dictionary);
        
      //get value from map using the key
        String key = "apple";
        String value = dictionary.get(key);
        System.out.println("The value for the key: " + key + " is " + value);
        
        //define a new TreeMap
        //Now, let's say you wanted to keep the keys sorted like a regular 
        //dictionary does. We can use a TreeMap to manage the keys/value pairs.
        
        TreeMap<String, String> sortedDictionary = new TreeMap<>();
        
        //we can use the putAll method to add all items in dictionary 
        //into sortedDictionary.
        sortedDictionary.putAll(dictionary);
        System.out.println(sortedDictionary);
        
        //Let's add another key/value pair to the sortedDictionary. 
        sortedDictionary.put("beets", "An actual vegetable");
        System.out.println(sortedDictionary);
        
        //What happens if you add the same key with a different value?
        //Update your code to add the beets key again, but with a different value:
        //re-add an element
        sortedDictionary.put("beets", "A better explanation");
        System.out.println(sortedDictionary);
        
        //create a Set of keys
        Set<String> keys = sortedDictionary.keySet();
        
        //use the enhanced for-loop to iterate over the keys and print them.
        for(String s: keys) {
            System.out.println("key: " + s);
        }
	
	}

}

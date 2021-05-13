package com.sekou.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.sekou.model.Item;

public class TestArrayList {
	
	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(1, "This is item 1"));
        items.add(new Item(2, "This is item 2"));
        items.add(new Item(3, "This is item 3"));
        items.add(new Item(4, "This is item 4"));
        items.add(new Item(5, "This is item 5"));
        
      //print the third item
        System.out.println(items.get(2));
        
      //remove the last item
        Item removed = items.remove(items.size()-1);
        System.out.println(removed);
        
      //generic loop for list
        System.out.println("......printing list.......");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
      //generic loop for list
      //As we remove an element, the list "shifts" the elements down 
      // by one and thus each have a new index and the size shrinks 
      // as well.
        
        System.out.println("......printing list.......");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
          
            //remove the element
            items.remove(i);
        }
        
        // item size should be half  
        System.out.println(items.size());
        
        // complete remove all element
      //iterating over a list
//		        Iterator<Item> iter = items.iterator();
//		
//		        while (iter.hasNext()) {
//		            Item item = iter.next();
//		            System.out.println("removing item: " + item);
//		            iter.remove();
//		        }
//		
//		        //confirm the size is 0
//		        System.out.println(items.size());
        
      // Limit of while loop 
      
//        //iterating over a list
//        Iterator<Item> iter = items.iterator();
//        while (iter.hasNext()) {
//            Item item = iter.next();
//            System.out.println("removing item: " + item);
//            iter.remove();
//            iter.remove();
//        }
//
//        //confirm the size is 0
//        System.out.println(items.size());
        
        //iterating over a list
        Iterator<Item> iter = items.iterator();
        while (iter.hasNext()) {
            Item item = iter.next();
            System.out.println("removing item: " + item);
            iter.remove();
            items.add(new Item(6, "This is a new item"));
        }
    }

}
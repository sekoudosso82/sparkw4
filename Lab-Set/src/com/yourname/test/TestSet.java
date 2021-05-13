package com.yourname.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<Integer>(); 
        Set<Integer> treeSet = new TreeSet<Integer>();

        int[] numbers = {19,2,35,3,5,5,4,427,7,7,99,1};
        
        for (int i = 0; i < numbers.length; i++) {
            hashSet.add(numbers[i]);
            treeSet.add(numbers[i]);
        }

        System.out.println(hashSet); // unsorted
        System.out.println(treeSet); // sorted 
        
      //contains
        System.out.println(hashSet.containsAll(treeSet));
        
      //removeAll
        hashSet.removeAll(treeSet);
        System.out.println(hashSet);
//        System.out.println(treeSet);
        
    }
}
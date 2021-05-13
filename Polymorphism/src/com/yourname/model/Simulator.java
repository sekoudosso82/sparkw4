package com.yourname.model;

public class Simulator {
	
	public static void main(String[] args){
//		CustomObject obj = new CustomObject("name");
//        System.out.println(obj);
		
//		CustomObject obj = new CustomObject("name");
//        System.out.println(obj);
//
//        Object objRef = obj;
//        System.out.println(objRef);
		
		CustomObject obj = new CustomObject("name");
        System.out.println(obj);

        Object objRef = obj;
        System.out.println(objRef);

        Object objRef2 = (Object)obj;
        System.out.println(objRef2);
        
    }

}

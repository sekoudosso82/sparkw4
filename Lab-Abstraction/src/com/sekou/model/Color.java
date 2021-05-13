package com.sekou.model;

public class Color {
	 private int red;
	 private int green;
	 private int blue;

	  //constructors
	    public Color(int red, int green, int blue){
	    	this.red  = red;
	    	this.green = green;
	    	this.blue = blue;
	    }

	    //getters and setters
	    public int getRed() {  return this.red; }
	    public int getGreen() {  return this.green; }
	    public int getBlue() {  return this.blue; }
	    
	    public void SetRed(int red) { this.red = red; }
	    public void SetGreen(int green) { this.green = green; }
	    public void SetBlue(int blue) { this.blue = blue; }
	    
	    //override toString()
	    public String toString(){
	        return ("This color is "+this.getRed()+" red "+ this.getGreen()+" green "+this.getBlue()+" blue. "
	        		+ "");
	    } 

}

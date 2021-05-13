package com.sekou.model;

public class Dimension{
    private double width;
    private double height;
    private double length;

  //constructors
    public Dimension(double width, double height, double length){
    	this.width  = width;
    	this.height = height;
    	this.length = length;
    }

    //getters and setters
    public double getWidth() {  return this.width; }
    public double getHeight() {  return this.height; }
    public double getLength() {  return this.length; }
    
    public void SetWidth(double width) { this.width = width; }
    public void SetHeight(double height) { this.height = height; }
    public void SetLength(double length) { this.length = length; }
   

    //override toString()
    public String toString(){
        return (" This Dimension is "+this.getWidth()+" width, "+ 
        		this.getHeight()+" height and "+
        		this.getLength()+" length. ");
    } 
}
package com.sekou.model;

public class Content {
	private int amount;
    private String description;

  //constructors
    public Content(int amount, String description){
    	this.amount  = amount;
    	this.description = description;
    }

    //getters and setters
    public int getAmount() {  return this.amount; }
    public String getDescription() { return this.description; }
    
    public void setAmount(int amount) { this.amount = amount; }
    public void setDescription(String description) { this.description = description;}
    

    //override toString()
    public String toString(){
        return ("This content is "+this.getAmount()+" amount "+ this.getDescription()+".");
    } 

}

package com.sekou.model;

public class Package {
	private Content content;
    private Color color;
    private Dimension dimension;

  //constructors
    public Package(Content content, Color color, Dimension dimension){
    	this.content  = content;
    	this.color = color;
    	this.dimension = dimension;
    }

    //getters and setters
    public Content getContent() {  return this.content; }
    public Color getColor() {  return this.color; }
    public Dimension getDimension() {  return this.dimension; }
    
    public void SetContent(Content content) { this.content = content; }
    public void SetColor(Color color) { this.color = color; }
    public void SetDimension(Dimension dimension) { this.dimension = dimension; }
    

    //override toString()
    public String toString(){
        return ("This Package is "+this.getContent()+
        		" content, "+ this.getColor()+
        		" color and "+this.getDimension()+" dimension.");
    } 

}

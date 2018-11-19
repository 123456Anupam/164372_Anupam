package com.anupam;


	abstract class Abstract  
	{ 
	    String color; 
	      
	    // these are abstract methods 
	    abstract double area(); 
	    public abstract String toString(); 
	      
	    // abstract class can have constructor 
	    public Abstract(String color) { 
	        System.out.println("Shape constructor called"); 
	        this.color = color; 
	    } 
	      
	    // this is a concrete method 
	    public String getColor() { 
	        return color; 
	    } 
	} 


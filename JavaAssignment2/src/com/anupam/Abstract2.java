package com.anupam;


	class Abstract2 extends Abstract{ 
		  
	    double length; 
	    double width; 
	      
	    public Abstract2(String color,double length,double width) { 
	        // calling Shape constructor 
	        super(color); 
	        System.out.println("Rectangle constructor called"); 
	        this.length = length; 
	        this.width = width; 
	    } 
	      
	    @Override
	    double area() { 
	        return length*width; 
	    } 
	  
	    @Override
	    public String toString() { 
	        return "Rectangle color is " + super.color +  
	                           "and area is : " + area(); 
	    } 
}

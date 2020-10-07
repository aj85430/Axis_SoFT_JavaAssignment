package com.shape;

public class Rectangle implements Polygon
{
       float length=2;
       float breadth=3;
	
	public float calcArea() 
	{
		float area= length*breadth;
		return area;		
	}

	public float calcPeri()
	{
	    float peri= 2*(length+breadth);
		return peri;
	}
}

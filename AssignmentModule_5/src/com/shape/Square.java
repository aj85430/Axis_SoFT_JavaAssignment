package com.shape;

public class Square implements Polygon
{
   float side=5;
   public float calcArea()
   {
	   float area= side*side;
	   return area;
   }

   public float calcPeri() 
   {
	  float peri= 4*side;
	  return peri;
   }
}

package com.test;
import com.shape.*;

public class testInterface {

	public static void main(String[] args) {

           Square square=new Square();
           Rectangle rectangle = new Rectangle();
           square.calcArea();
           square.calcPeri();
           System.out.println("Square...");
           System.out.println("Area: "+ square.calcArea());
           System.out.println("Perimeter: "+square.calcPeri());
           System.out.println("Rectangle...");
           System.out.println("Area: "+rectangle.calcArea());
           System.out.println("Perimeter: "+rectangle.calcPeri());

	}

}

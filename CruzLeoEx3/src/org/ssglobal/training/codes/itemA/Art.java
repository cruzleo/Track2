package org.ssglobal.training.codes.itemA;

public class Art {
	 
	//item number 1
	public abstract class Shape {
		public void draw() {}
		
		public void color() {}
	}
	
	public final class Square extends Shape {
		public void draw() {
			String shape = "Square";
			System.out.println("Shape: " + shape);
		}
		
		public void color() {
			String color = "Red";
			System.out.println("Color: " + color);
		}
	
	}
	
	public final class Triangle extends Shape {
		public void draw() {
			String shape = "Tirangle";
			System.out.println("Shape: " + shape);
		}
		
		public void color() {
			String color = "Green";
			System.out.println("Color: " + color);
		}
	}
	
	public final class Circle extends Shape {
		public void draw() {
			String shape = "Circle";
			System.out.println("Shape: " + shape);
		}
		
		public void color() {
			String color = "Yellow";
			System.out.println("Color: " + color);
		}
	}
	

	
}


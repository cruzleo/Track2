package org.ssglobal.training.codes.itemA;

public class Document {
	public abstract class Printable {
		public String studName;
		public byte age;
		public String address;
		
		void printName() {
			System.out.println("Student name: " + studName);
			System.out.println("Student age: " + age);
		}
	}
	
	public class Letter extends Printable {
		public void accessProps() {
			printName();
		}
	}
	
	public class Student extends Printable {
		public void accessProps() {
			printName();
		}
	}
	
}

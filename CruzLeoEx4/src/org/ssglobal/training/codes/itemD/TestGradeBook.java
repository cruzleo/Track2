package org.ssglobal.training.codes.itemD;

public class TestGradeBook {

	public static void main(String[] args) {
		GradeBook gb = new GradeBook();
		gb.addGrade(90.5);
		gb.addGrade(80.0);
		gb.addGrade(98.0);
		gb.addGrade(95.1);
		gb.addGrade(75.9);
		gb.addGrade(89.1);
		gb.addGrade(82.3);
		gb.addGrade(78.1);
		gb.addGrade(91.0);
		gb.addGrade(78.0);
		gb.printGrades();
	
		System.out.println("Average: " + gb.averageGrade());
		
		gb.deleteGrade(90.5);
		gb.deleteGrade(80.0);
		gb.deleteGrade(98.0);
		gb.deleteGrade(95.1);
		gb.deleteGrade(75.9);
		gb.deleteGrade(60.3); // non-existing grade
		
		System.out.println("----------------------");
		gb.printGrades();

		
	}

}

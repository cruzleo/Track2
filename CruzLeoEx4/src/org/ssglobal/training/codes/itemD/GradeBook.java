package org.ssglobal.training.codes.itemD;

public class GradeBook {
	private double[] grades = new double[0];
	
	public void printGrades() {
		for (double lookup : grades) {
			System.out.println(lookup);
		}
	}
	
	public double averageGrade() {
		double sum = 0;
		
		for (double lookup : grades) {
			sum = sum + lookup;
		}
		return sum / grades.length;
	}
	
	protected void addGrade(double newGrade) {
		double[] temp = new double[grades.length + 1];
		System.arraycopy(grades, 0, temp, 0, grades.length);
		temp[temp.length - 1] = newGrade;
		grades = null; // garbage collect first
		grades = temp;
		temp = null; // garbage collect after
	}
	
	protected void deleteGrade(double grade) {
//		double[] temp = new double[grades.length - 1];
//		System.arraycopy(temp, 0, grades, 0, temp.length);
//		temp[temp.length - 1] = grade;
//		grades = temp;
//		int occur = 0;
//		
//		for (double lookup : grades) {
//			if (lookup == grade) {
//				continue;
//			} else {
//				System.out.println("Grade does not exist");
//				break;
//			}
		
		int occur = 0;
		
		for (double lookup : grades) {
			if (lookup == grade) {
				occur++;
			} 
		}
		
		double[] temp = new double[grades.length - occur];
		int j = 0;
		
		for (double lookup : grades) {
			if (lookup != grade) {
				temp[j] = lookup;
				j++;
			}
		}
		
		grades = null;
		grades = temp;
		temp = null;
	}
}

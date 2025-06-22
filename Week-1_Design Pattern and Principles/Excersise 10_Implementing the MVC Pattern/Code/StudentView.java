package design_principles.mvc_pattern_example;


public class StudentView {
	public void displayStudentDetails(String name,String ID,char grade){ 
		System.out.println("--------Student Details--------");
		System.out.println("Name : "+name);
		System.out.println("ID : "+ID);
		System.out.println("Grade : "+grade);
		System.out.println("-----------------------------------");
	}
}

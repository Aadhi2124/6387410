package design_principles.mvc_pattern_example;

public class TestMVCPattern {

	public static void main(String[] args) {

		Student s = new Student("Aadhi", "PEC101", 'A');
		StudentView studentView = new StudentView();
		
		StudentController controller = new StudentController(s, studentView);
		
		//Display Initial data
		controller.updateView();
		
		//Modify data using Controller
		controller.setStudentName("Aadhishwar P");
		controller.setStudentgrade('O');
		
		//Display Updated data
		controller.updateView();
		
	}

}

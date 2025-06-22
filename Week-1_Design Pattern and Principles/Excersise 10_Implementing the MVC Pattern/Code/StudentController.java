package design_principles.mvc_pattern_example;

public class StudentController {
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getStudentname() {
		return model.getName();
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentid() {
		return model.getId();
	}

	public void setStudentid(String id) {
		model.setId(id);
	}

	public char getStudentgrade() {
		return model.getGrade();
	}

	public void setStudentgrade(char grade) {
		model.setGrade(grade);;
	}
	
	public void updateView() {
		view.displayStudentDetails(model.getName(),model.getId(), model.getGrade());
	}
}

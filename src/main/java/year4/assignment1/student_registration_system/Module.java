package year4.assignment1.student_registration_system;

import java.util.List;

public class Module {
	
	private String name;
	private String id;
	private List<Student> students;
	
	public Module(String n, String id, List<Student> studentsInClass){
		
		this.setName(n);
		this.setId(id);
		this.setStudents(studentsInClass);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}

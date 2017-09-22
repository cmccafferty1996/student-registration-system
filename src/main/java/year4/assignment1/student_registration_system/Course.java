package year4.assignment1.student_registration_system;

import java.util.List;

import org.joda.time.DateTime;

public class Course {
	
	private String name;
	private List<Module> modules;
	private DateTime startDate;
	private DateTime endDate;
	
	public Course(String n, List<Module> subjects, DateTime start, DateTime end){
		
		this.setName(n);
		this.setModules(subjects);
		this.setStartDate(start);
		this.setEndDate(end);	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}

}

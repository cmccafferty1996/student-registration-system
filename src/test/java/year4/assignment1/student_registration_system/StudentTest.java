package year4.assignment1.student_registration_system;

import org.junit.Test;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
	
	@Test
	public void testGetUsername(){
		
		Student testStudent = new Student("John", 21, "Galway", "01/01/1996", "ST12345");
		String expected = "John21";
		assertEquals(expected, testStudent.getUsername());
	}
}

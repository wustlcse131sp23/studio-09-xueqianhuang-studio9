package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
	private final Map<String, Student> students = new HashMap<>();

	public void addStudent(String accountName, Student student) {
		// TODO
		this.students.put(accountName, student);
	}

	public int getStudentCount() {
		// TODO
		return this.students.size();
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
		Student temp = this.students.get(accountName);
		return temp.getFullName();
	}

	public double getTotalBearBucks() {
		// TODO
		double total = 0.0;
		this.students.

		return total;
	}
}

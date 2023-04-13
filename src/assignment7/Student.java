package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName;
	private String lastName;
	private int studentId;
	private int attemptedCredits = 0;
	private int passingCredits = 0;
	private double gradeQualityPoints = 0.0;
	private double bearbucksBalance = 0.0;
	
	
	/***
	 * 
	 * @param firstName student's first name
	 * @param lastName student's last name
	 * @param studentId student's id
	 */
	public Student(String firstName , String lastName , int studentId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
	}
	
	/***
	 * 
	 * @return the student's full name
	 */
	public String getFullName() {
		String fullName = this.firstName + " " + this.lastName;
		return fullName;
	}
	/***
	 * 
	 * @return the student's id
	 */
	public int getId() {
		return this.studentId;
	}
	
	/***
	 * 
	 * @param the student's grade 
	 * @param the credit of this class
	 */
	public void submitGrade(double grade , int quality) {
		this.attemptedCredits = this.attemptedCredits + quality;
		if(grade >= 1.7) {
			this.passingCredits = this.passingCredits + quality;
		}
		this.gradeQualityPoints = this.gradeQualityPoints + grade * quality;
	}
	
	/***
	 * 
	 * @return total credit the student get
	 */
	public int getTotalAttemptedCredits() {
		return this.attemptedCredits;
	}
	
	/***
	 * 
	 * @return total credit the student get with a grade over 1.7
	 */
	public int getTotalPassingCredits() {
		return this.passingCredits;
	}
	
	/***
	 * 
	 * @return the GPA
	 */
	public double calculateGradePointAverage() {
		return this.gradeQualityPoints / this.attemptedCredits;
	}
	
	/***
	 * 
	 * @return the class standing
	 */
	public String getClassStanding() {
		if(this.passingCredits < 30)
			return "First Year";
		else if(this.passingCredits >= 30 && this.passingCredits < 60)
			return "Sophomore";
		else if(this.passingCredits >= 60 && this.passingCredits < 90)
			return "Junior";
		else
			return "Senior";
	}
	
	/***
	 * 
	 * @return if this student is eligible for PhiBetaKappa
	 */
	public boolean isEligibleForPhiBetaKappa() {
		if (this.attemptedCredits >= 75  && this.calculateGradePointAverage() >= 3.8) {
	        return true; 
		}
		if (this.attemptedCredits >= 98 && this.calculateGradePointAverage() >= 3.6) {
		        return true;
		    }
		
		return false;
		   
	}
	
	/***
	 * 
	 * @param amount add amount to the BearBucks
	 */
	public void depositBearBucks(double amount) {
		this.bearbucksBalance = this.bearbucksBalance + amount;
	}
	
	/***
	 * 
	 * @param amount decrease amount with BearBucks
	 */
	public void deductBearBucks(double amount) {
		this.bearbucksBalance = this.bearbucksBalance - amount;
	}
	
	/***
	 * 
	 * @return the current BarBucks
	 */
	public double getBearBucksBalance() {
		return this.bearbucksBalance;
	}
	
	/***
	 * 
	 * @return the value you can get with the administrative fee
	 */
	public double cashOutBearBucks() {
		if(this.bearbucksBalance > 10) {
			double balance = this.bearbucksBalance;
			this.bearbucksBalance = 0.0;
			return balance - 10.0;
		}
		else {
			this.bearbucksBalance = 0.0;
			return 0.0;
		}
	}
	
	/***
	 * 
	 * @param firstName the new student's first name
	 * @param otherParent the other parent
	 * @param isHyphenated to make sure if this new student's name either be the last name of this or a hyphenated combination of this-other parents'
	 * @param id the new student's id
	 * @return the new student
	 */
	public Student createLegacy(String firstName, Student otherParent, boolean isHyphenated, int id) {
		String lastName;
		if(isHyphenated) {
			lastName = this.lastName + "-" + otherParent.lastName;
		}
		else {
			lastName = this.lastName;
		}
		Student child = new Student(firstName, lastName, id);

		child.bearbucksBalance = this.cashOutBearBucks() + otherParent.cashOutBearBucks();
		
		return child;
		 
	}
	
	/***
	 * @return the student's full name and student ID
	 */
	public String toString() {
		return this.firstName +" " + this.lastName + " " + this.getId();
	}
	
}

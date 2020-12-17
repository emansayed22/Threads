
public class TestStudentGrades {
	
		public static void main(String[] args) {
			String name = "";
			String email ="";
			String phoneNumber = "";
			int grade = 0;
			
			
			StudentGrades student = new StudentGrades( name,  email,  phoneNumber);
			student.getUserData();
				student.start();
				
	
				StudentGrades studentTwo = new StudentGrades( name,  email);
				studentTwo.getUserData();
				studentTwo.start();
			
			
				StudentGrades studentThree = new StudentGrades( name, email, phoneNumber, grade);
				studentThree.getUserData();
				studentThree.start();
			
			
		}
	}
			
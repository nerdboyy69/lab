package lab1;
public class main {
		public static void main(final String[] args) {
			Student student = new Statement("Ebad Aamir", 450, 600);
			float output = student.getPercentage();
			System.out.println("Name:" + student.getStudent_Name() + " \nPercentage: " + output);
		}
	}

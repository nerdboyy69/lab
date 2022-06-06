package lab1;

public class student {
	public String Student_Name;
	public float Total_Marks;
	public float Obtained_marks;

	public void Student(String student_Name, float total_Marks, float obtained_marks) {
		Super();
		Student_Name = student_Name;
		Total_Marks = total_Marks;
		Obtained_marks = obtained_marks;
	}

	private void Super() {
		// TODO Auto-generated method stub
		
	}

	public String getStudent_Name() {
		return Student_Name;
	}

	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}

	public float getTotal_Marks() {
		return Total_Marks;
	}

	public void setTotal_Marks(float total_Marks) {
		Total_Marks = total_Marks;
	}

	public float getObtained_marks() {
		return Obtained_marks;
	}

	public void setObtained_marks(float obtained_marks) {
		Obtained_marks = obtained_marks;
	}

	public float getPercentage() {
		float result = ((getTotal_Marks()*100)/getObtained_marks());
		return result;
	}
}


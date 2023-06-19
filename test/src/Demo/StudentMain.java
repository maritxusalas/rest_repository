package Demo;
class Student 
{
	int regNumber;
	String studentName;
	Student(int reg_no, String name){
		this.regNumber =reg_no;
		this.studentName = name;
	}
}

public class StudentMain {

	public static void main(String[] args) {
		
		//declare an array of integers
		
		Student[] arr;
		
		arr = new Student[5];
		arr[0] = new Student(1241, "Martin");
		arr[1] = new Student(1242, "Pepe");
		arr[2] = new Student(1243, "Manolo");
		arr[3] = new Student(1244, "Eusebio");
		arr[4] = new Student(1245, "Horacia");
		
		for (int i=0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		for (int i =0; i < arr.length; i ++)
			System.out.println("Student with registration number " +
					arr[i].regNumber+ " and with name " +arr[i].studentName);
		
	}

}

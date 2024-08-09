package Day05.Ex01_Student;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.name = "김도현";
		student.age = 20;
		student.stdNo = "T10001";
		student.major = "전기전자과";
		int scores[] = {100, 80, 90, 50, 75};
		
		System.out.println("::::: 학생1 :::::");
		System.out.println("학생1 - 이름 : " + student.name);
		System.out.println("학생1 - 나이 : " + student.age);
		System.out.println("학생1 - 학번 : " + student.stdNo);
		System.out.println("학생1 - 전공 : " + student.major);
		student.study("");
		
		System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(100 , 90));
		System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(100 , 85 , 70));
		System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(scores));
		
//-----------------------------------------------------------------------------------------------
		Student student2 = new Student();
		student2.name = "김태겸";
		student2.age = 24;
		student2.stdNo = "T10001";
		student2.major = "재활스포츠학과";
		int scores2[] = {100, 80, 90, 50, 75};
		
		System.out.println("::::: 학생1 :::::");
		System.out.println("학생2 - 이름 : " + student2.name);
		System.out.println("학생2 - 나이 : " + student2.age);
		System.out.println("학생2 - 학번 : " + student2.stdNo);
		System.out.println("학생2 - 전공 : " + student2.major);
		student2.study("자료구조");
		
		System.out.println("학생2 - 중간고사 점수 : " + student2.getAverage(100 , 90));
		System.out.println("학생2 - 중간고사 점수 : " + student2.getAverage(100 , 85 , 70));
		System.out.println("학생2 - 중간고사 점수 : " + student2.getAverage(scores2));
	
	}
	
}

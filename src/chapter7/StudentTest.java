package chapter7;

public class StudentTest {
	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);

		Student studentKim = new Student(1001, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);

		studentLee.showStudentInfo();
		System.out.println("=================================");
		studentKim.showStudentInfo();

		System.out.println(studentLee); // 주소가 아닌 이름을 출력하도록 재정의

		System.out.println(studentLee.equals(studentKim));
		// 학번이 같으면 true를 출력하게 재정의, Kim의 학번을 1001로 바꾸면 true가 출력됨
	}
}

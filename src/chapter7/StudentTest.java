package chapter7;

public class StudentTest {
	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 50);

		Student studentKim = new Student(1001, "Kim");
		studentKim.addSubject("����", 70);
		studentKim.addSubject("����", 85);
		studentKim.addSubject("����", 100);

		studentLee.showStudentInfo();
		System.out.println("=================================");
		studentKim.showStudentInfo();

		System.out.println(studentLee); // �ּҰ� �ƴ� �̸��� ����ϵ��� ������

		System.out.println(studentLee.equals(studentKim));
		// �й��� ������ true�� ����ϰ� ������, Kim�� �й��� 1001�� �ٲٸ� true�� ��µ�
	}
}

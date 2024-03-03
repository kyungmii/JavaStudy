package chapter7;
import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s: subjectList) {
			total += s.getScorePoint();
			System.out.println("�л� "+studentName + "�� "+s.getName()+ 
					"���� ������ " + s.getScorePoint() + " �Դϴ�.");
			}
		System.out.println("�л� "+studentName + "�� ������ " +total + " �Դϴ�.");
		}
	
	
	//�Ʒ��κ��� �ּ�ó���ϸ� �ּҰ� ��µǰ�, �������ϸ� Lee�� ��µ� 
		public String getStudentName() {
			return studentName;
		}
		public String toString() {
			return getStudentName();
		} 
		
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentID == std.studentID)
				return true;
			else return false;
		}
		return false;
	}
}

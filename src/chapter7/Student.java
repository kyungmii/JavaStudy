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
			System.out.println("학생 "+studentName + "의 "+s.getName()+ 
					"과목 성적은 " + s.getScorePoint() + " 입니다.");
			}
		System.out.println("학생 "+studentName + "의 총점은 " +total + " 입니다.");
		}
	
	
	//아래부분을 주석처리하면 주소가 출력되고, 재정의하면 Lee가 출력됨 
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

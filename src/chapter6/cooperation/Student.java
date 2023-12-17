package chapter6.cooperation;

public class Student {
	public String studentName;
	public int grade; 
	public int money;
	

	public Student(String studentName, int money) {
		this.studentName=studentName;
		this.money = money; 
	} // �л� �̸��� ���� ���� �Ű� ������ �޴� ������ 
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -=1000; // �л��� ������ Ÿ�� 1000���� �����ϴ� ����� ������ �޼���
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money-=1500;
	}
	public void showInfo() {
		System.out.println(studentName + "���� ���� ����" + money + "�Դϴ�.");
	}
	
}

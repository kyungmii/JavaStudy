package chapter6;
//this ����ϱ� 
class Birthday {

	int day;
	int month;
	int year;

	public void setYear(int year) {
		this.year = year;		//bDay.year = year;

			
	}//�¾ ������ �����ϴ� �޼���
		
	public void printThis() {
		System.out.println(this); //syso(bDay)�� ���� 
	} // this ��� �޼��� 

}

public class ThisExample {
	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		bDay.setYear(2000); // �¾ ������ 2000���� ����
		System.out.println(bDay); // ���� ���� ��� 
		bDay.printThis(); // this  ��� �޼��� ȣ�� 
	}
}

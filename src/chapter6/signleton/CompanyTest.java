package chapter6.signleton;

public class CompanyTest {

	public static void main(String[] args) {

		Company myCompany1 = Company.getInsance();
		Company myCompany2 = Company.getInsance(); // Ŭ���� �̸����� getInstance() ȣ�� �Ͽ� ���� ������ ����
		System.out.println(myCompany1 == myCompany2); // �� ������ ���� �ּ����� Ȯ��

	}

}

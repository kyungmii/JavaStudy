package chapter6.signleton;

public class Company {
	private static Company instance = new Company();
	 // �����ϰ� ������ �ν��Ͻ� 
	private Company() {

	
	}
	public static Company getInsance() { // �ν��Ͻ��� �ܺο��� ���� �� �� �ֵ��� public get() �޼��� ���� 
		if ( instance == null) {
			instance = new Company();
		}
		return instance ; 	 // �����ϰ� ������ �ν��Ͻ� 

	}
}

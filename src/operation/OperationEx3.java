package operation;

public class OperationEx3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value =((num1 = num1 + 10) < 10) && ((i=i+2)<10) ;
		System.out.println(value); //f
		System.out.println(num1); // 20
		System.out.println(i); // 2

		value =((num1=num1+10) > 10) || ((i=i+2) <10);
		System.out.println(value);//t
		System.out.println(num1); //30
		System.out.println(i);//2
		
		//�������� : ���� 
		//&&(����) : �� ���� ��� ���� ��쿡�� ��� ���� �� 
		//||(����) : �� ���� �ϳ��� �׸� ���̸� ������� �� 
		//! (����) : ���� ���� �������� �ٲٰ�, ������ ���� ������ �ٲ� 
	}

}

package chapter4.loopexample;

public class BreakExample2 {
public static void main(String[] args) {
	int sum =0;
	int num = 0; 
	
	for (num = 0; ; num++) {// ���ǽ��� �����ϴ� ��� break���� ���
		sum += num;
		if(sum >=100) // sum �� 100���� ũ�ų� ������ (���� ����)
			break; 	// �ݺ��� ��
		
	}
	System.out.println("num : " + num);
	System.out.println("sum : " + sum);
}
}

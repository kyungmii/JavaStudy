package operation;

public class OperationEx2 {

	public static void main(String[] args) {

		int gameScore = 150; // ó���� 150
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1); // 150 ���� 1�� ������ 151
		
		int lastScore2 = --gameScore; // 151���� -1 �� �� 150 ��� 
		System.out.println(lastScore2);
		
		//����,���� ������
		//++: ���� ���� 1�� ���� val = ++num;
		//val = ++num; : ���� num ���� 1������ �� val������ ����
		//val = num++; : val ������ ���� num ���� ���� ���� �� �� num�� 1���� 
		
		//--: ���� ���� 1�� �� val = --num;
		
		
		
	}

}

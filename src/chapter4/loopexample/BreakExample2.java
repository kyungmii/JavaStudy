package chapter4.loopexample;

public class BreakExample2 {
public static void main(String[] args) {
	int sum =0;
	int num = 0; 
	
	for (num = 0; ; num++) {// 조건식을 생략하는 대신 break문을 사용
		sum += num;
		if(sum >=100) // sum 이 100보다 크거나 같을떄 (종료 조건)
			break; 	// 반복문 끝
		
	}
	System.out.println("num : " + num);
	System.out.println("sum : " + sum);
}
}

package chapter6.signleton;

public class CompanyTest {

	public static void main(String[] args) {

		Company myCompany1 = Company.getInsance();
		Company myCompany2 = Company.getInsance(); // 클래스 이름으로 getInstance() 호출 하여 참조 변수에 대입
		System.out.println(myCompany1 == myCompany2); // 두 변수가 같은 주소인지 확인

	}

}

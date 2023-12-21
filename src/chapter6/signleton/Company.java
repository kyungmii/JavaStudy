package chapter6.signleton;

public class Company {
	private static Company instance = new Company();
	 // 유일하게 생성한 인스턴스 
	private Company() {

	
	}
	public static Company getInsance() { // 인스턴스를 외부에서 참조 할 수 있도로 public get() 메서드 구현 
		if ( instance == null) {
			instance = new Company();
		}
		return instance ; 	 // 유일하게 생성한 인스턴스 

	}
}

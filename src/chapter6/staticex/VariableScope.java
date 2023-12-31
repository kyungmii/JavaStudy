package chapter6.staticex;

public class VariableScope {
//	지역변수(로컬변수 , local variable) :  함수나 메서드 안에서만 사용 할 수 있음
//	멤버변수(인스턴스 변수, instance variable) :  클래스안에서 사용하는 멤버 변수 
//	static(클래스변수 , class variable) : 여러 인스턴스에서 공통으로 사용할 수 있는 static 변수 
//	
//	변수는 어디에 어떻게 선언되느냐에 따라 유효범위(scope) 이 달라짐 
//	 
//	- 지역 변수
//	    선언위치 : 함수 내부에 선언 
//	    사용 범위 : 함수 내부에서만 
//	    메모리 : 스택 
//	    생성과 소멸 : 함수가 호출될때 생성 함수가 끝나면 소멸 
//	
//	- 멤버변수 (인스턴스변수)
//		선언위치 : 클래스 멤버 변수로 선언 
//		사용 범위 : 클래스 내부에서 사용하고 private 이 아니면 참조 변수로 다른 클래스 에서 사용 가능 
//		메모리 : 힙 
//		생성과 소멸 : 인스턴스가 생성될때 힙에 생성, 가비지 컬렉터가 메모리를 수거 할 때 소멸됨
//		
//    - static 변수 (클래스 변수) 
//    	선언위치 : static  예약어를 사용하여 클래스 내부에 선언
//    	사용 범위 : 클래스 내부에서 사용하고 private 이 아니면 클래스 이름으로 다른 클래스 에서 사용 가능 
//    	메모리 : 데이터영역 
//    	생성과 소멸 : 프로그램이 처음 시작 할 때 상수와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해제할 때 소멸 
}

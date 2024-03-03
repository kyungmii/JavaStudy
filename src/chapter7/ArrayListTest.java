package chapter7;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();

		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생택쥐페리"));

		for (int i = 0; i < library.size(); i++) {
			Book book = library.get(i); // get(i)= 배열의 인덱스 위치에있는 요소값 반환
			book.showBookInfo(); // Book클래스에 ShowBookInfo가 구현돼있음
									// Book클래스에 구현된 함수를 쓰려면 해당 클래스의 객체를
									// 만들어서 접근해야함(->book.showBookInfo)
		}
		System.out.println();

		System.out.println("=== 향상된 for문 사용 ===");

		for (Book book : library) {
			book.showBookInfo();
		}
	}

}

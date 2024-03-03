package chapter7;

import java.util.ArrayList;

public class Quiz5DogTest {
	public static void main(String[] args) {

		ArrayList<Quiz4Dog> list = new ArrayList<Quiz4Dog>();
		list.add(new Quiz4Dog("경미네강아지", "치아와"));
		list.add(new Quiz4Dog("친구네강아지", "진돗개"));
		list.add(new Quiz4Dog("kh정보교육원", "삽살개"));
		list.add(new Quiz4Dog("짱구네", "마르티스"));
		list.add(new Quiz4Dog("최강야구", "푸들"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).showDogInfo());
		}

		for (Quiz4Dog dog : list) {
			System.out.println(dog.showDogInfo());
		}
	}
}

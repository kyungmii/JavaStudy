package chapter7;

public class Quiz4DogTest {
	public static void main(String[] args) {

		Quiz4Dog[] dogArray = new Quiz4Dog[5];
		dogArray[0] = new Quiz4Dog("경미네강아지", "치아와");
		dogArray[1] = new Quiz4Dog("친구네강아지", "진돗개");
		dogArray[2] = new Quiz4Dog("kh정보교육원", "삽살개");
		dogArray[3] = new Quiz4Dog("짱구네", "마르티스");
		dogArray[4] = new Quiz4Dog("최강야구", "푸들");

		for (int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}

		for (Quiz4Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
	}

}

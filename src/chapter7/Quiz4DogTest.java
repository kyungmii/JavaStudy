package chapter7;

public class Quiz4DogTest {
	public static void main(String[] args) {

		Quiz4Dog[] dogArray = new Quiz4Dog[5];
		dogArray[0] = new Quiz4Dog("��̳װ�����", "ġ�ƿ�");
		dogArray[1] = new Quiz4Dog("ģ���װ�����", "������");
		dogArray[2] = new Quiz4Dog("kh����������", "��찳");
		dogArray[3] = new Quiz4Dog("¯����", "����Ƽ��");
		dogArray[4] = new Quiz4Dog("�ְ��߱�", "Ǫ��");

		for (int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}

		for (Quiz4Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
	}

}

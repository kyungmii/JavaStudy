package chapter7;

import java.util.ArrayList;

public class Quiz5DogTest {
	public static void main(String[] args) {

		ArrayList<Quiz4Dog> list = new ArrayList<Quiz4Dog>();
		list.add(new Quiz4Dog("��̳װ�����", "ġ�ƿ�"));
		list.add(new Quiz4Dog("ģ���װ�����", "������"));
		list.add(new Quiz4Dog("kh����������", "��찳"));
		list.add(new Quiz4Dog("¯����", "����Ƽ��"));
		list.add(new Quiz4Dog("�ְ��߱�", "Ǫ��"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).showDogInfo());
		}

		for (Quiz4Dog dog : list) {
			System.out.println(dog.showDogInfo());
		}
	}
}

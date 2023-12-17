package chapter6;

//this �� �ٸ� ������ ȣ�� �ϱ� 
class Person {
	String name;
	int age;

	Person() {
		this("�̸�����", 1); // this �� ����� Person(String , int) ������ ȣ��-> �� Person 
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//��ȯ���� Ŭ���������� 
	Person returnItSelf() {
		return this; //this ��ȯ 
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);

		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}

}

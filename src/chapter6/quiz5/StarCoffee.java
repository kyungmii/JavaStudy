package chapter6.quiz5;

public class StarCoffee {

	int money;
	
	public String brewing(int money) {
		this.money += money;
		if (money == Menu.STARAMERICANO) {
			 return "���ٹ� �Ƹ޸�ī�븦 ����";
		}
		else if ( money == Menu.STARLATTE) {
			return "���ٹ� �� ���� " ;
		}
		else {
			return null;
		}
	}
}


package chapter7;

public class EnhancedForLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = { "Java", "Android", "C", "JavaScript", "Python" };

		for (String lang : strArray) {
			System.out.println(lang);

		}
		int[] numArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int number : numArray) {
			System.out.println(number);
		}

	}
}

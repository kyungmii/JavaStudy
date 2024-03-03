package chapter7;

public class Book {

	private String bookName;
	private String author;

	public Book() {
	} // 디폴트생성자 : 생성과 정의하지않았을때 자바 컴파일러에서 자동으로 만들어주는 생성자

	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;

	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
}

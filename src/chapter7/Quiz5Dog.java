package chapter7;

public class Quiz5Dog {
	private String name;
	private String type;
	
	public Quiz5Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String showDogInfo() {
		return name + ", " + type;
	}
}

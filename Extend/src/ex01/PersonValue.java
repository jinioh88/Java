package ex01;

public class PersonValue {
	protected int age;
	protected String name;
	public PersonValue(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public PersonValue() {}
	
	public String getInfo() {
		String rt = new String();
		rt = "age : "+age+", name : "+name;
		return rt;
	}
}

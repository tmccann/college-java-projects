package MultipleConstructorsPackage;

public class TestClass {
	//class wide variable
	private String name;
	private int userAge;
	
	//constructors
	public  TestClass() {
		name = "tommy";
	}
	
	public  TestClass(String newName) {
		name =  newName;
	}
	
	public  TestClass(String newName, int age) {
		name =  newName;
		userAge = age;
	}
	
	public String getName() {
		return name;
	}
	

	
}

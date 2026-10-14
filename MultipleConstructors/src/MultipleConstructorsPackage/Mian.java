package MultipleConstructorsPackage;

public class Mian {

	public static void main(String[] args) {
		
		TestClass myClass1 = new TestClass();
		System.out.println("myClass1: " + myClass1.getName());
		
		TestClass myClass2 = new TestClass("Peter");
		System.out.println("myClass2 " + myClass2.getName());
		
		TestClass myClass3 = new TestClass("Paul", 21);
		System.out.println("myClass2 " + myClass3.getName());
	}

}

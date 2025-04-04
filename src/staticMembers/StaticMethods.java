package staticMembers;

public class StaticMethods {

	public static void main(String[] args) {
		System.out.println("Inside Main");
		StaticMethods.method1(); // Main invokes the static method which displays "Inside method1"
	}

	static void method1() {
		System.out.println("Inside method1"); // We have to invoke this function inside our main method
	}

	static {
		System.out.println("Inside the static block");
		StaticMethods.method1(); // These static methods can also be called from within static blocks
	}
}
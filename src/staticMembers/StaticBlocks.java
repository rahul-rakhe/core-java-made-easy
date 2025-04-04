package staticMembers;

public class StaticBlocks {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	static {
		System.out.println("Hello I am static block 1\n");
	}

	static {
		System.out.println("Hello I am static block 2\n");
	}
}
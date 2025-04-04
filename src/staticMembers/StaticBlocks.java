package staticMembers;

public class StaticBlocks {

	public static void main(String[] args) {
		System.out.println("\r\n"
				+ "	Section 4: Static Members and their execution control flow\r\n"
				+ "\r\n"
				+ "	Lecture 28 - Static Blocks\r\n"
				+ "\r\n"
				+ "	In the static block whatever code we put will be executed by the JVM.\r\n"
				+ "	\r\n"
				+ "	When the class is loaded this will be executed only once.\r\n"
				+ "	\r\n"
				+ "	And this class is loaded even before the main method is called.\r\n"
				+ "	\r\n"
				+ "	So if you want to do any initialization or any connections to any other systems or anything that we want, to be executed before the actual main method gets executed it should go inside the static block.\r\n"
				+ "	\r\n"
				+ "	So if we have multiple static blocks the order of the static blocks is important because the JVM uses the order to run them.\r\n"
				+ "	\r\n"
				+ "");
	}

	static {
		System.out.println("	Hello I am static block 1\n");
	}

	static {
		System.out.println("	Hello I am static block 2\n");
	}
}
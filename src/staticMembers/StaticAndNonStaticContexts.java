package staticMembers;

public class StaticAndNonStaticContexts {

	public static void main(String[] args) {
		System.out.println(" 	Section 4: Static Members and their execution control flow\r\n"
				+ "\r\n"
				+ "	Lecture 27 - Static and Non Static Contexts\r\n"
				+ "\r\n"
				+ "	Static Context or Class Level Context -> This is for entire class\r\n"
				+ "\r\n"
				+ "	It doesn't matter how many objects of that class you create, they will all share the same context. \r\n"
				+ "	Whether it is blocks, properties or methods, all the objects will share them.\r\n"
				+ "\r\n"
				+ "	We don't even need to create an object to access a static context.\r\n"
				+ "\r\n"
				+ "	You will just use the class name to access the static methods and static properties.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "	Non Static Context is per Object and we need to create an object to access the non-static context.\r\n"
				+ "	\r\n"
				+ "	Let's wrap it up with an example -\r\n"
				+ "\r\n"
				+ "	Banking Example\r\n"
				+ "\r\n"
				+ "	accountBalance				interest\r\n"
				+ "\r\n"
				+ "	withdraw()					calculateInterest()\r\n"
				+ "\r\n"
				+ "	checkBalance()\r\n"
				+ "\r\n"
				+ "	If we take an banking application for a bank account, then accountBalance, withdrawal() & checkBalance() are per object.\r\n"
				+ "\r\n"
				+ "	Each bank account or each object will have their own account balance, withdrawal methods and check balance.\r\n"
				+ "\r\n"
				+ "	Whereas interest, if you are taking a loan from a bank then the loan interest rates, calculating interest are common across bank accounts and across customers.\r\n"
				+ "\r\n"
				+ "	So these can be static whereas account balance, withdraw, check balance should be non-static which are per object.\r\n"
				+ "\r\n"
				+ "");
	
	
	}
}
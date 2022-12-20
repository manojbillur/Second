package package1;

public class Test {
	private String name = "";

	public static void main(String[] args) {
		System.out.println("Hello!!!" + getName());

	}
	
	private static String getName() {
		return "Jack";

	}
	
	private void setName(String myName) {
		this.name = myName;

	}

}

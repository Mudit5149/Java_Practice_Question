//Program How Static method will be executed first :
public class StaticMethodDemo {

	public static void main(String[] args) {
		System.out.println("Inside main");
		StaticMethodDemo.method1();
		
		

	}
	static void method1() {
		System.out.println("Inside main");
	}
	
	
	static {
		System.out.println("inside main method ");
		StaticMethodDemo.method1();
	}
	
	
}

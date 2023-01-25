
public class Person {

	
		 int age=21;
		 int weight=30;
		 String color= "Light";
		 
		 
		 void eat () {
			 System.out.println("I am Studying ");
		 }
		 void sleep() {
			 System.out.println("I am Sleeping ");
		 }
		 public static void main(String[] args) {
			 Person P=new Person();
			 System.out.println(P.age);
			 System.out.println(P.weight);
			 System.out.println(P.color);
			 
			 P.eat(); P.sleep();
			 
		 }
		 
		 

	}



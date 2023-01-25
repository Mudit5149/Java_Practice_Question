import java.util.Scanner;

public class marks {
	public static void main(String[] args) {
		int marks;
		System.out.print("enter the marks ");
		Scanner  s= new Scanner(System.in);
		marks=s.nextInt();
		if(marks>=60 && marks<=100) {
			System.out.println("You Scored first position ");
		
		}
		else if (marks>=50 && marks<=80){
			System.out.println("you Scored Second position in class ");
			
		}
		else if(marks >=40 && marks<=60) {
			System.out.print("you have Scored the third position:");
			
		}
		else
			System.out.println("you are only average student needs to work hard :");
		}
	
		
	}

	
		
	



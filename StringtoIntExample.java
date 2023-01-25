package javaExample;

public class StringtoIntExample {
		public static void main(String args[]){
		String s="200";
		int i=Integer.parseInt(s);
		System.out.println(s+100);//200100 because + is string concatenation operator
		System.out.println(i+100);//300 because + is binary plus operator
		}
}
		
//Convert String to the Integer 
//int i=200;
//String s=String.valueOf(i);
//System.out.println(i+100);//300 because + is binary plus operator
//System.out.println(s+100);//200100 because + is string concatenation operator
//}
//}

//------------------------Convert String to Long============================= 
//String s="9990449935";
//long l=Long.parseLong(s);
//System.out.println(l);
//}}
//__________________-----------------Convert String to Float____------------------ 

//String s="23.6";
//float f=Float.parseFloat("23.6");
//System.out.println(f);
//}}



//_______________________------------Convert String to double-------------______________________________ 
//String s="23.6";
//double d=Double.parseDouble("23.6");
//System.out.println(d);
//}}




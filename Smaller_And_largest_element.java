//JAva program to find the largest and Smallest Element from a given Array:

package javaExample;



public class Smaller_And_largest_element {

	public static void main(String[] args) {
		 int[] numbers = {3, 4, 5, 1, 2, 9, 7, 8, 6};
		    int min = Integer.MAX_VALUE;
		    int max = Integer.MIN_VALUE;

		    for (int num : numbers) {
		        if (num < min) {
		            min = num;
		        }
		        if (num > max) {
		            max = num;
		        }
		    }
		    System.out.println("Minimum: " + min);
		    System.out.println("Maximum: " + max);
		  }
	
}
//   ===By using this logic new java feature Stream we can also find the Smallest and the largest number in Array===
		
//		int[] numbers = {100, 4, 5, 5, 2, 9, 7, 8, 6};
//		int min = Arrays.stream(numbers).min().getAsInt();
//		int max = Arrays.stream(numbers).max().getAsInt();
//		System.out.println("Minimum: " + min);
//		System.out.println("Maximum: " + max);


	



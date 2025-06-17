package Activites;
interface Addable {
    int add(int a, int b);
}
public class Activity12 {
	

	
	    public static void main(String[] args) {
	        Addable num1 = (a, b) -> a + b;
	        System.out.println("Sum using ad1: " + num1.add(3, 4));

	        Addable num2 = (a, b) -> {
	            return a + b;
	        };
	        System.out.println("Sum using ad2: " + num2.add(7, 8));
	    }
	}


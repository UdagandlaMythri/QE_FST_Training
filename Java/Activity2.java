package Activites;

public class Activity2 {

	public static void main(String[] args) {
		 int[] numbers = {10, 77, 10, 54, -11, 10};
		 System.out.println("Is the sum of 10s equal to 30?"+countTens(numbers));
	}
	public static boolean countTens(int[] numbers) {

		 int sum=0;
		 for (int number:numbers) {
			 if(number==10) {
				 sum+=number;
				 System.out.println(sum);
			 }

		 if(sum>30) {
			 break;
		 }
	}
      return sum==30;
	}
}

//public class Activity2 {
//
//    public static void main(String[] args) {
//        // Initialize an array with 6 numbers
//        int[] numbers = {10, 77, 10, 54, -11, 10};
//
//        // Find the 10's in the array and add them
//        int sumOfTens = 0;
//        for (int number : numbers) {
//            if (number == 10) {
//                sumOfTens += number;
//            }
//        }
//
//        // Check if the sum of 10's is exactly 30 and print the result
//        if (sumOfTens == 30) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//    }
//}


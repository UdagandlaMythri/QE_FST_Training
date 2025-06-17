package Activites;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
	 public static void main(String[] args) {
	        // take input from user
	        Scanner scan = new Scanner(System.in);
	        System.out.println("enter comma seperated values:");
//	        add them to an array
	        Object[] inputArr=scan.nextLine().split(",");
	        System.out.println("Input array is:"+Arrays.toString(inputArr));
	        
//	        generate a random index number
	        int indexGen=new Random().nextInt(inputArr.length-1);
	        System.out.println("Random index is"+indexGen);
	        
//	        print the value at the generated index
	        System.out.println("Seperated value is:"+inputArr[indexGen]);
	 }
}

package Activites;

import java.util.Scanner;

public class Activity15 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter first number:");
		int a=scanner.nextInt();
		
		System.out.println("enter second number:");
		int b=scanner.nextInt();
		
		System.out.println("enter third number:");
		int c=scanner.nextInt();
		
		if(a==b && b==c) {
			System.out.println("all are equal");
		}else if(a==b||b==c||a==c) {
			System.out.println("two are equal");
		}else {
			System.out.println("all are not equal");
		}
	}
}

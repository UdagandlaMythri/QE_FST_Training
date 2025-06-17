package Activites;

import java.util.Scanner;

public class Activity18 {
	static long factorial(int num) {
		if(num==0||num==1) 
			return 1;
		return num*factorial(num-1);
	}
	static int fibonacci(int num) {
		if(num==0)
			return 0;
		if(num==1)
			return 1;
		return fibonacci(num-1)+fibonacci(num-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("factorial will be:"+factorial(n));
		System.out.println("fibonacci series will be:");
		for(int i=0;i<n;i++) {
			System.out.println(fibonacci(i)+"");
		}
		System.out.println();
		
	}
}

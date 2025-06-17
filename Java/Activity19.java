package Activites;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char c[]=str.toLowerCase().toCharArray();
		List<String> vow=new ArrayList<>();
		List<String> con=new ArrayList<>();
		List<String> pun=new ArrayList<>();
		for(char x:c) {
			if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u') {
				vow.add(String.valueOf(x));
			}else if(!Character.isAlphabetic(x) && !Character.isDigit(x)) {
				pun.add(String.valueOf(x));
			}
			else {
				con.add(String.valueOf(x));
			}
		}
		System.out.println("\nthe vowels in the string");
		for(String x:vow)
			System.out.print(x);
		System.out.println("\nthe punctuations in the string");
		for(String x:pun)
			System.out.print(x);
		System.out.println("\nthe constants in the string");
		for(String x:con)
			System.out.print(x);
	}
}

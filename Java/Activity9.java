package Activites;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
	public static void main(String[] args) {
		List<String> arrList=new ArrayList<>();
		
//		add names
		arrList.add("apple");
		arrList.add("orange");
		arrList.add("peach");
		arrList.add("strawberry");
		arrList.add("pineapple");
		
//		print names
		System.out.println("items in the list are:");
		for(String item:arrList) {
			System.out.println(item);
		}
//		third name in the list
		System.out.println("third name is:"+arrList.get(2));
		
//		print the size of the list
		System.out.println("size of list before removing:"+arrList.size());
		
//		remove a name
		System.out.println("value removed is:"+arrList.remove(2));
		
//		print the size of the list
		System.out.println("size of list after removing:"+arrList.size());
	}
}

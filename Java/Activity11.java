package Activites;

import java.util.HashMap;

public class Activity11 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		
//		add colors to hashmap
		hm.put(1,"red");
		hm.put(2,"blue");
		hm.put(3,"green");
		hm.put(4,"purple");
		hm.put(5,"black");
//		print the pairs
		System.out.println("key-value pairs are:");
		System.out.println(hm.entrySet());
//		remove a color
		System.out.println("color removed is:"+hm.remove(5));
//		search for green
		System.out.println("does green exists in the map?:"+hm.containsValue("green"));
//		size of the map
		System.out.println("number of pairs in the map:"+hm.size());
//		print the pairs
		System.out.println(hm.entrySet());
	}
}

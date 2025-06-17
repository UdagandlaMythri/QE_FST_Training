package Activites;

import java.util.HashSet;

public class Activity10 {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		
//		Add values to set
		hs.add(1);
		hs.add(15);
		hs.add(20);
		hs.add(90);
		hs.add(94);
		hs.add(1000);
		
//		size of the set
		System.out.println("number of items in the set:"+hs.size());
//		remove an item that exists
		System.out.println("is the given item removed?"+hs.remove(15));
//		remove an item that does not exists
		System.out.println("is the given item removed?"+hs.remove(5));
//		search for an item
		System.out.println("does 1000 exists in the set?"+hs.contains(1000));
//		values in the set
		System.out.println("values in the set:");
		for(int item:hs) {
			System.out.println(item);
		}
	}
}

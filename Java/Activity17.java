package Activites;

import java.util.HashSet;
import java.util.Set;

public class Activity17 {
	public boolean havingDuplicates(int[] arr) {
		Set<Integer> hs=new HashSet<>();
		for(int x:arr) {
			hs.add(x);
		}
		if(arr.length==hs.size()) {
			return false;
		}
		return true;
	}
	
	public void exceptionTest(int[] arr) throws DupliNumException{
		if(!havingDuplicates(arr)) {
			for(int x:arr) {
				System.out.println(x);
			}
		}else {
			throw new DupliNumException("Array should not have duplicates");
		}
	}
	
	public static void main(String[] args) {
		Activity17 obj=new Activity17();
		try {
			int[] arr= {1,2,3,4,5};
			int[] arr1= {1,2,2,4,5};
			obj.exceptionTest(arr);
			obj.exceptionTest(arr1);
		}
		catch(DupliNumException e){
			System.out.println(e.getMessage());
		}
		System.out.println("end of program");
	}
}

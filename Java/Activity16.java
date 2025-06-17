package Activites;

public class Activity16 {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70};
		int target=40;
		
		int result=binarySearch(arr,target);
		
		if(result==-1) {
			System.out.println("Element not found in array");
		}else {
			System.out.println("element found at index:"+result);
		}
	}

	public static int binarySearch(int[] arr, int target) {

		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return -1;	
	
	}
}

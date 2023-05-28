package sumya;


import java.util.Arrays;
public class Improved_bubble_sort {
	
	public static void bubble(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {10,80,54,121,36,85,65};
		System.out.println("Before:"+ Arrays.toString(arr));
		bubble(arr);
		System.out.println("After:"+ Arrays.toString(arr));
		
	}
}


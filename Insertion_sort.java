package sumya;
import java.util.Arrays;
public class Insertion_sort {
	
	public static void insertion(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int j,temp=arr[i];
			for(j=i-1; j>=0 && arr[j]>temp;j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
	}
public static void main(String[] args) {
	int arr[]= {10,54,32,21,95,46};
	
	System.out.println("before: "+Arrays.toString(arr));
	insertion(arr);
	System.out.println("after: "+Arrays.toString(arr));
}
}

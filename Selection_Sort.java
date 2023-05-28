package sumya;
import java.util.Arrays;
public class Selection_Sort {
	public static void selection(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1 ;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				}
			}
		}
	}
public static void main(String[] main) {
	int[] arr= {10,54,61,32,18};
	System.out.println("Before:"+ Arrays.toString(arr));
	selection(arr);
	System.out.println("After:"+ Arrays.toString(arr));
	
	 
}
}

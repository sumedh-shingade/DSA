package sumya;
import java.util.Arrays;

public class QuickSort 
	{
	
	public static void swap(int[] arr,int x,int y) {
		
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	
	public static void quickSort(int[] arr,int left,int right) {
		
		if(left>=right) {
			return ;
		}
		
		int i =left,j=right;
		while(i<j) {
		
		
		//consider left as pivot element
		//compare each ith element with pivot element
		
		while(i<=right && arr[i] <=arr[left]) 
			// if it is greater then increment the value by 1
			i++;
		
		
		//compare the jth element with pivot element
		while(arr[j]>arr[left]) 
			//if the right is less than pivot element then decrease the jth value by 1 
			j--;
		
		
		//i and j swaps 
		
		if(i<j) 
			swap(arr,i,j);
		}	
		
		swap(arr,j,left);
		//apply sort to left partition
		quickSort(arr,left,j-1);
		//apply sort to left partition
		quickSort(arr,j+1,right);
		
		
		
			
	}
	

	public static void main(String args[]) 
	{
		int arr[]= {10,21,32,14,12,36};
		
		
		
		System.out.println("Before: "+Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println("After: "+Arrays.toString(arr));	
		
		
	}
}

package array;
import java.util.Arrays;

public class BubbleSortNum {

	public static void main(String[] args) {
		
		int arr[]= {10, 50, 30, 20, 40, 60, 9, 8};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}					
			}
		}
		System.out.println(Arrays.toString(arr));  // array sort
		System.out.println("Maximum Number: "+arr[arr.length-1]); // maximum number
		System.out.println("Second Maximum Number: "+arr[arr.length-2]); // 2nd maximum number
		System.out.println("Minimum num: " +arr[0]); // minimum number
		System.out.println("Second minimum number: " +arr[1]); // 2nd min number

	}
}

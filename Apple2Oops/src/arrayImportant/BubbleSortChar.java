package arrayImportant;
  // Important code
import java.util.Arrays;

public class BubbleSortChar {

	public static void main(String[] args) {
		
		char arr[]= { 'f', 'd', 'a', 'x', 's'};

		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
					
			}
		}
		System.out.println(Arrays.toString(arr));  // array sort
		System.out.println("Max char: "+arr[arr.length-1]); // maximum char
		System.out.println("Second max char: "+arr[arr.length-2]); // 2nd maximum char
		System.out.println("Min char: "+arr[0]); // minimum char
		System.out.println("Second min char: "+arr[1]); // 2nd min char

	}
	

}

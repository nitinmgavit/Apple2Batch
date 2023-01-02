package array2DAssignment;

import java.util.Scanner;

public class Symmetrix {
	
   	public static void main(String args []) {
	
     	Scanner sc = new Scanner(System.in);
	
       int flag=1;
       System.out.println("Enter the number of rows:");
       int row = sc.nextInt();
       System.out.println("Enter the number of columns:");
       int col = sc.nextInt();

         int mat [][] = new int[row][col];
         int transpose [][] = new int[row][col];

	   System.out.println("Enter the elements of the matrix") ;
	     for(int i=0; i<row; i++)
	      { 
	     	for(int j=0; j<col; j++)
	     	{ 
    	    	mat[i][j] = sc.nextInt();
		   }
    }

	     System.out.println("The elements of the matrix") ;
	       for(int i=0; i<row; i++)
	        { 
	        	for(int j=0; j<col; j++)
	        	{ 
   	        		System.out.print(mat[i][j]+"  ");
	         	}
	        		System.out.println();
       }

	//To find transpose

      for(int i=0; i<row; i++)
       {
         for(int j=0; j<col; j++)

	    {
         transpose[j][i]=mat[i][j];
       }
  }

	if(row==col)
	{
		for(int i=0; i<row; i++)
		{
    			for(int j=0; j<col; j++)
    			{
        			if(mat[i][j]!=transpose[i][j])
        			{	
            				flag=0;
				break;
			}	
        }
    			
		if(flag==0)
        		{
        			System.out.print("\nThe matrix is not symmetric");                	
			break;	
    			}
    		}
	
		if(flag==1)
		{
    			System.out.print("\nThe matrix is symmetric");
		}
  }

     else
    	{
       		System.out.print("\nThe matrix is not symmetric");
    	}
   }	

}


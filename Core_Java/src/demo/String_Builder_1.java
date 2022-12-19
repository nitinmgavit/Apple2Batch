package demo;

public class String_Builder_1 {

	public static void main(String[] args) {
		
		// String Builder

		StringBuilder sb=new StringBuilder("Nitin");
		 System.out.println(sb);
		
		 // char insert at 0th index.
//		 sb.insert(0, 'K');
//		 System.out.println(sb); //KNitin
	 
		 sb.insert(3, 'h');
		 System.out.println(sb); // N i t h i n --> char insert at 3rd index
                             //     0 1 2 3 4 5
		 
		 // delete the extra index 't'
		 sb.delete(3, 4);   // start index 3rd,  end index 4th-> start from 3rd it means delete 3rd index, 
		                     //   and upto 4th but 4th will not delete. 
		 System.out.println(sb);
	}

}

package week3.Assignments.Day2;

public class ArrayAssignment1 {

	// find FindIntersection

	public static void main(String[] args) {

		
//		 Pseudo Code
//		
//		 a) Declare An array for {3,2,11,4,6,7};	
		
		int [] array1 = {3,2,11,4,6,7};
		
//		 b) Declare another array for {1,2,8,4,9,7};
		
		int [] array2 = {1,2,8,4,9,7};

//		 c) Declare for loop iterator from 0 to array length
//		 d) Declare a nested for another array from 0 to array length
//		 e) Compare Both the arrays using a condition statement
//		 f) Print the first array (should match item in both arrays)

		boolean status = false;
		for (int i = 0; i < array1.length ; i++) {
			
			for (int j = 0; j < array2.length; j++) {
				
				if (array1[i] == array2[j])
				{
					System.out.println("The 1st number intersect on comparision - number is:"+array1[i]);
					//return;
					status = true;
				}
				else {
					continue;
				}
			}
			if (status == true)
			{
				break;
			}
		}
		
		//printing array in single values
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
 
	}

}

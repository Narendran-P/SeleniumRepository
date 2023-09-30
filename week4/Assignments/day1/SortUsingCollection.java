package week4.Assignments.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortUsingCollection {
	
	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		// get the length of the array		
		// sort the array			
		// Iterate it in the reverse order
		// print the array
		// Required Output: Wipro, HCL , CTS, Aspire Systems
		
		String [] str = new String[4];
		str[0] = "HCL";
		str[1] = "Wipro";
		str[2] = "Aspire Systems";
		str[3] = "CTS";

		System.out.println(Arrays.toString(str));
		//length of the array
		int len = str.length;
		System.out.println("Length of Array is "+len);

		// sort the array				
		List<String> newStr = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			newStr.add(str[i]);
		}
		Collections.sort(newStr);
		System.out.println(newStr);
		
		// Iterate it in the reverse order
		// print the array
		
		Collections.reverse(newStr);
		System.out.println(newStr);

//		List<String> newStr1 = new ArrayList<>();
//		for (int i = len-1 ; i <= 0; i--) {
//			newStr1.add(newStr[i]);
//	}

}
}

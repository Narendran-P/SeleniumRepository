package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArraySet {
	public static void main(String[] args) {
		
		String companyname = "google";
		
		char companyNameArray [] = companyname.toCharArray();
		
		Set<Character> newCompany = new LinkedHashSet<>();
		
		for (Character char1 : companyNameArray) {
			newCompany.add(char1);
		}
		System.out.println(newCompany);
		
		String output = "";
		for (Character each1 : newCompany) {
			output = output+each1;		
		}
		System.out.println(output);
		
		
	}

}

package week3.day2;

import java.util.Arrays;

public class ArrayLearning {
	
	public static void main(String[] args) {
		
		int[] scores = {98,97,76,87,90};
		
		int scoresLength1 = scores.length;
		System.out.println("The length of Array is: "+scoresLength1);
		
	
		for (int i = scoresLength1 - 1; i >= 0 ; i--) {
			System.out.println(scores[i]);
		}
			Arrays.sort(scores);
			System.out.println("After Sort ");
		
			for (int j = scoresLength1 - 1; j >= 0 ; j--) {
				System.out.println(scores[j]);
		}
			
		
	}
}



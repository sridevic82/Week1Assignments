package week1.day2;

import java.util.Arrays;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {2,5,3,7,2,7,2,1};
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length-1;i++)
		{
			if(numbers[i]==numbers[i+1])
			{
				System.out.println(numbers[i]);
				break;
			}
		}

	}

}

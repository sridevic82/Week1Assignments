package week1.day2;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String one="stops";
		String two="potss";
		char [] a=one.toCharArray();
		char [] b=two.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a,b)==true)
		{
		
		System.out.println("The Given Two String are anagram");

		}

}
}
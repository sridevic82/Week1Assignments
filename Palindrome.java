package week1.day2;

public class Palindrome {

	private static char d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="MADAM";
		
		String rev="";
		
		
		for (int i = a.length()-1; i >= 0; i--) {
			
			
			rev=rev +a.charAt(i);
		
		}
			if(a.equals(rev))
			{
						
				System.out.println("The given string is Plindrome");	
					
				}
			
		
			
				
			
	}
}
				
	



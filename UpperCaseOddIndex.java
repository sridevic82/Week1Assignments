package week1.day2;

public class UpperCaseOddIndex {

	public static void main(String[] args) {
		
		String name="changeme";
		char[] charArray = name.toCharArray();
		for (int i = 0; i <charArray.length; i++) {
			
			if(i%2==0)
			{
				System.out.print(charArray[i]);
			}
			else
		{
				char c = charArray[i];
				char upperCase = Character.toUpperCase(c);
				System.out.print(upperCase);
				
			}
		}

	}

}

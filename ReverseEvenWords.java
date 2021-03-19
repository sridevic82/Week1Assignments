package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String a="I am a software tester";
		String [] b=a.split(" ");
		
		for (int i = 0; i < b.length; i++) {
			if(i%2==1){
				char[] charArray = b[i].toCharArray();
				for (int j = charArray.length; j > 0; j--) {
					
				System.out.print(charArray[j-1]);
				}
				
			} else
				System.out.print(b[i]);
				System.out.print(" ");
			
		}
		

	}

}

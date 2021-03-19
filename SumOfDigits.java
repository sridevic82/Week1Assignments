package week1.day2;

public class SumOfDigits {



	public static void main(String[] args) {
	
		 int a=0;
		 int sum=0;
		int input=123;
		
		while (input>0)
		{
			a=input%10;
		   sum=sum+a;
		   input=input/10;
			
		}
		
		
		System.out.println("The sum of digits is:"+ " " +sum);

	}

}

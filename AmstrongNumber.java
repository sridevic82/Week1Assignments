package week1.day2;

public class AmstrongNumber {

	public static void main(String[] args) {
	int input=153 ;
	int a=0;
	int sum=0;
	
	while (input>0)
	{
		a=input%10;
		input=input/10;
		sum=sum+(a*a*a);
	}
	
	System.out.println("The Amstrong Number is"  + " " + sum);
			
	}

}

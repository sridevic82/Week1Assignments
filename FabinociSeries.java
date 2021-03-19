package week1.day2;



public class FabinociSeries {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int sum;
		int input=8;
		System.out.println("fabonaci series is" + a);
		for (int i = 1; i < input; i++) {
			
			sum=a+b;
			b=a;
			a=sum;
			System.out.println(sum);
			
		}

	}

}

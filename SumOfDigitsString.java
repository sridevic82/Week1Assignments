package week1.day2;

public class SumOfDigitsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Tes12Le79af65";
		String replaceAll = a.replaceAll("[^0-9]","");
		
		char[] charArray = replaceAll.toCharArray();
		int sum=0;
		for (int i = 0; i < charArray.length; i++) {
			int no=Integer.parseInt(String.valueOf(charArray[i]));
			sum=sum+no;
		}
		System.out.println(sum);
	}

}

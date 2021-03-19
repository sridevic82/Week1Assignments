package week1.day2;


public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="we learnt java basis as java session";
		String [] b=a.split(" ");
		String replaceAll = "";
		int count = 0;
		 
		for (int i = 0; i < b.length; i++){
		
			for	(int j=i+1;j<b.length;j++){
			
				if((b[i].equals(b[j]))){
					count=count++;
						if (count>0) {
							replaceAll = a.replace(b[j],"");
							System.out.println(replaceAll);
						}
				}
			//String first =	a.replaceFirst(b[j], " ");
			// String replaceAll = a.replaceAll(b[j],"s");
			 
			}
			
		}		
				
				
		
	}
	
}

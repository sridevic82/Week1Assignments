package week1.day2;

public class EvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 EvenNo evenNo = new EvenNo();
 evenNo.evenNumber(100);
	}
	
	
public void evenNumber(int max) {

	for(int i=1;i<=max;i++){
	
		if(i%2==0){
		
			System.out.println("no is :" +i);
		}
    }
  }
}

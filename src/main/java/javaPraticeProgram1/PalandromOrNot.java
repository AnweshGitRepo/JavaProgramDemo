package javaPraticeProgram1;

public class PalandromOrNot {

	
	public static void main(String[] args) {
		int no=12321,orgInt=no;
		int revint=0;
		int temp;
		
	while(no>0) {
		temp=no%10;
		revint=revint*10+temp;
		no=no/10;		
	}
	if(revint==orgInt) {
		System.out.println(revint+" =>  Palandrom");
		
	}else {
		System.out.println(orgInt+" =>  Not Palandrom");
	}	
	}	
}

package Modal;
import java.util.Scanner;

class Problem{
	Scanner obj=new Scanner(System.in);
	
	void main() {          //--------------> function 1
		System.out.println("you may go press --> 1 "
				+ " \n you left press -->2");
		int ab=obj.nextInt();
		
		if(ab==1) {
			System.out.println("");
			System.out.println("Type Number : \n for exit -->0");
			Process();		
		}
		if(ab==2) {
			System.out.println("Thank you..!");
		}
	}
	
void Process() {          //--------------> function 2
	int a=1;
	int result;
	
	a=obj.nextInt();
	
	if(a!=00) {
	for(int i=0;i<a;i++) {
		int bb=2*i+1;
	System.out.print(bb+",");
	
		if(i!=a-1) {
			System.out.print("");		
		}	
	}
	Process();
	}
	else if(a==0){
		main();
	}	
	
}
}
public class Problem2 {

	public static void main(String[] args) {
		Problem obj=new Problem();
		obj.main();

	}

}

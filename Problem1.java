package Modal;
import java.util.Scanner;
class Calculator{
	
	void Cal() {
		Scanner obj=new Scanner(System.in);
		double num1;
		double num2;
		double result;
		int choose;
			
		System.out.println("choose your operation : "
				+ "\n press -->1 for Addition "
				+ "\n press -->2 for Subractioin "
				+ "\n press -->3 for Multiplication "
				+ "\n press -->4 for Division ");
		System.out.println(" ");				
		try {		
	   choose=obj.nextInt();   //>>>>>>>input from user weather what operation
	   int exit=0;
	   
	   if(choose==1){
		  
			 while(exit!=5) {
			
		 System.out.println("Enter 1st Number :");
		 num1=obj.nextDouble();
		 System.out.println("Enter 2nd Number :");
		 num2=obj.nextDouble();
		 result=num1+num2;                       //-------->>>>> this is for the Addition
		 System.out.println("Addition :"+num1+"+"+num2);
		 System.out.println("VALUE :"+result);
		 System.out.println(" ");
		 System.out.println("press -->1 for contunie "
		 		            + " press -->5 for back");
		 exit=obj.nextInt();
		 }
			 Cal();
	   }
	   else if(choose==2) {
		   
		   while(exit!=5 ) {
		   
		   System.out.println("Enter 1st Number :");
			 num1=obj.nextDouble();
			 System.out.println("Enter 1st Number :");
			 num2=obj.nextDouble();
			 result=num1-num2;                   //---------------> Subtraction
			 System.out.println("Addition :"+num1+"-"+num2);
			 System.out.println("VALUE :"+result); 
			 System.out.println(" ");
			 System.out.println("press-->1 for contunie "
			 		+ " press -->5 for back");
			 exit=obj.nextInt();
			 }
				 Cal();
	   }
	   else if(choose==3) {
		   
		   while(exit!=5) {
		   
		   System.out.println("Enter 1st Number :");
			 num1=obj.nextDouble();
			 System.out.println("Enter 1st Number :");
			 num2=obj.nextDouble();
			 result=num1*num2;                    //-----------> Multiplication
			 System.out.println("Addition :"+num1+"*"+num2);
			 System.out.println("VALUE :"+result);
			 System.out.println(" ");
			 System.out.println("press -->1 for contunie "
			 		+ " press -->5 for back");
			 exit=obj.nextInt();
			 }
				 Cal();
	   } 
	   else if(choose==4) {
		   
		   while(exit!=5 ) {
		   
		   System.out.println("Enter 1st Number :");
			 num1=obj.nextDouble();
			 System.out.println("Enter 1st Number :");
			 num2=obj.nextDouble();                  //-------------->Division
			 result=num1/num2;
			 System.out.println("Addition :"+num1+"/"+num2);
			 System.out.println("VALUE :"+result);
			 System.out.println(" ");
			 System.out.println("press -->1 for contunie "
			 		+ " press -->5 for back");
			 exit=obj.nextInt();
			 }
				 Cal();
	   }
	   else if(choose>=5) {
		   System.out.println("wrong input");
		   Cal();
	   }}catch(Exception e) { System.out.println("Wrong input"); Cal();}
	} 



	public static void main(String[] args) {

		    Calculator obj=new Calculator();
		    obj.Cal();
			}
	}




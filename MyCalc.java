package quiz;

import java.util.Scanner;

public class MyCalc {
	String x1,y1;
	int x,y;
	double result;
	int menuChoice;
	Scanner sc = new Scanner(System.in);
	
	MyCalc(){
		x=0;
		y=0;
		menuChoice=0;
	}
	
	void showMenu(){
		System.out.println("，Calculator Options Menu");
		System.out.println("\t1.\tAdd two integers");
		System.out.println("\t2.\tSubstract an integer from an integer");
		System.out.println("\t3.\tMultiply two integers");
		System.out.println("\t4.\tDivide an integer into an integer");
		System.out.println("\t5.\tExit");
		System.out.print("，Select one of the numbers from above: ");
		menuChoice = sc.nextInt();
	}
	void getNumbers(){
		System.out.print("，Input first number: ");
		getFirstNumber();
		System.out.print("，Input second number: ");
		getSecondNumber();
	}
	void addNumbers(){
		result = x + y;
		System.out.println(x+" + "+y+" = "+result+'\n');
	}
	void subNumbers(){
		result = x - y;
		System.out.println(x+" - "+y+" = "+result+'\n');		
	}
	void multNumbers(){
		result = x * y;
		System.out.println(x+" * "+y+" = "+result+'\n');
	}
	void divNumbers(){
		result = x / y;
		System.out.println(x+" / "+y+" = "+result+'\n');
	}
	void getFirstNumber(){
		x=sc.nextInt();		
	}
	void getSecondNumber(){
		y=sc.nextInt();
	}
	
	void asd1(){
		x1=sc.nextLine();
	}
	void asd2(){
		y1=sc.nextLine();
	}
	
	
	void checkIfDigit(String i){
		try{
			Integer.parseInt(i);
		}
		catch(Exception e){
			System.out.println("Please enter the integer");}
	}
	void convertNumbers(String i){
		Double.parseDouble(i);
	}
}

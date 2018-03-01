import java.util.Scanner;

public class FaveNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ask the name
		//greeting
		//fave number 1 & 2
		//add subtract divide multiply sqrt1 powers
		Scanner in=new Scanner (System.in);
		String name;
		double num1;
		double num2;
		double answer;
		System.out.println("Hello what is your name?");
		name=in.nextLine();
		System.out.println("Welcome "+name+"!");
		
		System.out.println("What is your first favourite number?");
		num1=in.nextDouble();
		
		System.out.println("What is your second favourite number?");
		num2=in.nextDouble();
		
		System.out.println("Lets do some math!");
		answer=num1+num2;
		
		System.out.println("When the numbers are added they equal "+answer);
		answer=num1-num2;
		answer=answer*100;
		answer=Math.round(answer);
		answer=answer/100;
		System.out.println("When the numbers are subtracted they equal "+answer);
		answer=num1*num2;
		answer=answer*100;
		answer=Math.round(answer);
		answer=answer/100;
		System.out.println("When the numbers are multiplied they equal "+answer);
		answer=num1/num2;
		answer=answer*100;
		answer=Math.round(answer);
		answer=answer/100;
		System.out.println("When the numbers are divided they equal "+answer);
 
		answer=answer*100;
		answer=Math.round(answer);
		answer=answer/100;
		System.out.println("The first number to the power of the second number is "+answer);
		answer = Math.sqrt(num1);
		answer=answer*100;
		answer=Math.round(answer);
		answer=answer/100;
		System.out.println("The squareroute of the first number is "+answer);
		System.out.println();
		
		System.out.println("Isn't math fun?");
	}

}

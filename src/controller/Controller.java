package controller;

import java.util.Scanner;

public class Controller
{
	public void start()
	{
		System.out.println("Questions");
		
		//questions();
		//just removed for now to save time.
		
		moreInput();

	}
	
	private void questions()
	{
		System.out.println("Whats you favorite color?");
		Scanner inputScanner = new Scanner(System.in);
		String answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.println("Whats  2 + 2?");
		answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.println("Whats the answer?");
		answer = inputScanner.nextLine();
		System.out.println(answer);

		
		System.out.println("Favorite Food");
		answer = inputScanner.next();
		System.out.println(answer);
		
		System.out.println("Whats your 2 favorite numbers?");
		answer = inputScanner.next();
		System.out.println(answer);
		answer = inputScanner.next();
		System.out.println(answer);
		
//		inputScanner.close();
		//Closed because I am still using the InputStream from the keyboard and don't want errors.
		
		
		

	}
	
	private void moreInput()
	{
		Scanner textScanner; //This is a declaration on a scanner variable
		textScanner = new Scanner(System.in); //Initialization of the textScanner
		
		System.out.println("Type in your favorite number");
		
		int userNumber = textScanner.nextInt();
		
		System.out.println("Your favorite number is: " + userNumber);
		
		textScanner.nextLine();//Need to call .nextLine() to consume the enter press after the call to .next, .nextInt, or .nextDouble
		
		System.out.println("Type an animal");
		String animal = textScanner.next();
		System.out.println(animal);
		textScanner.nextLine();
		
		System.out.println("Whats your age?");
		int age = textScanner.nextInt();
		System.out.println(age);
		textScanner.nextLine();
		
		System.out.println("What is the first 3 numbers of Pi");
		double Pi = textScanner.nextDouble();
		System.out.println(Pi);
		textScanner.nextLine();
		
		System.out.println("When you reverse the first 3 numbers of Pi, you get a word... what is it?");
		String Pie = textScanner.next();
		System.out.println(Pie);
		textScanner.nextLine();
		
		System.out.println("What");
		String what = textScanner.next();
		System.out.println("What: " + what);
		textScanner.nextLine();
		
		
		
		textScanner.close();
		
	}

	public boolean validInt(String sample)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(sample);//detects if wrong value is entered
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("You need to type in a number mammal!");//this catches the code, and throws back an error message
		}
		
		return isValid; //if gets an error gives error message, if not continues with program normally 
	}
	
	public boolean validDouble(String example)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(example);//if enter wrong value this detects it
			isValid = true;
		}
		catch(NumberFormatException oops)
		{
			System.out.println("Only floating point values are accepted AKA a number with a . in it");//this catches the code, and throws back an error message
		}
		
		return isValid; //if gets an error gives error message, if not continues with program normally 
	}

	
	
	
}

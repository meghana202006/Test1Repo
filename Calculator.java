import java.util.Scanner;

public class Calculator
{

	public static void main(String args[])
	{
		
		int num1 , num2;

		Scanner sc = new Scanner Scanner(System.in);

		System.out.println("Enter the first number:");

		num1 = sc.nextInt();

		System.out.println("Enter the second number:");

		num2 = sc.nextInt();

		System.out.println("Press 1 to add two numbers");
		System.out.println("Press 2 to subtract two numbers");
		System.out.println("Press 3 to multiply two numbers");
		System.out.println("Press 4 to divide two numbers");
		System.out.println("Press 5 to find remainder of two numbers");
		

		choice = int(input("Enter your choice:"));

		switch(choice)
		{
			case 1:
				System.out.println("Sum of given two numbers is: "+num1 + num2);

				break;
			case 2:
				System.out.println("Difference of given two numbers is: "+num1 - num2);

				break;
			case 3:
				System.out.println("Product of given two numbers is: "+num1 * num2);
				
				break;
			
			case 4:
				System.out.println("Quotient of given two numbers is: "+num1 / num2);
				
				break;
			case 5:
				System.out.println("Remainder of given two numbers is: "+num1 % num2);
				
				break;

			default:
				System.out.println("Invalid choice re-enter");
				
				break;
	
			
		}
		

	}

}
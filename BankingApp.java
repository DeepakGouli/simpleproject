import java.util.Scanner;

public class banking_application {
	static double Balance=0;

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int option=0;
		while(option!=4)
		{
			System.out.println("welcome to the Mybank ");
			System.out.println("1............checkbalance");
			System.out.println("2............deposite");
			System.out.println("3............withdraw");
			System.out.println("4............exit");
			System.out.println("enter an option..");
			option=scan.nextInt();
			switch(option)
			{
			case 1:
				checkbalance();
				break;
			case 2:
				deposite();
				break;
			
			case 3:
				withdraw();
				break;
			case 4:
				exite();
				break;
			default :
				System.out.println("invalid option.........");
				
			}
			
			
		}

	}
	private static void deposite() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter amount to deposite...");
		double amount=scan.nextDouble();
		Balance+=amount;
		System.out.println(amount+": rupees deposited to your account");
		
	}

	private static void checkbalance() 
	{
		System.out.println("your amount in the account is :"+Balance);
		// TODO Auto-generated method stub
		
	}

	private static void withdraw() 
	{
		System.out.println("enter amunt to withdraw.........");
		Scanner scan=new Scanner(System.in);
		double amount =scan.nextDouble();
		Balance-=amount;
		System.out.println(amount+":rupees withdrawn from your accounr.........");		
	}
	private static void exite()
	{
		System.out.println("thank you for using gulbarga bank.....Have a nice day!");
		
	}

}

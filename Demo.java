import java.util.Scanner;

class Demo
 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name...");
		String name = scan.next();
        System.out.println("Enter your age...");
		int age = scan.nextInt();
		System.out.println("Enter your height...");
		double height = scan.nextDouble();
		System.out.println("Enter your gender...");
		char gender = scan.next().charAt(0);
		System.out.println("Enter your education status True/alseF...");
		boolean eduStatus = scan.nextBoolean();
		System.out.println("------------Entered Details are--------");
		System.out.println(" Name :""+name);
		System.out.println(" Age :"+age);
		System.out.println(" Height :"+height);
		System.out.println(" Gender :"+gender);
		System.out.println(" eduStatus :"+eduStatus);
	}
}

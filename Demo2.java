import java.util.Scanner;
class Demo2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name.....");
		String name = scan.nextLine();/* nextLine means it is used for multiple words*/
        System.out.println("Enter your age.....");
		int age = scan.nextInt();
         System.out.println(" Name : "+name);
		  System.out.println(" Age : "+age);

	}
}

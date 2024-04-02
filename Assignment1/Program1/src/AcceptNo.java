import java.util.Scanner;

public class AcceptNo {
			int number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number:");
			int number = sc.nextInt();
			System.out.println("Entered Number is:"+number);
			System.out.println("The Binary representation of the entered number is:"+Integer.toBinaryString(number));
			System.out.println("The Binary representation of the entered number is:"+Integer.toOctalString(number));
			System.out.println("The Binary representation of the entered number is:"+Integer.toHexString(number));

	}

}

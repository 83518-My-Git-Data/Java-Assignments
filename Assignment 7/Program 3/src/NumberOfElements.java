import java.util.Scanner;

public class NumberOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String str1 = str.trim();
		String [] arr = str1.split(" ");

		System.out.println("The length of the string is:"+arr.length);
		
	}

}

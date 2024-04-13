import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse:");
		String str = sc.next();
		
		int len = str.length();
		String reverse = " ";
		for(int i = len -1; i>=0 ; i--) {
        reverse+=str.charAt(i);
		}
		
		System.out.println("The reverse string is:"+reverse);
	}

}

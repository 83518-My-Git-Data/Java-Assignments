import java.util.Scanner;

public class AcceptValues {
	double num1;
	double num2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Two:");
		
	
		if(sc.hasNextDouble()) {
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			double num3 = (num1 + num2)/2;
			System.out.println("The average of two numbers isL:"+num3);
			
		}
		else {
			System.out.println("The Entered Value is not a double value");
			sc.close();
		}
	}

}

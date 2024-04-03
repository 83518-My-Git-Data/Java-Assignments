import java.util.Scanner;

class Invoice{
	
	String partNo;
	String partDescription;
	int quantity;
	double price;
	
	Invoice(String partNo, String partDescription, int quantity, double price){
		this.partNo = partNo;
		this.partDescription = partDescription;
		setQuantity(quantity);
		setPrice(price);
	}
	

	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Part Number");
		this.partNo = sc.nextLine();
		System.out.println("Enter the Part Description");
		 this.partDescription = sc.nextLine();
		System.out.println("Enter Quantity");
		this.quantity = sc.nextInt();
		System.out.println("Enter the price");
		this.price = sc.nextDouble();
		

	}
	
	public String getPartNo() {
		return partNo;
	}
	
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		if(quantity < 0) {
			this.quantity = 0;
		}
		else {
			this.quantity = quantity;
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if(price < 0.0) {
			this.price = 0.0;
			
		}
		else {
			this.price = price;
		}
	}
	
	public double TotalBill() {
		// TODO Auto-generated method stub
		double total = quantity*price;
		return total;
		
	}
	
}

public class HardwareStore {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	
	Invoice I1 = new Invoice("abc","12",12,12);
	I1.accept();
	double total = I1.TotalBill();
	System.out.println("The Total bill of the Customer is:"+ total);
	
	}
}

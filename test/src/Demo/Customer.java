package Demo;

public abstract class Customer {
	String CustomerId;
	String CustomerName;
	String CustomerType;
	
	Customer(String custId, String custName, String custType){
		this.CustomerId =custId;
		this.CustomerName= custName;
		this.CustomerType = custType;
		
	}

	void showCustomerDetails() {
		System.out.println("Customer ID: " +this.CustomerId);
		System.out.println("Customer Name: " +this.CustomerName);
		System.out.println("Customer Type: "+this.CustomerType);
	}
	abstract double get_final_amount(double interest, int year);
	
}

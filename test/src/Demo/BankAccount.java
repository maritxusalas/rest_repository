package Demo;

public class BankAccount {

	public static void main(String[] args) {
		RegularCustomer regCustomer1 = new RegularCustomer("R123","Krishna","Domestic",10000);
		RegularCustomer regCustomer2 = new RegularCustomer("R345","Satish","Business",10000);
		
		EnterpriseCustomer entCustomer1 = new EnterpriseCustomer("E789","Madhu","SmallScale",10000);
		EnterpriseCustomer entCustomer2 = new EnterpriseCustomer("E379","Lahari","HighScale",10000);
		
		//REgular Customer
		
		regCustomer1.showCustomerDetails();
		System.out.println("final amount. "+ regCustomer1.get_final_amount(5, 8));
		regCustomer2.showCustomerDetails();
		System.out.println("final amount. "+ regCustomer2.get_final_amount(5, 8));
		
		//Enterprise Customer
		
		entCustomer1.showCustomerDetails();
		System.out.println("final amount: " +entCustomer1.get_final_amount(5, 8));
		entCustomer2.showCustomerDetails();
		System.out.println("final amount: " +entCustomer2.get_final_amount(5, 8));

	}

}

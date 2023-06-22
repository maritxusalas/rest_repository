package Demo;

public class EnterpriseCustomer extends Customer{
	
	//clas variables
	String customerId;
	String customerName;
	String customerType;
	double amount;
	
	//Constructor
	EnterpriseCustomer(String custId, String custName, String custType, double amt){
		super(custId,custName,custType);
		this.customerId =custId;
		this.customerName=custName;
		this.customerType=custType;
		this.amount =amt;
	}
	//method
	double get_final_amount (double interest, int year) {
		double simple_interest = this.amount*interest*year;
		double amount = this.amount*simple_interest;
		
		//flat 500 rupees discount for all Enterprise customers
		amount = amount -500;
		if (this.CustomerType=="SmallScale") {
			//for regular customer type we are discounting 500 rupees
			return amount -100;
		}
			else if (this.CustomerType=="BigScale") {
				//for business customer no discount
				return amount;
			}
			
		//besides the above customer types will return the amount calculated
		return amount;
		
		
	}

}

package Demo;

public class RegularCustomer extends Customer{
	//clas variables
		String customerId;
		String customerName;
		String customerType;
		double amount;
		
		//Constructor
		RegularCustomer(String custId, String custName, String custType, double amt){
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
			
			if (this.CustomerType=="Domestic") {
				//for regular customer type we are discounting 500 rupees
				return amount -500;
			}
				else if (this.CustomerType=="Business") {
					//for business customer no discount
					return amount;
				}
				
			//besides the above customer types will return the amount calculated
			return amount;
			
			
		}
}

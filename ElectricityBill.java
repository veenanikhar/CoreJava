/**
Create a class Electricity bill with data members as customer number, customer name, units consumed and methods as follows:

1. 	readData() - to read the values of data members.
2.	showData - to display the customer details
3.	computeBill() - to calculate and return electricity charges to be paid.calculate the bill as specified below

     number of units		 	charges
		< = 100					Rs.1.20
	for the next 200 units 		Rs. 2.00
	for the next 300 units		Rs. 3.00
		for more				Rs. 5.00		
ex:  input = 320 units output = 100*1.20 +200*2.00+20*3.00 =  Rs. 580
 
Read customer object values, calculate electricity bill and display the values.

**/
public class ElectricityBill 
{
	int customerNumber;
	String customerName; 
	float unitsConsumed;
	
	void readData(int cno, String cname, float unit) 
	{
		customerNumber = cno;
		customerName = cname;
		unitsConsumed = unit;
	}
	void showData() 
	{
		System.out.println("Customer No.: "+customerNumber);
		System.out.println("Customer Name: "+customerName);
		System.out.println("Unit Consumed: "+unitsConsumed);
	}
	void computeBill(float unit) 
	{
		float output = 0;
		if(unit <= 100) 
		{
			output = unit * 1.2f;
		}
		else if(unit <= 300) 
		{
			output = 100 * 1.2f + (unit - 100) * 2.00f;
		}
		else if(unit <= 600) 
		{
			output = 100 * 1.2f + 200 * 2.00f + (unit - 300) * 3.00f;
		}
		else 
		{
			output = 100 * 1.2f + 200 * 2.00f + 300 * 3.00f + (unit - 600) * 5.00f; 
		}
		
		System.out.println("Total amount consumed on electric bill : "+output+" for unit "+unit);
	}
	
	public static void main(String[] args) 
	{
		ElectricityBill eBill = new ElectricityBill();
		
		System.out.println("First Customer: ");
		System.out.println("---------------");
		eBill.readData(21101, "Veena", 580);
		eBill.showData();
		System.out.println("--------------------");
		eBill.computeBill(eBill.unitsConsumed);

	}
}

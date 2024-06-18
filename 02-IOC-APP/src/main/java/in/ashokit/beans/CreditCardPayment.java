package in.ashokit.beans;

public class CreditCardPayment  implements IPayment
{
	public CreditCardPayment()
	{
		System.out.println("CrediCardPayment : Constructor");
	}
	
	@Override
	public boolean payBill(double amt)
	{
		System.out.println("CreditcardPayment processing..");
		return true;
	}
}

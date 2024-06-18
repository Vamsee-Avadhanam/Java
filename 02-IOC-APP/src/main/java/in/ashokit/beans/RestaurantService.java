package in.ashokit.beans;

public class RestaurantService 
{
	private IPayment payment;
	
	public RestaurantService()
	{
		System.out.println("RestaurantService Constructor");
	}
	
	public void setPayment(IPayment payment)
	{
		this.payment=payment;
	}
	
	
	public void processPayment(double amt)
	{
		boolean status=payment.payBill(amt);
		if(status)
		{
			System.out.println("payment is success");
		}
		else
		{
			System.out.println("card is declined");
		}
	}
	
}

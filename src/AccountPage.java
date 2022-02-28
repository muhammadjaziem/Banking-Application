
public class AccountPage {
	
	private String Number;
	private double Balance;
	private String Name;
	private String Email;
	private String PhoneNumber;
	
	
	public AccountPage(String number, double balance, String name, String email, String phoneNumber) {
		
		Number = number;
		Balance = balance;
		Name = name;
		Email = email;
		PhoneNumber = phoneNumber;
	}
	
	public void MoneyDeposited(double depositMoney)
	{
		this.Balance+=depositMoney;
		System.out.println("Deposit is successful,new Balance is" + this.Balance);
	}
	
	public void WithDrawMoney(double WithdrawalMoney)
	{
		//filter the withdrawal money
		if(this.Balance-WithdrawalMoney<0)
		{
			System.out.println("Withdraw is unsuccessful" + this.Balance +"is left");
		}
		else
		{
			this.Balance-=WithdrawalMoney;
			System.out.println("Withdraw is successful. Current balance is" + this.Balance );
		}
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	

}

package exercice3;

public class Passenger extends Person{
	
	int loyaltyCardNumber;
	
	public Passenger(String name, String passportNumber, int loyaltyCardNumber) {
		super(name, passportNumber);
		this.loyaltyCardNumber = loyaltyCardNumber;
	}

	public int getLoyaltyCardNumber() {
		return loyaltyCardNumber;
	}
	
}

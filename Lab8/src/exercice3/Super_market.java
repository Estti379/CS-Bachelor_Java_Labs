package exercice3;

import java.time.LocalDate;
import java.util.*;

public class Super_market {
	
	private static List <Loyalty_Card> card_list = new ArrayList <Loyalty_Card>();
	private static Map<LocalDate, List<Loyalty_Card>> data_base = new HashMap<LocalDate, List<Loyalty_Card>>();
	
	public Super_market() {}
		
	public void add_client(Loyalty_Card card) {
		LocalDate date = LocalDate.now();
		card_list.add(card);
		Super_market.data_base.put(date,Super_market.card_list); //remark : ".add" won't work  
	}
	
	/*
	 * Checks if card is in the List, in case it is not allows redeem and 
	 * and adds the card to the List. Note that the current available points 
	 * are checked with the public boolean checkout_with_points(double bill)
	 * method of the Loyalty_Card class
	 */
	public boolean allow_redeem(Loyalty_Card card) {
		if(Super_market.data_base.containsValue(card)) {
			return false;
		}else {
			return true;
		}
	}
	
	

}

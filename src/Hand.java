import java.util.ArrayList;
import java.util.List;

public class Hand {

	List<Card> hand = new ArrayList<Card>();
	//Deck d2 = new Deck();
	
	public void addCard(Card card) {
		//get next card from deck
		//card = d2.dealCard();
		//remove dealt card from deck
		//Deck.remove(card);
		//add card to next array element in hand
		this.hand.add(card);
		//Player p = new Player();
		
		
	}
	
	public Hand getCardsInHand() {
		Hand hand = null;
		
	
		return hand;
		
	}
	
	public int getValueOfHand() {
		int valueHand = 0;
		
		//iterate over the whole hand
		for (int i = 0; i < hand.size(); i++) {
			Card temp = hand.get(i);
			valueHand = valueHand + temp.value;

			
		}
		
		
		return valueHand;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hand [hand=");
		builder.append(hand);
		builder.append("]");
		return builder.toString();
	}




	
	
}

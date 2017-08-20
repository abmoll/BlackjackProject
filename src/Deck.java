import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Deck {

	int numDealt = 0;
	List<Card> deck = new ArrayList<Card>(52);

	public void shuffleDeck() {
		Collections.sort(deck);

		for (Suit s : Suit.values()) {
			int v = 2;
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s, v));
				if (v < 10)
					v++;
			}

			Card card1 = deck.get(deck.size()-1);
			card1.value = 11;
			
//			for (Card card : deck) {
//
//				System.out.println(card);
//				System.out.println(card.value);
//			}

			Collections.shuffle(deck);
			
		}
	}

	public Card dealCard() {

		// int numDealt = 0;
		// Card card = null;

		// get the next card from the deck and return it
		Card card = deck.get(numDealt);
		numDealt++;
		return card;
	}

	// public static void main(String[] args) {

	// for (int i = 0; i < deck.size(); i++) {
	// System.out.println(deck.get(i));
	// }

	// System.out.println(deck.get(0));
	// System.out.println("*** Sorted Cards ***");
	// Collections.sort(deck);
	// for (Card card : deck) {
	// System.out.println(card);
	// }

	// System.out.println(deck.get(0));
	// System.out.println("*** Shuffled Cards ***");
	// for (Card card : deck) {
	// System.out.println(card);
	// }
}

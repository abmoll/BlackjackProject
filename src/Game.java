import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		List<Card> deck = new ArrayList<Card>(52);
		// set player names
		Player dealer = new Player("Dealer");
		Player player = new Player("Player");
		// Game g1 = new Game();
		Hand p = new Hand();
		Hand d = new Hand();
		Deck d1 = new Deck();

		d1.shuffleDeck();

		// get next card
		Card card = d1.dealCard();
		// add card to dealer hand
		d.addCard(card);

		card = d1.dealCard();
		p.addCard(card);

		card = d1.dealCard();
		d.addCard(card);

		card = d1.dealCard();
		p.addCard(card);
		boolean gameOver = false;
		System.out.println("Welcome to Blackjack!");
		System.out.println("Dealer hand" + d);
		System.out.println("Player hand" + p);
		// System.out.println("Dealer value: " + d.getValueOfHand());
		// System.out.println("Player value: " + p.getValueOfHand());
		Scanner keyb = new Scanner(System.in);

		while (gameOver == false) {
			if (d.getValueOfHand() == 21) {
				System.out.println("Dealer has 21 and wins!");
				gameOver = true;
			} else if (p.getValueOfHand() == 21) {
				System.out.println("Player has 21 and wins!");
				gameOver = true;
			}

			else if (d.getValueOfHand() < 21 && p.getValueOfHand() < 21) {
				System.out.println("\nEnter your choice:");
				System.out.println("1. Hit\n" + "2. Stay");
				int choice = keyb.nextInt();

				switch (choice) {
				case 1:
					// player chooses hit
					System.out.println("You say Hit me! You take another card!");
					card = d1.dealCard();
					p.addCard(card);
					System.out.println("Dealer hand" + d);
					System.out.println("Player hand" + p);

					if (p.getValueOfHand() > 21) {
						System.out.println("You are over 21. Dealer wins!!!");
						gameOver = true;
						break;
					} else if (p.getValueOfHand() == 21) {
						System.out.println("You have 21 -- you win!");
						gameOver = true;
						break;
					}
					// else if (p.getValueOfHand() < d.getValueOfHand()){
					// System.out.println("Dealer wins!");
					// gameOver = true;
					break;

				case 2:
					// player chooses stay
					if (d.getValueOfHand() <= p.getValueOfHand()) {
						System.out.println("Dealer takes a card!");
						card = d1.dealCard();
						d.addCard(card);
						System.out.println("Dealer hand" + d);
						System.out.println("Player hand" + p);
					}

					if (d.getValueOfHand() > 21) {
						System.out.println("Dealer is over 21. You win!!!");
						gameOver = true;
					}

					else if (d.getValueOfHand() > p.getValueOfHand()) {
						System.out.println("Dealer wins!");
						gameOver = true;
					}

				} // end of switch
			}

		}

	}

}

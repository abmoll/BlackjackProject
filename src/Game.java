import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

	public static void main (String[] args) {
		List<Card> deck = new ArrayList<Card>(52);
		//set player names
		Player dealer = new Player("Dealer");
		Player player = new Player("Player");
		//Game g1 = new Game();
		Hand p = new Hand();
		Hand d = new Hand();
		Deck d1 = new Deck();

		d1.shuffleDeck();
	
		//get next card
		Card card = d1.dealCard();
		//add card to dealer hand
		d.addCard(card);
		
		card = d1.dealCard();
		p.addCard(card);
	
		card = d1.dealCard();
		d.addCard(card);
		
		card = d1.dealCard();
		p.addCard(card);
		System.out.println("Dealer hand" + d);
		System.out.println("Player hand" + p);
		System.out.println("Dealer value: " + d.getValueOfHand());
		System.out.println("Player value: " + p.getValueOfHand());
		Scanner keyb = new Scanner(System.in);
		
		
		if (d.getValueOfHand() < 21 && p.getValueOfHand() < 21) {
			System.out.println("Enter your choice:");
			System.out.println("1. Hit\n" + "2. Stay");
			int choice = keyb.nextInt();
			
			switch (choice) {
				case 1:
					//deal card to player and add to hand
					System.out.println("Hit me!");
					card = d1.dealCard();
					p.addCard(card);
					System.out.println("Dealer hand" + d);
					System.out.println("Player hand" + p);
					break;
				case 2:
					//deal card to dealer and add to hand
					if (d.getValueOfHand() < 21 && (d.getValueOfHand() < p.getValueOfHand())) {
						System.out.println("Dealer takes a card!");
						card = d1.dealCard();
						d.addCard(card);
						System.out.println("Dealer hand" + d);
						System.out.println("Player hand" + p);
					}
					break;
			}
		}
			else if (d.getValueOfHand() == 21)
				System.out.println("Dealer has 21!");
			else if (p.getValueOfHand() == 21)
				System.out.println("Player has 21");
			else if (d.getValueOfHand() > 21)
				System.out.println("Dealer is over 21. You win!!!");
			else if (p.getValueOfHand() > 21)
				System.out.println("You are over 21. Dealer wins!!!");
		
		
		
//		
//		System.out.println(dealer.hand);
//		
//		//getcard send to each hand
//		//this adds two cards to each player's hand which is displayed face up
//		
//		
//		//check for blackjack:
//		//if dealer or player has a 10 value card and a ace, game ends
//		
//		//display hand
//		//take hit or stay decision
//		//deal cards
//		//dealer makes his decision
//		//check for winner
//		
	}

}

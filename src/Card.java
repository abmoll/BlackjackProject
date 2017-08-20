
	public class Card implements Comparable<Card> {
	    private Rank rank;
	    private Suit suit;
	    int value = 0;

	    public Card(Rank r, Suit s) {
	        rank = r;
	        suit = s;


	    }

	    @Override
	    public String toString() {
	        return (rank + " of " + suit).toLowerCase();
	    }

	    public int compareTo(Card card) {
	        int rcompare = this.rank.compareTo(card.rank);
	        int scompare = this.suit.compareTo(card.suit);

	        if (rcompare == 0)
	            return scompare;
	        else
	            return rcompare;
	    }

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result
	                + ((rank == null) ? 0 : rank.hashCode());
	        result = prime * result
	                + ((suit == null) ? 0 : suit.hashCode());
	        return result;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Card other = (Card) obj;
	        if (rank != other.rank)
	            return false;
	        if (suit != other.suit)
	            return false;
	        return true;
	    }

		public Card(Rank rank, Suit suit, int value) {
			this.rank = rank;
			this.suit = suit;
			this.value = value;
		}
	}



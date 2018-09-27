package classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Deck {

	@Test
	void test() {
		fail("Not yet implemented");
		Deck deck = new Deck();
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                Card card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n",
                    card.rankToString(card.getRank()),
                    card.suitToString(card.getSuit()));
            }
        }
	}

}


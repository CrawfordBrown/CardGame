
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void testCardCreation() {
        Card card = new Card(Suit.HEARTS, Rank.ACE);
        assertEquals(Suit.HEARTS, card.getSuit());
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    void testCardEquality() {
        Card card1 = new Card(Suit.SPADES, Rank.TEN);
        Card card2 = new Card(Suit.SPADES, Rank.TEN);
        Card card3 = new Card(Suit.HEARTS, Rank.TEN);

        assertEquals(card1, card2);
        assertNotEquals(card1, card3);
    }

    @Test
    void testCardToString() {
        Card card = new Card(Suit.CLUBS, Rank.KING);
        assertEquals("KING of CLUBS", card.toString());
    }
}

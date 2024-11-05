
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    // Test to verify that a player can add cards to their hand
    @Test
    void testAddCard() {
        Player player = new Player();
        Card card = new Card(Suit.HEARTS, Rank.ACE);
        player.addCard(card);
        assertEquals(1, player.getHandSize()); // There should be one card in hand
        assertEquals(card, player.getHand().get(0)); // The card added should be the same
    }

    // Test to verify that a player can play a card
    @Test
    void testPlayCard() {
        Player player = new Player();
        Card card1 = new Card(Suit.HEARTS, Rank.ACE);
        Card card2 = new Card(Suit.SPADES, Rank.KING);
        player.addCard(card1);
        player.addCard(card2);
        Card playedCard = player.playCard(0); // Play the first card
        assertEquals(card1, playedCard); // The played card should be the ACE of HEARTS
        assertEquals(1, player.getHandSize()); // There should be one card left in hand
    }

    // Test to verify playing a card at an invalid index
    @Test
    void testPlayCardInvalidIndex() {
        Player player = new Player();
        Card card = new Card(Suit.HEARTS, Rank.ACE);
        player.addCard(card);
        Card playedCard = player.playCard(1); // Attempt to play a card at an invalid index
        assertNull(playedCard); // Should return null
        assertEquals(1, player.getHandSize()); // The hand should remain unchanged
    }
}

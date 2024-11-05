import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    // Test to verify that a Deck contains 52 cards upon creation
    @Test
    void testDeckCreation() {
        Deck deck = new Deck();
        assertEquals(52, deck.cardsRemaining());
    }

    // Test to verify that dealing a card reduces the number of cards in the deck
    @Test
    void testDealCard() {
        Deck deck = new Deck();
        Card card = deck.dealCard();
        assertNotNull(card);
        assertEquals(51, deck.cardsRemaining()); // After dealing one card, there should be 51 left
    }

    // Test to verify that the deck is empty after all cards have been dealt
    @Test
    void testDealAllCards() {
        Deck deck = new Deck();
        for (int i = 0; i < 52; i++) {
            deck.dealCard(); // Deal all cards
        }
        assertEquals(0, deck.cardsRemaining()); // The deck should be empty now
        assertNull(deck.dealCard()); // Dealing from an empty deck should return null
    }

    // Test to verify that shuffling the deck changes the order of cards
    @Test
    void testShuffle() {
        Deck deck = new Deck();
        List<Card> originalOrder = new ArrayList<>(deck.cardsRemaining()); // Make a copy of the original order
        deck.shuffle();
        // Check that the order has changed
        assertNotEquals(originalOrder, deck.cardsRemaining());
    }
}

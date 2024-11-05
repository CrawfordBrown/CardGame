import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards;

    // Constructor to create a standard deck of cards
    public Deck() {
        cards = new ArrayList<>();
        // Add each combination of suit and rank to the deck
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
        shuffle(); // Shuffle the deck upon creation
    }

    // Shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Deal a card from the top of the deck
    public Card dealCard() {
        if (!cards.isEmpty()) {
            return cards.remove(cards.size() - 1); // Deal from the end of the list (top of the deck)
        }
        return null; // Return null if the deck is empty
    }

    // Get the number of cards remaining in the deck
    public int cardsRemaining() {
        return cards.size();
    }
}

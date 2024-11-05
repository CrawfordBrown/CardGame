
import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Card> hand; // The player's hand of cards

    // Constructor
    public Player() {
        this.hand = new ArrayList<>();
    }

    // Add a card to the player's hand
    public void addCard(Card card) {
        hand.add(card);
    }

    // Remove a card from the player's hand
    public Card playCard(int index) {
        if (index >= 0 && index < hand.size()) {
            return hand.remove(index); // Remove and return the card at the specified index
        }
        return null; // Return null if the index is invalid
    }

    // Get the number of cards in the player's hand
    public int getHandSize() {
        return hand.size();
    }

    // Get the player's hand (for testing or display)
    public List<Card> getHand() {
        return new ArrayList<>(hand); // Return a copy of the hand to prevent external modifications
    }
}

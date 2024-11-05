

public class Card {

    // Fields for the suit and rank of the card
    private final Suit suit;
    private final Rank rank;

    // Constructor to initialize the suit and rank of the card
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getter for the suit of the card
    public Suit getSuit() {
        return suit;
    }

    // Getter for the rank of the card
    public Rank getRank() {
        return rank;
    }

    // Override toString() to provide a readable representation of the card
    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    // Override equals() to compare cards based on suit and rank values
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (obj == null || getClass() != obj.getClass()) return false; // Different types
        Card card = (Card) obj;
        // Check if suit and rank are equal
        return suit == card.suit && rank == card.rank;
    }

    // Override hashCode() to ensure consistent hashing for card comparisons
    @Override
    public int hashCode() {
        // Hash based on suit and rank
        return suit.hashCode() + rank.hashCode();
    }
}
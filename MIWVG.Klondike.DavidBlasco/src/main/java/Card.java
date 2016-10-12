
public class Card {

    private FaceValue value;

    private Suit suit;

    public Card(FaceValue value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public FaceValue getCardValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

}

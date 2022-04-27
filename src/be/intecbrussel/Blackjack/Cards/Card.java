package be.intecbrussel.Blackjack.Cards;

public class Card {
    private String value;
    private String suit;

    public Card(String value, String suit) {
        setValue(value);
        setSuit(suit);
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setSuit(String suit) {
        this.suit = suit;

    }

    public String getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }
}

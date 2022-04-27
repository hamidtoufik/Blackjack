package be.intecbrussel.Blackjack.Cards;

public class Deck {
    private Card[] cards;


    public Deck() {
        generateDeck();
    }

    public Card[] getCards() {
        return cards;
    }

    private void generateDeck() {
        // initialise array
        cards = new Card[52];
        String[] Symbols = new String[] {"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for (int index = 0; index < cards.length;index++){
            if (index <= 13){
                cards[index].setValue(Symbols[index]);


            }else if(index <= 26){
                cards[index].setValue(Symbols[index-13]);
            }
        }
        // create all 52 different cards
        // add them in the array
    }
}

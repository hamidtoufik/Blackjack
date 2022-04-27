package be.intecbrussel.Blackjack.Util;

import be.intecbrussel.Blackjack.Cards.Card;
import be.intecbrussel.Blackjack.Cards.Deck;

import java.util.Random;

public class CardRandom {


    public Deck shuffleDeck(Deck Deck) {
        Random rand = new Random();
        int[] deck = new int[52];

        boolean[] cardsAreUnique = new boolean[deck.length];

        for (int index = 0; index < deck.length; ) {
            int value = rand.nextInt(52);


            if (!cardsAreUnique[value]) {
                deck[index] = value;
                cardsAreUnique[value] = true;
                index++;
            }

        }
        for(int index = 0; index< deck.length;index++){
            Card card = new Card ("test1","test2");

        }

        return Deck;
    }
}

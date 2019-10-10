import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

    private ArrayList<Card> deckOfCards;

    public Deck(){
        this.deckOfCards = new ArrayList<Card>();
    }

    public int getDeckOfCardsCount(){
        return this.deckOfCards.size();
    }

    public void addCardToDeck(Card card){
        this.deckOfCards.add(card);
    }

    public int getSuitsArray(){
        SuitType[] suits = SuitType.values();
        return suits.length;
    }

    public ArrayList createDeckOfCards(){
        SuitType[] suits = SuitType.values();
        RankType[] ranks = RankType.values();

        for (SuitType suit : suits){
            for (RankType rank : ranks){
                Card card = new Card(suit,rank);
                this.addCardToDeck(card);
            }
        }
        return this.deckOfCards;
    }

    public ArrayList createShuffledDeckOfCards(){
       ArrayList<Card> cards = this.createDeckOfCards();

//       List shuffledList  = Arrays.asList(unShuffledCards);

       Collections.shuffle(cards);

//       ArrayList<Card> shuffledArray = shuffledList.toArray();

       return cards;
    }
}

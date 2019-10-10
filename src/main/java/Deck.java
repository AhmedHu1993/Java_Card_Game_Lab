import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deckOfCards;

    public Deck(){
        this.deckOfCards = new ArrayList<Card>();
    }

    public int getDeckOfCardsCount(){
        return this.deckOfCards.size();
    }
}

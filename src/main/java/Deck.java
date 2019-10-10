import java.util.ArrayList;

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

    public void CreateDeckOfCards(){
        SuitType[] suits = SuitType.values();
        RankType[] ranks = RankType.values();

        for (SuitType suit : suits){
            for (RankType rank : ranks){
                Card card = new Card(suit,rank);
                this.addCardToDeck(card);
            }
        }
    }
}

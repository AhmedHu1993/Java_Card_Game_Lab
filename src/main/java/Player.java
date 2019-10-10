import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;

    public Player(){
        this.hand = new ArrayList<Card>();
    }

    public ArrayList getHand(){
        return this.hand;
    }

    public void addCardToHand(Card card){
        this.hand.add(card);
    }

}

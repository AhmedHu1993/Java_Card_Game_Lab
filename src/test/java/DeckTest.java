import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.DIAMONDS, RankType.FIVE);
    }

    @Test
    public void testDeckStartEmpty(){
        assertEquals(0, deck.getDeckOfCardsCount());
    }

    @Test
    public void canAddCard(){
        deck.addCardToDeck(card);
        assertEquals(1, deck.getDeckOfCardsCount());
    }

    @Test
    public void canGetArrayOfSuits(){
        assertEquals(4, deck.getSuitsArray());
    }

    @Test
    public void canPopulateDeckOfCards(){
        deck.createDeckOfCards();
        assertEquals(52, deck.getDeckOfCardsCount());
    }

    @Test
    public void canShuffleCards(){
        assertEquals(52,deck.createShuffledDeckOfCards().size());
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    @Before
    public void before(){
        game = new Game();
    }

    @Test
    public void canPlayTheGames(){
        assertEquals("Player 1 is The WINNER",game.playTheGame());
    }
}

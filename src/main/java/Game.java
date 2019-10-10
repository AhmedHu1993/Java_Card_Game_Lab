public class Game {

    private Deck deck;
    private Player player1;
    private Player player2;

    public Game(){
        this.deck = new Deck();
        this.player1 = new Player();
        this.player2 = new Player();
    }

    public String compareCards(){
        int player1CardValue = this.player1.firstCardValueinHand();
        int player2CardValue = this.player2.firstCardValueinHand();
        String winnerMsg = "";
        if(player1CardValue > player2CardValue){
            winnerMsg = "Player 1 is The WINNER";
        } else if (player2CardValue > player1CardValue){
            winnerMsg = "Player 2 is The WINNER";
        }else {
            winnerMsg = "It is a Draw";
        }
        return winnerMsg;
    }

    public String playTheGame(){
        this.deck.createShuffledDeckOfCards();
        this.deck.drawCadFromDeckToPlayer(player1);
        this.deck.drawCadFromDeckToPlayer(player2);
        return this.compareCards();
    }


}

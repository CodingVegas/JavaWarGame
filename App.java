package WarGame;

import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) {
    
    List<Player> players = new ArrayList<Player>();
    for(int a = 1;a < 3; a++) {
      Player player = new Player("Player "+ a);
      players.add(player);
    }
    
    
    Deck myDeck = new Deck();
    myDeck.shuffle();
    
    Integer currentPlayer = 0;
    for(int b = 0; b < 52; b++) {
      players.get(currentPlayer).draw(myDeck);
      if(currentPlayer == 0) {
        currentPlayer++;
      } else {
        currentPlayer--;
      }
    }
    
    for(Player p : players) {
      p.describe();
      System.out.println("--------------------");
    }
    
    Card player1Card;
    Card player2Card;
    for(int c = 0; c < 26; c++) {
      player1Card=players.get(0).flip();
      player2Card=players.get(1).flip();
      if(player1Card.value > player2Card.value) {
        players.get(0).incrementScore();
      } else if (player2Card.value > player1Card.value) {
        players.get(1).incrementScore();
      }
    }
    
    //System.out.println(players.get(0).name + " score is: "+players.get(0).score);
    //System.out.println(players.get(1).name + " score is: "+players.get(1).score);
    
    for(Player p : players) {
      p.describe();
      System.out.println("--------------------");
    }
    
    if (players.get(0).score > players.get(1).score) {
      System.out.println(players.get(0).name +" wins!");
    } else if (players.get(0).score < players.get(1).score) {
       System.out.println(players.get(1).name +" wins!");
    } else  {
      System.out.println("It's a tie!");
    }
  }

}

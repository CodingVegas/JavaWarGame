package WarGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
  String name;
  Integer score = 0;
  List<Card> hand = new ArrayList<Card>();
  
  public Player(String name) {
    this.name = name;
  }
  
  public void incrementScore() {
    score++;
  }
  
  public void draw(Deck d) {
    hand.add(d.draw());
  }
  
  public Card flip() {
    return hand.remove(0);
  }
  
  public void describe() {
    System.out.println(name + " Score is "+score);
    for (Card c : hand) {
      c.describe();
    }
  }
}
/*
i.  Fields
1.          hand (List of Card)
2.          score (set to 0 in the constructor)
3.          name
ii. Methods
1.          describe (prints out information about the player and calls the describe method for each card in the Hand List)
2.          flip (removes and returns the top card of the Hand)
3.          draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
4.          incrementScore (adds 1 to the Player’s score field)
*/
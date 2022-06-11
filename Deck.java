package WarGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  
  List<Card> cards = new ArrayList<Card>();
  
  public Deck () {
  
  List<Integer> value = new ArrayList<Integer>();
  for (int i = 2; i <= 14; i++) {
    value.add(i);
  }
  
  List<String> rank = new ArrayList<String>();
    String[] rankList = {"2", "3" , "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    for (String r : rankList) {
      rank.add(r);
    }
      
    List<String> suit = new ArrayList<String>();
    suit.add("Hearts");
    suit.add("Spades");
    suit.add("Diamonds");
    suit.add("Clubs");
    
    for (String s : suit) {
      for (Integer v : value) {
        Card card = new Card();
          card.setValue(v);
          card.setSuit(s);
          card.setRank(rank.get(value.indexOf(v)));
          cards.add(card);
      }
    }
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }
  
  public Card draw() {
    return cards.remove(0);
  }
  
  public Card peek() {
    return cards.get(0);
  }
} //END Class

/*
i.  Fields
    1.  cards (List of Card)
ii. Methods
    1.  shuffle (randomizes the order of the cards)
    2.  draw (removes and returns the top card of the Cards field)
3.  In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
*/

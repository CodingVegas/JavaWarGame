package WarGame;

public class Card {
  
// has getters and setters methods and a describe
 
  Integer value;
  String rank;
  String suit;
  
  public void setValue(Integer v) {
    this.value = v;
  }

  public void setRank(String r) {
    this.rank = r;
  }

  public void setSuit(String s) {
    this.suit = s;
  }

  public Integer getValue() {
    return this.value;
  }

  public String getRank() {
    return this.rank;
  }
  public String getSuit() {
    return this.suit;
  }

  public void describe() {
    System.out.println("This card is the "+this.rank+" of "+this.suit+" and it has a value of "+this.value+".");
  }
}  
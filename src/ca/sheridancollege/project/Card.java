package ca.sheridancollege.project;
public class Card{

    /**
     * In this Class you can extend 
     * the different values for both suits and values
     * thus allowing you to add or remove as much as you wish
     */
    
    
    public enum Suit {
        RED, BLUE, YELLOW, GREEN
    };
    
    public enum Value {ZERO, ONE, TWO, THREE, FOUR, 
    FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAW_TWO, DRAW_FOUR, WILDCARD 
    };
    
    private Value value;
    private Suit suit;
    

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    /**
     * 
     * @return value
     */
    
    public Value getValue() {
        return this.value;
    }
    
    public void setValue(Value value) {
        this.value = value;
    }
    /**
     * 
     * @return suit
     */
    
    public Suit getSuit() {
        return this.suit;
    }
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

}
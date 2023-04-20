package ca.sheridancollege.project;
import java.util.Random;

/**     This class Generates a hand for the card game
 *
 * @author Ebbe Raiber
 */
public class CardHandGenerator{
   
    public static Card[] generateHand(int numCards) {
        
        Card[] hand = new Card[numCards];
        Random random = new Random();
        
        for(int i =0 ; i <hand.length;i++){
           int numValues = Card.Value.values().length;
               Card.Value value = Card.Value.values() [random.nextInt(numValues)];
               
            int numSuits = Card.Suit.values().length;
            Card.Suit suit = Card.Suit.values() [random.nextInt(numSuits)];
            
            Card card = new Card(value, suit);
            hand[i] = card;
        }
        return hand;
    }

}

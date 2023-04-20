package ca.sheridancollege.project;
import java.util.*;

/** This class *** Insert Description here ***
 *
 * @author Ebbe Raiber
 */
public class CardGame {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Card[] hand = CardHandGenerator.generateHand(7);
                
        System.out.print("here are the cards in the hand");
        for(Card card:hand){
            System.out.println(card.getValue() +"   "+card.getSuit());
        }
        
        //Now ask user for a card
        System.out.print("Pick a suit for your guess card");
        for(int i =0 ; i <Card.Suit.values().length;i++){
            System.out.println(Card.Suit.values()[i]);            
        }
        int suitPos = input.nextInt();
        System.out.print("Pick a value for your guess card");
        int valuePos= input.nextInt();
        
        Card userGuess = new Card(Card.Value.values()[valuePos], 
            Card.Suit.values()[suitPos]);
        
        //now check for a match
        boolean match = false;
        for(Card card:hand){
            if(card.getValue() == userGuess.getValue()
                && card.getSuit().equals(userGuess.getSuit())){
             match =true;
             break;
            }//end of if                        
        }//end of for
        if(match)
            System.out.println("your guess is right");
        
    }
    
}


    /**
     * @param args the command line arguments
     */
    


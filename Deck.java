import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();

    public Deck(){
        for(Shape shape : Shape.values()){
            for(Shading shading : Shading.values()){
                for(Number number : Number.values()){
                    for(Colour colour : Colour.values()){
                        deck.add(new Card(shading, shape, number, colour));
                    }
                }
            }
        }
    }

    public ArrayList<Card> getDeck(){
        return deck;
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public void printDeck(){
        deck.forEach(n -> {
            System.out.println(n.getShading()+" "+n.getShape()+" "+n.getColour()+" "+n.getNumber());
        });
    }
}

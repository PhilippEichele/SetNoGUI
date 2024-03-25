public class Set {
    public static void main(String[] args){
        Deck deck = new Deck();
        deck.printDeck();

        System.out.println();

        deck.shuffle();
        deck.printDeck();
    }
}
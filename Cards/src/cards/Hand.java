package cards;
import java.util.*;

public class Hand {
	private ArrayList<Card> inHand;
	
	public Hand()
	{
		inHand = new ArrayList<Card>();
	}
	
	public ArrayList<Card> drawNewCard(Deck currentDeck)
	{
		Card c;
		c = currentDeck.drawFromDeck();
		inHand.add(c);
		return inHand;
	}
	
	public ArrayList<Card> remove(Card crd) throws NoSuchElementException
	{
	     inHand.remove(crd);
	     return inHand;
	}
	
	public Iterator<Card> iterator()
	{
		return inHand.iterator();
	}
	
	public String toString()
	{
	    String result="";
	    Card cardstr;
	    int i = 0;
	    Iterator<Card> scan = inHand.iterator();
	    while (scan.hasNext())
	    {
	       cardstr = scan.next();
	       result += "Card " + i + ": " + cardstr.toString() + "\n";
	       i++;
	    }

	    return result;
	}
	public int getBlackjackValue(Hand currentHand)
	{
	    Card cardScan;
	    BlackJack eq;
	    int result = 0;
		Iterator<Card> scan = currentHand.iterator();
	    while (scan.hasNext())
	    {
	       cardScan = scan.next();
	       eq = new BlackJack(cardScan);
	       result += eq.getValue(eq);
	    }
	    return result;
	}
}

package cards;

public class Main {
	
public static void main(String[] args)
{
	/*//testing deck and card
	Deck deck = new Deck();
	Card C;
	System.out.println(deck.getTotalCards());
	while (deck.getTotalCards()!=0)
	{
		C = deck.drawFromDeck();
		System.out.println(C.toString());
	}*/
	//testing hand
	Deck deck = new Deck();
	Hand H = new Hand();
	System.out.println(deck.getTotalCards());
	if (deck.getTotalCards()>2)
	{
		H.drawNewCard(deck);
		H.drawNewCard(deck);
		System.out.println(H.toString());
	}
	System.out.println(H.getBlackjackValue(H));
}
}

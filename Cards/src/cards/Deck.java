package cards;

import java.util.Random;
import java.util.ArrayList;
public class Deck {
	private ArrayList<Card> cards;
	
	Deck()
	{
		cards = new ArrayList<Card>();
		int index1, index2;
		Random generator = new Random();
		Card temp;
		for (int i = 0; i <= 3; i++)
		{
			for (int j = 0; j <= 12; j++)
			{
				cards.add(new Card(i,j));
			}
		}
		for (int a = 0; a < 100; a++)
		{
			index1 = generator.nextInt(cards.size()-1);
			index2 = generator.nextInt(cards.size()-1);
			temp = (Card) cards.get(index2);
			cards.set(index2, cards.get(index1));
			cards.set(index1, temp);
		}
	}
public Card drawFromDeck()
{
	return cards.remove(0);
}
public int getTotalCards()
{
	return cards.size();
}
}

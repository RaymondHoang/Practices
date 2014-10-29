package cards;

public class BlackJack extends Card
{
	private int value;
	
	private static int[] values = {1,2,3,4,5,6,7,8,9,10,11};
	
	public BlackJack(Card card) {
		super(card.suit, card.rank);
		switch (rank)
		{
			case 0:
				this.value = values[10];
				break;
			case 9:
			case 10:
			case 11:
			case 12:
				this.value = values[9];
				break;
			default:
				this.value = values[rank];
				break;
		}
	}
	
	public int getValue(BlackJack card)
	{
		return card.value;
	}

}

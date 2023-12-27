import java.util.*;

public class DeckOfCards {
	ArrayList<Card> cards = new ArrayList<Card>();
	
	public DeckofCards()
	{
		for (int i=0; i < 4; i++)
		{
			deck.add(new cardvalOne());
			deck.add(new cardvalTwo());
			deck.add(new cardvalFour());
			deck.add(new cardvalSeven());
			deck.add(new cardvalTen());
			deck.add(new cardvalEleven());
			deck.add(new cardSorry());
			
			cards.add(new SpecificCard(3, "Move one of your pawns 3 spaces forward"));
			cards.add(new SpecificCard(3, "Move one of your pawns 5 spaces forward"));
			cards.add(new SpecificCard(3, "Move one of your pawns 8 spaces forward"));
			cards.add(new SpecificCard(3, "Move one of your pawns 12 spaces forward"));
			
		}
		cards.add(new cardvalOne();
		System.out.println("Total cards "+cards.size());
	}
	
	//returns the card at the given index
	public Card get(int i)
	{
		return cards.get(i);
	}
	
	
	public int getsize()
	{
		return cards.size();
	}
	
	public void remove(int i)
	{
		cards.remove(i);
	}
}

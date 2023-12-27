import java.util.*;

public class Card {
	
	private int movespaces;
	private String desc;
	
	
	public void setMovespaces(int m)
	{
		movespaces = m;
	}
	
	public int getMovespaces()
	{
		return movespaces;
	}
	
	
	public void setdesc(String s)
	{
		desc = s;
	}
	
	public String getdesc()
	{
		return desc;
	}
	
	
	public void Move(Pawn p, Board b)
	{
		b.advance(p, movespaces);
		b.pickagain(false);
	}
	
	
	public String toString()
	{
		return (this.getClass()+" with movespaces = "+movespaces);
	}
	
	

}

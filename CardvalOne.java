import java.util.*;

public class CardvalOne extends Card implements SpecCard {
	
public void specFn(Pawn p, Board b)
{
	if (b.getGrid()[p.getX()][p.getY()] instanceof StartPos)  
	{
		if  (p.getCol() == Board.getYellowPawn()   )
		{
			p.moveTo(4,0);
		}
		
		if  (p.getCol() == Board.getGreenPawn()   )
		{
			p.moveTo(15,4);
		}
		
		if  (p.getCol() == Board.getRedPawn()   )
		{
			p.moveTo(11,15);
		}
		
		if  (p.getCol() == Board.getBluePawn()   )
		{
			p.moveTo(0,11);
		}
		b.pickagain(false);
	}
	else
	{
		b.advance(p,getmovespaces());
		b.pickagain(false);
	}
}


public void move(Pawn p, Board b)
{
	specFn(p,b);
}

public OneCard()
{
	setdesc("Move a pawn from Start or \n move a pawn 1 space forward");
	setmovespaces(1);
}





}

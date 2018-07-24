//Sukhmai Kapur Pd 3
//This does stuff I cant do in the other 3
import java.util.ArrayList;

public class checkCheck
{

	public checkCheck()
	{

	}

	public boolean isCheck(int toRow, int toCol, ArrayList<Piece> all, chessBoard board)
	{
		if(board.getPiece(toRow, toCol).getColor().equals("Black"))
		{
		for(int i =0; i<all.size()/2;i++)
		{
			Move toMove = new Move(all.get(i), board, toRow, toCol);
			if(toMove.checkMove())
			{
				return true;
			}
		}
		}
		else
		{
		for(int i = all.size()/2; i<all.size();i++)
		{
			Move toMove = new Move(all.get(i), board, toRow, toCol);
			if(toMove.checkMove())
			{
				return true;
			}
		}
		}
		return false;
	}//end of isPostCheck

}


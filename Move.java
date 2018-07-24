//Sukhmai Kapur Pd 3
//This program figures out and makes valid moves
import java.util.Scanner;

public class Move
{
	private Piece piece;
	private chessBoard board;
	private int toRow;
	private int toCol;
	public Move(Piece piece, chessBoard board, int toRow, int toCol)
	{
	this.piece=piece;
	this.board=board;
	this.toRow=toRow;
	this.toCol=toCol;
	}

	public Piece getPiece()
	{
		return piece;
	}

	public boolean checkMove()
	{
	int row = piece.getRow();
	int col = piece.getColumn();
	if(piece.getType().equals("WRook")||piece.getType().equals("BRook"))
	{
		if(!(toRow==row||toCol==col))
		{

			return false;
		}
		if(toRow==row)
		{
			if(toCol>col)
			{
				for(int i = col+1; i<toCol; i++)
				{
					if(board.contains(row,i))
					{
						return false;
					}
				}
				return true;
			}
			if(toCol<col)
			{
				for(int i = col-1; i>toCol; i--)
				{
					if(board.contains(row,i))
					{
						return false;
					}
				}
				return true;
			}
			return false;
		}

		if(toCol==col)
		{
			if(toRow>row)
			{
				for(int i = row+1; i<toRow; i++)
				{
					if(board.contains(i,col))
					{
						return false;
					}
				}
				return true;
			}
			if(toRow<row)
			{
				for(int i = row-1; i>toRow; i--)
				{
					if(board.contains(i,col))
					{
						return false;
					}
				}
				return true;
			}
			return false;
		}
	}
	if(piece.getType().equals("WKnig")||piece.getType().equals("BKnig"))
	{
		if(toRow==row+1&&toCol==col+2)
		{
			return true;
		}
		if(toRow==row+1&&toCol==col-2)
		{
			return true;
		}
		if(toRow==row+2&&toCol==col+1)
		{
			return true;
		}
		if(toRow==row+2&&toCol==col-1)
		{
			return true;
		}
		if(toRow==row-1&&toCol==col+2)
		{
			return true;
		}
		if(toRow==row-1&&toCol==col-2)
		{
			return true;
		}
		if(toRow==row-2&&toCol==col+1)
		{
			return true;
		}
		if(toRow==row-2&&toCol==col-1)
		{
			return true;
		}
		return false;
	}
	if(piece.getType().equals("WBish")||piece.getType().equals("BBish"))
	{
		int reCheck=0;
		if(toRow>row&&toCol>col)
		{
			for(int i=1; i<=toRow-row;i++)
			{
				if(row+i==toRow&&col+i==toCol)
				{
					reCheck=1;
				}
			}
			if(reCheck==0)
			{
				return false;
			}
			for(int i =1;i<=toRow-row-1;i++)
			{
				if(board.contains(row+i,col+i))
				{
					return false;
				}
			}
			return true;
		}
		if(toRow>row&&toCol<col)
		{
			for(int i=1; i<=toRow-row;i++)
			{
				if(row+i==toRow&&col-i==toCol)
				{
					reCheck=1;
				}
			}
			if(reCheck==0)
			{
				return false;
			}
			for(int i=1; i<=toRow-row-1;i++)
			{
				if(board.contains(row+i,col-i))
				{
					return false;
				}
			}
			return true;
		}
		if(toRow<row&&toCol>col)
		{
			for(int i=1; i<=row-toRow;i++)
			{
				if(row-i==toRow&&col+i==toCol)
				{
					reCheck=1;
				}
			}
			if(reCheck==0)
			{
				return false;
			}
			for(int i=1; i<=row-toRow-1;i++)
			{
				if(board.contains(row-i,col+i))
				{
					return false;
				}
			}
			return true;
		}
		if(toRow<row&&toCol<col)
		{
			for(int i=1; i<=row-toRow;i++)
			{
				if(row-i==toRow&&col-i==toCol)
				{
					reCheck=1;
				}
			}
			if(reCheck==0)
			{
				return false;
			}
			for(int i=1; i<=row-toRow-1;i++)
			{
				if(board.contains(row-i,col-i))
				{
					return false;
				}
			}
			return true;
		}
	}

	if(piece.getType().equals("WQuee")||piece.getType().equals("BQuee"))
	{
		if(toRow==row)
		{
			if(toCol>col)
			{
				for(int i = col+1; i<toCol; i++)
				{
					if(board.contains(row,i))
					{
						return false;
					}
				}
				return true;
			}
			if(toCol<col)
			{
				for(int i = col-1; i>toCol; i--)
				{
					if(board.contains(row,i))
					{
						return false;
					}
				}
				return true;
			}
			return false;
		}

		if(toCol==col)
		{
		if(toRow>row)
			{
				for(int i = row+1; i<toRow; i++)
				{
					if(board.contains(i,col))
					{
						return false;
					}
				}
				return true;
			}
			if(toRow<row)
			{
				for(int i = row-1; i>toRow; i--)
				{
					if(board.contains(i,col))
					{
						return false;
					}
				}
				return true;
			}
			return false;
		}
		int reCheck=0;
				if(toRow>row&&toCol>col)
				{
					for(int i=1; i<=toRow-row;i++)
					{
						if(row+i==toRow&&col+i==toCol)
						{
							reCheck=1;
						}
					}
					if(reCheck==0)
					{
						return false;
					}
					for(int i =1;i<=toRow-row-1;i++)
					{
						if(board.contains(row+i,col+i))
						{
							return false;
						}
					}
					return true;
				}
				if(toRow>row&&toCol<col)
				{
					for(int i=1; i<=toRow-row;i++)
					{
						if(row+i==toRow&&col-i==toCol)
						{
							reCheck=1;
						}
					}
					if(reCheck==0)
					{
						System.out.println("1");
						return false;
					}
					for(int i=1; i<=(toRow-row)-1;i++)
					{
						if(board.contains(row+i,col-i))
						{
							return false;
						}
					}
					return true;
				}
				if(toRow<row&&toCol>col)
				{
					for(int i=1; i<=row-toRow;i++)
					{
						if(row-i==toRow&&col+i==toCol)
						{
							reCheck=1;
						}
					}
					if(reCheck==0)
					{
						return false;
					}
					for(int i=1; i<=row-toRow-1;i++)
					{
						if(board.contains(row-i,col+i))
						{
							return false;
						}
					}
					return true;
				}
				if(toRow<row&&toCol<col)
				{
					for(int i=1; i<=row-toRow;i++)
					{
						if(row-i==toRow&&col-i==toCol)
						{
							reCheck=1;
						}
					}
					if(reCheck==0)
					{
						return false;
					}
					for(int i=1; i<=row-toRow-1;i++)
					{
						if(board.contains(row-i,col-i))
						{
							return false;
						}
					}
					return true;
		}

	}

	if(piece.getType().equals("WKing")||piece.getType().equals("BKing"))
	{
		if(toRow==row+1)
		{
			if(toCol==col+1||toCol==col-1||toCol==col)
			{
				return true;
			}
			return false;
		}
		if(toRow==row-1)
		{
			if(toCol==col+1||toCol==col-1||toCol==col)
			{
				return true;
			}
			return false;
		}
		if(toRow==row)
		{
			if(toCol==col-1||toCol==col+1)
			{
				return true;
			}
		}
		if(piece.getMoveCount()==0)
		{
			if(board.isRook(row,0))
			{
				if((toRow==row)&&(toCol==col-2)&&board.contains(row,col-1)==false&&board.contains(row,col-2)==false&&board.contains(row,col-3)==false)
				{
					piece.changeCastleSide("Left");
					return true;
				}
			}
			if(board.isRook(row,7))
			{
				if(toRow==row&&(toCol==col+2)&&board.contains(row,col+1)==false&&board.contains(row,col+2)==false)
				{
					piece.changeCastleSide("Right");
					return true;
				}
			}
		}
	}
	if(piece.getType().equals("WPawn")&&piece.getColor().equals("White"))
	{
		if(piece.getMoveCount()==0)
		{
			if(toCol==col&&((toRow==row+2&&board.contains(row+2,col)==false)||(toRow==row+1&&board.contains(row+1,col)==false)))
			{
				return true;
			}
		}
		if(toCol==col&&toRow==row+1&&board.contains(row+1,col)==false)
		{
			return true;
		}
		if(toRow==row+1&&toCol==col+1)
		{
			if(board.contains(toRow,toCol))
			{
				return true;
			}
			if((row==4)&&(board.isPawn(row,col+1)))
			{
				piece.changeEnPassant("Right");
				return true;
			}
			return false;
		}
		if(toRow==row+1&&toCol==col-1)
		{
			if(board.contains(toRow,toCol))
			{
				return true;
			}
			if((row==4)&&(board.isPawn(row,col-1)))
			{
				piece.changeEnPassant("Left");
				return true;
			}
			return false;
		}
	}
	if(piece.getType().equals("BPawn")&&piece.getColor().equals("Black"))
	{
		if(piece.getMoveCount()==0)
		{
			if(toCol==col&&((toRow==row-2&&board.contains(row-2,col)==false)||(toRow==row-1&board.contains(row-1,col)==false)))
			{
				return true;
			}
		}
		if(toCol==col&&toRow==row-1&&board.contains(row-1,col)==false)
		{
			return true;
		}
		if(toRow==row-1&&toCol==col+1)
		{
			if(board.contains(toRow,toCol))
			{
				return true;
			}
			if((row==3)&&(board.isPawn(row,col+1)))
			{
				piece.changeEnPassant("Right");
				return true;
			}
			return false;
		}
		if(toRow==row-1&&toCol==col-1)
		{
			if(board.contains(toRow,toCol))
			{
				return true;
			}
			if((row==3)&&(board.isPawn(row,col-1)))
			{
				piece.changeEnPassant("Left");
				return true;
			}
			return false;
		}
	}
	return false;
	}//end of checkMove, thank god

	//makes the move
	public void makeMove()
	{
		int r=piece.getRow();
		int c=piece.getColumn();
		//checks for EnPassant
		if(piece.getEnPassant().equals("Right"))
		{
		board.setPiece(toRow,toCol, piece);
		board.remove(r,c+1);
		board.remove(r,c);
		}
		else if(piece.getEnPassant().equals("Left"))
		{
		board.setPiece(toRow,toCol, piece);
		board.remove(r,c-1);
		board.remove(r,c);
		}
		//checks for castle
		else if(piece.getCastleSide().equals("Right"))
		{
			board.setPiece(toRow,toCol, piece);
			board.setPiece(toRow,toCol-1, board.getPiece(r,c+3));
			board.remove(r,c);
			board.remove(r,c+3);
		}
		else if(piece.getCastleSide().equals("Left"))
		{
			board.setPiece(toRow,toCol, piece);
			board.setPiece(toRow,toCol+1, board.getPiece(r,c-4));
			board.remove(r,c);
			board.remove(r,c-4);
		}
		//move for all other situations
		else
		{
			if(board.contains(toRow,toCol))
			{
				board.remove(toRow,toCol);
			}
			board.setPiece(toRow,toCol, piece);
			board.remove(r,c);
		}

	}//end of makeMove

	public void pawnPromotion(Scanner keyboard)
	{
		if((piece.getType().equals("WPawn")||piece.getType().equals("BPawn"))&&(piece.getRow()==7||piece.getRow()==0))
		{
			boolean proper = false;
			String newType="";
			System.out.println("Your pawn has reached the end of the board. \nWould you like to promote it to a Knight, Bishop, Rook, or Queen?");
			while(proper==false)
			{
				newType = keyboard.next();
				if(newType.equals("Queen")||newType.equals("Bishop")||newType.equals("Rook")||newType.equals("Knight"))
				{
					proper = true;
				}
				else
				{
					System.out.println("Please enter a valid piece.(Queen,Rook,Bishop,Knight)");
				}
			}
			if(piece.getType().equals("WPawn"))
			{
				if(newType.equals("Queen"))
				{
					piece.changeType("WQuee");
				}
				if(newType.equals("Bishop"))
				{
					piece.changeType("WBish");
				}
				if(newType.equals("Rook"))
				{
					piece.changeType("WRook");
				}
				if(newType.equals("Knight"))
				{
					piece.changeType("WKnig");
				}
			}
			else
			{
				if(newType.equals("Queen"))
				{
					piece.changeType("BQuee");
				}
				if(newType.equals("Bishop"))
				{
					piece.changeType("BBish");
				}
				if(newType.equals("Rook"))
				{
					piece.changeType("BRook");
				}
				if(newType.equals("Knight"))
				{
					piece.changeType("BKnig");
				}
			}
		}
	}//end of pawnPromotion

}
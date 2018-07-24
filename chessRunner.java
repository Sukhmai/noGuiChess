//Sukhmai Kapur Pd 3
//This runs the chessGame
import java.util.Scanner;
import java.util.ArrayList;
public class chessRunner
{
	public static void main(String [] Args)
	{
	Scanner keyboard = new Scanner(System.in);
	chessBoard game = new chessBoard();
	game.newGame();
	game.printBoard();
	ArrayList<Piece> all = game.getList();
	checkCheck check = new checkCheck();
	int gameOver=0;
	String isWhite ="W";
	while(gameOver==0)
	{
		System.out.println();
		if(isWhite.equals("W"))
		{
			System.out.println("White's Turn");
		}
		else
		{
			System.out.println("Black's Turn");
		}
		System.out.println();
			//grabs piece
			boolean check1 = false;
			Move realMove= new Move(game.getPiece(0,0), game, 0, 0);
			while(check1==false)
			{
				System.out.println("Please enter the row and column of the piece you are moving.");
				int row = 0;
				int col = 0;
				int toRow = 0;
				int toCol = 0;
				boolean proper=false;
				while(proper==false)
				{
					System.out.print("Row: ");
					row = keyboard.nextInt()-1;
					System.out.println();
					if(row>=0&&row<=7)
					{
						proper=true;
					}
					else
					{
						System.out.println("The row must be between 1 and 8. (inclusive)");
					}
				}
				proper=false;
				while(proper==false)
				{
					System.out.print("Column: ");
					col = keyboard.nextInt()-1;
					System.out.println();
					if(col>=0&&col<=7)
					{
						proper=true;
					}
					else
					{
						System.out.println("The column must be between 1 and 8. (inclusive)");
					}
				}
				//grabs location to go to
				System.out.println("Now enter the row and column of where you want to move the piece.");
				proper=false;
				while(proper==false)
				{
					System.out.print("Row: ");
					toRow = keyboard.nextInt()-1;
					System.out.println();
					if(toRow>=0&&toRow<=7)
					{
						proper=true;
					}
					else
					{
						System.out.println("The row must be between 1 and 8. (inclusive)");
					}
				}
				proper=false;
				while(proper==false)
				{
					System.out.print("Column: ");
					toCol = keyboard.nextInt()-1;
					System.out.println();
					if(toCol>=0&&toCol<=7)
					{
						proper=true;
					}
					else
					{
						System.out.println("The column must be between 1 and 8. (inclusive)");
					}
				}

				//Making/Testing the move
				boolean finishMove = true;
					Move testMove= new Move(game.getPiece(row,col), game, toRow, toCol);
					if(testMove.checkMove()==false
					||game.getPiece(row,col).getType().substring(0,1).equals(isWhite)==false)
						{
						System.out.println("Invalid move. Please try again.");
						finishMove=false;
						}
					else if(game.getPiece(row,col).getType().equals("WKing")||game.getPiece(row,col).getType().equals("BKing"))
						{
							if(check.isCheck(toRow,toCol,game.getList(), game))
							{
								System.out.println("You cannot move your King into check.");
							}
							finishMove=false;
						}
					else if(isWhite.equals("W")&&check.isCheck(all.get(4).getRow(),all.get(4).getColumn(),game.getList(), game)
					||isWhite.equals("B")&&check.isCheck(all.get(20).getRow(),all.get(20).getColumn(),game.getList(), game))
					{
						Move legalMove= testMove;
						Piece temp = game.getPiece(row,col);
						legalMove.makeMove();
						if(isWhite.equals("W")&&check.isCheck(all.get(4).getRow(),all.get(4).getColumn(),game.getList(), game)
						||isWhite.equals("B")&&check.isCheck(all.get(20).getRow(),all.get(20).getColumn(),game.getList(), game))
						{
							System.out.println("You cannot leave your King in check.");
							finishMove=false;
						}
						legalMove= new Move(temp , game, row, col);
						legalMove.makeMove();
					}
					if(finishMove==true)
					{
						realMove=testMove;
						check1=true;
					}

			}//end of inner while
			realMove.makeMove();
			realMove.getPiece().increaseMoveCount();
			System.out.println();
			realMove.pawnPromotion(keyboard);
			game.printBoard();
			if(isWhite.equals("W")&&check.isCheck(all.get(20).getRow(),all.get(20).getColumn(),game.getList(), game))
			{
				checkCheckMate tired = new checkCheckMate();
				if(tired.isCheckMate(all, game, "B")==true)
				{
					gameOver=1;
				}
			}
			if(isWhite.equals("B")&&check.isCheck(all.get(4).getRow(),all.get(4).getColumn(),game.getList(), game))
			{
				checkCheckMate tired = new checkCheckMate();
				if(tired.isCheckMate(all, game, "W")==true)
				{
					gameOver=2;
				}
			}

			if(isWhite.equals("W"))
			{
				isWhite="B";
			}
			else
			{
				isWhite="W";
			}
	}//end of outer while
	if(gameOver==1)
	{
		System.out.println("Congratulations. White has won.");
	}
	if(gameOver==2)
	{
		System.out.println("Congratulations. Black has won.");
	}
	}//end of main
}//end of class
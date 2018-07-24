//Sukhmai Kapur Pd 3
//This program is a chessBoard and creates access to the chessboard

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class chessBoard
{
	private Piece [][] board;
	private Piece blank;
	private ArrayList<Piece> all;
	public chessBoard()
	{
		board = new Piece[8][8];
		blank = new Piece("     ","none",0,0,0,0,"none","none");
		all = new ArrayList<Piece>();
	}
	public boolean contains(int row, int col)
	{
		if((board[row][col]).getType().equals("     "))
		{
			return false;
		}
		return true;
	}
	public boolean isPawn(int r, int c)
	{
		if(board[r][c].getType().equals("WPawn")||board[r][c].getType().equals("BPawn"))
		{
			return true;
		}
		return false;
	}
	public boolean isRook(int r, int c)
	{
		if((board[r][c]).getType().equals("WRook")&&(board[r][c]).getMoveCount()==0
		||(board[r][c]).getType().equals("BRook")&&(board[r][c]).getMoveCount()==0)
		{
			return true;
		}
		return false;
	}
	public void remove(int row, int col)
	{
		board[row][col]=blank;
		blank.setRow(row);
		blank.setColumn(col);
	}
	public void setPiece(int r, int c, Piece piece)
	{
		board[r][c]=piece;
		piece.setRow(r);
		piece.setColumn(c);
	}
	public Piece getPiece(int r, int c)
	{
		return board[r][c];
	}
	public void newGame()
	{
	//White
	Piece whiteRook1 = new Piece("WRook","White",5,0,0,0,"none","none");
	all.add(whiteRook1);
	Piece whiteKnight1 = new Piece("WKnig","White",3,0,1,0,"none","none");
	all.add(whiteKnight1);
	Piece whiteBishop1 = new Piece("WBish","White",3,0,2,0,"none","none");
	all.add(whiteBishop1);
	Piece whiteQueen1 = new Piece("WQuee","White",9,0,3,0,"none","none");
	all.add(whiteQueen1);
	Piece whiteKing1 = new Piece("WKing","White",100000,0,4,0,"none","none");
	all.add(whiteKing1);
	Piece whiteBishop2 = new Piece("WBish","White",3,0,5,0,"none","none");
	all.add(whiteBishop2);
	Piece whiteKnight2 = new Piece("WKnig","White",3,0,6,0,"none","none");
	all.add(whiteKnight2);
	Piece whiteRook2 = new Piece("WRook","White",5,0,7,0,"none","none");
	all.add(whiteRook2);
	Piece whitePawn1=new Piece("WPawn","White",1,1,0,0,"none","none");
	all.add(whitePawn1);
	Piece whitePawn2=new Piece("WPawn","White",1,1,1,0,"none","none");
	all.add(whitePawn2);
	Piece whitePawn3=new Piece("WPawn","White",1,1,2,0,"none","none");
	all.add(whitePawn3);
	Piece whitePawn4=new Piece("WPawn","White",1,1,3,0,"none","none");
	all.add(whitePawn4);
	Piece whitePawn5=new Piece("WPawn","White",1,1,4,0,"none","none");
	all.add(whitePawn5);
	Piece whitePawn6=new Piece("WPawn","White",1,1,5,0,"none","none");
	all.add(whitePawn6);
	Piece whitePawn7=new Piece("WPawn","White",1,1,6,0,"none","none");
	all.add(whitePawn7);
	Piece whitePawn8=new Piece("WPawn","White",1,1,7,0,"none","none");
	all.add(whitePawn8);
	//Black
	Piece blackRook1 = (new Piece("BRook","Black",5,7,0,0,"none","none"));
	all.add(blackRook1);
	Piece blackKnight1 = (new Piece("BKnig","Black",3,7,1,0,"none","none"));
	all.add(blackKnight1);
	Piece blackBishop1 =(new Piece("BBish","Black",3,7,2,0,"none","none"));
	all.add(blackBishop1);
	Piece blackQueen1 = (new Piece("BQuee","Black",9,7,3,0,"none","none"));
	all.add(blackQueen1);
	Piece blackKing1 = (new Piece("BKing","Black",100000,7,4,0,"none","none"));
	all.add(blackKing1);
	Piece blackBishop2 =(new Piece("BBish","Black",3,7,5,0,"none","none"));
	all.add(blackBishop2);
	Piece blackKnight2 = (new Piece("BKnig","Black",3,7,6,0,"none","none"));
	all.add(blackKnight2);
	Piece blackRook2 = (new Piece("BRook","Black",5,7,7,0,"none","none"));
	all.add(blackRook2);
	Piece blackPawn1 = (new Piece("BPawn","Black",1,6,0,0,"none","none"));
	all.add(blackPawn1);
	Piece blackPawn2 = (new Piece("BPawn","Black",1,6,1,0,"none","none"));
	all.add(blackPawn2);
	Piece blackPawn3 = (new Piece("BPawn","Black",1,6,2,0,"none","none"));
	all.add(blackPawn3);
	Piece blackPawn4 = (new Piece("BPawn","Black",1,6,3,0,"none","none"));
	all.add(blackPawn4);
	Piece blackPawn5 = (new Piece("BPawn","Black",1,6,4,0,"none","none"));
	all.add(blackPawn5);
	Piece blackPawn6 = (new Piece("BPawn","Black",1,6,5,0,"none","none"));
	all.add(blackPawn6);
	Piece blackPawn7 = (new Piece("BPawn","Black",1,6,6,0,"none","none"));
	all.add(blackPawn7);
	Piece blackPawn8 = (new Piece("BPawn","Black",1,6,7,0,"none","none"));
	all.add(blackPawn8);

	for(int i=0; i<all.size(); i++)
	{
		board[all.get(i).getRow()][all.get(i).getColumn()]=all.get(i);
	}
	for(int i=2; i<=5; i++)
	{
		for(int j=0; j<8; j++)
		{
			board[i][j]=blank;
		}
	}

	}//end of newGame

	public ArrayList<Piece> getList()
	{
		return all;
	}

	public void printBoard()
	{
		System.out.println("    1       2       3       4       5       6       7       8");
		System.out.println("_________________________________________________________________");//
		for(int i=0; i<8; i++)
		{
			System.out.println("|       |       |       |       |       |       |       |       |");//
			for(int j=0; j<8; j++)
			{
			System.out.print("| ");//
			System.out.print((board[i][j].getType()));
			System.out.print(" ");
			}
			System.out.println("| " +(i+1));//
			System.out.println("|       |       |       |       |       |       |       |       |");//
			System.out.println("_________________________________________________________________");//
		}

	}
}


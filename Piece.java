//Sukhmai Kapur Pd 3
//this program sets up all the functions of an individual chess piece
public class Piece
{
	private String type;
	private String color;
	private int value;
	private int row;
	private int column;
	private int moveCount;
	private String inEnPassant;
	private String castleSide;
	public Piece(String type, String color, int value, int row, int column, int moveCount, String inEnPassant, String castleSide)
	{
		this.type=type;
		this.color=color;
		this.value=value;
		this.row=row;
		this.column=column;
		this.moveCount=moveCount;
		this.inEnPassant=inEnPassant;
		this.castleSide=castleSide;
	}

	public String getType()
	{
	return type;
	}

	public int getRow()
	{
		return row;
	}
	public int getColumn()
	{
		return column;
	}
	public void setRow(int newRow)
	{
		row = newRow;
	}
	public void setColumn(int newColumn)
	{
		column = newColumn;
	}
	public int getMoveCount()
	{
		return moveCount;
	}
	public void increaseMoveCount()
	{
		moveCount= moveCount+1;
	}
	public void changeType(String newType)
	{
		type=newType;
	}
	public String getColor()
	{
		return color;
	}
	public void changeEnPassant(String truth)
	{
		inEnPassant=truth;
	}
	public String getEnPassant()
	{
		return inEnPassant;
	}
	public String getCastleSide()
	{
		return castleSide;
	}
	public void changeCastleSide(String side)
	{
		castleSide=side;
	}
}
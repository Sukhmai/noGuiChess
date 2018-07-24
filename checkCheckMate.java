//Sukhmai Kapur Pd 3
//This program checks Checkmate
import java.util.ArrayList;

public class checkCheckMate
{
	public checkCheckMate()
	{

	}

	public boolean isCheckMate(ArrayList<Piece>all, chessBoard board, String color)
	{
		checkCheck check = new checkCheck();
		if(color.equals("W"))
		{
		if(all.get(4).getRow()==7)
		{
			for(int i=-1; i<=0;i++)
			{
				for(int j=-1; j<=1; j++)
				{
					if(!(i==0&&j==0))
					{
							if(check.isCheck(all.get(4).getRow()+i, all.get(4).getColumn()+j, all, board)==false)
							{
								if(board.contains(all.get(4).getRow()+i,all.get(4).getColumn()+j))
								{
									if(board.getPiece(all.get(4).getRow()+i,all.get(4).getColumn()+j).getColor().equals("White"))
									{

									}
									else
									{
										return false;
									}
								}
								else
								{
									return false;
								}
							}
					}
				}
			}
		}
		else if(all.get(4).getRow()==0)
		{
		for(int i=0; i<=1;i++)
			{
				for(int j=-1; j<=1; j++)
				{
					if(!(i==0&&j==0))
					{
							if(check.isCheck(all.get(4).getRow()+i, all.get(4).getColumn()+j, all, board)==false)
							{
								if(board.contains(all.get(4).getRow()+i,all.get(4).getColumn()+j))
								{
									if(board.getPiece(all.get(4).getRow()+i,all.get(4).getColumn()+j).getColor().equals("White"))
									{

									}
									else
									{
										return false;
									}
								}
								else
								{
									return false;
								}
							}
					}
				}
			}
		}
		else if(all.get(4).getColumn()==7)
		{
		for(int i=-1; i<=1;i++)
			{
				for(int j=-1; j<=0; j++)
				{
					if(!(i==0&&j==0))
					{
							if(check.isCheck(all.get(4).getRow()+i, all.get(4).getColumn()+j, all, board)==false)
							{
								if(board.contains(all.get(4).getRow()+i,all.get(4).getColumn()+j))
								{
									if(board.getPiece(all.get(4).getRow()+i,all.get(4).getColumn()+j).getColor().equals("White"))
									{

									}
									else
									{
										return false;
									}
								}
								else
								{
									return false;
								}
							}
					}
				}
			}
		}
		else if(all.get(4).getColumn()==0)
		{
		for(int i=-1; i<=1;i++)
			{
				for(int j=0; j<=1; j++)
				{
					if(!(i==0&&j==0))
					{
							if(check.isCheck(all.get(4).getRow()+i, all.get(4).getColumn()+j, all, board)==false)
							{
								if(board.contains(all.get(4).getRow()+i,all.get(4).getColumn()+j))
								{
									if(board.getPiece(all.get(4).getRow()+i,all.get(4).getColumn()+j).getColor().equals("White"))
									{

									}
									else
									{
										return false;
									}
								}
								else
								{
									return false;
								}
							}
					}
				}
			}
		}
		else
		{
			for(int i=-1; i<=1;i++)
			{
				for(int j=-1; j<=1; j++)
				{
					if(!(i==0&&j==0))
					{
							if(check.isCheck(all.get(4).getRow()+i, all.get(4).getColumn()+j, all, board)==false)
							{
							if(board.contains(all.get(4).getRow()+i,all.get(4).getColumn()+j))
								{
									if(board.getPiece(all.get(4).getRow()+i,all.get(4).getColumn()+j).getColor().equals("White"))
									{

									}
									else
									{
										return false;
									}
								}
								else
								{
									return false;
								}
							}
					}
				}
			}
		}
	}
	if(color.equals("B"))
			{
			if(all.get(20).getRow()==7)
			{
				for(int i=-1; i<=0;i++)
				{
					for(int j=-1; j<=1; j++)
					{
						if(!(i==0&&j==0))
						{
								if(check.isCheck(all.get(20).getRow()+i, all.get(20).getColumn()+j, all, board)==false)
								{
									if(board.contains(all.get(20).getRow()+i,all.get(20).getColumn()+j))
									{
										if(board.getPiece(all.get(20).getRow()+i,all.get(20).getColumn()+j).getColor().equals("Black"))
										{

										}
										else
										{
											return false;
										}
									}
									else
									{
										return false;
									}
								}
						}
					}
				}
			}
			else if(all.get(20).getRow()==0)
			{
			for(int i=0; i<=1;i++)
				{
					for(int j=-1; j<=1; j++)
					{
						if(!(i==0&&j==0))
						{
								if(check.isCheck(all.get(20).getRow()+i, all.get(20).getColumn()+j, all, board)==false)
								{
									if(board.contains(all.get(20).getRow()+i,all.get(20).getColumn()+j))
									{
										if(board.getPiece(all.get(20).getRow()+i,all.get(20).getColumn()+j).getColor().equals("Black"))
										{

										}
										else
										{
											return false;
										}
									}
									else
									{
										return false;
									}
								}
						}
					}
				}
			}
			else if(all.get(20).getColumn()==7)
			{
			for(int i=-1; i<=1;i++)
				{
					for(int j=-1; j<=0; j++)
					{
						if(!(i==0&&j==0))
						{
								if(check.isCheck(all.get(20).getRow()+i, all.get(20).getColumn()+j, all, board)==false)
								{
									if(board.contains(all.get(20).getRow()+i,all.get(20).getColumn()+j))
									{
										if(board.getPiece(all.get(20).getRow()+i,all.get(20).getColumn()+j).getColor().equals("Black"))
										{

										}
										else
										{
											return false;
										}
									}
									else
									{
										return false;
									}
								}
						}
					}
				}
			}
			else if(all.get(20).getColumn()==0)
			{
			for(int i=-1; i<=1;i++)
				{
					for(int j=0; j<=1; j++)
					{
						if(!(i==0&&j==0))
						{
								if(check.isCheck(all.get(20).getRow()+i, all.get(20).getColumn()+j, all, board)==false)
								{
									if(board.contains(all.get(20).getRow()+i,all.get(20).getColumn()+j))
									{
										if(board.getPiece(all.get(20).getRow()+i,all.get(20).getColumn()+j).getColor().equals("Black"))
										{

										}
										else
										{
											return false;
										}
									}
									else
									{
										return false;
									}
								}
						}
					}
				}
			}
			else
			{
				for(int i=-1; i<=1;i++)
				{
					for(int j=-1; j<=1; j++)
					{
						if(!(i==0&&j==0))
						{
								if(check.isCheck(all.get(20).getRow()+i, all.get(20).getColumn()+j, all, board)==false)
								{
								if(board.contains(all.get(20).getRow()+i,all.get(20).getColumn()+j))
									{
										if(board.getPiece(all.get(20).getRow()+i,all.get(20).getColumn()+j).getColor().equals("Black"))
										{

										}
										else
										{
											return false;
										}
									}
									else
									{
										return false;
									}
								}
						}
					}
				}
			}
	}
	return true;
	}
}

import java.util.InputMismatchException;
import java.util.Scanner;
public class NQueenProblem {



	static int NumberOfcol; 
	
	
	
   private	int UserInput() {
		int number;
		try {
			Scanner sc = new Scanner(System.in);

			number = sc.nextInt();
			if (number < 0) {
				System.out.println("number can't be negative");
				number = UserInput();

			}
			return number;
		} catch (InputMismatchException e) {
			System.out.println("enter the correct input");
			number = UserInput();
			return number;
		}

	}
	/** used to print the solution of nqueen problem.
	 * @param board is the board which is to be printed.
	 */
   private void printSolution(int board[][])
	{
		for (int row = 0; row < NumberOfcol; row++)
		{
			for (int col = 0; col< NumberOfcol; col++)
				System.out.print(board[row][col]+"\t");
			System.out.println("\n");
		}
	}

	/** checks that the queen which is placed is at safe location or not.
	 * @param board on which queen is to be placed.
	 * @param row of board in which queen is placed.
	 * @param col  of board in which queen is placed.
	 * @return a boolean value safe or not.
	 */
	private boolean isSafe(int board[][], int row, int col)
	{
		int CheckingRow, CheckingCol;
		
		for (CheckingRow = 0; CheckingRow < col; CheckingRow++)
			if (board[row][CheckingRow] == 1) return false;
		
		for (CheckingRow = row, CheckingCol = col; CheckingRow >= 0 && CheckingCol >= 0; CheckingRow--, CheckingCol--)
			if (board[CheckingRow][CheckingCol] == 1)
				return false;

		for (CheckingRow = row, CheckingCol = col; CheckingCol >= 0 && CheckingRow < NumberOfcol; CheckingRow++, CheckingCol--)
			if (board[CheckingRow][CheckingCol] == 1)
				return false;

		return true;
	}

	/** A recursive utility function to solve N Queen problem 
	 * @param board on which queen is to be placed.
	 * @param col is no. of column on which queen is to be placed.
	 * @return true if queen are placed else fail.
	 */
	private boolean nQueen(int board[][], int col)
	{
		if (col >= NumberOfcol) 
			return true;
		
		for (int row = 0; row < NumberOfcol; row++)
			if (isSafe(board, row, col) == true) 
			{
				board[row][col] = 1;

				if (nQueen(board, col + 1) == true)
					return true; 
				board[row][col] = 0; }

		return false;
		}
	
	
	public static void main(String args[]){
		int col=0;
		boolean flag=false;		
		
		NQueenProblem nQueenProblem = new NQueenProblem();
		
		System.out.println("enter the no. of columns");
		
		NumberOfcol= nQueenProblem.UserInput();
		int[][] board = new int[NumberOfcol][NumberOfcol];
		
		
		flag =nQueenProblem.nQueen(board, col);
	if(flag)
		nQueenProblem.printSolution(board);
	else
		System.out.println("solution can't possible");
	}
}



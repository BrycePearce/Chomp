package CRRBoard;

/**
 * Created by Bryce on 10/4/2016.
 */
public class Board {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }

    /**
     * Generate rows/columns. Create turn variable, and initialize the "bar" with two array values.
     */
    private final int numRows = 7;
    private final int numColumns = 4;
    private int turnCounter = 0;

    private int [][]chocolateBar;

    /**
     * Set board to entered Rows/Columns. Add reset function, so it re-creates the same Rows/Columns
     */
    public Board() {
        chocolateBar = new int[numRows][numColumns];
        resetGame();
    }
    /**
    * Check if there is a piece available where the user selects.
    */
    public boolean pieceAvailable(int row, int column) {
        try {
            if (chocolateBar[row][column] == 0) {
                return false;
            }
        }

        catch(ArrayIndexOutOfBoundsException ex) {}
        return true;
    }
    /**
    * Determine player turns
    */
    public boolean playerOneTurn() {
        int turn = turnCounter % 2;
        if (turn == 0) {
            return true;
        }
        return false;
    }

    public boolean playerTwoTurn() {
        int turn = turnCounter % 2;
        if (turn == 1) {
            return true;
        }
        return false;
    }
    /**
     * Gets clicked piece
     */
    public void getClicked(int row, int column) {
        try {
            if(chocolateBar[row][column] != 0) {
                chocolateBar[row][column] = chocolateBar[row][column] - 1;
            }
        }

        catch(ArrayIndexOutOfBoundsException ex) {}

        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
    * Update things when things are clicked. Then changed player turn counter.
    */
    public void click(int row, int column) {
        if(row >= 0 && column >= 0) {
            for(int r = row; r >= 0; r-=1) {
                for(int c = column; c <= numColumns; c+=1) {
                    getClicked(r, c);
                }
            }
        }
        turnCounter = turnCounter + 1;
    }

    /**
     * Check if last piece is available. If so return false, otherwise return true.
     */
    public boolean isCleared() {
        if(pieceAvailable(6, 0) == true) {
            return false;
        }
        return true;
    }
    /**
     * Check if Player One won the game.
     */
    public boolean PlayerOneWin() {
        if(isCleared() == true && playerOneTurn() == true) {
            return true;
        }

        return false;
    }

    /**
     * Check if Player Two won the game.
     */
    public boolean PlayerTwoWin() {
        if(isCleared() == true && playerTwoTurn() == true) {
            return true;
        }

        return false;
    }

    /**
     * Reset the board when the "Reset" button is clicked. Also resets the turnCounter when a new
     * game begins.
     */
    public void resetGame()
    {
        for(int i = 0; i < numRows; ++i)
        {
            for(int j = 0; j < numColumns; ++j)
            {
                chocolateBar[i][j] = 1;
            }
        }
        turnCounter = 0;
    }

}
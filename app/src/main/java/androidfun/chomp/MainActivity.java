package androidfun.chomp;

import CRRBoard.Board;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    /**
     * Initalize a default size for the board
     */
    private final int NUM_ROWS = 7;
    private final int NUM_COLUMNS = 4;

    private Board gameBoard;
    private Button [][]chocoButtons;
    private Button button;

    /**
     * onCreate creates the board whenever the game is activated.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameBoard = new Board();
        chocoButtons = new Button[][]{
                {
                        (Button) findViewById(R.id.button00),
                        (Button) findViewById(R.id.button01),
                        (Button) findViewById(R.id.button02),
                        (Button) findViewById(R.id.button03)
                }, {
                (Button) findViewById(R.id.button10),
                (Button) findViewById(R.id.button11),
                (Button) findViewById(R.id.button12),
                (Button) findViewById(R.id.button13)
        }, {
                (Button) findViewById(R.id.button20),
                (Button) findViewById(R.id.button21),
                (Button) findViewById(R.id.button22),
                (Button) findViewById(R.id.button23)
        }, {
                (Button) findViewById(R.id.button30),
                (Button) findViewById(R.id.button31),
                (Button) findViewById(R.id.button32),
                (Button) findViewById(R.id.button33)
        }, {
                (Button) findViewById(R.id.button40),
                (Button) findViewById(R.id.button41),
                (Button) findViewById(R.id.button42),
                (Button) findViewById(R.id.button43)
        }, {
                (Button) findViewById(R.id.button50),
                (Button) findViewById(R.id.button51),
                (Button) findViewById(R.id.button52),
                (Button) findViewById(R.id.button53)
        }, {
                (Button) findViewById(R.id.button60),
                (Button) findViewById(R.id.button61),
                (Button) findViewById(R.id.button62),
                (Button) findViewById(R.id.button63)
        }
        };
        updateGameBoard();
    }
    /**
     * Update the game board as pieces are clicked
     */
    public void updateGameBoard() {
        for(int i = 0; i < NUM_ROWS; ++i) {
            for(int j = 0; j < NUM_COLUMNS; ++j) {
                if (gameBoard.pieceAvailable(i, j) == false) {
                    chocoButtons[i][j].setVisibility(View.INVISIBLE);
                }

                if(gameBoard.pieceAvailable(i, j) == true) {
                    chocoButtons[i][j].setVisibility(View.VISIBLE);
                }

                if(gameBoard.pieceAvailable(i, j) == true) {
                    chocoButtons[i][j].setBackgroundColor(Color.rgb(67, 22, 22));
                }
            }
        }

        if (gameBoard.playerOneTurn() == true && gameBoard.isCleared() == false) {
            TextView text;
            text = (TextView) findViewById(R.id.textView1);
            text.setText("Turn: Player 1");
            text.setTextColor(Color.BLACK);
            text.setBackgroundColor(Color.WHITE);
        }

        if(gameBoard.playerTwoTurn() == true && gameBoard.isCleared() == false) {
            TextView text;
            text = (TextView) findViewById(R.id.textView1);
            text.setText("Turn: Player 2");
            text.setTextColor(Color.BLACK);
            text.setBackgroundColor(Color.WHITE);
        }

        if(gameBoard.PlayerOneWin() == true && gameBoard.isCleared() == true) {
            TextView text;
            text = (TextView) findViewById(R.id.textView1);
            text.setText("Player One wins!");
            text.setTextColor(Color.RED);
            text.setBackgroundColor(Color.BLACK);
        }

        if(gameBoard.PlayerTwoWin() == true && gameBoard.isCleared() == true) {
            TextView text;
            text = (TextView) findViewById(R.id.textView1);
            text.setText("Player Two wins!");
            text.setTextColor(Color.RED);
            text.setBackgroundColor(Color.BLACK);
        }
    }

    /**
     * Set up events for click actions.
     */
    public void click00(View q) {
        gameBoard.click(0, 0);
        updateGameBoard();
    }

    public void click01(View q) {
        gameBoard.click(0, 1);
        updateGameBoard();
    }

    public void click02(View q) {
        gameBoard.click(0, 2);
        updateGameBoard();
    }

    public void click03(View q) {
        gameBoard.click(0, 3);
        updateGameBoard();
    }

    public void click10(View q) {
        gameBoard.click(1, 0);
        updateGameBoard();
    }

    public void click11(View q) {
        gameBoard.click(1, 1);
        updateGameBoard();
    }

    public void click12(View q) {
        gameBoard.click(1, 2);
        updateGameBoard();
    }

    public void click13(View q) {
        gameBoard.click(1, 3);
        updateGameBoard();
    }

    public void click20(View q) {
        gameBoard.click(2, 0);
        updateGameBoard();
    }

    public void click21(View q) {
        gameBoard.click(2, 1);
        updateGameBoard();
    }

    public void click22(View q) {
        gameBoard.click(2, 2);
        updateGameBoard();
    }

    public void click23(View q) {
        gameBoard.click(2, 3);
        updateGameBoard();
    }

    public void click30(View q) {
        gameBoard.click(3, 0);
        updateGameBoard();
    }

    public void click31(View q) {
        gameBoard.click(3, 1);
        updateGameBoard();
    }

    public void click32(View q) {
        gameBoard.click(3, 2);
        updateGameBoard();
    }

    public void click33(View q) {
        gameBoard.click(3, 3);
        updateGameBoard();
    }

    public void click40(View q) {
        gameBoard.click(4, 0);
        updateGameBoard();
    }

    public void click41(View q) {
        gameBoard.click(4, 1);
        updateGameBoard();
    }

    public void click42(View q) {
        gameBoard.click(4, 2);
        updateGameBoard();
    }

    public void click43(View q) {
        gameBoard.click(4, 3);
        updateGameBoard();
    }

    public void click50(View q) {
        gameBoard.click(5, 0);
        updateGameBoard();
    }

    public void click51(View q) {
        gameBoard.click(5, 1);
        updateGameBoard();
    }

    public void click52(View q) {
        gameBoard.click(5, 2);
        updateGameBoard();
    }

    public void click53(View q) {
        gameBoard.click(5, 3);
        updateGameBoard();
    }

    public void click60(View q) {
        gameBoard.click(6, 0);
        updateGameBoard();
    }

    public void click61(View q) {
        gameBoard.click(6, 1);
        updateGameBoard();
    }

    public void click62(View q) {
        gameBoard.click(6, 2);
        updateGameBoard();
    }

    public void click63(View q) {
        gameBoard.click(6, 3);
        updateGameBoard();
    }
    /**
     * Reset the game board when the "Restart Game" button is clicked.
     */
    public void startNewGame(View q) {
        gameBoard.resetGame();
        updateGameBoard();
    }
}
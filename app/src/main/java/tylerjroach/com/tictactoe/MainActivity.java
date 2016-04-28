package tylerjroach.com.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private TextView box1;
  private TextView box2;
  private TextView box3;
  private TextView box4;
  private TextView box5;
  private TextView box6;
  private TextView box7;
  private TextView box8;
  private TextView box9;
  private TextView gameInfo;
  private Button startButton;

  private Player player1;
  private Player player2;

  private int turn = 0;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //create the players in the game
    player1 = new Player("Player 1", "X");
    player2 = new Player("Player 2", "O");

    //bind views
    box1 = (TextView) findViewById(R.id.box1);
    box2 = (TextView) findViewById(R.id.box2);
    box3 = (TextView) findViewById(R.id.box3);
    box4 = (TextView) findViewById(R.id.box4);
    box5 = (TextView) findViewById(R.id.box5);
    box6 = (TextView) findViewById(R.id.box6);
    box7 = (TextView) findViewById(R.id.box7);
    box8 = (TextView) findViewById(R.id.box8);
    box9 = (TextView) findViewById(R.id.box9);
    gameInfo = (TextView) findViewById(R.id.turn_info);
    startButton = (Button) findViewById(R.id.new_game);

    //attach on click listeners
    startButton.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startGame();
      }
    });

    View.OnClickListener boxClicked = new View.OnClickListener() {
      @Override public void onClick(View v) {
        TextView box = (TextView)v;

        //only take a turn if the box hadn't been clicked yet
        if (box.getText().toString().equals("")) {
          if (turn % 2 == 0) {
            box.setText(player1.getPiece());
            gameInfo.setText(player2.getName() + "'s turn");
          } else {
            box.setText(player2.getPiece());
            gameInfo.setText(player1.getName() + "'s turn");
          }

          turn = turn + 1;
        }

      }
    };

    box1.setOnClickListener(boxClicked);
    box2.setOnClickListener(boxClicked);
    box3.setOnClickListener(boxClicked);
    box4.setOnClickListener(boxClicked);
    box5.setOnClickListener(boxClicked);
    box6.setOnClickListener(boxClicked);
    box7.setOnClickListener(boxClicked);
    box8.setOnClickListener(boxClicked);
    box9.setOnClickListener(boxClicked);

    startGame();
  }

  public void startGame() {
    turn = 0;
    gameInfo.setText(player1.getName() + "'s turn");
    box1.setText("");
    box2.setText("");
    box3.setText("");
    box4.setText("");
    box5.setText("");
    box6.setText("");
    box7.setText("");
    box8.setText("");
    box9.setText("");
  }
}

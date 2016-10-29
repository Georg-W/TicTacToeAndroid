package georgwestner.de.ticedytac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EndingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endingscreen);

        TextView winnerName = (TextView) findViewById(R.id.winnerName);
        winnerName.setText("Player 1 won!");
    }
}

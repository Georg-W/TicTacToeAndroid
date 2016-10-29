package georgwestner.de.ticedytac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endingscreen);
        Intent intent = getIntent();
        String result = intent.getStringExtra(Intent.EXTRA_TEXT);

        TextView winnerName = (TextView) findViewById(R.id.winnerName);
        winnerName.setText("Result: " + result);

        setupUI();
    }


    void setupUI (){
        Button restartSingle = (Button) findViewById(R.id.restart1);
        Button restartDouble = (Button) findViewById(R.id.restart2);

        restartSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleButtonClick((Button) v);
            }
        });

        restartDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleButtonClick((Button) v);
            }
        });
    }

    void handleButtonClick(Button b){
        int id = b.getId();

        switch(id){
            case R.id.restart1:
                Intent restart1 = new Intent(this, SinglePlayer.class);
                startActivity(restart1);
                break;
            case R.id.restart2:
                Intent restart2 = new Intent(this, MultiPlayer.class);
                startActivity(restart2);
                break;
            default:
                break;
        }
    }




}

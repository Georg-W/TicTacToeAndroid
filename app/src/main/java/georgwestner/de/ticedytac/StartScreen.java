package georgwestner.de.ticedytac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartScreen extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
    }


    void startSingle(View v){
        Intent startSingle = new Intent(this, SinglePlayer.class);
        startActivity(startSingle);
    }

    void startTwo(View v){
        Intent startTwo = new Intent(this, MainActivity.class);
        startActivity(startTwo);
    }
}

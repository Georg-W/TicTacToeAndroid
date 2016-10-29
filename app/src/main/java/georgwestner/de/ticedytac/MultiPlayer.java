package georgwestner.de.ticedytac;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MultiPlayer extends AppCompatActivity{


    public int turns = 0;

    List fields = new ArrayList();

    boolean over = false;

    final int[] field1 = {0};
    final int[] field2 = {0};
    final int[] field3 = {0};
    final int[] field4 = {0};
    final int[] field5 = {0};
    final int[] field6 = {0};
    final int[] field7 = {0};
    final int[] field8 = {0};
    final int[] field9 = {0};

    int activePlayer = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleplayer);

        setupUi();
        createArray();
    }


    void createArray(){

        fields.add(1);
        fields.add(2);
        fields.add(3);
        fields.add(4);
        fields.add(5);
        fields.add(6);
        fields.add(7);
        fields.add(8);
        fields.add(9);

    }

    void setupUi() {

        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton button3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton button4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton button5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton button6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton button7 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton button8 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton button9 = (ImageButton) findViewById(R.id.imageButton9);




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field1[0] == 0 && activePlayer == 1){
                    field1[0] = 1;
                    fields.remove(fields.indexOf(1));
                    handleButtonClick((ImageButton) v);
                }
                else if(field1[0] == 0 && activePlayer == 2){
                    field1[0] = 2;
                    fields.remove(fields.indexOf(1));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field2[0] == 0 && activePlayer == 1){
                    field2[0] = 1;
                    fields.remove(fields.indexOf(2));
                    handleButtonClick((ImageButton) v);
                }
                else if(field2[0] == 0 && activePlayer == 2){
                    field2[0] = 2;
                    fields.remove(fields.indexOf(2));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field3[0] == 0 && activePlayer == 1){
                    field3[0] = 1;
                    fields.remove(fields.indexOf(3));
                    handleButtonClick((ImageButton) v);
                }
                else if(field3[0] == 0 && activePlayer == 2){
                    field3[0] = 2;
                    fields.remove(fields.indexOf(3));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field4[0] == 0  && activePlayer == 1){
                    field4[0] = 1;
                    fields.remove(fields.indexOf(4));
                    handleButtonClick((ImageButton) v);
                }
                else if(field4[0] == 0 && activePlayer == 2){
                    field4[0] = 2;
                    fields.remove(fields.indexOf(4));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field5[0] == 0  && activePlayer == 1){
                    field5[0] = 1;
                    fields.remove(fields.indexOf(5));
                    handleButtonClick((ImageButton) v);
                }
                else if(field5[0] == 0 && activePlayer == 2){
                    field5[0] = 2;
                    fields.remove(fields.indexOf(5));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field6[0] == 0  && activePlayer == 1){
                    field6[0] = 1;
                    fields.remove(fields.indexOf(6));
                    handleButtonClick((ImageButton) v);
                }
                else if(field6[0] == 0 && activePlayer == 2){
                    field6[0] = 2;
                    fields.remove(fields.indexOf(6));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field7[0] == 0  && activePlayer == 1){
                    field7[0] = 1;
                    fields.remove(fields.indexOf(7));
                    handleButtonClick((ImageButton) v);
                }
                else if(field7[0] == 0 && activePlayer == 2){
                    field7[0] = 2;
                    fields.remove(fields.indexOf(7));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field8[0] == 0  && activePlayer == 1){
                    field8[0] = 1;
                    fields.remove(fields.indexOf(8));
                    handleButtonClick((ImageButton) v);
                }
                else if(field8[0] == 0 && activePlayer == 2){
                    field8[0] = 2;
                    fields.remove(fields.indexOf(8));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field9[0] == 0  && activePlayer == 1){
                    field9[0] = 1;
                    fields.remove(fields.indexOf(9));
                    handleButtonClick((ImageButton) v);
                }
                else if(field9[0] == 0 && activePlayer == 2){
                    field9[0] = 2;
                    fields.remove(fields.indexOf(9));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
    }

    void addTurn (){
        turns++;
        TextView turn = (TextView) findViewById(R.id.turn);
        turn.setText("Turn: " + turns);

    }

    void handleButtonClick(ImageButton imagebutton) {

        TextView textView = (TextView) findViewById(R.id.player);


        if (activePlayer==1){
            imagebutton.setImageResource(R.drawable.cross);
            textView.setText("Player 2");
            addTurn();
            checkResult();
            activePlayer = 2;
        }
        else{
            imagebutton.setImageResource(R.drawable.circle);
            textView.setText("Player 1");
            addTurn();
            checkResult();
            activePlayer = 1;
        }
    }


    void checkResult(){
        if (field1[0]==1&&field2[0]==1&&field3[0]==1 || field4[0]==1&&field5[0]==1&&field6[0]==1 || field7[0]==1&&field8[0]==1&&field9[0]==1 ||
                field1[0]==1&&field4[0]==1&&field7[0]==1 || field2[0]==1&&field5[0]==1&&field8[0]==1 || field3[0]==1&&field6[0]==1&&field9[0]==1 ||
                field1[0]==1&&field5[0]==1&&field9[0]==1 || field3[0]==1&&field5[0]==1&&field7[0]==1){
            over=true;
            restartApp();
            Intent showResult = new Intent(this, EndingScreen.class);
            showResult.putExtra(Intent.EXTRA_TEXT, "Player 1 wins!");
            startActivity(showResult);
        }
        else{
            if(field1[0]==2&&field2[0]==2&&field3[0]==2 || field4[0]==2&&field5[0]==2&&field6[0]==2 || field7[0]==2&&field8[0]==2&&field9[0]==2 ||
                    field1[0]==2&&field4[0]==2&&field7[0]==2 || field2[0]==2&&field5[0]==2&&field8[0]==2 || field3[0]==2&&field6[0]==2&&field9[0]==2 ||
                    field1[0]==2&&field5[0]==2&&field9[0]==2 || field3[0]==2&&field5[0]==2&&field7[0]==2){
                over=true;
                restartApp();
                Intent showResult = new Intent(this, EndingScreen.class);
                showResult.putExtra(Intent.EXTRA_TEXT, "Player 2 wins!");
                startActivity(showResult);
            }
            else{
                if(turns==9){
                    over=true;
                    restartApp();
                    Intent showResult = new Intent(this, EndingScreen.class);
                    showResult.putExtra(Intent.EXTRA_TEXT, "A draw!");
                    startActivity(showResult);
                }

            }
        }


    }


    void restartApp(){

        turns = 0;

        TextView turn = (TextView) findViewById(R.id.turn);
        TextView player = (TextView) findViewById(R.id.player);
        player.setText("Player 1");
        turn.setText("Turn: " + turns);

        int activePlayer = 1;

        fields.clear();
        fields.add(1);
        fields.add(2);
        fields.add(3);
        fields.add(4);
        fields.add(5);
        fields.add(6);
        fields.add(7);
        fields.add(8);
        fields.add(9);

        field1[0] = 0;
        field2[0] = 0;
        field3[0] = 0;
        field4[0] = 0;
        field5[0] = 0;
        field6[0] = 0;
        field7[0] = 0;
        field8[0] = 0;
        field9[0] = 0;

        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton button3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton button4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton button5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton button6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton button7 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton button8 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton button9 = (ImageButton) findViewById(R.id.imageButton9);

        button1.setImageResource(R.drawable.grid_box);
        button2.setImageResource(R.drawable.grid_box);
        button3.setImageResource(R.drawable.grid_box);
        button4.setImageResource(R.drawable.grid_box);
        button5.setImageResource(R.drawable.grid_box);
        button6.setImageResource(R.drawable.grid_box);
        button7.setImageResource(R.drawable.grid_box);
        button8.setImageResource(R.drawable.grid_box);
        button9.setImageResource(R.drawable.grid_box);

    }



}



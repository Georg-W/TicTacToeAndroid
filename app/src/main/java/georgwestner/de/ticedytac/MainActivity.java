package georgwestner.de.ticedytac;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity{


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

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                if(field1[0] == 0){
                    field1[0] = 1;
                    fields.remove(fields.indexOf(1));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field2[0] == 0){
                    field2[0] = 1;
                    fields.remove(fields.indexOf(2));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field3[0] == 0){
                    field3[0] = 1;
                    fields.remove(fields.indexOf(3));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field4[0] == 0){
                    field4[0] = 1;
                    fields.remove(fields.indexOf(4));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field5[0] == 0){
                    field5[0] = 1;
                    fields.remove(fields.indexOf(5));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field6[0] == 0){
                    field6[0] = 1;
                    fields.remove(fields.indexOf(6));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field7[0] == 0){
                    field7[0] = 1;
                    fields.remove(fields.indexOf(7));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field8[0] == 0){
                    field8[0] = 1;
                    fields.remove(fields.indexOf(8));
                    handleButtonClick((ImageButton) v);
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(field9[0] == 0){
                    field9[0] = 1;
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


        /*ObjectAnimator an = ObjectAnimator.ofInt(imagebutton, "alpha", 1, 0);
        an.setDuration(9000);
        an.setInterpolator(new BounceInterpolator());
        an.start();*/

        imagebutton.setImageResource(R.drawable.cross);

        textView.setText("CPU");

        addTurn();
        checkResult();
        if (over==false){
            executeAiMove();
            addTurn();
            checkResult();
        }
        else{
            restartApp();
        }

    }


    void checkResult(){
        if (field1[0]==1&&field2[0]==1&&field3[0]==1 || field4[0]==1&&field5[0]==1&&field6[0]==1 || field7[0]==1&&field8[0]==1&&field9[0]==1 ||
                field1[0]==1&&field4[0]==1&&field7[0]==1 || field2[0]==1&&field5[0]==1&&field8[0]==1 || field3[0]==1&&field6[0]==1&&field9[0]==1 ||
                field1[0]==1&&field5[0]==1&&field9[0]==1 || field3[0]==1&&field5[0]==1&&field7[0]==1){
            Toast.makeText(this, "Win! Can you do it again?", Toast.LENGTH_SHORT).show();
            over=true;
            restartApp();
        }
        else{
            if(field1[0]==2&&field2[0]==2&&field3[0]==2 || field4[0]==2&&field5[0]==2&&field6[0]==2 || field7[0]==2&&field8[0]==2&&field9[0]==2 ||
                    field1[0]==2&&field4[0]==2&&field7[0]==2 || field2[0]==2&&field5[0]==2&&field8[0]==2 || field3[0]==2&&field6[0]==2&&field9[0]==2 ||
                    field1[0]==2&&field5[0]==2&&field9[0]==2 || field3[0]==2&&field5[0]==2&&field7[0]==2){
                over=true;
                Toast.makeText(this, "Noo a loss... Try again and beat the Developer!", Toast.LENGTH_SHORT).show();
                restartApp();

            }
            else{
                if(turns==9){
                    Toast.makeText(this, "Well.. a draw. Try again!", Toast.LENGTH_SHORT).show();
                    over=true;
                    restartApp();
                }

            }
        }


    }


    void executeAiMove() {
        TextView textView = (TextView) findViewById(R.id.player);
        textView.setText("Player");

        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton button3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton button4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton button5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton button6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton button7 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton button8 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton button9 = (ImageButton) findViewById(R.id.imageButton9);




        /*
        if (field1[0]==1 && field2[0]==1){
            field3[0]=2;
            fields.remove(fields.indexOf(3));
        }
        */


        int possibility = random.nextInt(100);


        //80% Possibility of random move

        if  (possibility<80){
            if (field1[0]==1 && field2[0]==1 && field3[0]==0){
                button3.setImageResource(R.drawable.circle);
                field3[0]=2;
                fields.remove(fields.indexOf(3));
            }
            else if(field1[0]==1 && field3[0]==1 && field2[0]==0){
                button2.setImageResource(R.drawable.circle);
                field2[0]=2;
                fields.remove(fields.indexOf(2));
            }
            else if(field2[0]==1 && field3[0]==1 && field1[0]==0){
                button1.setImageResource(R.drawable.circle);
                field1[0]=2;
                fields.remove(fields.indexOf(1));
            }
            else if(field4[0]==1 && field5[0]==1 && field6[0]==0){
                button6.setImageResource(R.drawable.circle);
                field6[0]=2;
                fields.remove(fields.indexOf(6));
            }
            else if(field4[0]==1 && field6[0]==1 && field5[0]==0){
                button5.setImageResource(R.drawable.circle);
                field5[0]=2;
                fields.remove(fields.indexOf(5));
            }
            else if(field5[0]==1 && field6[0]==1 && field4[0]==0){
                button4.setImageResource(R.drawable.circle);
                field4[0]=2;
                fields.remove(fields.indexOf(4));
            }
            else if(field7[0]==1 && field8[0]==1 && field9[0]==0){
                button9.setImageResource(R.drawable.circle);
                field9[0]=2;
                fields.remove(fields.indexOf(9));
            }
            else if(field7[0]==1 && field9[0]==1 && field8[0]==0){
                button8.setImageResource(R.drawable.circle);
                field8[0]=2;
                fields.remove(fields.indexOf(8));
            }
            else if(field9[0]==1 && field8[0]==1 && field7[0]==0){
                button7.setImageResource(R.drawable.circle);
                field7[0]=2;
                fields.remove(fields.indexOf(7));
            }

            // Diagonal
            else if(field1[0]==1 && field5[0]==1 && field9[0]==0){
                button9.setImageResource(R.drawable.circle);
                field9[0]=2;
                fields.remove(fields.indexOf(9));
            }
            else if(field9[0]==1 && field5[0]==1 && field1[0]==0){
                button1.setImageResource(R.drawable.circle);
                field1[0]=2;
                fields.remove(fields.indexOf(1));
            }
            else if(field1[0]==1 && field9[0]==1 && field5[0]==0){
                button5.setImageResource(R.drawable.circle);
                field5[0]=2;
                fields.remove(fields.indexOf(5));
            }
            else if(field7[0]==1 && field5[0]==1 && field3[0]==0){
                button3.setImageResource(R.drawable.circle);
                field3[0]=2;
                fields.remove(fields.indexOf(3));
            }
            else if(field7[0]==1 && field3[0]==1 && field5[0]==0){
                button5.setImageResource(R.drawable.circle);
                field5[0]=2;
                fields.remove(fields.indexOf(5));
            }
            else if(field5[0]==1 && field3[0]==1 && field7[0]==0){
                button7.setImageResource(R.drawable.circle);
                field7[0]=2;
                fields.remove(fields.indexOf(7));
            }

            // Downwards
            else if(field1[0]==1 && field4[0]==1 && field7[0]==0){
                button7.setImageResource(R.drawable.circle);
                field7[0]=2;
                fields.remove(fields.indexOf(7));
            }
            else if(field1[0]==1 && field7[0]==1 && field4[0]==0){
                button4.setImageResource(R.drawable.circle);
                field4[0]=2;
                fields.remove(fields.indexOf(4));
            }
            else if(field7[0]==1 && field4[0]==1 && field1[0]==0){
                button1.setImageResource(R.drawable.circle);
                field1[0]=2;
                fields.remove(fields.indexOf(1));
            }
            else if(field2[0]==1 && field5[0]==1 && field8[0]==0){
                button8.setImageResource(R.drawable.circle);
                field8[0]=2;
                fields.remove(fields.indexOf(8));
            }
            else if(field2[0]==1 && field8[0]==1 && field5[0]==0){
                button5.setImageResource(R.drawable.circle);
                field5[0]=2;
                fields.remove(fields.indexOf(5));
            }
            else if(field8[0]==1 && field5[0]==1 && field2[0]==0){
                button2.setImageResource(R.drawable.circle);
                field2[0]=2;
                fields.remove(fields.indexOf(2));
            }
            else if(field3[0]==1 && field6[0]==1 && field9[0]==0){
                button9.setImageResource(R.drawable.circle);
                field9[0]=2;
                fields.remove(fields.indexOf(9));
            }
            else if(field3[0]==1 && field9[0]==1 && field6[0]==0){
                button6.setImageResource(R.drawable.circle);
                field6[0]=2;
                fields.remove(fields.indexOf(6));
            }
            else if(field9[0]==1 && field6[0]==1 && field3[0]==0){
                button3.setImageResource(R.drawable.circle);
                field3[0]=2;
                fields.remove(fields.indexOf(3));
            }

            else if(1==1){
                executeRandomMove();
            }
        }

        else{
            executeRandomMove();
        }
    }

    void executeRandomMove(){
        int randomPosition = random.nextInt(fields.size());
        int move = (int) fields.get(randomPosition);

        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton button3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton button4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton button5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton button6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton button7 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton button8 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton button9 = (ImageButton) findViewById(R.id.imageButton9);


        switch (move) {
            case 1:
                button1.setImageResource(R.drawable.circle);
                field1[0] = 2;
                fields.remove(fields.indexOf(1));
                break;
            case 2:
                button2.setImageResource(R.drawable.circle);
                field2[0] = 2;
                fields.remove(fields.indexOf(2));
                break;
            case 3:
                button3.setImageResource(R.drawable.circle);
                field3[0] = 2;
                fields.remove(fields.indexOf(3));
                break;
            case 4:
                button4.setImageResource(R.drawable.circle);
                field4[0] = 2;
                fields.remove(fields.indexOf(4));
                break;
            case 5:
                button5.setImageResource(R.drawable.circle);
                field5[0] = 2;
                fields.remove(fields.indexOf(5));
                break;
            case 6:
                button6.setImageResource(R.drawable.circle);
                field6[0] = 2;
                fields.remove(fields.indexOf(6));
                break;
            case 7:
                button7.setImageResource(R.drawable.circle);
                field7[0] = 2;
                fields.remove(fields.indexOf(7));
                break;
            case 8:
                button8.setImageResource(R.drawable.circle);
                field8[0] = 2;
                fields.remove(fields.indexOf(8));
                break;
            case 9:
                button9.setImageResource(R.drawable.circle);
                field9[0] = 2;
                fields.remove(fields.indexOf(9));
                break;
            default:
                break;

        }
    }


    void restartApp(){

        turns = 0;

        TextView turn = (TextView) findViewById(R.id.turn);
        turn.setText("Turn: " + turns);

        over = false;

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



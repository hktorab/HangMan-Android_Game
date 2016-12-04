package com.example.torab.hangman;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int gameLife = 6;

    public String[] countryName = {"C", "A", "N", "A", "D", "A"};
    public int gameAlphabetCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    //to start another game

    private void FreshStart() {
        /*for (int c = 0; c < countryName.length; c++) {
            display("", c);
        }
        gameLife = 6;
        gameAlphabetCounter=0;*/
       // gameAlphabetCounter = 0;

    }

    public void buttonA(View v) {
        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {

                if (countryName[c].equals("A")) {
                    display("A", c);
                    check++;
                }

            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }

            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {

            display();
            FreshStart();
        }
    }

    public void buttonB(View v) {
        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("B")) {
                    display("B", c);
                    check++;
                }

            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }

            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonC(View v) {
        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("C")) {
                    display("C", c);
                    check++;
                }

            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }

            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonD(View v) {
        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("D")) {
                    display("D", c);
                    check++;
                }

            }
            if (check == 0) {
                gameLife--;
                display("" + gameLife, 100);
            }

            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonE(View v) {
        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("E")) {
                    display("E", c);
                    check++;
                }

            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }

            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonF(View v) {
        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("F")) {
                    display("F", c);
                    check++;
                }

            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }

            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonG(View v) {
        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("G")) {
                    display("G", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }

            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonH(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("H")) {
                    display("H", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }

            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonI(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("I")) {
                    display("I", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonJ(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("J")) {
                    display("J", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }

            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonK(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("K")) {
                    display("K", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonL(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("L")) {
                    display("L", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonM(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("M")) {
                    display("M", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonN(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("N")) {
                    display("N", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonO(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("O")) {
                    display("O", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonP(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("P")) {
                    display("P", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonQ(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("Q")) {
                    display("Q", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonR(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("R")) {
                    display("R", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonS(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("S")) {
                    display("S", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonT(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("T")) {
                    display("T", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonU(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("U")) {
                    display("U", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonV(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("V")) {
                    display("V", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonW(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("W")) {
                    display("W", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonX(View view) {

        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("X")) {
                    display("X", c);
                    check++;
                }

            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife < 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }

    public void buttonY(View view) {

        try {

            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("Y")) {
                    display("Y", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife <= 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }
    }


    public void buttonZ(View view) {
        try {
            int check = 0;
            for (int c = 0; c < countryName.length; c++) {
                if (countryName[c].equals("Z")) {
                    display("Z", c);
                    check++;
                }
            }
            if (check == 0) {
                gameLife--;
                display("", 100);
            }
            if (gameLife <= 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            display();
            FreshStart();
        }

    }

// alphabet display

    private void display(String al, int pos) {
        try{
        if (pos == 100) {
            TextView textView = (TextView) findViewById(R.id.textLifeNumber);
            textView.setText("" + gameLife);
        } else if (pos == 0) {
            gameAlphabetCounter++;
            TextView textView = (TextView) findViewById(R.id.textZero);
            textView.setText(al);
        } else if (pos == 1) {
            gameAlphabetCounter++;
            TextView textView = (TextView) findViewById(R.id.textOne);
            textView.setText(al);
        } else if (pos == 2) {
            gameAlphabetCounter++;
            TextView textView = (TextView) findViewById(R.id.textTwo);
            textView.setText(al);
        } else if (pos == 3) {
            gameAlphabetCounter++;
            TextView textView = (TextView) findViewById(R.id.textThree);
            textView.setText(al);
        } else if (pos == 4) {
            gameAlphabetCounter++;
            TextView textView = (TextView) findViewById(R.id.textFour);
            textView.setText(al);
        } else if (pos == 5) {
            gameAlphabetCounter++;
            TextView textView = (TextView) findViewById(R.id.textFive);
            textView.setText(al);
        } else {
            TextView textView = (TextView) findViewById(R.id.textjhamela);
            textView.setText("?");
        }
            //After finishing the Name
        if (gameAlphabetCounter == countryName.length) {
            TextView textView1 = (TextView) findViewById(R.id.textLifeFont);
            String show = "Congratulations :D" + "\n" + "You Have Conquered ";
            textView1.setText(show);

            TextView textView2 = (TextView) findViewById(R.id.textLifeNumber);
            textView2.setText("");
            TextView textView3 = (TextView) findViewById(R.id.showHint);
            textView3.setText("");
        }  }catch (Exception e)
        {
            Toast.makeText(getApplication(),""+e,Toast.LENGTH_LONG).show();
        }
    }

    //finishing gameLife

    private void display() {
        TextView textView3 = (TextView) findViewById(R.id.showHint);
        textView3.setText("");
        TextView textView1 = (TextView) findViewById(R.id.textLifeFont);
        textView1.setText("You Are Dead");
        TextView textView2 = (TextView) findViewById(R.id.textLifeNumber);
        textView2.setText("");
    }

}

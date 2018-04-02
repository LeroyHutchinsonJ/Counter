package com.example.counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link the java variables to the xml variables
         final TextView CountText = (TextView) findViewById(R.id.CountText);
        Button CountBtn = (Button) findViewById(R.id.CountBtn);



        final int test = 0;


        //Makes it so that the button does something when it is clicked
        CountBtn.setOnClickListener(new View.OnClickListener() {

            //Sets the counter variable, posting it inside the onClick(View view) stops it from moving from 0
            int counter = test;

            @Override
            public void onClick(View view) {

                    //Posts the number of times the button has been clicked, put ++ infront so it adds 1 to the number before posting it
                    CountText.setText("" + ++counter);

                //Link to the java reset button
                Button Resetbtn = (Button) findViewById(R.id.Resetbtn);

                //Makes it so that when the reset button is held down the count resets
                Resetbtn.setOnLongClickListener(new View.OnLongClickListener() {

                    @Override
                    public boolean onLongClick(View view) {

                        //Sets the counter to 0
                        counter=0;

                        //Sets the screen value of counter to 0, so that the user can see what is going on
                        CountText.setText("0");


                        return false;
                    }
                });

            }
        });



    }
}

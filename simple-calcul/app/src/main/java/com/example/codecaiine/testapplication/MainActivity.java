package com.example.codecaiine.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonMinus , buttonPlus, buttonMulti , buttonDivide;
    private EditText editMe1 , editMe2;
    private TextView showSign , showEqual , showResul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonPlus = findViewById(R.id.click_plus);
        buttonMinus = findViewById(R.id.click_minus);
        buttonMulti = findViewById(R.id.click_multi);
        buttonDivide = findViewById(R.id.click_divide);

        editMe1 = findViewById(R.id.edit_me1);
        editMe2 = findViewById(R.id.edit_me2);

        //TEXTVIEW
        showSign = findViewById(R.id.sign);
        showEqual = findViewById(R.id.equal);
        showResul = findViewById(R.id.result);


        //BUTTON ADDITION

        buttonPlus.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Log.d("My Button", "Clicked!");

                String firstNum = editMe1.getText().toString();
                String secondNum = editMe2.getText().toString();

                Integer firstSum = Integer.valueOf(firstNum);
                Integer secondSum = Integer.valueOf(secondNum);

                Integer tSum =  firstSum + secondSum ;

                String resultat = String.valueOf(tSum);

                showSign.setText(" + ");
                showEqual.setText(" = ");
                showResul.setText(resultat);

                Toast.makeText(view.getContext(), "Value in first item is " + tSum, Toast.LENGTH_LONG).show();

            }
        });


        //BUTTON MULTIPLI

        buttonMulti.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Log.d("My Button", "Clicked!");

                String firstNum = editMe1.getText().toString();
                String secondNum = editMe2.getText().toString();

                Integer firstSum = Integer.valueOf(firstNum);
                Integer secondSum = Integer.valueOf(secondNum);


                Integer tSum =  firstSum * secondSum ;

                String resultat = String.valueOf(tSum);

                showSign.setText(" x ");
                showEqual.setText(" = ");
                showResul.setText(resultat);

                Toast.makeText(view.getContext(), "Value in first item is " + tSum, Toast.LENGTH_LONG).show();

            }
        });

        //BUTTON MINUS

        buttonMinus.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Log.d("My Button", "Clicked!");

                String firstNum = editMe1.getText().toString();
                String secondNum = editMe2.getText().toString();

                Integer firstSum = Integer.valueOf(firstNum);
                Integer secondSum = Integer.valueOf(secondNum);

                Integer tSum =  firstSum - secondSum ;

                String resultat = String.valueOf(tSum);

                showSign.setText(" - ");
                showEqual.setText(" = ");
                showResul.setText(resultat);

                Toast.makeText(view.getContext(), "Value in first item is " + tSum, Toast.LENGTH_LONG).show();

            }
        });


        //BUTTON MINUS

        buttonDivide.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Log.d("My Button", "Clicked!");

                String firstNum = editMe1.getText().toString();
                String secondNum = editMe2.getText().toString();

                Integer firstSum = Integer.valueOf(firstNum);
                Integer secondSum = Integer.valueOf(secondNum);

                Integer tSum =  firstSum / secondSum ;

                String resultat = String.valueOf(tSum);

                showSign.setText(" / ");
                showEqual.setText(" = ");
                showResul.setText(resultat);

                Toast.makeText(view.getContext(), "Value in first item is " + tSum, Toast.LENGTH_LONG).show();

            }
        });
    }
}

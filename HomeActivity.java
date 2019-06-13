package com.example.a52weeksaveapplast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private EditText principle;
    private TextView savedAmount;
    private Button calculate, reset;

    int principleAmount;
    int savedAmt;
    int weeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        principle = (EditText) findViewById(R.id.edittxtPri);
        savedAmount = (TextView) findViewById(R.id.savedAmt);
        calculate = (Button) findViewById(R.id.calculateBt);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                principleAmount = Integer.parseInt(principle.getText().toString());
                savedAmt = 26*52*principleAmount;
                savedAmount.setText(savedAmt);
            }
        });

        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                principle.setText(" ");
                savedAmount.setText(" ");
            }
        });

    }
}

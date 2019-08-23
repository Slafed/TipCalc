package com.example.tipcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double sahjk = 34.0;
    double gdsg = 35.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v) {
        DecimalFormat df = new DecimalFormat("#,###,##0.00");

        // Get references to all elements on app screen
        EditText bill = (EditText) findViewById(R.id.billEditView);
        EditText tip = (EditText) findViewById(R.id.tipEditView);
        TextView result = (TextView) findViewById(R.id.resultTextView);
        try {
            // get the values from the EditText boxes and convert them to int data types
            double num1 = Double.parseDouble(bill.getText().toString());
            double num2 = Double.parseDouble(tip.getText().toString());
            num2 = num2 / 100;

            // multiply both ints and format
            double product = num1 * num2;
            double total = num1 + product;

            // set the text for the answer
            result.setText("Tip: " + df.format(product) + "\n" + "Total: " + df.format(total));
        }
        catch(Exception e){
            result.setText("incorrect input");
        }
    }
}

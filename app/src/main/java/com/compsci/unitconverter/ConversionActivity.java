package com.compsci.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ConversionActivity extends AppCompatActivity {
    EditText editext1, editext2, edt2;
    Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        editext1 = findViewById(R.id.txtAmount);
        editext2 = findViewById(R.id.txtAmount1);
        button1 = findViewById(R.id.btnConvert);
        button2 = findViewById(R.id.btnExit);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double cm;

                if (editext1.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter an amount", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    Double length = Double.parseDouble(editext1.getText().toString());
                    cm = length * 100;
                    Toast.makeText(getApplicationContext(), cm.toString(), Toast.LENGTH_LONG).show();

                    editext2.setText(cm.toString());
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }}
package com.example.areacalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegi extends AppCompatActivity {

    private EditText inputsisi;
    private Button hitungluas;
    private TextView luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        inputsisi = (EditText) findViewById(R.id.inputsisi);
        hitungluas = (Button) findViewById(R.id.hitungluas);
        luas = (TextView) findViewById(R.id.luas);

        hitungluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!inputsisi.getText().toString().equals("")) {
                    double number1 = Double.parseDouble(inputsisi.getText().toString());

                    double hasil = number1 *  number1;
                    luas.setText("Luas: " + String.valueOf(hasil));

                } else {
                    luas.setText("Please input number");
                }

            }
        });


    }
}
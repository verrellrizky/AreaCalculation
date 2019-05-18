package com.example.areacalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {
    private EditText alas;
    private EditText tinggi;
    private TextView luas;
    private Button hitungluas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        alas = (EditText)findViewById(R.id.alas);
        tinggi = (EditText)findViewById(R.id.tinggi);
        luas = (TextView)findViewById(R.id.luas);
        hitungluas = (Button)findViewById(R.id.hitungluas);

        hitungluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!alas.getText().toString().equals("") && (!tinggi.getText().toString().equals(""))) {

                    double number1 = Double.parseDouble(alas.getText().toString());
                    double number2 = Double.parseDouble(tinggi.getText().toString());

                    double hasil = number1 *  number2 * 1/2;
                    luas.setText("Luas: " + String.valueOf(hasil));

                } else {
                    luas.setText("Please input number");
                }
            }
        });
    }
}

package com.example.areacalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegipanjang extends AppCompatActivity {
    private EditText panjang;
    private EditText lebar;
    private Button hitungluas;
    private TextView luas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);

        panjang = (EditText)findViewById(R.id.panjang);
        lebar = (EditText)findViewById(R.id.lebar);
        hitungluas = (Button)findViewById(R.id.hitungluas);
        luas = (TextView)findViewById(R.id.luas);

        hitungluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!panjang.getText().toString().equals("") && (!lebar.getText().toString().equals(""))){

                    double number1 = Double.parseDouble(panjang.getText().toString());
                    double number2 = Double.parseDouble(lebar.getText().toString());

                    double hasil = number1 * number2;
                    luas.setText("Luas: "+String.valueOf(hasil));

                }else{
                    luas.setText("Please input number");
                }
            }
        });
    }
}

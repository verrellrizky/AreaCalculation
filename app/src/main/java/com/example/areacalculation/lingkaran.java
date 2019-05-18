package com.example.areacalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lingkaran extends AppCompatActivity {

    private EditText inputradius;
    private Button hitungluas;
    private TextView luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        inputradius = (EditText)findViewById(R.id.inputradius);
        hitungluas = (Button) findViewById(R.id.hitungluas);
        luas = (TextView) findViewById(R.id.luas);

            hitungluas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (!inputradius.getText().toString().equals("")) {
                        int number1 = Integer.parseInt(inputradius.getText().toString());

                        int hasil = (int) (3.14 * number1 *  number1);
                        luas.setText("Luas: " + String.valueOf(hasil));

                    } else {
                        luas.setText("Please input number");
                    }
                }
            });

    }
}

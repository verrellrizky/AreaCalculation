package com.example.areacalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class layanglayang extends AppCompatActivity {

    private EditText d1;
    private EditText d2;
    private Button hitungluas;
    private TextView luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layanglayang);

        d1 = (EditText)findViewById(R.id.d1);
        d2 = (EditText)findViewById(R.id.d2);
        hitungluas = (Button)findViewById(R.id.hitungluas);
        luas = (TextView)findViewById(R.id.luas);

        hitungluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!d1.getText().toString().equals("") && (!d2.getText().toString().equals(""))) {

                    double number1 = Double.parseDouble(d1.getText().toString());
                    double number2 = Double.parseDouble(d2.getText().toString());

                    double hasil = number1 *  number2 * 1/2;
                    luas.setText("Luas: " + String.valueOf(hasil));

                } else {
                    luas.setText("Please input number");
                }

            }
        });
    }
}

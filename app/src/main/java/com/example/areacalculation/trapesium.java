package com.example.areacalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class trapesium extends AppCompatActivity {

    private EditText sisi1;
    private EditText sisi2;
    private EditText tinggi;
    private Button hitungluas;
    private TextView luas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);

        sisi1 = (EditText)findViewById(R.id.sisi1);
        sisi2 = (EditText)findViewById(R.id.sisi2);
        tinggi = (EditText)findViewById(R.id.tinggi);
        hitungluas = (Button)findViewById(R.id.hitungluas);
        luas = (TextView)findViewById(R.id.luas);

        hitungluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!sisi1.getText().toString().equals("")
                        && (!sisi2.getText().toString().equals("")
                        && (!tinggi.getText().toString().equals(""))))
                {

                    float number1 = Float.parseFloat(sisi1.getText().toString());
                    float number2 = Float.parseFloat(sisi2.getText().toString());
                    float number3 = Float.parseFloat(tinggi.getText().toString());

                    int tambahsisi = (int) (number1 + number2);
                    float hasil =tambahsisi * number3 * 1/2;

                    luas.setText("Luas: "+String.valueOf(hasil));

                }else {
                    luas.setText("Please input number");
                }
        }

});
    }
}


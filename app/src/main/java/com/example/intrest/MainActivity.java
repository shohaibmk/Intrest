package com.example.intrest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3;
    TextView t1,t2,t3,t4,t5;
    Button button;
    String principle,rate,time;
    double p,r,t;
    double ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
        e3=findViewById(R.id.editText3);

        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView2);
        t3=findViewById(R.id.textView3);
        t4=findViewById(R.id.textView4);
        t5=findViewById(R.id.textView5);

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                principle=e1.getText().toString().trim();
                rate=e2.getText().toString().trim();
                time=e3.getText().toString().trim();

                p= Double.parseDouble(principle);
                r= Double.parseDouble(rate);
                t= Double.parseDouble(time);

                ans=(p*r*t)/100;
                rate= String.valueOf(ans);
                if(ans<0)
                {
                    rate="  -  ";
                }
                t5.setText(rate);

            }
        });
    }
}

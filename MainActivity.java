package com.example.nock.calv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private EditText text1;
    private EditText text2;
    private Button btnOk;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.editText);
        text2 = findViewById(R.id.editText2);
        btnOk = findViewById(R.id.button);
        result = findViewById(R.id.textView);


        btnOk.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v){
            switch (v.getId()) {
                case R.id.button:
                    double x = Double.valueOf(text1.getText().toString());
                    double y = Double.valueOf(text2.getText().toString());
                    result.setText(String.valueOf(sum.Sum(x, y)));
                    break;
            }

    }
});
    }
}
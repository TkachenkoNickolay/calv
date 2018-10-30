package com.example.nock.calv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class activity_convert extends AppCompatActivity implements AdapterView.OnItemSelectedListener,View.OnClickListener {
    private EditText ed1;
    private EditText ed2;
    private Spinner spin1;
    private Spinner spin2;
    private Button btnConv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);
        ed1 = findViewById(R.id.editText2);
        ed1.setOnClickListener(this);
        ed2 = findViewById(R.id.editText3);
        ed1.setOnClickListener(this);
        spin1 = findViewById(R.id.spinner);
        spin1.setOnClickListener(this);
        spin2 = findViewById(R.id.spinner2);
        spin2.setOnClickListener(this);
        btnConv = findViewById(R.id.button18);
        btnConv.setOnClickListener(this);

    }

}

package com.example.nock.calv;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText text1;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnDod;
    private Button btnVid;
    private Button btnMnog;
    private Button btnDil;
    private Button btnRav;
    private Button btnC;
    private Button btnP;
    private double  currNum;
    private int  currActiv;
    private int Point;
    private int Res;
    private TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.editText);
        btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.button5);
        btn5.setOnClickListener(this);
        btn6 = findViewById(R.id.button6);
        btn6.setOnClickListener(this);
        btn7 = findViewById(R.id.button7);
        btn7.setOnClickListener(this);
        btn8 = findViewById(R.id.button8);
        btn8.setOnClickListener(this);
        btn9 = findViewById(R.id.button9);
        btn9.setOnClickListener(this);
        btn0 = findViewById(R.id.button10);
        btn0.setOnClickListener(this);
        btnDod = findViewById(R.id.button11);
        btnDod.setOnClickListener(this);
        btnVid = findViewById(R.id.button12);
        btnVid.setOnClickListener(this);
        btnMnog = findViewById(R.id.button13);
        btnMnog.setOnClickListener(this);
        btnDil = findViewById(R.id.button14);
        btnDil.setOnClickListener(this);
        btnRav = findViewById(R.id.button15);
        btnRav.setOnClickListener(this);
        btnC = findViewById(R.id.button16);
        btnC.setOnClickListener(this);
        btnP = findViewById(R.id.button17);
        btnP.setOnClickListener(this);
        txt1=findViewById(R.id.textView);
        txt1.setOnClickListener(this);



    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        try {
            switch (v.getId()) {
                case (R.id.button1):
                    if(Res==1) {
                        text1.setText("" + "1");
                        Res=0;
                    }
                    else
                    {
                        text1.setText(text1.getText() + "1");
                    }
                break;
                case (R.id.button2):
                    if(Res==1) {
                        text1.setText("" + "2");
                        Res=0;
                    }
                    else
                    {
                        text1.setText(text1.getText() + "2");
                    }
                    break;
                case (R.id.button3):
                    if(Res==1) {
                        text1.setText("" + "3");
                        Res=0;
                    }
                    else
                    {
                        text1.setText(text1.getText() + "3");
                    }
                    break;
                case (R.id.button4):
                    if(Res==1) {
                        text1.setText("" + "4");
                        Res=0;
                    }
                    else
                    {
                        text1.setText(text1.getText() + "4");
                    }
                    break;
                case (R.id.button5):
                    if(Res==1) {
                        text1.setText("" + "5");
                        Res=0;
                    }
                    else
                    {
                        text1.setText(text1.getText() + "5");
                    }
                    break;
                case (R.id.button6):
                    if(Res==1) {
                        text1.setText("" + "6");
                        Res=0;
                    }
                    else
                    {
                        text1.setText(text1.getText() + "6");
                    }
                    break;
                case (R.id.button7):
                    if(Res==1) {
                        text1.setText("" + "7");
                        Res=0;
                    }
                    else
                    {
                        text1.setText(text1.getText() + "7");
                    }
                    break;
                case (R.id.button8):
                     if(Res==1) {
                    text1.setText("" + "8");
                    Res=0;
                }
                else
                {
                    text1.setText(text1.getText() + "8");
                }
                    break;
                case (R.id.button9):
                    if(Res==1) {
                        text1.setText("" + "9");
                        Res=0;
                    }
                    else
                    {
                        text1.setText(text1.getText() + "9");
                    }
                    break;
                case (R.id.button10):
                    if(Res==1) {
                        text1.setText("" + "0");
                        Res=0;
                    }
                    else
                    {
                        text1.setText(text1.getText() + "0");
                    }
                    break;
                case(R.id.button11):
                    currNum=Double.valueOf(text1.getText().toString());
                    text1.setText("");
                    currActiv = 1;
                case(R.id.button12):
                    currNum=Double.valueOf(text1.getText().toString());
                    text1.setText("");
                    currActiv = 2;
                case(R.id.button13):
                    currNum=Double.valueOf(text1.getText().toString());
                    text1.setText("");
                    currActiv = 3;
                case(R.id.button14):
                    currNum=Double.valueOf(text1.getText().toString());
                    text1.setText("");
                    currActiv = 4;
                    break;
                case(R.id.button16):
                    text1.setText("");
                    break;
                case(R.id.button17):
                    if(Point == 0 && Res!=1)
                   {
                        Res++;
                       text1.setText(text1.getText()+".");
                break;
                   }
                case(R.id.button15):
                    Res=1;
                    double temp = Double.valueOf(text1.getText().toString());
                    switch(currActiv)
                    {
                        case 1:
                            text1.setText(String.valueOf(Sum.sum(currNum,temp)));
                            currNum=0;
                            currActiv=0;
                            break;
                        case 2:
                            text1.setText(String.valueOf(Sum.vid(currNum,temp)));
                            currNum=0;
                            currActiv=0;
                            break;
                        case 3:
                            text1.setText(String.valueOf(Sum.mNog(currNum,temp)));
                            currNum=0;
                            currActiv=0;
                            break;
                        case 4:
                            text1.setText(String.valueOf(Sum.dil(currNum,temp)));
                            currNum=0;
                            currActiv=0;
                            break;
                    }
            }
        }
        catch (Exception e)
        {
            Toast.makeText(this, e.toString(),Toast.LENGTH_LONG).show();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        TextView infoTextView = (TextView) findViewById(R.id.textView);
        switch (id) {
            case R.id.Atr1:

                infoTextView.setText("Конвертер");
                Intent intent = new Intent(MainActivity.this, activity_convert.class);
                startActivity(intent);
                return true;
            case R.id.Atr2:
                infoTextView.setText("Выход");

                return true;

        }
        return super.onOptionsItemSelected(item);
    }

}

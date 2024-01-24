package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class
MainActivity extends AppCompatActivity {
    private TextView tv;
    private Button btn;
    int count =0;
    private ImageView iv;
    private ImageButton ib;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textview1);
        tv.setTextSize(30);
        tv.setTextColor(Color.DKGRAY);
        tv.setText("0");
        btn = findViewById(R.id.button);
        iv=findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.img);
        ib=findViewById(R.id.imageButton4);
        ib.setImageResource(R.drawable.img_4);
        et1=(EditText) findViewById(R.id.editTextText);
        String st=et1.getText().toString();



    }

    public void countAdd(View view) {
        count++;
        tv.setText(""+count);
    }

    public void clr(View view)
    {
    }
}
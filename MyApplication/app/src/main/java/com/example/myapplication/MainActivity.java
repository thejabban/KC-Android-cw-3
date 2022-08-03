package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textview =findViewById(R.id.calculator);
        TextView textView1=findViewById(R.id.total);
        EditText edittext=findViewById(R.id.name);
        EditText edittext1=findViewById(R.id.second);
        Button button= findViewById(R.id.button);
    }
}
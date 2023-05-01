package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InsertRec extends AppCompatActivity {
    EditText e1 = findViewById(R.id.myEditText);
    EditText e2 = findViewById(R.id.myEditText2);
    EditText e3 = findViewById(R.id.myEditText3);
    //DB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_rec);
    }

    /*
    public void rec (View view) {
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        String s3 = e3.getText().toString();
        //db.save(s1,s2,s3);

    }
    */
}
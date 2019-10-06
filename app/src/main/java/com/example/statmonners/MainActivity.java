package com.example.statmonners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    protected static final String extram = "com.example.statmonners.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navResults (View view){
        EditText et = findViewById(R.id.searchInput);
        String summName = et.getText().toString();
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra(extram, summName);
        startActivity(i);
    }
}

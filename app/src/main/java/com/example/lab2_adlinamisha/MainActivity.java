package com.example.lab2_adlinamisha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button openActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openActivity = (Button) findViewById(R.id.button);
    }

    public void openActivity2(View view){
        Intent intent = new Intent (this, MainActivity2.class);
        startActivity(intent);
    }

}
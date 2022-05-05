package com.example.myfitnesstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Log Activity button */
    public void goToActivityPage(View view) {
        Intent intent = new Intent(this, ActivitiesPageActivity.class);
        startActivity(intent);

    }


}
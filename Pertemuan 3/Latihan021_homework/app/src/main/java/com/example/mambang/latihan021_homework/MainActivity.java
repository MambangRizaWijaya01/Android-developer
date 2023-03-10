package com.example.mambang.latihan021_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "com.example.mambang.latihan021_homework.extra.MESSAGE";
    private int mcount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }

    public void LaunchSayHello(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String message = mShowCount.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void ShowCount(View view) {
        mcount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mcount));
        }
    }
}
package com.example.mambang.latihan021_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mambang.latihan021_1.R;


public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_REPLAY =
            "com.example.mambang.latihan021_1.extra.REPLY";
    private EditText mReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mReply = findViewById(R.id.editText_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message_reply);
        textView.setText(message);
    }

    public void ReturnReply(View view) {
        String reply = mReply.getText().toString();
        Intent replyintent = new Intent();
        replyintent.putExtra(EXTRA_REPLAY, reply);
        setResult(RESULT_OK,replyintent);
        finish();
    }
}
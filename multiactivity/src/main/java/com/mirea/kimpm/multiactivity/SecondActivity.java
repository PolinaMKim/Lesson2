package com.mirea.kimpm.multiactivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String text = (String) getIntent().getSerializableExtra("key");
        TextView textView = findViewById(R.id.textView1);
        textView.setText(text);

    }

    @Override
    protected void onStart(){
        super.onStart();
    };

    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState){
        super.onRestoreInstanceState(saveInstanceState);
    };

    @Override
    protected void onRestart(){
        super.onRestart();
    };

    @Override
    protected void onResume(){
        super.onResume();
    };

    @Override
    protected void onPause(){
        super.onPause();
    };

    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super.onSaveInstanceState(saveInstanceState);
    };

    @Override
    protected void onStop(){
        super.onStop();
    };

    @Override
    protected void onDestroy(){
        super.onDestroy();
    };
}
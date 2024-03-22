package com.mirea.kimpm.toastapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        int length = editText.getText().length();
        Toast toast =Toast.makeText(getApplicationContext(),
                "Студент №12, группа БСБО-10-21, символов " + Integer.toString(length),
                Toast.LENGTH_SHORT);
        toast.show();
    }


}
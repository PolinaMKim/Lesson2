package com.mirea.kimpm.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        AlertDialogFragment dialogFragment = new AlertDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Ползу дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Умер\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Сижу туплю\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onClickShowDialogTime(View view) {
        MyTimeDialogFragment timeDialogFragment = new MyTimeDialogFragment();
        timeDialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void OnTimeSetListener(String selectedTime){
        Toast.makeText(this, "Вы выбрали время: " + selectedTime, Toast.LENGTH_SHORT).show();
    }

    public void onClickShowDialogDate(View view) {
        MyDateDialogFragment dateDialogFragment = new MyDateDialogFragment();
        dateDialogFragment.show(getSupportFragmentManager(), "mirea");
    }
    public void onDateSelected(String selectedDate) {
        Toast.makeText(this, "Вы выбрали дату: " + selectedDate, Toast.LENGTH_SHORT).show();
    }
    public void onClickShowDialogProgress(View view) {
        MyProgressDialogFragment progressDialogFragment = new MyProgressDialogFragment();
        progressDialogFragment.show(getSupportFragmentManager(), "mirea");
    }
}
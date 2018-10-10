package com.example.tran_ly.listview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityWelcome extends AppCompatActivity {
    private TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tvWelcome = this.findViewById(R.id.tvWelcome);
        Bundle extrasData = getIntent().getExtras();
        String value = extrasData.getString("NAME", "you");
        value= "Welcome, "+ value+"!";
        tvWelcome.setText(value);
    }
}

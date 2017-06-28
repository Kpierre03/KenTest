package com.example.ken.kendemo17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ken.kendemo17.R;

public class ResultActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("Data", "data");
        setResult(RESULT_OK, intent);
        //setResult(200, new Intent().putExtra("Data","data"));
        super.onBackPressed();
    }
}

MAINACTIVITY.JAVA
package com.example.myrento1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button explore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exp=(Button)findViewById(R.id.button13);
        exp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==exp)
        {
           Intent i=new Intent(this,signuporlogin.class);
            startActivity(i);
        }

    }
}

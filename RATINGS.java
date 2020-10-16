RATINGS.JAVA

package com.example.myrento1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Ratings extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
RadioGroup rg;
RadioButton rawful,rpoor,raverage,rgood,rgreat;
    AlertDialog ad=null;
    AlertDialog.Builder adb=null;
    Button blogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratings);
        rg=(RadioGroup)findViewById(R.id.radio);
        rawful=(RadioButton)findViewById(R.id.awful);
        rpoor=(RadioButton)findViewById(R.id.poor);
        raverage=(RadioButton)findViewById(R.id.average);
        rgood=(RadioButton)findViewById(R.id.good);
        rgreat=(RadioButton)findViewById(R.id.great);
        blogout=(Button)findViewById(R.id.buttonlogout);
        rg.setOnCheckedChangeListener(this);
        blogout.setOnClickListener(this);
        blogout.setBackgroundColor(Color.RED);
        blogout.setTextColor(Color.YELLOW);
        blogout.setVisibility(View.INVISIBLE);

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if(i==R.id.awful)
        {
            Toast.makeText(this,"We're Sorry...\nWill Try To Improve",Toast.LENGTH_SHORT).show();
        }
        else if(i==R.id.poor)
        {
            Toast.makeText(this,"We're Sorry...\nWill Try To Improve",Toast.LENGTH_SHORT).show();
        }
        else if(i==R.id.average)
        {
            Toast.makeText(this,"Thank You...\nHope It Helped You",Toast.LENGTH_SHORT).show();
        }
        else if(i==R.id.good)
        {
            Toast.makeText(this,"Thank You...\nHope It Helped You",Toast.LENGTH_SHORT).show();
        }
        else if(i==R.id.great)
        {
            Toast.makeText(this,"Thank You...\nHope It Helped You",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m=getMenuInflater();
        m.inflate(R.menu.menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent i5;

        switch (item.getItemId()) {
            case R.id.flats:
                i5=new Intent(this,Main2Activity.class);
                startActivity(i5);
                return true;
            case R.id.pgs:
                i5=new Intent(this,PGs.class);
                startActivity(i5);
                return true;
            case R.id.logout:
                adb=new AlertDialog.Builder(this);
                adb.setCancelable(false);

                adb.setMessage("Are you sure to logout?");
                adb.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        blogout.setVisibility(View.VISIBLE);
                    }
                });
                adb.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                ad=adb.create();
                ad.show();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public void onClick(View view) {
        if(view==blogout)
        {
           Intent i4=new Intent(this,signuporlogin.class);
            startActivity(i4);
        }
    }
}

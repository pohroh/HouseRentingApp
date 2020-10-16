PG.JAVA

package com.example.myrento1;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class PGs extends AppCompatActivity implements View.OnClickListener {
    AlertDialog ad=null;
    Button blogout;
    Button bdelhi,bhyderabad,bkolkata,bpune;
    AlertDialog.Builder adb=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pgs);
        bdelhi=(Button)findViewById(R.id.button12);
        bdelhi.setOnClickListener(this);
        bhyderabad=(Button)findViewById(R.id.button10);
        bhyderabad.setOnClickListener(this);
        bpune=(Button)findViewById(R.id.button11);
        bpune.setOnClickListener(this);
        bkolkata=(Button)findViewById(R.id.button9);
        bkolkata.setOnClickListener(this);
        blogout=(Button)findViewById(R.id.buttonlogout);
        blogout.setOnClickListener(this);
        blogout.setBackgroundColor(Color.RED);
        blogout.setTextColor(Color.YELLOW);
        blogout.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View view) {
        if(view==blogout)
        {
            Intent i4=new Intent(this,signuporlogin.class);
            startActivity(i4);
        }
        Intent i=new Intent(this,ResultPG.class);
        if(view==bdelhi)
        {
            i.putExtra("","DELHI");
            startActivity(i);
        }
        if(view==bhyderabad)
        {
            i.putExtra("","HYDERABAD");
            startActivity(i);
        }
        if(view==bkolkata)
        {
            i.putExtra("","KOLKATA");
            startActivity(i);
        }
        if(view==bpune)
        {
            i.putExtra("","PUNE");
            startActivity(i);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m=getMenuInflater();
        m.inflate(R.menu.menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        Intent i;

        switch (item.getItemId()) {
            case R.id.flats:
               i=new Intent(this,Main2Activity.class);
                startActivity(i);
                return true;
           // case R.id.pgs:
              //  i=new Intent(this,PGs.class);
                //startActivity(i);
                //return true;
            case R.id.logout:
                adb=new AlertDialog.Builder(this);
                adb.setCancelable(false);
                adb.setMessage("Are you sure to logout?");
                adb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        blogout.setVisibility(View.VISIBLE);
                    }
                });
                adb.setNegativeButton("No", new DialogInterface.OnClickListener() {
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
}

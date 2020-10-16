MENUCREATED.JAVA
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

public class menucreated extends AppCompatActivity implements View.OnClickListener {
AlertDialog ad=null;
AlertDialog.Builder adb=null;
Button b7,b8,blogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menucreated);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        blogout=(Button)findViewById(R.id.button5);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        blogout.setOnClickListener(this);
        blogout.setBackgroundColor(Color.RED);
        blogout.setTextColor(Color.YELLOW);
        blogout.setVisibility(View.INVISIBLE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m=getMenuInflater();
        m.inflate(R.menu.menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
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
   // private void Logout()
   // {
       // Intent i5=new Intent(this,signuporlogin.class);
     //   startActivity(i5);
   // }
    @Override
    public void onClick(View view) {
        Intent i4;
        if(view==b7) {
            i4=new Intent(this,PGs.class);
            startActivity(i4);
        }
        else if(view==b8)
        {
            i4=new Intent(this,Main2Activity.class);
            startActivity(i4);
        }
        if(view==blogout)
        {
            i4=new Intent(this,signuporlogin.class);
            startActivity(i4);
        }
    }
}

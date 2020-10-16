SIGNUPANDLOGIN.JAVA
package com.example.myrento1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class signuporlogin  {
    EditText e1,e2,e3,e4,e5;
    Spinner s1,s2;
    Button b1,b2,b3,b4,bShow;
    TextView t2,t3;
    DatabaseHandler db = new DatabaseHandler(this);
    Context myContext;

    AlertDialog ad=null;
    AlertDialog.Builder adb=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuporlogin);
        t2=(TextView)findViewById(R.id.textView);
        t3=(TextView)findViewById(R.id.textView2);
        s1=(Spinner)findViewById(R.id.spinner);
        s2=(Spinner)findViewById(R.id.spinner1);
        b1=(Button) findViewById(R.id.button);
        bShow=(Button) findViewById(R.id.button6);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        e1=(EditText) findViewById(R.id.editText);
        e4=(EditText) findViewById(R.id.editText4);
        e5=(EditText) findViewById(R.id.editText5);
        e2=(EditText) findViewById(R.id.editText2);
        e3=(EditText) findViewById(R.id.editText3);
        b2.setOnClickListener(this);
        b1.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        bShow.setOnClickListener(this);

        b3.setVisibility(View.INVISIBLE);
        b4.setVisibility(View.INVISIBLE);
        e1.setVisibility(View.INVISIBLE);
        e2.setVisibility(View.INVISIBLE);
        e3.setVisibility(View.INVISIBLE);
        e4.setVisibility(View.INVISIBLE);
        e5.setVisibility(View.INVISIBLE);
        t3.setVisibility(View.INVISIBLE);
        s1.setVisibility(View.INVISIBLE);
        e1.setTextColor(Color.WHITE);
        e2.setTextColor(Color.WHITE);
        e3.setTextColor(Color.WHITE);
        e4.setTextColor(Color.WHITE);
        e5.setTextColor(Color.WHITE);
        b3.setBackgroundColor(Color.BLUE);
        b3.setTextColor(Color.WHITE);
        b4.setBackgroundColor(Color.BLUE);
        b4.setTextColor(Color.WHITE);
        //String[] s={"Male","Female","Other"};
        //ArrayAdapter a=new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,s);
        // s1.setAdapter(a);
        // s1.setOnItemClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==b1)
        {   b1.setBackgroundColor(Color.YELLOW);
            b2.setBackgroundColor(Color.GRAY);
            e1.setVisibility(View.VISIBLE);
            e2.setVisibility(View.VISIBLE);
            e3.setVisibility(View.VISIBLE);
            e4.setVisibility(View.VISIBLE);
            e5.setVisibility(View.VISIBLE);
            b3.setVisibility(View.VISIBLE);
            t3.setVisibility(View.VISIBLE);
            s1.setVisibility(View.VISIBLE);
            b4.setVisibility(View.INVISIBLE);

        }
        else if(view==b2)
        {   b2.setBackgroundColor(Color.YELLOW);
            b1.setBackgroundColor(Color.GRAY);
            e1.setVisibility(View.VISIBLE);
            e3.setVisibility(View.VISIBLE);
            e2.setVisibility(View.INVISIBLE);
            e4.setVisibility(View.INVISIBLE);
            e5.setVisibility(View.INVISIBLE);
            b4.setVisibility(View.VISIBLE);
            b3.setVisibility(View.INVISIBLE);
            t2.setVisibility(View.INVISIBLE);
            t3.setVisibility(View.INVISIBLE);
            s1.setVisibility(View.INVISIBLE);

        }
        if(view==b4) {
            t2.setVisibility(View.VISIBLE);
            if((e1.getText().toString().isEmpty())||(e3.getText().toString().isEmpty()))
            {   t2.setTextColor(Color.RED);
                t2.setText("EMPTY!...FILL EVERYTHING");
            }
            else
            {  t2.setVisibility(View.INVISIBLE);
                String username=e1.getText().toString();
                String password=e3.getText().toString();
                    AllowAccessToAccount(username,password);
            }
            }





            if(view==b3) {
            if (e1.getText().toString().isEmpty()||e5.getText().toString().isEmpty()||e4.getText().toString().isEmpty()||e3.getText().toString().isEmpty() || e2.getText().toString().isEmpty()) {
                t2.setTextColor(Color.RED);
                t2.setText("EMPTY!...FILL EVERYTHING");
            } else {
                Log.d("Insert: ", "Inserting ..");
                t2.setVisibility(View.INVISIBLE);
                db.addUser(new Userclass(e1.getText().toString(), e2.getText().toString(),e3.getText().toString(),e4.getText().toString(),e5.getText().toString()));
               Intent i=new Intent(this,menucreated.class);
                startActivity(i);
            }
        }
        if(view==bShow) {
            Log.d("Reading: ", "Reading all contacts..");
            int size = db.getUsersCount();
            String[] mylist = new String[size];
            int i = 0;
            List<Userclass> users = db.getAllUsers();
            for (Userclass us : users) {
                String show1 = String.valueOf(us.getID());
                String log = "Id: " + us.getID() + " ,Name: " + us.getUserName() + ",Email: " + us.getEmail() + ",Password: " + us.getPassword() + ",Age: " + us.getAge() + " ,Phone: " + us.getPhoneNumber();
                // Writing Contacts to log
                mylist[i] = log;
                i++;


                //char s1 = log.charAt(4);
                Log.d("Name: ", log);
                // Log.d("Name: ", String.valueOf(s1));
            }


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mylist);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            s2.setAdapter(adapter);

            s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                    myContext = view.getContext();
                    Toast myToast = new Toast(myContext);

                    // tv1.setText(((TextView)view).getText());
                    myToast.makeText(myContext, ((TextView) view).getText(), Toast.LENGTH_LONG).show();
                    //tv1.setText(((TextView)view).getText());

                    String s1 = ((TextView) view).getText().toString();
                    String s2 = ((TextView) view).getText().toString();
                    String s3 = ((TextView) view).getText().toString();
                    String id1 = s1.substring(4, 5);
                    Log.d("hello", s1);
                    Log.d("hi", s2);
                    Log.d("hii", s3);
                    Log.d("hello", id1);
                    Userclass c = db.getUser(Integer.parseInt(id1));
                    e1.setText(c.getUserName());
                    e2.setText(c.getEmail());
                    e3.setText(c.getPassword());
                    e4.setText(c.getAge());
                    e5.setText(c.getPhoneNumber());
                }

                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }
    }

    private void AllowAccessToAccount(String un, String pw) {
        db = new DatabaseHandler(this);
        if (db.checkUser(un, pw)) {
            adb = new AlertDialog.Builder(this);
            adb.setCancelable(true);
            adb.setMessage("you're are successfully logged in.");
            ad = adb.create();
            ad.show();
            Intent i = new Intent(this, menucreated.class);
            startActivity(i);
        } else {
            adb = new AlertDialog.Builder(this);
            adb.setCancelable(true);
            adb.setMessage("error!!!...signup or login again");
            ad = adb.create();
            ad.show();

        }
    }

}

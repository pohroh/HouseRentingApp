RESULT.JAVA

package com.example.myrento1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Result extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    Spinner sdelhi,skolkata,shyderabad,spune;
    ImageView ima;
    TextView tdetail,tcity,tphonenumber;
    Button bcontact,brate;
    int[] images={R.drawable.bhk1delhi,R.drawable.bhk2delhi,R.drawable.bhk3delhi,R.drawable.bhk33delhi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        sdelhi=(Spinner)findViewById(R.id.spinnerdelhi);
        skolkata=(Spinner)findViewById(R.id.spinnerkolkata);
        shyderabad=(Spinner)findViewById(R.id.spinnerhyderabad);
        spune=(Spinner)findViewById(R.id.spinnerpune);
        tdetail=(TextView)findViewById(R.id.textView);
        tphonenumber=(TextView)findViewById(R.id.phonenumber);
        tcity=(TextView)findViewById(R.id.textView4);
        ima=(ImageView)findViewById(R.id.imageView2);
        bcontact=(Button)findViewById(R.id.buttoncontact);
        brate=(Button)findViewById(R.id.buttonratings);
        sdelhi.setOnItemSelectedListener(this);
        skolkata.setOnItemSelectedListener(this);
        shyderabad.setOnItemSelectedListener(this);
        spune.setOnItemSelectedListener(this);
        bcontact.setOnClickListener(this);
        brate.setOnClickListener(this);
        sdelhi.setVisibility(View.INVISIBLE);
        skolkata.setVisibility(View.INVISIBLE);
        spune.setVisibility(View.INVISIBLE);
        shyderabad.setVisibility(View.INVISIBLE);
        tphonenumber.setTextColor(Color.BLUE);

    }

    @Override
    public void onClick(View view) {
        if(view==bcontact)
        {
            String phone_number=String.format("tel:%s",tphonenumber.getText().toString());
            Intent idial=new Intent();
            idial.setAction(Intent.ACTION_DIAL);
            idial.setData(Uri.parse(phone_number));
            startActivity(Intent.createChooser(idial,"choose app"));
        }
        if(view==brate)
        {
            Intent irate=new Intent(this,Ratings.class);
            startActivity(irate);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //ima.setImageResource(0);
       // ima.setImageDrawable(null);
        Intent i4=getIntent();

        tcity.setText(i4.getStringExtra(""));
       if(tcity.getText().toString().equalsIgnoreCase("Delhi")) {


           sdelhi.setVisibility(View.VISIBLE);
           skolkata.setVisibility(View.INVISIBLE);
           spune.setVisibility(View.INVISIBLE);
           shyderabad.setVisibility(View.INVISIBLE);

           String s1 = sdelhi.getSelectedItem().toString();
               if (s1.equals("1 BHK,Independent Floor,Pitampura,Delhi")) {
                   ima.setVisibility(View.VISIBLE);
                   tphonenumber.setText(":9654601774");
                   ima.setImageResource(images[0]);
                   tdetail.setText(" Pusa Wall st,Block 6,Patel Nagar,New Delhi,Delhi,110008,India\n" +
                           "        \n" +
                           "        Fully Furnished,400 sq.ft\n" +
                           "        \n" +
                           "        RS: 14000/month\n" +
                           "        ---------------------------------------------------------------\n" +
                           "        OVERVIEW->\n" +
                           "        \n" +
                           "        Built up Area                        Available From\n" +
                           "        400 sq. ft                              2018-04-28\n" +
                           "        \n" +
                           "        Floor No.                             Furnishing\n" +
                           "        1 of 4                               Fully Furnished\n" +
                           "       "
                   );


               } else if (s1.equals("2 BHK,Independent Floor,Patel Nagar West")) {
                   ima.setImageResource(images[1]);
                   tphonenumber.setText(":9946784658");
                   tdetail.setText(" J Block ODS Lajpat Nagar-4,opp. vinobha puri Metro Sation and Near Amarcolony,India\n" +
                           "        \n" +
                           "        Semi Furnished,800 sq.ft\n" +
                           "        \n" +
                           "        RS: 15000/month\n" +
                           "        ---------------------------------------------------------------\n" +
                           "        OVERVIEW->\n" +
                           "        \n" +
                           "        Built up Area                        Available From\n" +
                           "        800 sq. ft                              2019-10-05\n" +
                           "        \n" +
                           "        Bathrooms                            Tenant Type\n" +
                           "           1                                 Family/Bachelor\n" +
                           "        \n" +
                           "        Floor No.                             Furnishing\n" +
                           "        3 of 4                               semi Furnished\n" +
                           "       "
                   );
               } else if (s1.equals("3 BHK,Independent Floor,Lajpat Nagar,National Park")) {
                   ima.setVisibility(View.VISIBLE);
                   ima.setImageResource(images[2]);
                   tphonenumber.setText(":9876884645");
                   tdetail.setText(" Patel Nagar\n" +
                           "        \n" +
                           "        Fully Furnished,700 sq.ft\n" +
                           "        \n" +
                           "        RS: 14000/month\n" +
                           "        ---------------------------------------------------------------\n" +
                           "        OVERVIEW->\n" +
                           "        \n" +
                           "        Built up Area                        Available From\n" +
                           "        700 sq. ft                              2018-09-30\n" +
                           "        \n" +
                           "        Bathrooms                            Tenant Type\n" +
                           "           2                                Family/Bachelor\n" +
                           "        \n" +
                           "        Floor No.                             Furnishing\n" +
                           "        1 of 4                               Fully Furnished\n" +
                           "       "
                   );
               } else if (s1.equals("3 BHK,Independent Floor,Paschim Vihar,Peeragarhi Village")) {
                   ima.setVisibility(View.VISIBLE);
                   ima.setImageResource(images[3]);
                   tphonenumber.setText(":9484755637");
                   tdetail.setText(" Paschim Enclave\n" +
                           "        \n" +
                           "        Unfurnished,1200 sq.ft\n" +
                           "        \n" +
                           "        RS: 28000/month\n" +
                           "        ---------------------------------------------------------------\n" +
                           "        OVERVIEW->\n" +
                           "        \n" +
                           "        Built up Area                        Available From\n" +
                           "        1200 sq. ft                              2018-10-19\n" +
                           "        \n" +
                           "        Bathrooms                            Tenant Type\n" +
                           "           2                              Family/Bachelor/Company\n" +
                           "        \n" +
                           "        Floor No.                             Furnishing\n" +
                           "        2 of 4                                Unfurnished\n" +
                           "       "
                   );
               }
           }
       else if(tcity.getText().toString().equalsIgnoreCase("kolkata")){
           sdelhi.setVisibility(View.INVISIBLE);
           skolkata.setVisibility(View.VISIBLE);
           spune.setVisibility(View.INVISIBLE);
           shyderabad.setVisibility(View.INVISIBLE);

           String s1 = adapterView.getItemAtPosition(i).toString();
               if (s1.equals("2 BHK Apartment,kestopur,Ghosh para")) {
                   ima.setVisibility(View.VISIBLE);
                   ima.setImageResource(images[0]);
                   tphonenumber.setText(":9828737346");
                   tdetail.setText("Kestopur JorKhana,Hanapara,rabindra Pally\n" +
                           "        \n" +
                           "        Unfurnished,715 sq.ft\n" +
                           "        \n" +
                           "        RS: 7200/month\n" +
                           "        ---------------------------------------------------------------\n" +
                           "        OVERVIEW->\n" +
                           "        \n" +
                           "        Built up Area                        Available From\n" +
                           "        715 sq. ft                              2018-11-29\n" +
                           "        \n" +
                           "         Tenant Type                      \n " +
                           "        Family/Bachelor                         \n" +
                           "        \n" +
                           "        Floor No.                             Furnishing\n" +
                           "        1 of 3                               unfurnished\n" +
                           "       "
                   );


               } else if (s1.equals("3 BHK Apartment,New Town,ActionArea I")) {
                   ima.setImageResource(images[1]);
                   tphonenumber.setText(":09189377733");
                   tdetail.setText(" Ce-63,Street No-202,New Town,Action Area I,Kolkata 700156\n" +
                           "        \n" +
                           "        Semi Furnished,1480 sq.ft\n" +
                           "        \n" +
                           "        RS: 20000/month\n"+
                           "        ---------------------------------------------------------------\n" +
                           "        OVERVIEW->\n" +
                           "        \n" +
                           "        Built up Area                        Available From\n" +
                           "        1480 sq. ft                              2019-10-27\n" +
                           "        \n" +
                           "                                  Tenant Type\n" +
                           "                                     Family\n" +
                           "        \n" +
                           "        Floor No.                             Furnishing\n" +
                           "        1 of 4                               semi Furnished\n" +
                           "       "
                   );
               } else if (s1.equals("2 BHK Apartment,Rajarghat,Action Area II")) {
                   ima.setVisibility(View.VISIBLE);
                   ima.setImageResource(images[2]);
                   tphonenumber.setText(":8738398377");
                   tdetail.setText(" Rajarghat City Centre II\n" +
                           "        \n" +
                           "        Fully Furnished,834 sq.ft\n" +
                           "        \n" +
                           "        RS: 20000/month\n" +
                           "        ---------------------------------------------------------------\n" +
                           "        OVERVIEW->\n" +
                           "        \n" +
                           "        Built up Area                        Available From\n" +
                           "        834 sq. ft                              2018-10-30\n" +
                           "        \n" +
                           "        Bathrooms                            Tenant Type\n" +
                           "           2                                Family/Bachelor\n" +
                           "        \n" +
                           "        Floor No.                             Furnishing\n" +
                           "        2 of 7                              Fully Furnished\n" +
                           "       "
                   );
               } else if (s1.equals("2 BHK Apartment,Garia,Mahamaya Tala")) {
                   ima.setVisibility(View.VISIBLE);
                   ima.setImageResource(images[3]);
                   tphonenumber.setText(":8878949875");
                   tdetail.setText(" Mahamaya Tala\n" +
                           "        \n" +
                           "        Unfurnished,1150 sq.ft\n" +
                           "        \n" +
                           "        RS: 13000/month\n" +
                           "        ---------------------------------------------------------------\n" +
                           "        OVERVIEW->\n" +
                           "        \n" +
                           "        Built up Area                        Available From\n" +
                           "        1150 sq. ft                              2019-10-9\n" +
                           "        \n" +
                           "        Floor No.                             Furnishing\n" +
                           "        1 of 5                                Unfurnished\n" +
                           "       "
                   );
               }
           }
       else if(tcity.getText().toString().equalsIgnoreCase("hyderabad")){
           sdelhi.setVisibility(View.INVISIBLE);
           skolkata.setVisibility(View.INVISIBLE);
           spune.setVisibility(View.INVISIBLE);
           shyderabad.setVisibility(View.VISIBLE);

           String s1 = adapterView.getItemAtPosition(i).toString();
           if (s1.equals("3 BHK Apartment,Kondapur,Whitefields")) {
               ima.setVisibility(View.VISIBLE);
               ima.setImageResource(images[0]);
               tphonenumber.setText(":7839849783");
               tdetail.setText(" White field,kondapur,Hyderabad\n" +
                       "        \n" +
                       "        Fully Furnished,3000 sq.ft\n" +
                       "        \n" +
                       "        RS: 70000/month\n" +
                       "        ---------------------------------------------------------------\n" +
                       "        OVERVIEW->\n" +
                       "        \n" +
                       "        Built up Area                        Available From\n" +
                       "        3000 sq. ft                              2019-08-21\n" +
                       "        \n" +
                       "        Tenant Type                              \n" +
                       "        Family/Company                           \n" +
                       "        \n" +
                       "        Floor No.                             Furnishing\n" +
                       "        3 of 5                             Fully Furnished\n" +
                       "       "
               );


           } else if (s1.equals("4 BHK Apartment,Banjara Hills Valley")) {
               ima.setImageResource(images[1]);
               tphonenumber.setText(":9829184647");
               tdetail.setText(" Banjara Hills\n" +
                       "        \n" +
                       "        Semi Furnished,800 sq.ft\n" +
                       "        \n" +
                       "        RS: 15000/month\n" +
                       "        ---------------------------------------------------------------\n" +
                       "        OVERVIEW->\n" +
                       "        \n" +
                       "        Built up Area                        Available From\n" +
                       "        800 sq. ft                              2019-10-05\n" +
                       "        \n" +
                       "        Bathrooms                            Tenant Type\n" +
                       "           1                                 Family/Bachelor\n" +
                       "        \n" +
                       "        Floor No.                             Furnishing\n" +
                       "        3 of 4                               semi Furnished\n" +
                       "       "
               );
           } else if (s1.equals("2 BHK Apartment,Madhapur,Mega Hills\n")) {
               ima.setVisibility(View.VISIBLE);
               ima.setImageResource(images[2]);
               tphonenumber.setText(":8923846375");
               tdetail.setText(" Madhapur,Hyderabad\n" +
                       "        \n" +
                       "        Fully Furnished,1500 sq.ft\n" +
                       "        \n" +
                       "        RS: 32000/month\n" +
                       "        ---------------------------------------------------------------\n" +
                       "        OVERVIEW->\n" +
                       "        \n" +
                       "        Built up Area                        Available From\n" +
                       "        1500 sq. ft                              2019-05-06\n" +
                       "        \n" +
                       "        Bathrooms                            Tenant Type\n" +
                       "           2                              Family/Bachelor/Company\n" +
                       "        \n" +
                       "        Floor No.                             Furnishing\n" +
                       "        3 of 5                               Fully Furnished\n" +
                       "       "
               );
           } else if (s1.equals("3 BHK Apartment,Gachibowli")) {
               ima.setVisibility(View.VISIBLE);
               ima.setImageResource(images[3]);
               tphonenumber.setText(":9328492656");
               tdetail.setText(" Flat No 601,Burgupalli Residency,gachibowli,Hyderabad,Telangana,India\n" +
                       "        \n" +
                       "        Fully Furnished,1300 sq.ft\n" +
                       "        \n" +
                       "        RS: 8000/month\n" +
                       "        ---------------------------------------------------------------\n" +
                       "        OVERVIEW->\n" +
                       "        \n" +
                       "        Built up Area                        Available From\n" +
                       "        1300 sq. ft                              2019-12-04\n" +
                       "        \n" +
                       "                             Tenant Type\n" +
                       "                              Bachelor\n" +
                       "        \n" +
                       "        Floor No.                             Furnishing\n" +
                       "        6 of 8                                Fully Furnished\n" +
                       "       "
               );
           }
       }
       else if(tcity.getText().toString().equalsIgnoreCase("pune")){
           sdelhi.setVisibility(View.INVISIBLE);
           skolkata.setVisibility(View.INVISIBLE);
           spune.setVisibility(View.VISIBLE);
           shyderabad.setVisibility(View.INVISIBLE);

           String s1 = adapterView.getItemAtPosition(i).toString();
           if (s1.equals("2 BHK Apartment,Shankar Kalate Nagar,Pune")) {
               ima.setVisibility(View.VISIBLE);
               ima.setImageResource(images[0]);
               tphonenumber.setText(":9397487656");
               tdetail.setText(" Shankar Kalate Nagar,near Mauli Chowk,datt Mandir Road,Wakad,Pune\n" +
                       "        \n" +
                       "        Unfurnished,700 sq.ft\n" +
                       "        \n" +
                       "        RS: 14980/month\n" +
                       "        ---------------------------------------------------------------\n" +
                       "        OVERVIEW->\n" +
                       "        \n" +
                       "        Built up Area                        Available From\n" +
                       "        700 sq. ft                              2019-04-26\n" +
                       "        \n" +
                       "        Bathrooms                            Tenant Type\n" +
                       "           2                                   Family\n" +
                       "        \n" +
                       "        Floor No.                             Furnishing\n" +
                       "        3 of 5                                Unfurnished\n" +
                       "       "
               );


           } else if (s1.equals("1 BHK Apartment,Hadapsar,Magarpatta City")) {
               ima.setImageResource(images[1]);
               tphonenumber.setText(":8327875874");
               tdetail.setText(" Anex Magarpatta City\n" +
                       "        \n" +
                       "        Fully Furnished,695 sq.ft\n" +
                       "        \n" +
                       "        RS: 26000/month\n" +
                       "        ---------------------------------------------------------------\n" +
                       "        OVERVIEW->\n" +
                       "        \n" +
                       "        Built up Area                        Available From\n" +
                       "        695 sq. ft                              2019-09-01\n" +
                       "        \n" +
                       "        Bathrooms                            Tenant Type\n" +
                       "           1                              Family/Bachelor/Company\n" +
                       "        \n" +
                       "        Floor No.                             Furnishing\n" +
                       "        6 of 12                               Fully Furnished\n" +
                       "       "
               );
           } else if (s1.equals("2 BHK Apartment,Kharadi,Rakshak Nagar")) {
               ima.setVisibility(View.VISIBLE);
               ima.setImageResource(images[2]);
               tphonenumber.setText(":5983665744");
               tdetail.setText(" Marvel Citrine,Kharadi,Pune\n" +
                       "        \n" +
                       "        Unfurnished,1255 sq.ft\n" +
                       "        \n" +
                       "        RS: 30000/month\n" +
                       "        ---------------------------------------------------------------\n" +
                       "        OVERVIEW->\n" +
                       "        \n" +
                       "        Built up Area                        Available From\n" +
                       "        1255 sq. ft                              2019-10-25\n" +
                       "        \n" +
                       "        Bathrooms                            Tenant Type\n" +
                       "           2                                   Family\n" +
                       "        \n" +
                       "        Floor No.                             Furnishing\n" +
                       "        1 of 12                               Unfurnished\n" +
                       "       "
               );
           } else if (s1.equals("1 BHK Apartment,Hinejewadi")) {
               ima.setVisibility(View.VISIBLE);
               ima.setImageResource(images[3]);
               tphonenumber.setText(":8497685866");
               tdetail.setText(" Archana Enterprise Life Republic\n" +
                       "        \n" +
                       "        Semi Furnished,750 sq.ft\n" +
                       "        \n" +
                       "        RS: 10000/month\n" +
                       "        ---------------------------------------------------------------\n" +
                       "        OVERVIEW->\n" +
                       "        \n" +
                       "        Built up Area                        Available From\n" +
                       "        750 sq. ft                              2019-11-01\n" +
                       "        \n" +
                       "        Bathrooms                            Tenant Type\n" +
                       "           2                              Family/Bachelor/Company\n" +
                       "        \n" +
                       "        Floor No.                             Furnishing\n" +
                       "        17 of 21                               Semi Furnished\n" +
                       "       "
               );
           }
       }
       }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

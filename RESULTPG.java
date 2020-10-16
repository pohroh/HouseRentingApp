RESULTPG.JAVA

package com.example.myrento1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class ResultPG extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    Spinner sdelhi,skolkata,shyderabad,spune;
    ImageView ima;
    TextView tdetail,tcity,tphonenumber;
    Button bcontact,brate;
    int[] images={R.drawable.bhk1delhi,R.drawable.bhk2delhi,R.drawable.bhk3delhi,R.drawable.bhk33delhi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_pg);
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
        Intent i4=getIntent();

        tcity.setText(i4.getStringExtra(""));
        if(tcity.getText().toString().equalsIgnoreCase("Delhi")) {


            sdelhi.setVisibility(View.VISIBLE);
            skolkata.setVisibility(View.INVISIBLE);
            spune.setVisibility(View.INVISIBLE);
            shyderabad.setVisibility(View.INVISIBLE);

            String s1 = sdelhi.getSelectedItem().toString();
            if (s1.equals("Girls/Women PG,AfloHomes,Lajpat Nagar III,New Delhi")) {
                ima.setVisibility(View.VISIBLE);
                tphonenumber.setText(":9654601774");
                ima.setImageResource(images[0]);
                tdetail.setText(" 20 Feroze Gandhi Road,Lajpat Nagar III,Lajapt Nagar,New Delhi," +
                        "         Metro station,Gate Number 5,Delhi,110024\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS: 1500/24000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "        South Indian Food                       North Indian food\n" +
                        "         Vegetarian                               CC cameras\n" +
                        "        \n" +
                        "        Room Facilities:1-Share AC,2-Share AC,3-Share AC\n" +
                        "        Toilets Attached,Hot Water,Wardrobe,Washing machine,Dhobi service on order," +
                        "        Bed sheets,Cots,TV in Common Area,Power back-up,Electricity,Self Cooking," +
                        "        Food on Order,Electricity Charges(approx)\n" +
                        "       "
                );


            } else if (s1.equals("Boys/Men PG,Guru Kripa Boys PG,Kamla Nagar")) {
                ima.setImageResource(images[1]);
                tphonenumber.setText(":9946784658");
                tdetail.setText(" 26 UB,1st Floor,Chattori Lane,Near Momo Point," +
                        "         Kamla Nagar,Jawahar Nagar,Delhi,Delhi,110007\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS:N/A/9000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "        South Indian Food                       North Indian food\n" +
                        "         Vegetarian                               Non Vegetarian\n" +
                        "        \n" +
                        "        Room Facilities:1-Share AC,2-Share AC,3-Share AC\n" +
                        "        Toilets Attached,Hot Water,Wardrobe,Washing machine,Dhobi service on order," +
                        "        Bed sheets,Cots,TV in Common Area,Power back-up,Electricity,Self Cooking," +
                        "        Food on Order,Electricity Charges(approx)\n" +
                        "       "
                );
            } else if (s1.equals("Girls PG,Sector 16,Rohini,India")) {
                ima.setVisibility(View.VISIBLE);
                ima.setImageResource(images[2]);
                tphonenumber.setText(":9876884645");
                tdetail.setText(" E-4/35,Sector 16,Rohini,Delhi,India" +
                        "         Dena bank,Delhi,110085\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS:N/A/9000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "          Newspaper                       Power Back-up\n" +
                        "         2 Wheeler Parking                Non Vegetarian\n" +
                        "        \n" +
                        "        Room Facilities:1-Share AC,2-Share AC,3-Share AC\n" +
                        "        Toilets Attached,Hot Water,Wardrobe,Washing machine," +
                        "        Cots,Electricity,Self Cooking," +
                        "        Food on Order,Electricity Charges(approx)\n" +
                        "       "
                );
            } else if (s1.equals("Girls/Women PG,Sanskriti PG,Delhi University,North Campus")) {
                ima.setVisibility(View.VISIBLE);
                ima.setImageResource(images[3]);
                tphonenumber.setText(":9484755637");
                tdetail.setText("Flat No:21,Block G,Lehna Singh Market,Maikaganj Chowk," +
                        "         Delhi University,North Cmapus,Delhi,110007\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS:N/A/14000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "        South Indian Food                       North Indian food\n" +
                        "         Vegetarian                               Non Vegetarian\n" +
                        "        \n" +
                        "        Room Facilities:1-Share AC,2-Share AC,3-Share AC\n" +
                        "        Toilets Attached,Hot Water,Wardrobe,Electricity,Self Cooking," +
                        "        Food Add-On Service,Electricity Charges(approx)\n" +
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
            if (s1.equals("Boys/Men PG,Sima Katarika boys PG,Patuapara,Bhowanipora")) {
                ima.setVisibility(View.VISIBLE);
                ima.setImageResource(images[0]);
                tphonenumber.setText(":9828737346");
                tdetail.setText(" 60/3,Kalighat Road,Jatin das Park,Patuapara,Bhowanipara," +
                        "         Kolkata,West Bengal.700026\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS:600/9000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "        South Indian Food                       North Indian food\n" +
                        "         Vegetarian                               Non Vegetarian\n" +
                        "        \n"+
                        "       "
                );


            } else if (s1.equals("Boys/Men PG,Dutta Boys PG,Machui Bazar")) {
                ima.setImageResource(images[1]);
                tphonenumber.setText(":09189377733");
                tdetail.setText("House-4 Biplabi House No.4,Pulin Pulin-Brigte Kalkatta brige STM,\n" +
                        "        Raja Bazar,Machui Bazar,Kolkata,West Bengal,7000009\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS:N/A/2000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "        Safety Lockers                         Toilets Attached\n" +
                        "         Laundary                               Security Guard\n" +
                        "        \n" +
                        "        Room Facilities:4-Share Non-AC,3-Share Non-AC\n" +
                        "        Wardrobe,Mattress,Security Deposit and Refund,Notice Period" +
                        "        Cots,Electricity Charges(approx)\n" +
                        "       "
                );
            } else if (s1.equals("Girls/Women PG,Jhunjhunwala Girls PG,Began,Joransko")) {
                ima.setVisibility(View.VISIBLE);
                ima.setImageResource(images[2]);
                tphonenumber.setText(":8738398377");
                tdetail.setText(" 13,Singhi began,Raja Singhi,Began,Joransko," +
                        "         Kolkata,West Bengal,700007\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS:N/A/5000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "            TV                                North Indian food\n" +
                        "         Vegetarian                               CC Cameras\n" +
                        "        \n" +
                        "        Room Facilities:\n" +
                        "        Toilets Attached,Electricity Charges(approx)\n" +
                        "       "
                );
            } else if (s1.equals("Girls/Women PG,Subha Shree Women PG,Raja Katra")) {
                ima.setVisibility(View.VISIBLE);
                ima.setImageResource(images[3]);
                tphonenumber.setText(":8878949875");
                tdetail.setText(" Girish Park,Opp Haryana Bhawan,Girish Park-7 H.No.136,Raja Katra,Jora Sanko," +
                        "        Raja Katra,Jora Sanko,Kolkata,West Bengal,700073\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS:N/A/9000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "        CC Cameras                                     TV\n" +
                        "         Vegetarian                                Refrigerator\n" +
                        "        \n" +
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
                tdetail.setText(" 26 UB,1st Floor,Chattori Lane,Near Momo Point," +
                        "         Kamla Nagar,Jawahar Nagar,Delhi,Delhi,110007\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS:N/A/9000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "        South Indian Food                       North Indian food\n" +
                        "         Vegetarian                               Non Vegetarian\n" +
                        "        \n" +
                        "        Room Facilities:1-Share AC,2-Share AC,3-Share AC\n" +
                        "        Toilets Attached,Hot Water,Wardrobe,Washing machine,Dhobi service on order," +
                        "        Bed sheets,Cots,TV in Common Area,Power back-up,Electricity,Self Cooking," +
                        "        Food on Order,Electricity Charges(approx)\n" +
                        "       "
                );


            } else if (s1.equals("4 BHK Apartment,Banjara Hills Valley")) {
                ima.setImageResource(images[1]);
                tphonenumber.setText(":9829184647");
                tdetail.setText(" 26 UB,1st Floor,Chattori Lane,Near Momo Point," +
                        "         Kamla Nagar,Jawahar Nagar,Delhi,Delhi,110007\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS:N/A/9000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "        South Indian Food                       North Indian food\n" +
                        "         Vegetarian                               Non Vegetarian\n" +
                        "        \n" +
                        "        Room Facilities:1-Share AC,2-Share AC,3-Share AC\n" +
                        "        Toilets Attached,Hot Water,Wardrobe,Washing machine,Dhobi service on order," +
                        "        Bed sheets,Cots,TV in Common Area,Power back-up,Electricity,Self Cooking," +
                        "        Food on Order,Electricity Charges(approx)\n" +
                        "       "
                );
            } else if (s1.equals("2 BHK Apartment,Madhapur,Mega Hills\n")) {
                ima.setVisibility(View.VISIBLE);
                ima.setImageResource(images[2]);
                tphonenumber.setText(":8923846375");
                tdetail.setText(" 26 UB,1st Floor,Chattori Lane,Near Momo Point," +
                        "         Kamla Nagar,Jawahar Nagar,Delhi,Delhi,110007\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS:N/A/9000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "        South Indian Food                       North Indian food\n" +
                        "         Vegetarian                               Non Vegetarian\n" +
                        "        \n" +
                        "        Room Facilities:1-Share AC,2-Share AC,3-Share AC\n" +
                        "        Toilets Attached,Hot Water,Wardrobe,Washing machine,Dhobi service on order," +
                        "        Bed sheets,Cots,TV in Common Area,Power back-up,Electricity,Self Cooking," +
                        "        Food on Order,Electricity Charges(approx)\n" +
                        "       "
                );
            } else if (s1.equals("3 BHK Apartment,Gachibowli")) {
                ima.setVisibility(View.VISIBLE);
                ima.setImageResource(images[3]);
                tphonenumber.setText(":9328492656");
                tdetail.setText(" 26 UB,1st Floor,Chattori Lane,Near Momo Point," +
                        "         Kamla Nagar,Jawahar Nagar,Delhi,Delhi,110007\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS:N/A/9000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "        South Indian Food                       North Indian food\n" +
                        "         Vegetarian                               Non Vegetarian\n" +
                        "        \n" +
                        "        Room Facilities:1-Share AC,2-Share AC,3-Share AC\n" +
                        "        Toilets Attached,Hot Water,Wardrobe,Washing machine,Dhobi service on order," +
                        "        Bed sheets,Cots,TV in Common Area,Power back-up,Electricity,Self Cooking," +
                        "        Food on Order,Electricity Charges(approx)\n" +
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
                tdetail.setText(" 26 UB,1st Floor,Chattori Lane,Near Momo Point," +
                        "         Kamla Nagar,Jawahar Nagar,Delhi,Delhi,110007\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS:N/A/9000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "        South Indian Food                       North Indian food\n" +
                        "         Vegetarian                               Non Vegetarian\n" +
                        "        \n" +
                        "        Room Facilities:1-Share AC,2-Share AC,3-Share AC\n" +
                        "        Toilets Attached,Hot Water,Wardrobe,Washing machine,Dhobi service on order," +
                        "        Bed sheets,Cots,TV in Common Area,Power back-up,Electricity,Self Cooking," +
                        "        Food on Order,Electricity Charges(approx)\n" +
                        "       "
                );


            } else if (s1.equals("1 BHK Apartment,Hadapsar,Magarpatta City")) {
                ima.setImageResource(images[1]);
                tphonenumber.setText(":8327875874");
                tdetail.setText(" 26 UB,1st Floor,Chattori Lane,Near Momo Point," +
                        "         Kamla Nagar,Jawahar Nagar,Delhi,Delhi,110007\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS:N/A/9000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "        South Indian Food                       North Indian food\n" +
                        "         Vegetarian                               Non Vegetarian\n" +
                        "        \n" +
                        "        Room Facilities:1-Share AC,2-Share AC,3-Share AC\n" +
                        "        Toilets Attached,Hot Water,Wardrobe,Washing machine,Dhobi service on order," +
                        "        Bed sheets,Cots,TV in Common Area,Power back-up,Electricity,Self Cooking," +
                        "        Food on Order,Electricity Charges(approx)\n" +
                        "       "
                );
            } else if (s1.equals("2 BHK Apartment,Kharadi,Rakshak Nagar")) {
                ima.setVisibility(View.VISIBLE);
                ima.setImageResource(images[2]);
                tphonenumber.setText(":5983665744");
                tdetail.setText(" 26 UB,1st Floor,Chattori Lane,Near Momo Point," +
                        "         Kamla Nagar,Jawahar Nagar,Delhi,Delhi,110007\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS:N/A/9000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "        South Indian Food                       North Indian food\n" +
                        "         Vegetarian                               Non Vegetarian\n" +
                        "        \n" +
                        "        Room Facilities:1-Share AC,2-Share AC,3-Share AC\n" +
                        "        Toilets Attached,Hot Water,Wardrobe,Washing machine,Dhobi service on order," +
                        "        Bed sheets,Cots,TV in Common Area,Power back-up,Electricity,Self Cooking," +
                        "        Food on Order,Electricity Charges(approx)\n" +
                        "       "
                );
            } else if (s1.equals("1 BHK Apartment,Hinejewadi")) {
                ima.setVisibility(View.VISIBLE);
                ima.setImageResource(images[3]);
                tphonenumber.setText(":8497685866");
                tdetail.setText(" 26 UB,1st Floor,Chattori Lane,Near Momo Point," +
                        "         Kamla Nagar,Jawahar Nagar,Delhi,Delhi,110007\n" +
                        "        \n" +
                        "         Daily/Monthly\n" +
                        "        RS:N/A/9000\n" +
                        "        ---------------------------------------------------------------\n" +
                        "        OVERVIEW->\n" +
                        "        \n" +
                        "        South Indian Food                       North Indian food\n" +
                        "         Vegetarian                               Non Vegetarian\n" +
                        "        \n" +
                        "        Room Facilities:1-Share AC,2-Share AC,3-Share AC\n" +
                        "        Toilets Attached,Hot Water,Wardrobe,Washing machine,Dhobi service on order," +
                        "        Bed sheets,Cots,TV in Common Area,Power back-up,Electricity,Self Cooking," +
                        "        Food on Order,Electricity Charges(approx)\n" +
                        "       "
                );
            }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

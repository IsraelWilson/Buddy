package com.balance.buddy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;


public class MainActivity extends Activity {
    LayoutInflater inflater;
    //Scrol view
    ScrollView scrollView;
    LinearLayout ll;
    Context ctx;
    View nRow;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ctx = getApplicationContext();

        inflater =(LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        scrollView = (ScrollView)findViewById(R.id.scrollView);
        ll =(LinearLayout)findViewById(R.id.scroll_ll);
        nRow = (View)inflater.inflate(R.layout.row_add,null);
        ll.addView(nRow,0);

    }



}

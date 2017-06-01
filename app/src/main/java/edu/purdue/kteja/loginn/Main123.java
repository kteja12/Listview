package edu.purdue.kteja.loginn;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


import java.util.ArrayList;

public class Main123 extends AppCompatActivity

{
    //private Button new12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main123);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       // new12 = (Button) findViewById(R.id.settings);
        //new12.setOnClickListener(new OnClickListener() {
//            public void onClick(View view) {
//                startnew();
//
//            }
//
//        });
        ListView listview = (ListView) findViewById(R.id.nm123);

        ArrayList<String> headlines ;
        RetrieveFeed getXML = new RetrieveFeed();
        getXML.execute();
        headlines = getXML.heads();

        ArrayList<String> images = new ArrayList<>();
        getXML = new RetrieveFeed();
        getXML.execute();
        images = getXML.images12();

        ArrayList<String> summary = new ArrayList<>();
        getXML = new RetrieveFeed();
        getXML.execute();
        summary = getXML.getSummary();



//            this.setListAdapter(new ArrayAdapter<String>(
//                    this, R.layout.mylist,
//                    R.id.Itemname,images));
        // Binding data
//        ArrayAdapter adapter = new ArrayAdapter(this,
//                android.R.layout.simple_list_item_1, headlines);
//
//        listview.setAdapter(adapter);
        final ListView lv = (ListView) findViewById(R.id.nm123);
        lv.setAdapter(new MyCustomBaseAdapter(this,headlines,summary,images));
    }


    private void startnew()
    {
        Intent intent = new Intent(this, Main123.class);
        System.out.println("REFRESH");
        startActivity(intent);

        finish();
    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.new123, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int data1 = MyApplication.data;

        // Handle item selection
        switch (item.getItemId()) {
            case R.id.t10:
                if (data1 == 10)
                    break;
                else
                    MyApplication.data = 10;
                MyApplication.change = true;
                startnew();
                break;


            case R.id.t25:
                if (!(data1 == 25)) {
                    MyApplication.data = 25;
                    MyApplication.change = true;
                    startnew();
                }

                break;

            case R.id.refresh:

                    startnew();

                break;


            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }



}


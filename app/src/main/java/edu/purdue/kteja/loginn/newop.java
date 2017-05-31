package edu.purdue.kteja.loginn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class newop extends AppCompatActivity {
    private Button be;

    private TextView text12;
    private RadioButton new11;
    private RadioGroup new12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newop);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        addListenerOnButton();

    }


    public void addListenerOnButton() {

        new12 = (RadioGroup) findViewById(R.id.radiogroup);

        be = (Button) findViewById(R.id.back);
        text12 = (TextView) findViewById(R.id.textView12);
        be.setOnClickListener (new View.OnClickListener(){
            public void onClick(View view) {
                // get selected radio button from radioGroup
                int selectedId = new12.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                new11 = (RadioButton) findViewById(selectedId);

if(selectedId == 2131558527)// 25
    MyApplication.data = 1;
else
    MyApplication.data = 0;


           startnew();

               // text12.setText(Integer.toString(selectedId));

            }

        });






    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.new123, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.t10:
                startnew();
                return true;
            case R.id.t25:
                System.out.println("25");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    private void startnew()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

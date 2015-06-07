package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button first = (Button)findViewById(R.id.first_project);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch " + first.getText().toString().toLowerCase(), Toast.LENGTH_SHORT);
            }
        });

        final Button second = (Button)findViewById(R.id.second_project);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch " + second.getText().toString().toLowerCase(), Toast.LENGTH_SHORT);
            }
        });

        final Button third = (Button)findViewById(R.id.third_project);
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch " + third.getText().toString().toLowerCase(), Toast.LENGTH_SHORT);
            }
        });

        final Button fourth = (Button)findViewById(R.id.fourth_project);
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch " + fourth.getText().toString().toLowerCase(), Toast.LENGTH_SHORT);
            }
        });

        final Button fifth = (Button)findViewById(R.id.fifth_project);
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch " + fifth.getText().toString().toLowerCase(), Toast.LENGTH_SHORT);
            }
        });

        final Button last = (Button)findViewById(R.id.final_project);
        last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch " + last.getText().toString().toLowerCase(), Toast.LENGTH_SHORT);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

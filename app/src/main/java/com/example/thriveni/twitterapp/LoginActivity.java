package com.example.thriveni.twitterapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {

    Button login;
    EditText username , password;
    String usernamest ,passst;
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twitterlogin);

        login = (Button)findViewById(R.id.btnlogin);
        username = (EditText) findViewById(R.id.etusername);
        password = (EditText) findViewById(R.id.etpass);

        pref = getSharedPreferences("codelearn_twitter", MODE_PRIVATE);
        editor = pref.edit();

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                usernamest = username.getText().toString();
                passst = password.getText().toString();
                editor.putString("key_name", usernamest);
                editor.putString("key_pass", passst);
                editor.commit();

                Intent listintent = new Intent(getApplicationContext(), TweetListActivity.class);
                startActivity(listintent);


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }






}

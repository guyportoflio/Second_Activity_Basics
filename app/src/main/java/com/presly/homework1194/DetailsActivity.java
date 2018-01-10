package com.presly.homework1194;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by presly on 06/01/2018.
 */

public class DetailsActivity extends AppCompatActivity{


    private TextView firstName, lastName;
    @SuppressLint("WrongViewCast")
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        firstName = (TextView) findViewById(R.id.firstTextView);
        lastName = (TextView) findViewById(R.id.secondTextView);

        Intent intent = getIntent();
        String firstname = intent.getStringExtra("firstname");
        String lastname = intent.getStringExtra("lastname");
      //  Toast.makeText(this, "" + firstname + lastname,Toast.LENGTH_LONG).show();

      firstName.setText(firstname);
      lastName.setText(lastname);

    }

    public void closeActivity(View view){
        Intent intent = new Intent();

        intent.putExtra("message", " it worked");
        setResult(RESULT_OK, intent);

        finish();
    }
}

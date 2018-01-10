package com.presly.homework1194;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private EditText firstNameEntered;
    private EditText lastNameEntered;
    String first, second;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      firstNameEntered = ((EditText) findViewById(R.id.first_name));
      lastNameEntered = ((EditText)findViewById(R.id.last_name));


    }

    public void enterButton(View view) {

        first = firstNameEntered.getText().toString();
        second = lastNameEntered.getText().toString();

        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra("firstname", first );
        intent.putExtra("lastname", second);


        startActivityForResult(intent, 1);




      //  Toast.makeText(this, "working: " + first+ " " + second, Toast.LENGTH_LONG).show();
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1 && resultCode == RESULT_OK){
            String message = data.getStringExtra("message");
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }
}

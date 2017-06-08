package com.example.android.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }


    public void submit(View view) {
        EditText text = (EditText) findViewById(R.id.eduser);
        EditText text2 = (EditText) findViewById(R.id.edpass);
        EditText text3 = (EditText) findViewById(R.id.edage);
        EditText text4 = (EditText) findViewById(R.id.edname);
        EditText text5 = (EditText) findViewById(R.id.edemail);
        String UserName =
                text.getText().toString();
        String Password = text2.getText().toString();
        String Age = text3.getText().toString();
        String Name = text4.getText().toString();
        String Email= text5.getText().toString();

        CharSequence note = "Your details have been saved!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(SignUp.this, note, duration);
        toast.show();


    }
}

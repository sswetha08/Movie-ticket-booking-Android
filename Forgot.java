package com.example.android.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Forgot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);

    }

    public void submit(View view) {
        EditText text = (EditText)findViewById(R.id.edemail);
        String UserName =
                text.getText().toString();

        CharSequence note = "An email has been sent to your id !";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(Forgot.this, note, duration);
        toast.show();



    }
}

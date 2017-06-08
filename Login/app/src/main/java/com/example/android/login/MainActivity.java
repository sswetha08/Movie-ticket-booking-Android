package com.example.android.login;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;


/**
 16  * This app displays an order form to order coffee.
 17  */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        EditText text = (EditText) findViewById(R.id.eduser);
        EditText text2 = (EditText) findViewById(R.id.edpass);
        String UserName =
                text.getText().toString();
        String Password = text2.getText().toString();
        String user = new String("login");
        String pass = new String("password");
        if (Password.equals(pass)&& UserName.equals(user)) {
            Intent intent = new Intent(MainActivity.this, Actmain2.class);
            startActivity(intent);}
         else {

            CharSequence note = "Invalid credentials!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(MainActivity.this, note, duration);
            toast.show();

        }}

    public void forpass(View view) {
            Intent intent = new Intent(MainActivity.this,Forgot.class);
            startActivity(intent);
        }

    public void makeacc(View view) {
        Intent intent = new Intent(MainActivity.this,SignUp.class);
        startActivity(intent);
    }


}

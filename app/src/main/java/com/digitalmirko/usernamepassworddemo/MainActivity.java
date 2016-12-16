package com.digitalmirko.usernamepassworddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Button action method
    public void btnClicked(View view) {

        // Username TextField
        EditText usernameTextField = (EditText) findViewById(R.id.usernameTextField);

        // Password TextField
        EditText passwordTextField = (EditText) findViewById(R.id.passwordTextField);

        // Username and Password field printed out to logcat when button clicked
        Log.i("Username",usernameTextField.getText().toString());
        Log.i("Password",passwordTextField.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

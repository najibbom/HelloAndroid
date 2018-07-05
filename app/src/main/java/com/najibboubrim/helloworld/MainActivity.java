package com.najibboubrim.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button login;
    EditText inputUserName;
    EditText inputPssword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        login.setOnClickListener(this);

        inputUserName = findViewById(R.id.username);
        inputPssword = findViewById(R.id.password);


        String message = getString(R.string.message);
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        String username = inputUserName.getText().toString();
        String password = inputPssword.getText().toString();
        Toast.makeText(MainActivity.this, username+" ("+password+").", Toast.LENGTH_SHORT).show();
    }
}

package com.example.android.login;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.login.R;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private Button reset;
    private TextView register;
    private TextView username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button = findViewById(R.id.register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ButtonState","Button Clicked");
                Intent intent = new Intent(MainActivity.this,login.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Succesful register",Toast.LENGTH_SHORT).show();

            }
        });
        Button button1 = findViewById(R.id.login);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ButtonState","Button Clicked");
                Intent intent = new Intent(MainActivity.this,login.class);
                startActivity(intent);

            }
        });

    }


}
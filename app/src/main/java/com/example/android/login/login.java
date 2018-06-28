package com.example.android.login;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private TextView textLogin;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        Intent i=getIntent();
        String userName=i.getStringExtra("username");
        textLogin=(TextView)findViewById(R.id.textView2);
        textLogin.setText(textLogin.getText()+" "+userName+".");


        Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ButtonState","Button Clicked");
                Intent intent = new Intent(login.this,login1.class);
                startActivity(intent);

            }
        });
    }
}
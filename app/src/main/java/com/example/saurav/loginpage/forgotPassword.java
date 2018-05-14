package com.example.saurav.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class forgotPassword extends AppCompatActivity {

    EditText mretrieveMail;
    Button mretrieveButton;

    String rmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        getSupportActionBar().hide();

        mretrieveMail = (EditText)findViewById(R.id.retrieveMail);
        mretrieveButton = (Button)findViewById(R.id.retrieveButton);




        mretrieveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rmail = mretrieveMail.getText().toString();
                if(rmail.isEmpty() != true)
                {
                    Toast.makeText(forgotPassword.this, "Link sent to "+ rmail, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(forgotPassword.this, "Please enter valid mail ID ", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}

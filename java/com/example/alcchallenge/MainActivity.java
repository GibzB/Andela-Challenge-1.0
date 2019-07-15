package com.example.alcchallenge;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener
{

    private Button btnProfile;
    private Button btnAboutAlc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAboutAlc = findViewById(R.id.AboutAlcbutton);
        btnProfile = findViewById(R.id.MyProfilebutton);

        btnProfile.setOnClickListener(this);
        btnAboutAlc.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == btnAboutAlc)
        {
            startActivity(new Intent(this, Details.class));
        }
        if (view == btnProfile)
        {
            startActivity(new Intent(this, MyProfile.class));
        }

    }
}


package com.example.ulacit.clima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ulacit.clima.service.ServiceHandler;

public class MainActivity extends AppCompatActivity {

    private ServiceHandler sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sh = new ServiceHandler();
    }
}

package com.httpman_bok.explicitintents;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void gotoActivity(View v) {
        switch(v.getId()) {
            case R.id.bmethod1:
                Intent i = new Intent(ActivityA.this, ActivityB.class);
                startActivity(i);
                break;
            case R.id.bmethod2:
                Intent j = new Intent("com.httpman_bok.explicitintents.ActivityB");
                startActivity(j);
                break;
            case R.id.bmethod3:
                Intent k = new Intent();
                k.setClassName("com.httpman_bok.explicitintents","com.httpman_bok.explicitintents.ActivityB");
                        startActivity(k);
                break;
        }
    }
}

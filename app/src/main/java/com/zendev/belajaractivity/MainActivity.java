package com.zendev.belajaractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnCamera, btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCamera = findViewById(R.id.btn_camera);
        btnCamera.setOnClickListener(this);

        btnClose = findViewById(R.id.btn_close);
        btnCamera.setOnClickListener(this);

        Toast.makeText(this, "Activity Sedang Melakukan Proses : onCreate()", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_camera:
                Intent openCamera = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(openCamera);
                break;
            case R.id.btn_close:
                finish();
                break;
        }
    }

    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "Activity Sedang Melakukan Proses : onStart()", Toast.LENGTH_LONG).show();
    }

    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "Activity Sedang Melakukan Proses : onResume()", Toast.LENGTH_LONG).show();
    }

    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "Activity Sedang Melakukan Proses : onPause()", Toast.LENGTH_LONG).show();
    }

    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "Activity Sedang Melakukan Proses : onStop()", Toast.LENGTH_LONG).show();
    }
}

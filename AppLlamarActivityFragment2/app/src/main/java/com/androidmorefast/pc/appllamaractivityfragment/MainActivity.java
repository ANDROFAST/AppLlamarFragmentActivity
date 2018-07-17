package com.androidmorefast.pc.appllamaractivityfragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlador();
    }
    public void controlador() {

        Button entry = (Button) findViewById(R.id.btn1);

        //hago clic y se abre el 2
        entry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this.getBaseContext(), SegundoActivity.class);
                startActivity(intent);
            }
        });
    }


}

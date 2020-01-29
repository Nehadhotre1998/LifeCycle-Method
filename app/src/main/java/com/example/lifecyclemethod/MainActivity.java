package com.example.lifecyclemethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String KEY = "Android";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(KEY, "onCreate Method Call");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(KEY, "onStart Method Call");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(KEY, "onResume Method Call");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(KEY, "onPause Method Call");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(KEY, "onStop Method Call");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(KEY, "onRestart Method Call");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(KEY, "onDestroy Method Call");

    }
}

package de.jo20046.a54_logging_activity_state_transitions;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("jentag", "onCreate()");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("jentag", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("jentag", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("jentag", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("jentag", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("jentag", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("jentag", "onDestroy()");
    }
}
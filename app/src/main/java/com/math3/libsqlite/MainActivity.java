package com.math3.libsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("sqlite3");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);


//        String tex = Encrypt("this is a test string!");
//        tv.setText(tex);
//        Log.d("STRJNI", tex);
//        String detext = Dencrypt(tex);
//        Log.d("STRJNI", detext);
    }
}

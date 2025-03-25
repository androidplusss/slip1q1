package com.example.slip1q1;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    String tag="Events";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "in on create event");
    }
    public void onStart()
    {
    super.onStart();
    Log.d(tag,"in the onStart() event");
    }
    public void onRestart()
    {
    super.onRestart();
    Log.d(tag,"in the onRestart () event");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag,"in the onResume() event");
    }
    public void onPause()
    {
        super.onPause();
        Log.d(tag,"in the onPause() event");
    }
    public void onStop()
    {
        super.onStop();
        Log.d(tag,"in the onStop() event");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag,"in the onDestroy() event");
    }
}

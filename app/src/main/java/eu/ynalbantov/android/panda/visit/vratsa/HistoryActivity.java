package eu.ynalbantov.android.panda.visit.vratsa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import eu.ynalbantov.android.panda.visit.vratsa.c1.*;

/**
 * Created by Dani on 16.4.2016 г
 */
public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }
    
    public void onI01Click(View v) {
        Intent intent = new Intent(this, c01s01i01Activity.class);
        startActivity(intent);
    }

    public void onI02Click(View v) {
        Intent intent = new Intent(this, c01s01i02Activity.class);
        startActivity(intent);
    }

    public void onI03Click(View v) {
        Intent intent = new Intent(this, c01s01i03Activity.class);
        startActivity(intent);
    }

    public void onI04Click(View v) {
        Intent intent = new Intent(this, c01s01i04Activity.class);
        startActivity(intent);
    }

    public void onI05Click(View v) {
        Intent intent = new Intent(this, c01s01i05Activity.class);
        startActivity(intent);
    }

    public void onI06Click(View v) {
        Intent intent = new Intent(this, c01s01i06Activity.class);
        startActivity(intent);
    }
}

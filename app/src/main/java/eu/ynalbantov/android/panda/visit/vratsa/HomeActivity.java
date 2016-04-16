package eu.ynalbantov.android.panda.visit.vratsa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.panda.myapplication.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onHistoryClick(View v) {
        setContentView(R.layout.activity_history);
    }

    public void onNatureClick(View v) {
        setContentView(R.layout.activity_nature);
    }

    public void onNearByClick(View v) {
        setContentView(R.layout.activity_nearby);
    }

    public void onFunClick(View v) {
        setContentView(R.layout.activity_fun);
    }

    public void onCafesClick(View v) {
        setContentView(R.layout.activity_cafes);
    }

    public void onRestaurantsClick(View v) {
        setContentView(R.layout.activity_restaurants);
    }

    public void onHotelsClick(View v) {
        setContentView(R.layout.activity_hotels);
    }

    public void onNightlifeClick(View v) {
        setContentView(R.layout.activity_nightlife);
    }

    public void onBusesClick(View v) {
        setContentView(R.layout.activity_buses);
    }

    public void onTrainsClick(View v) {
        setContentView(R.layout.activity_trains);
    }

    public void onTaxisClick(View v) {
        setContentView(R.layout.activity_taxis);
    }

    public void onRentClick(View v) {
        setContentView(R.layout.activity_rent);
    }

    public void onShuttlesClick(View v) {
        setContentView(R.layout.activity_shuttles);
    }

    public void onTrolleybusesClick(View v) {
        setContentView(R.layout.activity_trolleybuses);
    }

    public void onEmergencyClick(View v) {
        setContentView(R.layout.activity_emergency);
    }

    public void onWiFiClick(View v) {
        setContentView(R.layout.activity_wifi);
    }

    public void onShopsClick(View v) {
        setContentView(R.layout.activity_shops);
    }

    public void onMunicipalityClick(View v) {
        setContentView(R.layout.activity_municipality);
    }

    public void onParkClick(View v) {
        setContentView(R.layout.activity_park);
    }
}

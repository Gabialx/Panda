package eu.ynalbantov.android.panda.visit.vratsa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.panda.myapplication.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onHistoryClick(View v) {
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }

    public void onNatureClick(View v) {
        Intent intent = new Intent(this, NatureActivity.class);
        startActivity(intent);
    }

    public void onNearByClick(View v) {
        Intent intent = new Intent(this, NearByActivity.class);
        startActivity(intent);
    }

    public void onFunClick(View v) {
        Intent intent = new Intent(this, FunActivity.class);
        startActivity(intent);
    }

    public void onCafesClick(View v) {
        Intent intent = new Intent(this, CafesActivity.class);
        startActivity(intent);
    }

    public void onRestaurantsClick(View v) {
        Intent intent = new Intent(this, RestaurantsActivity.class);
        startActivity(intent);
    }

    public void onHotelsClick(View v) {
        Intent intent = new Intent(this, HotelsActivity.class);
        startActivity(intent);
    }

    public void onNightlifeClick(View v) {
        Intent intent = new Intent(this, NightlifeActivity.class);
        startActivity(intent);
    }

    public void onBusesClick(View v) {
        Intent intent = new Intent(this, BusesActivity.class);
        startActivity(intent);
    }

    public void onTrainsClick(View v) {
        Intent intent = new Intent(this, TrainsActivity.class);
        startActivity(intent);
    }

    public void onTaxisClick(View v) {
        Intent intent = new Intent(this, TaxisActivity.class);
        startActivity(intent);
    }

    public void onRentClick(View v) {
        Intent intent = new Intent(this, RentActivity.class);
        startActivity(intent);
    }

    public void onShuttlesClick(View v) {
        Intent intent = new Intent(this, ShuttlesActivity.class);
        startActivity(intent);
    }

    public void onTrolleybusesClick(View v) {
        Intent intent = new Intent(this, TrolleybusesActivity.class);
        startActivity(intent);
    }

    public void onEmergencyClick(View v) {
        Intent intent = new Intent(this, EmergencyActivity.class);
        startActivity(intent);
    }

    public void onWiFiClick(View v) {
        Intent intent = new Intent(this, WiFiActivity.class);
        startActivity(intent);
    }

    public void onShopsClick(View v) {
        Intent intent = new Intent(this, ShopsActivity.class);
        startActivity(intent);
    }

    public void onMunicipalityClick(View v) {
        Intent intent = new Intent(this, MunicipalityActivity.class);
        startActivity(intent);
    }

    public void onParkClick(View v) {
        Intent intent = new Intent(this, ParkActivity.class);
        startActivity(intent);
    }
}

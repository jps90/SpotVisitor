package de.uni.oldenburg.spotvisitor;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import de.uni.oldenburg.spotvisitor.compass.CompassActivity;
import de.uni.oldenburg.spotvisitor.detail.DetailActivity;
import de.uni.oldenburg.spotvisitor.location.LocationActivity;


public class MainAction extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
    }

    @Override
    protected void onStart() {
        super.onStart();
                //Intent intent = new Intent(MainAction.this, DetailActivity.class);
                //startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start_up, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.action_location:
                startActivity(new Intent(MainAction.this, LocationActivity.class));
                return true;
            case R.id.action_compass:
                startActivity(new Intent(MainAction.this, CompassActivity.class));
                return true;
            case R.id.action_detail:
                // TODO neuen Eintrag anlegen können

        }
        return super.onOptionsItemSelected(item);
    }
}

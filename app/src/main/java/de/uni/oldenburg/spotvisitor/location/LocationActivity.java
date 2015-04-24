package de.uni.oldenburg.spotvisitor.location;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;

import de.uni.oldenburg.spotvisitor.R;

/**
 * Created by stubbe on 24.04.2015.
 */
public class LocationActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        getSupportActionBar().setTitle(R.string.titleLocationActivity);
    }
}

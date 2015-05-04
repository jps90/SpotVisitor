package de.uni.oldenburg.spotvisitor.detail;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

import de.uni.oldenburg.spotvisitor.MainAction;
import de.uni.oldenburg.spotvisitor.R;
import de.uni.oldenburg.spotvisitor.datas.Spot;

/**
 * Created by stubbe on 24.04.2015.
 */
public class DetailActivity extends MainAction {

    private Spot spot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        this.spot = (Spot) getIntent().getSerializableExtra("spot");
        getSupportActionBar().setTitle(spot.getName());

    }

    @Override
    protected void onStart() {
        super.onStart();
        TextView txtLocation = (TextView) findViewById(R.id.lblDetEditLocation);
        TextView txtDate = (TextView) findViewById(R.id.lblDetDate);
        TextView txtDescription = (TextView) findViewById(R.id.lblDetEditDescription);
        ImageView imgView = (ImageView) findViewById(R.id.imgDetail);

        txtLocation.setText(spot.getLocationname());
        txtDate.setText(spot.getDate().toString());
        txtDescription.setText(spot.getDescription());
        imgView.setImageDrawable(getResources().getDrawable(spot.getImage()));
    }
}

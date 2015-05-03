package de.uni.oldenburg.spotvisitor.detail;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;

import de.uni.oldenburg.spotvisitor.MainAction;
import de.uni.oldenburg.spotvisitor.R;

/**
 * Created by stubbe on 24.04.2015.
 */
public class DetailActivity extends MainAction {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}

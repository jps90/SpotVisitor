package de.uni.oldenburg.spotvisitor.location;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import de.uni.oldenburg.spotvisitor.MainAction;
import de.uni.oldenburg.spotvisitor.R;

/**
 * Created by stubbe on 24.04.2015.
 */
public class LocationActivity extends MainAction {

    private List<String> dummylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        getSupportActionBar().setTitle(R.string.titleLocationActivity);
        ListView lv = (ListView) findViewById(R.id.listLocLocations);
        lv.setTextFilterEnabled(true);

        EditText filter = (EditText) findViewById(R.id.txtLocFilter);

        createList();
        final ArrayAdapter<String> listadapter = new ArrayAdapter<String>(this, R.layout.listitem_locations, dummylist);
        lv.setAdapter(listadapter);


        filter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                listadapter.getFilter().filter(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void createList(){
        dummylist = new ArrayList<String>();
        dummylist.add("Schloss");
        dummylist.add("Lambertikirche");
        dummylist.add("Hafen");
        dummylist.add("Bahnhof");
        dummylist.add("Pferdemarkt");
        dummylist.add("Degodehaus");
        dummylist.add("Rathaus");
    }

}

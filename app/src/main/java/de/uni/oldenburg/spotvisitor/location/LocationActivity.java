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
import java.util.Date;
import java.util.List;

import de.uni.oldenburg.spotvisitor.MainAction;
import de.uni.oldenburg.spotvisitor.R;
import de.uni.oldenburg.spotvisitor.datas.Spot;
import de.uni.oldenburg.spotvisitor.datas.SpotAdapter;

/**
 * Created by stubbe on 24.04.2015.
 */
public class LocationActivity extends MainAction {

    private List<Spot> dummylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        getSupportActionBar().setTitle(R.string.titleLocationActivity);
        ListView lv = (ListView) findViewById(R.id.listLocLocations);
        lv.setTextFilterEnabled(true);

        EditText filter = (EditText) findViewById(R.id.txtLocFilter);

        createList();
        final SpotAdapter listadapter = new SpotAdapter(this, R.layout.listitem_locations, dummylist);
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
        dummylist = new ArrayList<Spot>();
        Spot spot = new Spot();
        spot.setDate(new Date());
        spot.setDescription("Voll das schöne Schloss");
        spot.setGps("00");
        List<String> hashtags = new ArrayList<String>();
        hashtags.add("Schloss");
        hashtags.add("Alt");
        spot.setHastags(hashtags);
        spot.setImage(getResources().getDrawable(R.drawable.schlossoldenburg));
        spot.setLocationname("Oldenburg");
        spot.setName("Oldenburger Schloss");
        spot.setUser("stubbe");
        dummylist.add(spot);


        spot = new Spot();
        spot.setDate(new Date());
        spot.setDescription("Super schöne Kirche!");
        spot.setGps("00");
        hashtags = new ArrayList<String>();
        hashtags.add("Kirche");
        hashtags.add("Alt");
        spot.setHastags(hashtags);
        spot.setImage(getResources().getDrawable(R.drawable.lambertikirche));
        spot.setLocationname("Oldenburg");
        spot.setName("Lambertikriche");
        spot.setUser("stubbe");
        dummylist.add(spot);


        spot = new Spot();
        spot.setDate(new Date());
        spot.setDescription("Ziemlich klein der Hafen hier...");
        spot.setGps("00");
        hashtags = new ArrayList<String>();
        hashtags.add("Hafen");
        hashtags.add("Alt");
        hashtags.add("Wasser");
        spot.setHastags(hashtags);
        spot.setImage(getResources().getDrawable(R.drawable.hafen));
        spot.setLocationname("Oldenburg");
        spot.setName("Oldenburger Hafen");
        spot.setUser("stubbe");
        dummylist.add(spot);


        spot = new Spot();
        spot.setDate(new Date());
        spot.setDescription("Riesiger Bahnhof");
        spot.setGps("00");
        hashtags = new ArrayList<String>();
        hashtags.add("zug");
        hashtags.add("bahnhof");
        spot.setHastags(hashtags);
        spot.setImage(getResources().getDrawable(R.drawable.bahnhof));
        spot.setLocationname("Oldenburg");
        spot.setName("Hauptbahnhof");
        spot.setUser("stubbe");
        dummylist.add(spot);


        spot = new Spot();
        spot.setDate(new Date());
        spot.setDescription("Hier sind ja gar keine Pferde!?!?!");
        spot.setGps("00");
        hashtags = new ArrayList<String>();
        hashtags.add("pferd");
        hashtags.add("markt");
        hashtags.add("essen");
        spot.setHastags(hashtags);
        spot.setImage(getResources().getDrawable(R.drawable.pferdemarkt));
        spot.setLocationname("Oldenburg");
        spot.setName("Pferdemarkt");
        spot.setUser("stubbe");
        dummylist.add(spot);
    }

}

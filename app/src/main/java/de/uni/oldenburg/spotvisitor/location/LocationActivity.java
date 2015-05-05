package de.uni.oldenburg.spotvisitor.location;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.uni.oldenburg.spotvisitor.MainAction;
import de.uni.oldenburg.spotvisitor.R;
import de.uni.oldenburg.spotvisitor.datas.Spot;
import de.uni.oldenburg.spotvisitor.datas.SpotAdapter;
import de.uni.oldenburg.spotvisitor.detail.DetailActivity;
import de.uni.oldenburg.spotvisitor.detail.DetailFragment;
import de.uni.oldenburg.spotvisitor.detail.DetailHelper;

/**
 * Created by stubbe on 24.04.2015.
 */
public class LocationActivity extends MainAction {

    private List<Spot> dummylist;

    private DetailFragment detailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_location);
        getSupportActionBar().setTitle(R.string.titleLocationActivity);
        ListView lv = (ListView) findViewById(R.id.listLocLocations);
        lv.setTextFilterEnabled(true);
    }

    @Override
    protected void onStart() {
        super.onStart();
        EditText filter = (EditText) findViewById(R.id.txtLocFilter);

        createList();
        final SpotAdapter listadapter = new SpotAdapter(this, R.layout.listitem_locations, dummylist);
        final ListView lv = (ListView) findViewById(R.id.listLocLocations);
        lv.setAdapter(listadapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                LinearLayout lay = (LinearLayout) findViewById(R.id.fragdetails);
                Spot spot = (Spot) lv.getItemAtPosition(position);
                if(lay == null) {
                    Intent detailIntent = new Intent(LocationActivity.this, DetailActivity.class);
                    detailIntent.putExtra("spot", spot);
                    startActivity(detailIntent);
                }else{
                    DetailHelper helper = new DetailHelper();
                    helper.fillDetails(LocationActivity.this, spot);
                }
            }
        });

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
        spot.setHashtags(hashtags);
        spot.setImage(R.drawable.schlossoldenburg);
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
        spot.setHashtags(hashtags);
        spot.setImage(R.drawable.lambertikirche);
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
        spot.setHashtags(hashtags);
        spot.setImage(R.drawable.hafen);
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
        spot.setHashtags(hashtags);
        spot.setImage(R.drawable.bahnhof);
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
        spot.setHashtags(hashtags);
        spot.setImage(R.drawable.pferdemarkt);
        spot.setLocationname("Oldenburg");
        spot.setName("Pferdemarkt");
        spot.setUser("stubbe");
        dummylist.add(spot);
    }

}

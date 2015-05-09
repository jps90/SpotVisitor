package de.uni.oldenburg.spotvisitor.datas;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by stubbe on 09.05.2015.
 */
public class DatabaseUtil extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static String name = "spots";
    private Context context;

    public DatabaseUtil(Context context){
        super(context, name, null, VERSION);
        this.context = context;
    }

    public void deleteDatabse()  {
        context.deleteDatabase("spots");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+name+"(id INTEGER PRIMARY KEY AUTOINCREMENT, description TEXT, name varchar(255), date LONG, image INTEGER, locationname varchar(255), user varchar(255), gps varchar(200), rating INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void saveSpot(Spot spot){
        ContentValues values = new ContentValues();
        values.put("description", spot.getDescription());
        values.put("name", spot.getName());
        values.put("date", spot.getDate().getTime());
        values.put("image", spot.getImage());
        values.put("locationname", spot.getLocationname());
        values.put("user", spot.getUser());
        values.put("gps", spot.getGps());
        values.put("rating", spot.getRating());
        this.getWritableDatabase().insert("spots", null, values);
    }

    public List<Spot> getAllSpots(){
        Cursor c = this.getWritableDatabase().query("spots", new String[] {"id", "description", "name", "date", "image", "locationname", "user", "gps", "rating"}, null, new String[] {}, null, null ,null );
        List<Spot> spots = new ArrayList<Spot>();
        while(c.moveToNext()){
            Spot spot = new Spot();
            spot.setId(c.getInt(c.getColumnIndex("id")));
            spot.setDescription(c.getString(c.getColumnIndex("description")));
            spot.setName(c.getString(c.getColumnIndex("name")));
            spot.setDate(new Date(c.getLong(c.getColumnIndex("date"))));
            spot.setImage(c.getInt(c.getColumnIndex("image")));
            spot.setLocationname(c.getString(c.getColumnIndex("locationname")));
            spot.setUser(c.getString(c.getColumnIndex("user")));
            spot.setGps(c.getString(c.getColumnIndex("gps")));
            spot.setRating(c.getInt(c.getColumnIndex("rating")));
            spots.add(spot);
        }
        return spots;
    }
}

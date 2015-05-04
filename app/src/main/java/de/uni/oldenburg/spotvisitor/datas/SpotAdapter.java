package de.uni.oldenburg.spotvisitor.datas;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.util.List;

import de.uni.oldenburg.spotvisitor.R;

/**
 * Created by stubbe on 04.05.2015.
 */
public class SpotAdapter extends ArrayAdapter<Spot> {

    private Context context;
    private List<Spot> spots;


    public SpotAdapter(Context context, int resource, List<Spot> objects) {
        super(context, resource, objects);
        this.context = context;
        this.spots = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            convertView = ((LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.listitem_locations, null);

            holder.txt_name = (TextView)convertView.findViewById(R.id.list_name);
            holder.img_image = (ImageView)convertView.findViewById(R.id.list_image);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txt_name.setText(spots.get(position).getName());

        holder.img_image.setImageDrawable(spots.get(position).getImage());
        return convertView;
    }

    public static class ViewHolder {
        public TextView txt_name;
        public ImageView img_image;
    }
}

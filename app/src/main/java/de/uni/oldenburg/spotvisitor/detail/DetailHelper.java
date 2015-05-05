package de.uni.oldenburg.spotvisitor.detail;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import de.uni.oldenburg.spotvisitor.R;
import de.uni.oldenburg.spotvisitor.datas.Spot;

/**
 * Created by stubbe on 05.05.2015.
 */
public class DetailHelper {

    public void fillDetails(Activity activity, Spot spot){
        TextView txtLocation = (TextView) activity.findViewById(R.id.lblDetEditLocation);
        TextView txtDate = (TextView) activity.findViewById(R.id.lblDetDate);
        TextView txtDescription = (TextView) activity.findViewById(R.id.lblDetEditDescription);
        ImageView imgView = (ImageView) activity.findViewById(R.id.imgDetail);

        txtLocation.setText(spot.getLocationname());
        txtDate.setText(spot.getDate().toString());
        txtDescription.setText(spot.getDescription());
        imgView.setImageDrawable(activity.getResources().getDrawable(spot.getImage()));
    }
}

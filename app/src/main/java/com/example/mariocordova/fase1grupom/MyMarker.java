package com.example.mariocordova.fase1grupom;


import android.content.Context;
import android.widget.Toast;

import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.Point;
import org.mapsforge.map.layer.overlay.Marker;
/**
 * Created by mariocordova on 07-05-17.
 */

public class MyMarker extends Marker {
    private Context ctx;

    public MyMarker(Context ctx, LatLong latLong, Bitmap bitmap, int horizontalOffset,
                    int verticalOffset) {
        super(latLong, bitmap, horizontalOffset, verticalOffset);
        this.ctx = ctx;
    }
    @Override
    public boolean onTap(LatLong tapLatLong, Point layerXY, Point tapXY) {
        if (this.contains(layerXY, tapXY)) {
            Toast.makeText(ctx, "Marker con latitud: " + tapLatLong.latitude + " y longitud: " + tapLatLong.longitude + " pulsado", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onTap(tapLatLong, layerXY, tapXY);
    }
}

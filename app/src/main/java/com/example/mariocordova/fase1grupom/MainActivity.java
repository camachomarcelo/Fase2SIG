package com.example.mariocordova.fase1grupom;

/*
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
*/
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
import android.system.ErrnoException;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Toast;
*/

import android.util.Log;
import android.view.View;
import android.widget.Toast;


//import org.mapsforge.android.maps.mapgenerator.tiledownloader.MapnikTileDownloader;
import org.mapsforge.core.graphics.Color;
import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.graphics.Style;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.map.android.graphics.AndroidGraphicFactory;
import org.mapsforge.map.android.util.AndroidUtil;
import org.mapsforge.map.layer.Layer;
import org.mapsforge.map.layer.Layers;
import org.mapsforge.map.layer.cache.TileCache;
import org.mapsforge.map.layer.overlay.Polyline;
import org.mapsforge.map.layer.renderer.TileRendererLayer;
import org.mapsforge.map.rendertheme.InternalRenderTheme;
/*
import org.osmdroid.bonuspack.overlays.Marker;
import org.osmdroid.events.MapListener;
import org.osmdroid.events.ScrollEvent;
import org.osmdroid.events.ZoomEvent;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
*/
import org.mapsforge.map.android.view.MapView;
//import org.osmdroid.views.overlay.Overlay;

import java.io.File;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /*
    public MapView osm;
    MapController mc;
    */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //@Override
    public void verLinea(View v)
    {
        Toast.makeText(this, "Ver LINEA", Toast.LENGTH_LONG).show();
        Util.llamador ="ver linea";
        Intent i = new Intent(this.getApplicationContext(),ListaDeLineas.class);
        startActivity(i);

    }

    //@Override
    public void verTodasLasLineas(View v)
    {
        Toast.makeText(this, "Ver todas las lineas", Toast.LENGTH_LONG).show();
        Util.llamador ="ver todas";
        Intent i = new Intent(this.getApplicationContext(),Mapa.class);
        startActivity(i);

    }

}

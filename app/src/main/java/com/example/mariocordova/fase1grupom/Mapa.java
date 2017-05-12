package com.example.mariocordova.fase1grupom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import org.mapsforge.core.graphics.Color;
import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.graphics.Style;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.map.android.graphics.AndroidGraphicFactory;
import org.mapsforge.map.android.util.AndroidUtil;
import org.mapsforge.map.android.view.MapView;
import org.mapsforge.map.layer.cache.TileCache;
import org.mapsforge.map.layer.overlay.Polyline;
import org.mapsforge.map.layer.renderer.TileRendererLayer;
import org.mapsforge.map.rendertheme.InternalRenderTheme;

import java.io.File;
import java.util.List;

public class Mapa extends AppCompatActivity {

    private MapView mapView;
    private TileCache tileCache;
    private TileRendererLayer tileRendererLayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidGraphicFactory.createInstance(getApplication());
        setContentView(R.layout.activity_mapa);

        Toast.makeText(this,"MAPA",Toast.LENGTH_LONG).show();
        try {
            mapView = (MapView)findViewById(R.id.mapView);
            mapView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);

            mapView.setClickable(true);

            // create a tile cache of suitable size
            tileCache = AndroidUtil.createTileCache(this, "mapcache",
                    mapView.getModel().displayModel.getTileSize(), 1f,
                    mapView.getModel().frameBufferModel.getOverdrawFactor());

            mapView.getModel().mapViewPosition.setZoomLevel((byte) 15);
            mapView.getMapZoomControls().setZoomLevelMin((byte)8);
            //mapView.getMapZoomControls().setZoomLevelMax((byte)20);
            mapView.getMapZoomControls().setZoomLevelMax(mapView.getMapZoomControls().getZoomLevelMax());

            String filepath = "/sdcard/bolivia.map";//"/storage/extSdCard/maps/bolivia.map";//Environment.getExternalStorageDirectory().getPath() + "/maps/bolivia.map";
            // tile renderer layer using internal render theme
            tileRendererLayer = new TileRendererLayer(tileCache,
                    mapView.getModel().mapViewPosition, false, AndroidGraphicFactory.INSTANCE);
            tileRendererLayer.setMapFile(new File(filepath));

            tileRendererLayer.setXmlRenderTheme(InternalRenderTheme.OSMARENDER);

            // only once a layer is associated with a mapView the rendering starts
            mapView.getLayerManager().getLayers().add(tileRendererLayer);

            //mapView.setClickable(true);
            mapView.setBuiltInZoomControls(true);
            mapView.getMapScaleBar().setVisible(false);

            mapView.getModel().mapViewPosition.setCenter(new LatLong(-17.783319,-63.182127));

            MyMarker marker = new MyMarker(this, new LatLong(-17.783319,-63.182127), AndroidGraphicFactory.convertToBitmap(getResources().getDrawable(R.mipmap.ic_marker_green)), 0, 0);
            mapView.getLayerManager().getLayers().add(marker);




            Paint paint = AndroidGraphicFactory.INSTANCE.createPaint();
            paint.setColor(Color.BLUE);
            paint.setStrokeWidth(new Float(5.0));//strokeWidth);
            paint.setStyle(Style.STROKE);

            // instantiating the polyline object
            Polyline polyline = new Polyline(paint, AndroidGraphicFactory.INSTANCE);
            Util.linea2(polyline);
            mapView.getLayerManager().getLayers().add(polyline);
            /*
            List<LatLong> coordinateList = polyline.getLatLongs();
            coordinateList.add(new LatLong(-17.768923, -63.195484));
            coordinateList.add(new LatLong(-17.777449, -63.184498));
            coordinateList.add(new LatLong(-17.776359, -63.188300));
            */
            Paint paint2 = AndroidGraphicFactory.INSTANCE.createPaint();
            paint2.setColor(Color.GREEN);
            paint2.setStrokeWidth(new Float(5.0));//strokeWidth);
            paint2.setStyle(Style.STROKE);
            Polyline polyline2 = new Polyline(paint2, AndroidGraphicFactory.INSTANCE);
            Util.linea1(polyline2);
            // adding the layer to the mapview

            mapView.getLayerManager().getLayers().add(polyline2);
        }


        catch (Exception e)
        {
            Log.println(Log.ERROR,e.getLocalizedMessage(),"-------"+e.getMessage());

        }

    }
}

package com.example.mariocordova.fase1grupom;

import android.content.Context;

import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.map.android.graphics.AndroidGraphicFactory;
import org.mapsforge.map.layer.overlay.Polyline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by mariocordova on 11-05-17.
 */

public class Util {
    public static String llamador;
    public static Context contexto1;
    public static String path = "/storage/extSdCard/maps/lineas.text";

    public static String leerArchivo(Context contexto1) throws IOException{
        //File Root=Environment.getExternalStorageDirectory();
        //File Dir=new File(Root.getAbsolutePath());
        //File file=new File(Dir,NArchivo);

        String msg;
        try {
            FileInputStream fis=new FileInputStream(contexto1.getFileStreamPath(Util.path));
            File archivo = contexto1.getFileStreamPath(path);
            InputStreamReader isr=new InputStreamReader(fis);
            BufferedReader br=new BufferedReader(isr);
            StringBuffer sb=new StringBuffer();
            while ((msg=br.readLine())!=null){
                sb.append(msg + "\n");
            }
            return sb.toString();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("archivo no encontrado");
        } catch (IOException e) {
            throw new IOException("IOException");
        }
    }
    public static void linea2(Polyline polyline)
    {

        // set lat lng for the polyline
        List<LatLong> coordinateList = polyline.getLatLongs();

        coordinateList.add(new LatLong(-17.838220, -63.224251));
        coordinateList.add(new LatLong(-17.828824, -63.215475));
        coordinateList.add(new LatLong(-17.827568, -63.215314));
        coordinateList.add(new LatLong(-17.826434, -63.214305));
        coordinateList.add(new LatLong(-17.826454, -63.213919));
        coordinateList.add(new LatLong(-17.824360, -63.211226));
        coordinateList.add(new LatLong(-17.821674, -63.209037));
        coordinateList.add(new LatLong(-17.815770, -63.204220));
        coordinateList.add(new LatLong(-17.811970, -63.208243));
        coordinateList.add(new LatLong(-17.811704, -63.207964));
        coordinateList.add(new LatLong(-17.813124, -63.206516));
        coordinateList.add(new LatLong(-17.812041, -63.205379));
        coordinateList.add(new LatLong(-17.807209, -63.198534));
        coordinateList.add(new LatLong(-17.806657, -63.197697));
        coordinateList.add(new LatLong(-17.805258, -63.199027));
        coordinateList.add(new LatLong(-17.804819, -63.198523));
        coordinateList.add(new LatLong(-17.803737, -63.199274));
        coordinateList.add(new LatLong(-17.797097, -63.191678));
        coordinateList.add(new LatLong(-17.796198, -63.193159));
        coordinateList.add(new LatLong(-17.795238, -63.192665));
        coordinateList.add(new LatLong(-17.788731, -63.187923));
        coordinateList.add(new LatLong(-17.788057, -63.187204));
        coordinateList.add(new LatLong(-17.787679, -63.186206));
        coordinateList.add(new LatLong(-17.786310, -63.177816));
        coordinateList.add(new LatLong(-17.785820, -63.175627));
        coordinateList.add(new LatLong(-17.784400, -63.175927));
        coordinateList.add(new LatLong(-17.784002, -63.172215));
        coordinateList.add(new LatLong(-17.782776, -63.172430));
        coordinateList.add(new LatLong(-17.782694, -63.172130));
        coordinateList.add(new LatLong(-17.782898, -63.172012));
        coordinateList.add(new LatLong(-17.782244, -63.164738));
        coordinateList.add(new LatLong(-17.782101, -63.164234));
        coordinateList.add(new LatLong(-17.781239, -63.154737));
        coordinateList.add(new LatLong(-17.780667, -63.150488));
        coordinateList.add(new LatLong(-17.779993, -63.148396));
        coordinateList.add(new LatLong(-17.779308, -63.147688));
        coordinateList.add(new LatLong(-17.779277, -63.147205));
        coordinateList.add(new LatLong(-17.779420, -63.146518));
        coordinateList.add(new LatLong(-17.773071, -63.129808));
        coordinateList.add(new LatLong(-17.772223, -63.127673));
        coordinateList.add(new LatLong(-17.774072, -63.126085));
        coordinateList.add(new LatLong(-17.775553, -63.124862));
        coordinateList.add(new LatLong(-17.778577, -63.122759));
        coordinateList.add(new LatLong(-17.780079, -63.125999));
        coordinateList.add(new LatLong(-17.783236, -63.124658));
        coordinateList.add(new LatLong(-17.781356, -63.120270));
        coordinateList.add(new LatLong(-17.781111, -63.118961));
        coordinateList.add(new LatLong(-17.781285, -63.118693));
        coordinateList.add(new LatLong(-17.786117, -63.117910));
        coordinateList.add(new LatLong(-17.792676, -63.118232));
        coordinateList.add(new LatLong(-17.797539, -63.118575));
        coordinateList.add(new LatLong(-17.802156, -63.118800));
        coordinateList.add(new LatLong(-17.802146, -63.118950));
        coordinateList.add(new LatLong(-17.802340, -63.118950));
        coordinateList.add(new LatLong(-17.802371, -63.117802));
        coordinateList.add(new LatLong(-17.802606, -63.117620));
        coordinateList.add(new LatLong(-17.802964, -63.117663));
        coordinateList.add(new LatLong(-17.804466, -63.118435));
        coordinateList.add(new LatLong(-17.806008, -63.118692));
        coordinateList.add(new LatLong(-17.806335, -63.118778));

    }
    public static void linea1(Polyline polyline)
    {

        // set lat lng for the polyline
        List<LatLong> coordinateList = polyline.getLatLongs();

        coordinateList.add(new LatLong(-17.786305, -63.107162));
        coordinateList.add(new LatLong(-17.786443, -63.107744));
        coordinateList.add(new LatLong(-17.785971, -63.107882));
        coordinateList.add(new LatLong(-17.781731, -63.107776));
        coordinateList.add(new LatLong(-17.778576, -63.107630));
        coordinateList.add(new LatLong(-17.777381, -63.107440));
        coordinateList.add(new LatLong(-17.777044, -63.107365));
        coordinateList.add(new LatLong(-17.777054, -63.107794));
        coordinateList.add(new LatLong(-17.780201, -63.116527));
        coordinateList.add(new LatLong(-17.778270, -63.117890));




        coordinateList.add(new LatLong(-17.777893, -63.117215));

        coordinateList.add(new LatLong(-17.777137, -63.117591));

        coordinateList.add(new LatLong(-17.775942, -63.118321));
        coordinateList.add(new LatLong(-17.775834, -63.117969));
        coordinateList.add(new LatLong(-17.774592, -63.118374));
        coordinateList.add(new LatLong(-17.774374, -63.117880));
        coordinateList.add(new LatLong(-17.773194, -63.118153));
        coordinateList.add(new LatLong(-17.771752, -63.118264));
        coordinateList.add(new LatLong(-17.771793, -63.118843));
        coordinateList.add(new LatLong(-17.770812, -63.118929));
        coordinateList.add(new LatLong(-17.770924, -63.119766));

        coordinateList.add(new LatLong(-17.769626, -63.120442));
        coordinateList.add(new LatLong(-17.767838, -63.115239));
        coordinateList.add(new LatLong(-17.767838, -63.115239));
        coordinateList.add(new LatLong(-17.779152, -63.146005));
        coordinateList.add(new LatLong(-17.779152, -63.146005));
        coordinateList.add(new LatLong(-17.779438, -63.146857));
        coordinateList.add(new LatLong(-17.779305, -63.147625));
        coordinateList.add(new LatLong(-17.779484, -63.147858));
        coordinateList.add(new LatLong(-17.779790, -63.148156));
        coordinateList.add(new LatLong(-17.780051, -63.148558));
        coordinateList.add(new LatLong(-17.780596, -63.150077));
        coordinateList.add(new LatLong(-17.782144, -63.164484));
        coordinateList.add(new LatLong(-17.782206, -63.164868));
        coordinateList.add(new LatLong(-17.782288, -63.165856));
        coordinateList.add(new LatLong(-17.782920, -63.172000));
        coordinateList.add(new LatLong(-17.782713, -63.172132));
        coordinateList.add(new LatLong(-17.779431, -63.172626));
        coordinateList.add(new LatLong(  -17.779323, -63.172768));
        coordinateList.add(new LatLong(      -17.779451, -63.172883                ));


        coordinateList.add(new LatLong(   -17.779530, -63.173191                   ));
        coordinateList.add(new LatLong(    -17.780429, -63.178780                 ));
        coordinateList.add(new LatLong(    -17.784607, -63.178115                  ));
        coordinateList.add(new LatLong(    -17.786849, -63.181334                  ));
        coordinateList.add(new LatLong(      -17.787339, -63.183823                ));
        coordinateList.add(new LatLong(      -17.787339, -63.183823                ));
        coordinateList.add(new LatLong(  -17.788115, -63.187257                    ));
        coordinateList.add(new LatLong(   -17.788769, -63.187890                   ));
        coordinateList.add(new LatLong(    -17.790485, -63.187472                  ));
        coordinateList.add(new LatLong( -17.793121, -63.187129                     ));
        coordinateList.add(new LatLong(     -17.797815, -63.192618                 ));
        coordinateList.add(new LatLong(   -17.797948, -63.192951                   ));
        coordinateList.add(new LatLong(     -17.798203, -63.193005                 ));
        coordinateList.add(new LatLong(      -17.803747, -63.199292                ));
        coordinateList.add(new LatLong(   -17.811774, -63.208414                   ));
        coordinateList.add(new LatLong(   -17.819179, -63.198801                   ));
        coordinateList.add(new LatLong(    -17.819639, -63.198619                  ));
        coordinateList.add(new LatLong(    -17.828385, -63.203063                  ));
        coordinateList.add(new LatLong(   -17.830642, -63.201379                   ));
    }
}

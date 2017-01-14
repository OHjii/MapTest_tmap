package ohh.maptest_t;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.skp.Tmap.TMapMarkerItem;
import com.skp.Tmap.TMapPoint;
import com.skp.Tmap.TMapView;

public class MainActivity extends AppCompatActivity {

    private final String TMAP_API_KEY = "b1914c83-23f8-383b-989f-784d06066b6f";
    private TMapView tmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTmap();
    }

    private void initTmap() {
        tmap = new TMapView(this);
        tmap.setSKPMapApiKey(TMAP_API_KEY);
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.main_layout_tmap);

        double lat = 37.621957;
        double lng = 127.084077;
        tmap.setCenterPoint(lng, lat);
        tmap.setZoomLevel(15);

        layout.addView(tmap);
        addMarker();
    }

    private void addMarker() {
        double lat = 37.621956;
        double lng = 127.084077;

        TMapPoint point = new TMapPoint(lat,lng);
        TMapMarkerItem marker = new TMapMarkerItem();
        marker.setTMapPoint(point);
        tmap.addMarkerItem("marker",marker);


    }
}


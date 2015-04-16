package com.odong.xingwu.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.odong.xingwu.R;
import com.odong.xingwu.models.Video;
import com.odong.xingwu.services.YoukuService;
import com.odong.xingwu.utils.XmlHelper;
import com.odong.xingwu.widgets.VideosView;

import java.util.List;
import java.util.Map;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initVideos();
        startService(new Intent(this, YoukuService.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initVideos() {
        Map<String, List<Video>> videosMap = new XmlHelper(this).getVideos();
        LinearLayout layout = (LinearLayout) findViewById(R.id.ll_main);
        for (Map.Entry<String, List<Video>> entry : videosMap.entrySet()) {
            VideosView vv = new VideosView(this);
            vv.setTitle(entry.getKey());
            vv.setVideos(entry.getValue());
            layout.addView(vv);
        }

    }
}

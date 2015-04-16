package com.odong.xingwu.widgets;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.TextView;

import com.odong.xingwu.R;
import com.odong.xingwu.models.Video;

import java.util.List;

/**
 * Created by flamen on 15-4-16.
 */
public class VideosView extends FrameLayout {
    public VideosView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.video_list, this);
    }

    public void setTitle(String title) {
        ((TextView) findViewById(R.id.tv_video_list)).setText(title);
    }

    public void setVideos(List<Video> videos) {
        ((GridView) findViewById(R.id.gv_video_list)).setAdapter(new VideoAdapter(getContext(), videos));
    }


}

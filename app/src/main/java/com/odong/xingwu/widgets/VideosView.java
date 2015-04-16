package com.odong.xingwu.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.TextView;

import com.odong.xingwu.R;
import com.odong.xingwu.models.Video;

/**
 * Created by flamen on 15-4-16.
 */
public class VideosView extends FrameLayout {
    public VideosView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.videos, this);
        tv = (TextView) findViewById(R.id.tv_videos);
        gv = (GridView) findViewById(R.id.gv_videos);

    }

    public void setTitle(String title) {
        tv.setText(title);
    }

    public void addVideo(Video video) {

    }

    private GridView gv;
    private TextView tv;
}

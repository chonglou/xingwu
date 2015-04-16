package com.odong.xingwu.widgets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.odong.xingwu.R;
import com.odong.xingwu.models.Video;

import java.util.List;

/**
 * Created by flamen on 15-4-16.
 */
public class VideoAdapter extends BaseAdapter {
    public VideoAdapter(Context context, List<Video> videos) {
        this.context = context;
        this.videos = videos;
    }

    @Override
    public int getCount() {
        return videos.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            grid = inflater.inflate(R.layout.video_show, null);

            Video video = videos.get(position);

            View.OnClickListener click = new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                }
            };

            ImageButton ib = (ImageButton) grid.findViewById(R.id.ib_video_show);
            //ib.setImageResource(icon.getImage());
            ib.setOnClickListener(click);

            TextView tv = (TextView) grid.findViewById(R.id.tv_video_show);
            tv.setText(video.getTitle());
            tv.setOnClickListener(click);

        } else {
            grid = convertView;
        }
        return grid;


    }

    private Context context;
    private List<Video> videos;
}

package com.odong.xingwu.services;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.odong.xingwu.Config;
import com.odong.xingwu.models.Video;

public class YoukuService extends IntentService {

    public YoukuService() {
        super("YoukuService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("SyncService", "检查资源文件");
    }

    private Video getVideo(String vid) {
        Video v = new Video();
        v.setVid(vid);
        String url = "https://openapi.youku.com/v2/videos/show.json?client_id="
                +
                Config.YOUKU_CLIENT_ID + "&video_id=" + vid;
        //todo
        return v;
    }

}

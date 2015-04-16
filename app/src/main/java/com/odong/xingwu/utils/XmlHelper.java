package com.odong.xingwu.utils;


import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;

import com.odong.xingwu.R;
import com.odong.xingwu.models.Video;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by flamen on 15-4-15.
 */
public class XmlHelper {
    public XmlHelper(Context context) {
        this.context = context;
    }

    public Map<String, List<Video>> getVideos() {
        int rid = R.xml.videos;
        Map<String, List<Video>> map = new LinkedHashMap<>();
        try {
            XmlResourceParser xrp = context.getResources().getXml(rid);
            Video video = null;
            String catalog = null;
            for (int et = xrp.getEventType(); et != XmlPullParser.END_DOCUMENT; et = xrp.next()) {

                switch (et) {
                    case XmlPullParser.START_TAG:
                        switch (xrp.getName()) {
                            case "item":
                                video = new Video();
                                break;
                            case "catalog":
                                catalog = xrp.nextText();
                                break;
                            case "vid":
                                video.setVid(xrp.nextText());
                                break;
                            case "title":
                                video.setTitle(xrp.nextText());
                                break;
                        }
                        break;
                    case XmlPullParser.END_TAG:
                        if (xrp.getName().equals("item")) {
                            if (!map.containsKey(catalog)) {
                                map.put(catalog, new ArrayList<Video>());
                            }

                            map.get(catalog).add(video);
                        }
                        break;
                }
            }
        } catch (XmlPullParserException | IOException e) {
            Log.d("解析XML出错", context.getResources().getResourceName(rid), e);
        }

        return map;
    }

    private Context context;
}

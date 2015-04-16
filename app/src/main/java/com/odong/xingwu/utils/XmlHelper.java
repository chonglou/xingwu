package com.odong.xingwu.utils;


import android.content.Context;

import com.odong.xingwu.models.Video;

import org.xmlpull.v1.XmlPullParser;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by flamen on 15-4-15.
 */
public class XmlHelper {
    public XmlHelper(Context context){
        this.context = context;
    }
    public Map<String, List<Video>> getVideos(){
        Map<String, List<Video>> map = new LinkedHashMap<>();
        try{
            XmlPullParser parser = 
        }
        return map;
    }
    private Context context;
}

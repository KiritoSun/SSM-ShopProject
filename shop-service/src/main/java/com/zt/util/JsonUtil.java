package com.zt.util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.List;

public class JsonUtil {
    // java对象转json
    public static String JsonObject(Object o){
        JSONObject object = null;
        try {
            object = JSONObject.fromObject(o);
        }catch (Exception e){
            e.printStackTrace();
        }finally {}
        return object.toString();
    }

    //java链表转json数组
    public static String JsonArray(List<Object> list){
        JSONArray array = null;
        try{
            array = JSONArray.fromObject(list);
        }catch (Exception e){
            e.printStackTrace();
        }finally {}
        return array.toString();
    }
}

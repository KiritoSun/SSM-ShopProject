package com.zt.util;

import com.zt.pojo.order;
import com.zt.model.pay;

import java.util.ArrayList;
import java.util.List;

public class PayUtil {
    public static List<pay> createList(String ids,String imgs,String names,
                                       String numbers,String prices){
        List<pay> list = new ArrayList<>();
        String[] id = toArray(ids);
        String[] img = toArray(imgs);
        String[] name = toArray(names);
        String[] number = toArray(numbers);
        String[] price = toArray(prices);
        pay p = null;
        for(int i=0;i<img.length;i++){
            p = new pay(id[i],img[i],name[i],new Integer(number[i]),new Integer(price[i]));
            list.add(p);
        }
        return list;
    }

    public static order createOrder(String id,List<pay> list,String cname,String price){
        order order = null;
        String ids = "";
        String names = "";
        for(pay e : list){
            ids+=","+e.getId();
            names+=","+e.getName();
        }
        ids = ids.replaceFirst(",","");
        names = names.replaceFirst(",","");
        order = new order(id,cname,ids,names,new Integer(price));
        return order;
    }

    public static List<String> toList(String str){
        List<String> list = new ArrayList<>();
        String[] s = str.split(",");
        for(String e : s){
            list.add(e);
        }
        return list;
    }

    public static String[] toArray(String str){
        String[] p = null;
        try{
            p = str.split(",");
        }catch (Exception e){
            e.printStackTrace();
        }finally {}
        return p;
    }
}

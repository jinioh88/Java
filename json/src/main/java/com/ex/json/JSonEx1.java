package com.ex.json;

import org.json.simple.JSONObject;

import java.util.HashMap;

public class JSonEx1 {
    public static void main(String[] args) {
        JSonEx1 ex1 = new JSonEx1();
        JSONObject obj = ex1.createJSONObject();
        HashMap map = ex1.getMapObject();

        System.out.println("result1 : "+obj.toJSONString());
        System.out.println("result1 : "+obj.toString());

        System.out.println("result2 : "+ex1.getMapObject());
    }

    public JSONObject createJSONObject() {
        JSONObject obj = new JSONObject();
        obj.put("Name","Sana");
        obj.put("Age","21");
        obj.put("Marriage", new Boolean(false));
        obj.put("Location","Osaka");

        return obj;
    }

    public HashMap getMapObject() {
        HashMap map = new HashMap();
        map.put("URL","www.facebook.com");
        map.put("ID","sanakim");
        map.put("PW","1234");

        return map;
    }

}

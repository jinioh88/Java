package com.ex.json;

import org.apache.camel.json.simple.parser.JSONParser;
import org.apache.camel.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Iterator;
import java.util.Set;

public class JSONEx3 {
    public static void main(String[] args) {
        JSONEx3 ex3 = new JSONEx3();
        String str = ex3.getStringByJSONObject();
        Object obj = ex3.parseJSON(str);
        ex3.analysis(obj);

        System.out.println("======================");

        str = ex3.getStringByJSONArray();
        obj = ex3.parseJSON(str);
        ex3.analysis(obj);
    }

    public String getStringByJSONArray() {
        JSONArray rtArray = new JSONArray();
        rtArray.add("Mongolia");
        rtArray.add("ITALY");

        return rtArray.toJSONString();
    }

    public String getStringByJSONObject() {
        JSONObject rtObj = new JSONObject();
        rtObj.put("Name","Sana");
        rtObj.put("LOCATION","Osaka");
        rtObj.put("FIELD","Twice");

        return rtObj.toJSONString();
    }

    public Object parseJSON(String jsonString) {
        Object rt = null;
        JSONParser parser = new JSONParser();
        try{
            rt = parser.parse(jsonString);
        }catch (ParseException e) {
            e.printStackTrace();
        }
        return rt;
    }

    public void analysis(Object obj) {
        if(obj instanceof JSONArray) {
            JSONArray array = (JSONArray) obj;
            Iterator iterator = array.iterator();
            while(iterator.hasNext()) {
                System.out.println("["+ iterator.next()+"] ");
            }
            System.out.println();
        } else if(obj instanceof JSONObject) {
            JSONObject object = (JSONObject)obj;
            Set kkeySet = object.keySet();
            for(Object key : kkeySet) {
                Object value = object.get(key);
                System.out.println("["+key+" / "+value+"}");
            }
        } else {
            System.out.println("Can't analayze");
        }

    }
}

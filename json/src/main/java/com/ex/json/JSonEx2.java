package com.ex.json;

import org.json.simple.JSONArray;

import java.util.Vector;

public class JSonEx2 {
    public static void main(String[] args) {
        JSonEx2 ex2 = new JSonEx2();
        JSONArray array1 = ex2.createJSONArray();
        JSONArray array2 = ex2.createMixedJSONArray();
        Vector vector = ex2.createVector();

        System.out.println("Result1 : "+array1.toJSONString());
        System.out.println("result2 : "+array2.toString());
        System.out.println("result3 : "+JSONArray.toJSONString(vector));
    }

    public JSONArray createJSONArray() {
        JSONArray array = new JSONArray();
        array.add("Sana");
        array.add("Sejin");
        array.add("LLlL");

        return array;
    }

    public JSONArray createMixedJSONArray() {
        JSonEx1 exam = new JSonEx1();

        JSONArray array = new JSONArray();
        array.add("SEOUL");
        array.add("NEW YORK");
        array.add("KUALA LUMPUR");
        array.add(exam.createJSONObject());

        return array;
    }

    public Vector createVector() {
        Vector vector = new Vector();

        vector.add("www.facebook.com");
        vector.add("www.daum.net");

        return vector;
    }
}

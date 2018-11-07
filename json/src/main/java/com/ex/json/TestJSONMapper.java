package com.ex.json;

import junit.framework.TestCase;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class TestJSONMapper extends TestCase {
    public void testGetJSONObject() {
        long beginTime = System.nanoTime();

        TestValue testVO = new TestValue();
        testVO.setAge(22);
        testVO.setCustomerName("Sana");
        testVO.setHeight(163.3D);
        testVO.setMarried(false);
        testVO.setName("Sana Kim");
        testVO.setWeight(48.2F);

        JSONMapper<TestValue> mapper = new JSONMapper<>();
        try {
            JSONObject obj = mapper.getJSONObject(testVO);
            System.out.println(obj);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            double execTime = (double) (System.nanoTime()-beginTime) /1000000;
            System.out.println(execTime+" ms");
        }
    }

    public void testGetJSONArray() {
        long beginTime = System.nanoTime();

        TestValue testVO = new TestValue();
        testVO.setAge(22);
        testVO.setCustomerName("Sana");
        testVO.setHeight(163.3D);
        testVO.setMarried(false);
        testVO.setName("Sana Kim");
        testVO.setWeight(48.2F);

        ArrayList<TestValue> testList = new ArrayList<>();
        for(int i=0; i<10;i++) {
            testList.add(testVO);
        }

        JSONMapper<TestValue> mapper = new JSONMapper<>();
        try {
            JSONArray jsonArray = mapper.getJSONArray(testList);
            System.out.println(jsonArray);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            double execTime = (double) (System.nanoTime()-beginTime) /1000000;
            System.out.println(execTime+" ms");
        }
    }

    @SuppressWarnings("unchecked")
    public void testGetValueObject() {
        long beginTime = System.nanoTime();

        JSONObject obj = new JSONObject();
        obj.put("customerName","Sana Kim");
        obj.put("married",false);
        obj.put("weight",47.2f);
        obj.put("height",164.3D);
        obj.put("age",22);
        obj.put("name","Sana");

        JSONMapper<TestValue> mapper = new JSONMapper<>();
        try {
            TestValue vo = mapper.getValueObject(TestValue.class,obj);
            System.out.println(vo.getAge());
            System.out.println(vo.getCustomerName());
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            double execTime = (double) (System.nanoTime()-beginTime) /1000000;
            System.out.println(execTime+" ms");
        }
    }

    @SuppressWarnings("unchecked")
    public void testGetValueList() {
        long beginTime = System.nanoTime();

        JSONArray jsonArray = new JSONArray();
        for(int i=0;i<10;i++) {
            JSONObject obj = new JSONObject();
            obj.put("customerName","Sana");
            obj.put("married",false);
            obj.put("weight",47.2F);
            obj.put("height",164.3D);
            obj.put("age",i);
            obj.put("name","sana Kim");

            jsonArray.add(obj);
        }

        JSONMapper<TestValue> mapper = new JSONMapper<>();
        try {
            ArrayList<TestValue> testList = mapper.getValueObjectList(TestValue.class,jsonArray);

            for(TestValue test : testList) {
                System.out.println(test.getName() + test.getAge());
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            double execTime = (double) (System.nanoTime()-beginTime) /1000000;
            System.out.println(execTime+" ms");
        }
    }
}

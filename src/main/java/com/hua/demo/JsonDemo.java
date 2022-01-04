package com.hua.demo;

import com.alibaba.fastjson.JSONArray;

public class JsonDemo {

  public static void doSomething() {

  }

  public static void someFn(JSONArray jsonArray) {
    if (jsonArray == null || jsonArray.isEmpty()) {
      System.out.println("empty");
      return;
    }
    System.out.println(jsonArray);
  }

  public static void main(String[] args) {
    JSONArray result = new JSONArray();
    someFn(null);
    someFn(result);
  }
}

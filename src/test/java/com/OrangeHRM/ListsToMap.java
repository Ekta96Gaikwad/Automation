package com.OrangeHRM;
import java.util.*;
public class ListsToMap {
  static public void main(String[] args) {
    List<String> names = Arrays.asList("apple,orange,pear".split(","));
    List<String> things = Arrays.asList("123,456,789".split(","));
    Map<String,String> map = new LinkedHashMap<String,String>();  // ordered

    for (int i=0; i<names.size(); i++) {
      map.put(names.get(i), things.get(i));    // is there a clearer way?
    }

    System.out.println(map);
  }
}
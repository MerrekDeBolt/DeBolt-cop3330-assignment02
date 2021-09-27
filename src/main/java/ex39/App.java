package ex39;
/*
 *  UCF COP3330 Fall 2021 Exercise 39 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.*;

public class App {

    public static ArrayList<Map<String, String>> createMaps()
    {
        ArrayList<Map<String, String>> maps = new ArrayList<Map<String, String>>();

        Map<String, String> map;

        map = createMap("John", "Johnson", "Manager", "2016-12-31");
        maps.add(map);

        map = createMap("Tou", "Xiong", "Software Engineer", "2016-10-15");
        maps.add(map);

        map = createMap("Michaela", "Michaelson", "District Manager", "2015-12-29");
        maps.add(map);

        map = createMap("Jake", "Jacobson", "Programmer", "");
        maps.add(map);

        map = createMap("Jacquelyn", "Jackson", "DBA", "");
        maps.add(map);

        map = createMap("Sally", "Webber", "Web Developer", "2015-12-18");
        maps.add(map);

        return maps;
    }

    public static Map<String, String> createMap(String firstName, String lastName, String position, String date)
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("First Name", firstName);
        map.put("Last Name", lastName);
        map.put("Position", position);
        map.put("Separation Date", date);
        return map;
    }

    public static Comparator<Map<String, String>> mapComparator = new Comparator<Map<String, String>>() {
        public int compare(Map<String, String> m1, Map<String, String> m2) {
            return m1.get("First Name").compareTo(m2.get("First Name"));
        }
    };

    public static void main(String[] args)
    {
        ArrayList<Map<String, String>> maps = createMaps();
        Collections.sort(maps, mapComparator);

        System.out.println(String.format("%5s | %5s | %5s", "Name", "Position", "Separation Date"));
    }
}
package ex40;
/*
 *  UCF COP3330 Fall 2021 Exercise 40 Solution
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

    public static ArrayList<Map<String, String>> filterMaps(ArrayList<Map<String, String>> maps, String filter)
    {
        ArrayList<Map<String, String>> newMaps = new ArrayList<Map<String, String>>();

        Map<String, String> map;
        for (int index = 0; index < maps.size(); index++)
        {
            map = maps.get(index);
            if (map.get("First Name").contains(filter) || map.get("Last Name").contains(filter))
                newMaps.add(map);
        }

        return newMaps;
    }

    public static void printTable(ArrayList<Map<String, String>> filteredMaps)
    {
        System.out.println(String.format(" %20s | %20s | %20s", "Name", "Position", "Separation Date"));
        System.out.println("----------------------|----------------------|----------------------");

        Map<String, String> map;
        String name, position, date;
        for (int index = 0; index < filteredMaps.size(); index++)
        {
            map = filteredMaps.get(index);

            name = map.get("First Name") + " " + map.get("Last Name");
            position = map.get("Position");
            date = map.get("Separation Date");

            System.out.println(String.format(" %20s | %20s | %20s ", name, position, date));
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Map<String, String>> maps = createMaps();

        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a search string: ");
        input = scanner.nextLine();

        ArrayList<Map<String, String>> filteredMaps = filterMaps(maps, input);

        Collections.sort(filteredMaps, mapComparator);

        printTable(filteredMaps);
    }
}
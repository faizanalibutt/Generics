package com.ali.fiazi.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Home {

    public static class hello {
        void setName() {
            System.out.println("Happy Advance Programming!");
        }
    }

    public static class PracticeMap {

        void setMapValues() {

            HashMap<Integer, String> mMap = new HashMap<>();
            mMap.put(1, "faizi");
            mMap.put(2, "studio");
            System.out.println(mMap);

            Set mSet = mMap.entrySet();
            for (Object o : mSet) {
                Map.Entry mEntry = (Map.Entry) o;
                System.out.println(mEntry.getKey() + " " + mEntry.getValue());
            }

            System.out.println("New Method of iterating throug Hashmap using Generics");

            /* GENERICS IMPLEMENTED HERE FOR HASHMAP LET'S ENJOY */

            Set<Map.Entry<Integer, String>> mSetGeneric = mMap.entrySet();
            for (Map.Entry mEntry : mSetGeneric)
                System.out.println(String.format("Map Key is: %s, Map Value is: %s", mEntry.getKey(), mEntry.getValue()));

            mMap.get(1);

            mMap.remove(2);

            mMap.put(2, "faizanalibutt");

            for(Integer key: mMap.keySet()) {
                System.out.println(String.format("key is: %d", key));

                System.out.println(String.format("value without values(): %s", mMap.get(key)));
            }

            for (String value: mMap.values())
                System.out.println(String.format("mMap value is: %s", value));

        }
    }

}

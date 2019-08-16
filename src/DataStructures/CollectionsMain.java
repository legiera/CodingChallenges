package DataStructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionsMain {
    public static void main() {

        //ex1()
        arraylistplay();
        System.out.println("---------");
        mapplay();

    }

    static void arraylistplay(){
        Collection collection = new ArrayList<String>();

        ArrayList<String> list = new ArrayList<>();
        list.add("Anna");
        list.add("Zofia");
        list.add("Przemyslaw");

        ((ArrayList) collection).add("Anna");
        ((ArrayList) collection).add("Przemyslaw");
      System.out.println(list);

    }

    static void mapplay(){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 101);
        map.put(2,102);
        map.put(3,103);

        System.out.println(map);
        System.out.println("Hashtable: "+ map.toString());
        System.out.println(map.get(1));
        int i = map.get(1);
        Integer j = map.get(1);
        System.out.println(i);
        System.out.println(j);
    }

}


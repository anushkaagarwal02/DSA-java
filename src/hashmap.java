import java.util.HashMap;

public class hashmap {
    public static void main(String[] args)
    {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Anushka",21);
        map.put("Anu",20);
        map.put("shihka",26);
        map.put("Anshika",12);
        HashMap<String,Integer> map1=new HashMap<>();
        map1.put("shihka",26);
        map1.put("Anu",20);
        map1.put("Anushka",21);
        map1.put("Anshika",12);
        System.out.println(map);
        System.out.println(map1);
        System.out.println(map.hashCode());
        System.out.println("map.size()=" + map.size());
         System.out.println("map.keySet()=" + map.keySet());
        System.out.println("map.values()=" + map.values());
        System.out.println("map.get(\"Uhr\")=" + map.get("Uhr"));
        System.out.println("map.remove(\"Rad\")=" + map.remove("Rad"));
        System.out.println("map.get(\"Rad\")=" + map.get("Rad"));
        System.out.println("map=" + map);
        System.out.println("map.size()=" + map.size());
    }
}

package org.example;

import java.util.HashMap;

public class Map {


    public Map(){
        System.out.print("Creee la clase Map jeje \n");
    }

    public Map(int algo){
        System.out.print("Cree la clase Map pero con otro constructor \n");
    }
    public void testNoStatic(){
        System.out.print("Este método no es estatico");
    }
    public static void test(){
        System.out.print("HISISIIS \n");
    }
    public static void mapexample() {
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Ali", 234);
        empIds.put("seb", 2333);
        empIds.put("rob", 1223);
        System.out.println(empIds);

        System.out.println(empIds.get("Ali"));
        System.out.println(empIds.containsKey("roby"));
        System.out.println(empIds.containsValue(234));

        empIds.put("Luigui", 2345);
        System.out.println(empIds);

        empIds.putIfAbsent("juan", 1220);
        System.out.println(empIds);

        empIds.remove("rob");
        System.out.println(empIds);
    }
}

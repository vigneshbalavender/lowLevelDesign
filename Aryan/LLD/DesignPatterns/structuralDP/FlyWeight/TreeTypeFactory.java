package LLD.DesignPatterns.structuralDP.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
    private static Map<String,TreeType> treeTypeMap = new HashMap<>();

    public static TreeType getTreeType(String name,String color,String texture){
        String key = name+"-"+color+"-"+texture;
        if(!treeTypeMap.containsKey(key)){
            treeTypeMap.put(key,new TreeType(name,color,texture));
        }
        return treeTypeMap.get(key);
    }
}

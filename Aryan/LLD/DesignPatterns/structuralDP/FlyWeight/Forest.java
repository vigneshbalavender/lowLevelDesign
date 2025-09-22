package LLD.DesignPatterns.structuralDP.FlyWeight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    List<Tree> treeList;
    public Forest(){
        treeList = new ArrayList<>();
    }

    public void plantTree(int x,int y,String name,String color,String texture){
        Tree tree = new Tree(x,y,name,color,texture);
        treeList.add(tree);
    }
    public void draw(){
        for(Tree tree:treeList){
            tree.draw();
        }
    }
}

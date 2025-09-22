package LLD.DesignPatterns.structuralDP.FlyWeight;

public class Tree {
    private int positionX;
    private int positionY;
    private TreeType treeType;

    public Tree(int positionX,int positionY,String name,String color,String texture){
        this.positionX=positionX;
        this.positionY=positionY;
        this.treeType = TreeTypeFactory.getTreeType(name,color,texture);
    }

    public void draw(){
       treeType.draw(positionX,positionY);
    }
}

package LLD.DesignPatterns.structuralDP.FlyWeight;

public class TreeType {
    String name;
    String color;
    String texture;
    public TreeType(String name,String color,String texture){
        this.name=name;
        this.color=color;
        this.texture=texture;
    }
  public void draw(int x,int y){
      System.out.println("planting tree : position x&Y"+x+" & "+y+" name:"+ name+" color:"+color+" texture:"+ texture);
  }
}

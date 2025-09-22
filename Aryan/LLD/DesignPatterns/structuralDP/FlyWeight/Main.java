package LLD.DesignPatterns.structuralDP.FlyWeight;

public class Main {
    public static void main(String[] args) {
        Forest forest =new Forest();

        for(int x=0;x<10;x++){
            for(int y=0;y<10;y++){
                forest.plantTree(x,y,"OAK","green","rough");
            }
        }

        forest.draw();
    }
}

package LLD.opencloseprinciple.badcode;

public class Shape {
    public String type;
    public int calculateArea(){
        if("circle".equals(type)){
            System.out.println("get radius input calculate area");
        }else if("rectangle".equals(type)){
            System.out.println("get hight and width calculate area");
        }
        //adding shapes in future by adding more if conditions
        return 0;
    }
}

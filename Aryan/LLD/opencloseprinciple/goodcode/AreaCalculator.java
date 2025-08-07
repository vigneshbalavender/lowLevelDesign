package LLD.opencloseprinciple.goodcode;

public class AreaCalculator {
    public static void main(String[] args) {
        Shape shape = new circle();
        shape.calculateArea(); // calculate area for circle

        shape = new Rectangle();
        shape.calculateArea();
        //in future if you want triangle you can add seamlessly

    }
}

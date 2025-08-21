package LLD.DesignPatterns.structuralDP.Bridge;

public class VectorRenderer implements Renderer{
    @Override
    public void drawCircle(double radius) {
        System.out.println("Vector rendering Circle with radius: "+radius);
    }

    @Override
    public void drawRectangle(int width, int height) {
        System.out.println("Vector rendering Rectangle with width and height "+width+" & "+height);
    }
}

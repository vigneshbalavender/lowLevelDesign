package LLD.DesignPatterns.structuralDP.Bridge;

public class RasterRenderer implements Renderer{

    @Override
    public void drawCircle(double radius) {
        System.out.println("Raster Rendering Circle with radius : "+radius);
    }

    @Override
    public void drawRectangle(int width, int height) {
        System.out.println("Raster Rendering Rectangle with width and height "+width+" & "+height);
    }
}

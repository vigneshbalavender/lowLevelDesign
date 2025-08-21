package LLD.DesignPatterns.structuralDP.Bridge;

public class DrawingApp {
    public static void main(String[] args) {

        Renderer raster = new RasterRenderer();
        Renderer vector =new VectorRenderer();
        Shape rasterCircle = new Circle(raster,6);
        Shape vectorCircle = new Circle(vector,7);

        Shape rasterRectangle = new Rectangle(raster,4,5 );
        Shape vectorRectangle = new Rectangle(vector,5,8);

        rasterCircle.draw();
        rasterRectangle.draw();

        vectorCircle.draw();
        vectorRectangle.draw();
    }
}

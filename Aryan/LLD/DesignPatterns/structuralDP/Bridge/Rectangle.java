package LLD.DesignPatterns.structuralDP.Bridge;

public class Rectangle extends Shape{
    private int width;
    private int height;
    public Rectangle(Renderer renderer,int width,int height){
        super(renderer);
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw() {
        renderer.drawRectangle(width,height);
    }
}

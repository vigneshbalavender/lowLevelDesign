package LLD.solid.interfaceSegmented.badcode;

public class BasicPrinter implements Machine{

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("cannot scan throwing error");
    }

    @Override
    public void fax() {
        System.out.println("cannot fax throwing error");
    }
}

package LLD.solid.interfaceSegmented.badcode;

public class AllInOnePrinter implements Machine{
    @Override
    public void print() {
        System.out.println("printing....");
    }

    @Override
    public void scan() {
        System.out.println("scanning reports....");
    }

    @Override
    public void fax() {
        System.out.println("sending fax...");
    }
}

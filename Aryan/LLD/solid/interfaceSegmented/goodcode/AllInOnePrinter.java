package LLD.solid.interfaceSegmented.goodcode;

public class AllInOnePrinter implements Printer,Scanner,FaxMachine{
    @Override
    public void fax() {
        System.out.println("sending fax...");
    }

    @Override
    public void print() {
        System.out.println("start printing...");
    }

    @Override
    public void scan() {
        System.out.println("scanning reports...");
    }
}

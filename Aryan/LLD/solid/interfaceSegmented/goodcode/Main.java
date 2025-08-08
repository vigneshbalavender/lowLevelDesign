package LLD.solid.interfaceSegmented.goodcode;

public class Main {
    public static void main(String[] args) {
        AllInOnePrinter printer = new AllInOnePrinter();
        BasicPrinter basicPrinter=new BasicPrinter();
        printer.print();
        printer.scan();
        printer.fax();
        basicPrinter.print();
    }
}

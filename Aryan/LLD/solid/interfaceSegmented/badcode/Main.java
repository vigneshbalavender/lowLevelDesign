package LLD.solid.interfaceSegmented.badcode;

public class Main {
    public static void main(String[] args) {
        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.scan();
        printer.fax();
//by basic printer implements general Machine interface
// it forced to implement irrelevent methods like scan and fax
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print();
        basicPrinter.scan();
        basicPrinter.fax();
    }
}

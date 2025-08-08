package LLD.solid.SingleResponsibility.badcode;

public class Bakery {
    public static void main(String[] args) {
        BreadBaker baker = new BreadBaker();
        baker.makeBread();
    baker.manageInventory();
    baker.orderSupplies();
    baker.serveCustomer();
    baker.cleanBakery();
    }

}

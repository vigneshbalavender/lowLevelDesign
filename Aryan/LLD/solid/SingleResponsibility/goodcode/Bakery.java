package LLD.solid.SingleResponsibility.goodcode;

import LLD.solid.SingleResponsibility.badcode.BreadBaker;

public class Bakery {
    public static void main(String[] args) {
        BreadBaker baker = new BreadBaker();
        InventoryManager inventoryManager=new InventoryManager();
        SupplyOrder supplyOrder = new SupplyOrder();
        CustomerService customerService = new CustomerService();
        BakeryCleaner bakeryCleaner = new BakeryCleaner();


        baker.makeBread();
        inventoryManager.manageInventory();
        supplyOrder.orderSupplies();
        customerService.serveCustomer();
        bakeryCleaner.cleanBakery();
    }
}

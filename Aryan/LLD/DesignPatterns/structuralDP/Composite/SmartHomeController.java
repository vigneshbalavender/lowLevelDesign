package LLD.DesignPatterns.structuralDP.Composite;

public class SmartHomeController {
    public static void main(String[] args) {
        SmartComponent room1Light =new SmartLight("room1 Light");
        SmartComponent room1AC = new AirConditionor("room1 AC");

        CompositeSmartComponent room1 = new CompositeSmartComponent();
        room1.addComponent(room1Light);
        room1.addComponent(room1AC);

        room1.turnOn();
        room1.turnOff();

        SmartComponent room2Light =new SmartLight("room2 Light");
        SmartComponent room2AC = new AirConditionor("room2 AC");
        CompositeSmartComponent room2 = new CompositeSmartComponent();
        room2.addComponent(room2Light);
        room2.addComponent(room2AC);

        room2.turnOn();
        room2.turnOff();

        CompositeSmartComponent floor = new CompositeSmartComponent();
        floor.addComponent(room1);
        floor.addComponent(room2);

        floor.turnOn();
        floor.turnOff();
    }
}

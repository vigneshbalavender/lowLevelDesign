package LLD.DesignPatterns.structuralDP.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeSmartComponent implements SmartComponent{
    List<SmartComponent> components;
    public CompositeSmartComponent(){
        components=new ArrayList<>();
    }
    public void addComponent(SmartComponent component){
        this.components.add(component);
    }
    @Override
    public void turnOff() {
        for(SmartComponent component:components){
            component.turnOff();
        }
    }

    @Override
    public void turnOn() {
       for(SmartComponent component: components){
           component.turnOn();
       }
    }
}

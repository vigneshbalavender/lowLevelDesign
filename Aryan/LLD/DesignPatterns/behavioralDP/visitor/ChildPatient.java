package LLD.DesignPatterns.behavioralDP.visitor;

public class ChildPatient implements Patient{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

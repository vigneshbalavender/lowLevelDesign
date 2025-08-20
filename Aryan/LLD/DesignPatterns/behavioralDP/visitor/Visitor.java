package LLD.DesignPatterns.behavioralDP.visitor;

public interface Visitor {
    public void visit(ChildPatient patient);
    public void visit(AdultPatient patient);
    public void visit(SeniorPatient patient);
}

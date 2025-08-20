package LLD.DesignPatterns.behavioralDP.visitor;

public class BillingVisitor implements Visitor{
    @Override
    public void visit(ChildPatient patient) {
        System.out.println("calculating billing for child patient");
    }

    @Override
    public void visit(AdultPatient patient) {
        System.out.println("calculating billing for adult patient");
    }

    @Override
    public void visit(SeniorPatient patient) {
        System.out.println("calculating billing for senior patient");
    }
}

package LLD.DesignPatterns.behavioralDP.visitor;

public class DiagnosisVisitor implements Visitor{
    @Override
    public void visit(ChildPatient patient) {
        System.out.println("diagnosing a child patient: check-up and pediatric care.");
    }

    @Override
    public void visit(AdultPatient patient) {
        System.out.println("diagnosing a adult patient: routine test and lifecycle advice.");
    }

    @Override
    public void visit(SeniorPatient patient) {
        System.out.println("diagnosing a senior patient: complete checkup,a Comprehensive Geriatric Evaluation");
    }
}

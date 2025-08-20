package LLD.DesignPatterns.behavioralDP.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VisitorDemo {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new AdultPatient());
        patients.add(new ChildPatient());
        patients.add(new SeniorPatient());

        Visitor diagnosis = new DiagnosisVisitor();
        Visitor billing = new BillingVisitor();

       for(Patient patient: patients){
           patient.accept(diagnosis);
           patient.accept(billing);
       }
    }
}

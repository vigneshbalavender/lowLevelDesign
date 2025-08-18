package LLD.DesignPatterns.behavioralDP.ChainOfResponsibility;

public class Supervisor extends Approver{


    @Override
    public void processLeaveRequest(int days) {
        if(days <=3){
            System.out.println("Supervisor Approved a leave Request.");
        }else if(nextApprover!=null){
            nextApprover.processLeaveRequest(days);
        }
    }
}

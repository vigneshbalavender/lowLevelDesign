package LLD.DesignPatterns.behavioralDP.ChainOfResponsibility;

public class Manager extends Approver{
    @Override
    public void processLeaveRequest(int days) {
        if(days>3 && days<=7){
            System.out.println("Manager Approves the leave Request.");
        }else if(nextApprover!=null){
            nextApprover.processLeaveRequest(days);
        }
    }
}

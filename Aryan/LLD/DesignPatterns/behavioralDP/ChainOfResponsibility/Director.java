package LLD.DesignPatterns.behavioralDP.ChainOfResponsibility;

public class Director extends Approver{

    @Override
    public void processLeaveRequest(int days) {
        if(days>7 && days <=12){
            System.out.println("Director Approves the leave reqeust.");
        }else if(nextApprover!=null){
            nextApprover.processLeaveRequest(days);
        }
    }
}

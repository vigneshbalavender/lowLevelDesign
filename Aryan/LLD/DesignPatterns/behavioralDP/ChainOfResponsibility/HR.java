package LLD.DesignPatterns.behavioralDP.ChainOfResponsibility;

public class HR extends Approver{

    @Override
    public void processLeaveRequest(int days) {
        if(days>12){
            System.out.println("HR: Leave request requires further discussion..");
        }
    }
}

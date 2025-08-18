package LLD.DesignPatterns.behavioralDP.ChainOfResponsibility;

public class LeaveApproveChainDemo {
    public static void main(String[] args) {
      Approver supervisor = new Supervisor();
      Approver manager = new Manager();
      Approver director =new Director();

        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);

        //request leave for 10 days
        System.out.println("Employee raise a leave request for 10 days");
        supervisor.processLeaveRequest(10);

        System.out.println("Employee raise a leave request for 15 days");
        supervisor.processLeaveRequest(15);
        //No reponse since no one handle that so we add HR Approver

        Approver HR = new HR();
        director.setNextApprover(HR);
        System.out.println("Employee raise a leave request for 20 days");
        supervisor.processLeaveRequest(20);
    }
}

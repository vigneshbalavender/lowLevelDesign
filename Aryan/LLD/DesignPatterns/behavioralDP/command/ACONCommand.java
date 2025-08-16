package LLD.DesignPatterns.behavioralDP.command;

public class ACONCommand implements Command{
    AC ac;
    public ACONCommand(AC ac){
        this.ac=ac;
    }
    @Override
    public void execute() {
        ac.on();
    }

    @Override
    public void undo() {
        ac.off();
    }
}

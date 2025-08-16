package LLD.DesignPatterns.behavioralDP.command;

import java.util.Stack;

public class RemoteControl {
    Command[]buttons = new Command[10];
    Stack<Command> commandHistory = new Stack<>();
    public void setCommand(int slot,Command command){
        if(slot<buttons.length){
            buttons[slot]=command;
        }
    }

    public void pressButton(int slot){
          if(slot<buttons.length && buttons[slot]!=null){

              buttons[slot].execute();
              commandHistory.push(buttons[slot]);
          }
    }
    public void pressUndo(){
        if(commandHistory.isEmpty()){
            System.out.println("there is no previous action done.");
            return;
        }
        commandHistory.pop().undo();
    }
}

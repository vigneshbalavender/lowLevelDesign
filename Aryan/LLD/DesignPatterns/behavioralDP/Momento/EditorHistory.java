package LLD.DesignPatterns.behavioralDP.Momento;

import java.util.Stack;

public class EditorHistory {
    Stack<Momento> undoStack = new Stack<>();
    Stack<Momento> redoStack = new Stack<>();

    public void saveState(Momento state){
        undoStack.push(state);
        redoStack.clear();
    }

    public Momento undo(Momento currentState){
        if(undoStack.isEmpty())return null;
        redoStack.push(currentState);
        return undoStack.pop();
    }
    public Momento redo(Momento currentState){
        if(redoStack.isEmpty())return null;
        undoStack.push(currentState);
        return redoStack.pop();
    }
}

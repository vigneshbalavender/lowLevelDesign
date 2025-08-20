package LLD.DesignPatterns.behavioralDP.Momento;

public class TextEditor {
    String text;
    EditorHistory history;
    TextEditor(){

        history = new EditorHistory();
    }
    public void setText(String text){
        this.text=text;
    }

    public void save(){
        history.saveState(new Momento(text));
    }
    public void print(){
        System.out.println("text :"+text);
    }
    public void undo(){
        Momento state = history.undo(new Momento(text));
        this.text = state.getText();
    }
    public void redo(){
       Momento state =  history.redo(new Momento(text));
        this.text = state.getText();
    }
}

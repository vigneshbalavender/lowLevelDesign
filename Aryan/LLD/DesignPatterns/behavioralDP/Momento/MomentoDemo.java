package LLD.DesignPatterns.behavioralDP.Momento;

public class MomentoDemo {
    public static void main(String[] args) {
          TextEditor editor = new TextEditor();

          editor.setText("Hello");
          editor.print();
          editor.save();
          editor.setText("Hello world");
          editor.save();
        editor.print();
          editor.setText("hello fellow developers!");
        editor.print();
        System.out.println("after undo");
          editor.undo();
          editor.print();

        System.out.println("after redo ");
         editor.redo();
         editor.print();
    }
}

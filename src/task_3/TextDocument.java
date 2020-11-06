package task_3;

public class TextDocument implements IDocument{
    @Override
    public void openDocument() {
        System.out.println("Opening TEXT document");
    }

    @Override
    public void newDocument() {
        System.out.println("Creating TEXT document");
    }

}
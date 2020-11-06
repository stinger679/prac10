package task_3;

public class ImageDocument implements IDocument{
    @Override
    public void openDocument() {
        System.out.println("opening IMAGE document");
    }

    @Override
    public void newDocument() {
        System.out.println("creating IMAGE document");
    }
}
package task_3;

public class MusicDocument implements IDocument {
    @Override
    public void openDocument() {
        System.out.println("Opening MUSIC document");
    }

    @Override
    public void newDocument() {
        System.out.println("Creating MUSIC document");
    }
}
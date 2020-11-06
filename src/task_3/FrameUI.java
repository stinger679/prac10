package task_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameUI extends JFrame {

    IDocument document;
    ICreateDocument createDocument;
    public FrameUI(ICreateDocument createDocument) {
        super("System Menu");
        this.createDocument = createDocument;
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());

        setJMenuBar(menuBar);


        setSize(300, 200);
        setVisible(true);
    }

    private JMenu createFileMenu()
    {

        JMenu file = new JMenu("File");
        JMenuItem create = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save= new JMenuItem("Save");

        JMenuItem exit = new JMenuItem(new ExitAction());


        file.add(create);
        file.add(open);
        file.add(save);


        file.addSeparator();
        file.add(exit);


        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                document =  createDocument.CreateNew();
                document.newDocument();
            }
        });


        open.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                document = createDocument.CreateOpen();
                document.openDocument();
            }
        });


        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Saving....");
            }
        });

        return file;
    }

    class ExitAction extends AbstractAction
    {
        private static final long serialVersionUID = 1L;
        ExitAction() {
            putValue(NAME, "Выход");
        }
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

}
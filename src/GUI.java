import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    JFrame window;
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar menuBar;
    JMenu menuFile, menuEdit, menuFormat, menuColor;
    JMenuItem iNew, iOpen, iSave, iSaveAs, iExit;

    Function_File file = new Function_File(this);

    public GUI() {
        createWindow();
        createTextArea();
        createMenuBar();
        createFileMenu();
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    public void createWindow() {
        window = new JFrame("NotePad");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createTextArea() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());

        // Set preferred size for the scroll pane
        scrollPane.setPreferredSize(new Dimension(800, 500));

        window.add(scrollPane);
    }

    public void createMenuBar() {
        menuBar = new JMenuBar();
        window.setJMenuBar(menuBar);

        menuFile = new JMenu("File");
        menuEdit = new JMenu("Edit");
        menuFormat = new JMenu("Format");
        menuColor = new JMenu("Color");
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuFormat);
        menuBar.add(menuColor);

        // Set preferred size for the menu bar
        menuBar.setPreferredSize(new Dimension(800, 30));
    }

    public void createFileMenu() {
        iNew = new JMenuItem("New");
        iNew.addActionListener(this);
        iNew.setActionCommand("New");
        menuFile.add(iNew);

        iOpen = new JMenuItem("Open");
        iOpen.addActionListener(this);
        iOpen.setActionCommand("Open");
        menuFile.add(iOpen);

        iSave = new JMenuItem("Save");
        menuFile.add(iSave);

        iSaveAs = new JMenuItem("Save As");
        menuFile.add(iSaveAs);

        iExit = new JMenuItem("Exit");
        menuFile.add(iExit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "New":
                file.newFile();
                break;
            case "Open":
                file.open();
                break;

        }
    }
}
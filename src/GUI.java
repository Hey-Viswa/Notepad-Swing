import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    JFrame window;
    // TEXT AREA
    JTextArea textArea;
    JScrollPane scrollPane;
    // TOP MENUBAR
    JMenuBar menuBar;
    JMenu menuFile, menuEdit, menuFormat, menuColor;
    // FILE MENU
    JMenuItem iNew, iOpen, iSave, iSaveAs, iExit;
    // FORMAT MENU
    JMenuItem iWrap, iFontArial, iFontCSMS, iFontTNR, iFontSize8, iFontSize12, iFontSize16, iFontSize20, iFontSize24, iFontSize28;
    JMenu menuFont, menuFontSize;

    Function_File file = new Function_File(this);
    Function_Format format = new Function_Format(this);

    public GUI() {
        createWindow();
        createTextArea();
        createMenuBar();
        createFileMenu();
        createFormatMenu();
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
        iSave.addActionListener(this);
        iSave.setActionCommand("Save");
        menuFile.add(iSave);

        iSaveAs = new JMenuItem("Save As");
        iSaveAs.addActionListener(this);
        iSaveAs.setActionCommand("Save As");
        menuFile.add(iSaveAs);

        iExit = new JMenuItem("Exit");
        iExit.addActionListener(this);
        iExit.setActionCommand("Exit");
        menuFile.add(iExit);
    }
    public void createFormatMenu(){

        iWrap = new JMenuItem("Word Wrap: Off");
        iWrap.addActionListener(this);
        iWrap.setActionCommand("Word Wrap");
        menuFormat.add(iWrap);

        menuFont = new JMenu("Font");
        menuFormat.add(menuFont);

        iFontArial = new JMenuItem("Arial");
        iFontArial.addActionListener(this);
        iFontArial.setActionCommand("Arial");
        menuFont.add(iFontArial);

        iFontCSMS = new JMenuItem("Comic Sans MS");
        iFontCSMS.addActionListener(this);
        iFontCSMS.setActionCommand("Comic Sans MS");
        menuFont.add(iFontCSMS );

        iFontTNR = new JMenuItem("Times New Roman");
        iFontTNR.addActionListener(this);
        iFontTNR.setActionCommand("Times New Roman");
        menuFont.add(iFontTNR);

        menuFontSize = new JMenu("Font Size");
        menuFormat.add(menuFontSize);

        iFontSize8 = new JMenuItem ("8");
        iFontSize8.addActionListener(this);
        iFontSize8.setActionCommand("8");
        menuFontSize.add(iFontSize8);

         iFontSize8 = new JMenuItem ("12");
        iFontSize8.addActionListener(this);
        iFontSize8.setActionCommand("8menu");
        menuFontSize.add(iFontSize8);

         iFontSize8 = new JMenuItem ("8");
        iFontSize8.addActionListener(this);
        iFontSize8.setActionCommand("8menu");
        menuFontSize.add(iFontSize8);

         iFontSize8 = new JMenuItem ("8");
        iFontSize8.addActionListener(this);
        iFontSize8.setActionCommand("8menu");
        menuFontSize.add(iFontSize8);

         iFontSize8 = new JMenuItem ("8");
        iFontSize8.addActionListener(this);
        iFontSize8.setActionCommand("8menu");
        menuFontSize.add(iFontSize8);

         iFontSize8 = new JMenuItem ("8");
        iFontSize8.addActionListener(this);
        iFontSize8.setActionCommand("8menu");
        menuFontSize.add(iFontSize8);

}

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "New" -> file.newFile();
            case "Open" -> file.open();
            case "Save" -> file.save();
            case "Save As" -> file.saveAs();
            case "Exit" ->  file.exit();
        }
    }

}

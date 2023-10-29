import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Function_File {
    GUI gui;
    String fileName;
    String fileAddress;

    public Function_File(GUI gui) {
        this.gui = gui;
    }

    public void newFile() {

        gui.textArea.setText("");
        gui.window.setTitle("New");
    }

    public void open() {
        FileDialog fd = new FileDialog(gui.window, "Open", FileDialog.LOAD);
        fd.setVisible(true);

        if (fd.getFile()!=null){
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            gui.window.setTitle(fileName);
        }
        System.out.println("File address and file name" + fileAddress + fileName);
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileAddress + fileName));
            gui.textArea.setText("");
            String line = null;
            while((line = br.readLine())!= null){
                gui.textArea.append(line + "\n");
            }
            br.close();
        }catch(Exception e){
            System.out.println("FILE NOT OPENED!");
        }
    }
}

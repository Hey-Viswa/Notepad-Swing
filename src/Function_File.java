public class Function_File {
    GUI gui;

    public Function_File(GUI gui){
        this.gui= gui;
    }
    public void newFile(){

        gui.textArea.setText("");
        gui.window.setTitle("New");
    }
}

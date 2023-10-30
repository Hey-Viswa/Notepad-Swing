

public class Function_Format {
    GUI gui;

    public Function_Format(GUI gui){
        this.gui = gui;
    }
    public void wordWrap(){

        if(gui.wordWrapOn == false){
            gui.wordWrapOn = true;
            gui.textArea.setLineWrap(true);
            gui.textArea.setWrapStyleWord(true);
        }
    }
}

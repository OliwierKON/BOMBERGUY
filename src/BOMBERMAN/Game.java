package BOMBERMAN;

import javax.swing.*;

public class Game extends JPanel {
    private Window window;
    private Panel panel;


    public Game(){
        panel = new Panel();
        window = new Window(panel);
        panel.requestFocus();
    }
}
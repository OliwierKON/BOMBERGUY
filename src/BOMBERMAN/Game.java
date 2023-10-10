package BOMBERMAN;

import javax.swing.*;

public class Game extends JPanel implements Runnable {
    private Window window;
    private Panel panel;

    Thread gameThread;
    public Game(){
        panel = new Panel();
        window = new Window(panel);
        panel.requestFocus();
    }
    public void StartgameThread(){

        gameThread = new Thread(this);
        gameThread.start();
    }

    public void run(){
        while (gameThread != null){

        }
    }
}

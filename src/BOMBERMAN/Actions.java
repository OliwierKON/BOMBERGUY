package BOMBERMAN;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Actions implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int input = (e.getKeyCode());
        System.out.println(input);
        if (input == 87){
            Player.y-=5;
        } else if (input == 65) {
            Player.x-=5;
        } else if (input == 83) {
            Player.y+=5;
        } else if (input == 68) {
            Player.x+=5;
        }
    }



    @Override
    public void keyReleased(KeyEvent e) {

    }
}

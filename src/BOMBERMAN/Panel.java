package BOMBERMAN;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Panel extends JPanel implements ActionListener {
    Timer timer;
    Image Gubbe;
    public Panel(){
        this.setBackground(Color.cyan);
        this.setDoubleBuffered(true);
        this.addKeyListener(new Actions());
        timer = new Timer(1,this);
        timer.start();
        Gubbe= new ImageIcon("Gubbe.png").getImage();
    }
    public void paint (Graphics g){
        Graphics2D G = (Graphics2D) g;
        super.paint(g);
        G.setColor(Color.GREEN);
        G.fillRect(0,300,518,200);
        G.setColor(Color.yellow);
        G.fillRect(0,0 , 75,75);
        G.setColor(Color.white);
        G.fillRect(50, 150 , 50, 20);
        G.fillRect(40, 130 , 50, 20);
        G.fillRect(73, 125 , 50, 20);
        G.drawImage(Gubbe,Player.x, Player.y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}

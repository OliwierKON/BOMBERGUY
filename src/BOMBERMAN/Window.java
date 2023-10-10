package BOMBERMAN;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Window extends JFrame{
    JFrame window = new JFrame();
    ImageIcon image = new ImageIcon(getClass().getResource("BOMB.png"));

    Panel panel = new Panel();
    Player player = new Player();
    public Window(Panel panel) {

        window.setSize(512, 448);
        window.setTitle("Bomberguy");
        window.setVisible(true);
        window.add(panel);
        window.add(player);
        window.setResizable(false);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setIconImage(image.getImage());
        window.setLocationRelativeTo(null);

    }
}

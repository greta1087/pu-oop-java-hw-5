import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


/**
 * Creates the frame of the phone
 *
 */
public class PhoneFrame extends JFrame implements MouseListener {


    public PhoneFrame() {

        this.setSize(990, 1000);
        this.setLocationRelativeTo(null);
        this.setTitle("Phone Display");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    }

    /**
     * Renders the pixels on the frame
     *
     */

    public void paint(Graphics g) {

        for (int row = 1; row < 65; row++) {
            for (int col = 2; col < 66; col++) {

                Pixels pixel = new Pixels(row, col);
                pixel.render(g);

            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}

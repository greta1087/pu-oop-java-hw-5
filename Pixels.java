import java.awt.*;
import java.util.Random;

public class Pixels {

    private int row;
    private int col;
    private int pixelColor;
    public static final int PIXEL_SIZE = 15;

    public Pixels(int row, int col) {

        this.row      = row;
        this.col      = col;

    }

    /**
     * Generates a random number for the color of the pixels
     *
     */
    public int getRandomPixelColor() {

        Random rand = new Random();

        pixelColor = rand.nextInt(3);

        return pixelColor;

    }

    /**
     * Renders the pixels
     *
     */
    public void render(Graphics g) {
        int pixelCoordinateX =  row * PIXEL_SIZE;
        int pixelCoordinateY = col * PIXEL_SIZE;
        int pixelColor = getRandomPixelColor();

        if (pixelColor == 0) {
            g.setColor(Color.red);
        } else if (pixelColor == 1) {
            g.setColor(Color.green);
        }  else if (pixelColor == 2) {
            g.setColor(Color.blue);
        }

        g.fillRect(pixelCoordinateX, pixelCoordinateY, PIXEL_SIZE, PIXEL_SIZE);

     // Pixel border for better visibility
        g.setColor(Color.black);
        g.drawRect(pixelCoordinateX, pixelCoordinateY, PIXEL_SIZE, PIXEL_SIZE);
    }

}

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class Graficos extends JPanel {
    private static final int CELL_SIZE = 40;
    private static final int COLOR_WHITE = 0xFFFFFF;
    private static final int COLOR_GRID_LINE = 0xCCCCCC; // Light gray

    private BufferedImage image;
    private int[] pixels;
    private int width;
    private int height;

    public Graficos() {
        this.width = 784;
        this.height = 595;

        this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        this.pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();
    }

    private void gerarGrade() {
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = COLOR_WHITE;
        }

        // 2. Draw vertical grid lines
        for (int x = 0; x < width; x += CELL_SIZE) {
            for (int y = 0; y < height; y++) {
                pixels[y * width + x] = COLOR_GRID_LINE;
            }
        }

        // 3. Draw horizontal grid lines
        for (int y = 0; y < height; y += CELL_SIZE) {
            for (int x = 0; x < width; x++) {
                pixels[y * width + x] = COLOR_GRID_LINE;
            }
        }
    }

    private void desenharCoisas() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Combine RGB channels into a single integer hexadecimal color
                int red = (x * 255 / width);
                int green = (y * 255 / height);
                int blue = 128;

                // Set the pixel at array coordinate (y * width + x)
                pixels[y * width + x] = (red << 16) | (green << 8) | blue;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        gerarGrade();
        g.drawImage(image, 0, 0, null);

        System.out.println(this.getWidth() + "," + this.getHeight());
    }
}

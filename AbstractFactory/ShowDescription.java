import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowDescription extends JFrame {

    protected String text = "";

    public ShowDescription() {
	    super("Abstract Factory");

        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();

        ImageIcon icon = this.loadImage();

        JLabel label = new JLabel(icon);

        this.add(label);

	    this.setBounds(0, 0, width, height - 100);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ShowDescription app = new ShowDescription();
		app.setVisible(true);
    }

    private ImageIcon loadImage() {
        ImageIcon icon = new ImageIcon("images/scheme.png");
        return icon;
    }

}
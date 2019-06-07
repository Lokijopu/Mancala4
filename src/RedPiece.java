import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class RedPiece extends Piece{
	public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setPaint(Color.RED);
        g2.fill(new Ellipse2D.Double(50, 50, 50, 50));
        
    }
	public String getColor() {
		return "red";
	}
}

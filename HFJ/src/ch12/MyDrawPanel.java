package ch12;

import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {

	private static final long serialVersionUID = -5571536609338850623L;

	public void paintComponent(Graphics g){
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.orange);
		g.fillRect(20, 50, 100, 50);
	}
}

package gui.component;

import java.awt.Color;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class TLabel extends JLabel {
	
	public TLabel(String text, double startX, double startY, double sizeX, double sizeY
			, String mColor) {
		super(text);
		super.setBounds((int) startX, (int) startY, (int) sizeX, (int) sizeY);
		super.setHorizontalAlignment(JLabel.CENTER);
		super.setVerticalAlignment(JLabel.CENTER);
		if (mColor.equals("black")) 
			super.setForeground(Color.black);
		if (mColor.equals("white")) 
			super.setForeground(Color.white);
		
//		super.setOpaque(true);
//		super.setBackground(Color.DARK_GRAY);
	}

	
}

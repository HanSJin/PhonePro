package gui.event;

import gui.MainPanel;
import gui.constvalue.ConstV;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import control.Controller;

public class FrameBtnEvent implements MouseListener{

	/*
	 * Mouse!
	 * (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == MainPanel.imgTopBtn_minimal) {
			// not yet implement
		} 
		
		else if (arg0.getSource() == MainPanel.imgTopBtn_exit) {
			// not yet implement
		}
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == MainPanel.imgTopBtn_minimal) {
			// not yet implement
		} 
		
		else if (arg0.getSource() == MainPanel.imgTopBtn_exit) {
			// not yet implement
		}
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == MainPanel.imgTopBtn_minimal) {
			System.out.println("minial");
			Controller.mainFrame.setLocation(0, ConstV.windowSizeY);
		} 
	
		
		else if (arg0.getSource() == MainPanel.imgTopBtn_exit) {
			System.out.println("exit");
			Controller.mainFrame.dispose();
			System.exit(1);
		}
		
	}

}

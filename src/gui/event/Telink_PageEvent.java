package gui.event;

import gui.page.Telink_Page;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import control.Controller;

public class Telink_PageEvent implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

		// 메인화면
		if (arg0.getSource() == Telink_Page.goMain) {
			Controller.telinkPage.setVisible(false);
			Controller.startPage.setVisible(true);
		}
		
	}

}

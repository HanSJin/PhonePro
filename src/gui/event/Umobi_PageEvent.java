package gui.event;

import gui.page.Umobi_Page;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import control.Controller;

public class Umobi_PageEvent implements MouseListener{

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
		if (arg0.getSource() == Umobi_Page.goMain) {
			Controller.umobiPage.setVisible(false);
			Controller.startPage.setVisible(true);
		}
		
	}

}

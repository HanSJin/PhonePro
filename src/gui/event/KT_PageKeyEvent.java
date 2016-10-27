package gui.event;

import gui.page.KT_Page;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import control.Controller;

public class KT_PageKeyEvent implements KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == 10) {
			// 엔터키 입력 부O
			Controller.ktData.calculData();
			
			if (arg0.getKeyCode() == 10) {
				// 엔터키 입력 부
				Controller.ktData.calculData();
			} 
			
			else if (arg0.getKeyCode() == 27) {
				// esc 입력부
				KT_Page.tf_Price1.setText("");
				KT_Page.tf_Price2.setText("");
				KT_Page.tf_Price3.setText("");
				KT_Page.last_Prices.setText("");
				Controller.ktData.calculData();
			}
		}
	}
	public void paint(Graphics g){
		   g.drawLine(0, 0, 0, 0);
		}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}

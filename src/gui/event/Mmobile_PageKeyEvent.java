package gui.event;

import gui.page.Mmobile_Page;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import control.Controller;

public class Mmobile_PageKeyEvent implements KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == 10) {
			// 엔터키 입력 부
			Controller.mmobileData.calculData();
		} 
		
		else if (arg0.getKeyCode() == 27) {
			// esc 입력부
			Mmobile_Page.tf_Price1.setText("");
			Mmobile_Page.tf_Price2.setText("");
			Mmobile_Page.tf_Price3.setText("");
			Mmobile_Page.last_Prices.setText("");
			Controller.mmobileData.calculData();
		}
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

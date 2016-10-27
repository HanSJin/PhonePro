package gui.event;

import gui.page.SK_Page;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

import control.Controller;

public class SK_PageIndexPageEvent implements MouseListener{

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
		if (arg0.getSource() == SK_Page.pNum1) {
			SK_Page.sk_table.setVisible(true);
			SK_Page.sk_table_2.setVisible(false);
			SK_Page.sk_table_3.setVisible(false);
			SK_Page.pNum1.setIcon(new ImageIcon(Controller.loadSKImage.getPricePageNumOn_1_Img()));
			SK_Page.pNum2.setIcon(new ImageIcon(Controller.loadSKImage.getPricePageNum_2_Img()));
			SK_Page.pNum3.setIcon(new ImageIcon(Controller.loadSKImage.getPricePageNum_3_Img()));
		}
		
		else if (arg0.getSource() == SK_Page.pNum2) {
			SK_Page.sk_table.setVisible(false);
			SK_Page.sk_table_2.setVisible(true);
			SK_Page.sk_table_3.setVisible(false);
			SK_Page.pNum1.setIcon(new ImageIcon(Controller.loadSKImage.getPricePageNum_1_Img()));
			SK_Page.pNum2.setIcon(new ImageIcon(Controller.loadSKImage.getPricePageNumOn_2_Img()));
			SK_Page.pNum3.setIcon(new ImageIcon(Controller.loadSKImage.getPricePageNum_3_Img()));
		}
		
		else if (arg0.getSource() == SK_Page.pNum3) {
			SK_Page.sk_table.setVisible(false);
			SK_Page.sk_table_2.setVisible(false);
			SK_Page.sk_table_3.setVisible(true);
			SK_Page.pNum1.setIcon(new ImageIcon(Controller.loadSKImage.getPricePageNum_1_Img()));
			SK_Page.pNum2.setIcon(new ImageIcon(Controller.loadSKImage.getPricePageNum_2_Img()));
			SK_Page.pNum3.setIcon(new ImageIcon(Controller.loadSKImage.getPricePageNumOn_3_Img()));
		}
	}
	
}

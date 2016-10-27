package gui.event;

import gui.page.LG_Page;
import gui.page.subpage.LG_Card;
import gui.page.subpage.LG_Iptv;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import control.Controller;

public class LG_PageEvent implements MouseListener{

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
		// ���ͳ� + IPTV
		if (arg0.getSource() == LG_Page.cardDisct) {
			if (!LG_Page.isOpenCard) {
				LG_Page.lg_card = new LG_Card();
				LG_Page.isOpenCard = true;
			}
			else {
				LG_Page.isOpenCard = false;
				LG_Page.lg_card.dispose();
			}
		}

		// ����ī��
		else if (arg0.getSource() == LG_Page.iptvDisct) {
			if (!LG_Page.isOpenIPTV) {
				LG_Page.lg_iptv = new LG_Iptv();
				LG_Page.isOpenIPTV = true;
			}
			else {
				// esc
				LG_Page.isOpenIPTV = false;
				LG_Page.lg_iptv.dispose();
			}
		}

		// ����ȭ��
		else if (arg0.getSource() == LG_Page.goMain) {
			if (LG_Page.isOpenCard) {
				LG_Page.lg_card.dispose();
				LG_Page.isOpenCard = false;
			}
			if (LG_Page.isOpenIPTV) {
				// �����ؾ���
				LG_Page.lg_iptv.dispose();
				LG_Page.isOpenIPTV = false;
			}
			Controller.lgPage.setVisible(false);
			Controller.startPage.setVisible(true);
		}
		
	}
}

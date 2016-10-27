package gui.event;

import gui.page.SK_Page;
import gui.page.subpage.SK_Iptv;
import gui.page.subpage.SK_Card;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import control.Controller;

public class SK_PageEvent implements MouseListener{

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

		// 인터넷 + IPTV
		if (arg0.getSource() == SK_Page.cardDisct) {
			if (!SK_Page.isOpenCard) {
				SK_Page.sk_card = new SK_Card();
				SK_Page.isOpenCard = true;
			}
			else {
				SK_Page.isOpenCard = false;
				SK_Page.sk_card.dispose();
			}
		}

		// 제휴카드
		else if (arg0.getSource() == SK_Page.iptvDisct) {
			if (!SK_Page.isOpenIPTV) {
				SK_Page.sk_iptv = new SK_Iptv();
				SK_Page.isOpenIPTV = true;
			}
			else {
				// esc
				SK_Page.isOpenIPTV = false;
				SK_Page.sk_iptv.dispose();
			}
		}

		// 메인화면
		else if (arg0.getSource() == SK_Page.goMain) {
			if (SK_Page.isOpenCard) {
				SK_Page.sk_card.dispose();
				SK_Page.isOpenCard = false;
			}
			if (SK_Page.isOpenIPTV) {
				// 구현해야해
				SK_Page.sk_iptv.dispose();
				SK_Page.isOpenIPTV = false;
			}
			Controller.skPage.setVisible(false);
			Controller.startPage.setVisible(true);
		}
		

		
	}

}

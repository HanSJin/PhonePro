package gui.event;

import gui.page.KT_Page;
import gui.page.subpage.KT_Card;
import gui.page.subpage.KT_Iptv;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import control.Controller;

public class KT_PageEvent implements MouseListener {


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
		if (arg0.getSource() == KT_Page.cardDisct) {
			if (!KT_Page.isOpenCard) {
				KT_Page.kt_card = new KT_Card();
				KT_Page.isOpenCard = true;
			}
			else {
				KT_Page.isOpenCard = false;
				KT_Page.kt_card.dispose();
			}
		}

		// 제휴카드
		else if (arg0.getSource() == KT_Page.iptvDisct) {
			if (!KT_Page.isOpenIPTV) {
				KT_Page.kt_iptv = new KT_Iptv();
				KT_Page.isOpenIPTV = true;
			}
			else {
				// esc
				KT_Page.isOpenIPTV = false;
				KT_Page.kt_iptv.dispose();
			}
		}


		// 메인화면
		else if (arg0.getSource() == KT_Page.goMain) {
			if (KT_Page.isOpenCard) {
				KT_Page.kt_card.dispose();
				KT_Page.isOpenCard = false;
			}
			if (KT_Page.isOpenIPTV) {
				KT_Page.kt_iptv.dispose();
				KT_Page.isOpenIPTV = false;
			}
			Controller.ktPage.setVisible(false);
			Controller.startPage.setVisible(true);
		}
		
	}
}
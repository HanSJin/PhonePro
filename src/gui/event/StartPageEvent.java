package gui.event;

import gui.page.StartPage;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import control.Controller;


public class StartPageEvent implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		/*
		 * 이미지 교체 - 마우스 진입
		 */
		if (e.getSource() == StartPage.img_MainBtn_SK) {
			StartPage.img_MainBtn_SK.setIcon(StartPage.on_img_SK);
		}
		else if (e.getSource() == StartPage.img_MainBtn_KT) {
			StartPage.img_MainBtn_KT.setIcon(StartPage.on_img_KT);
		}
		else if (e.getSource() == StartPage.img_MainBtn_LG) {
			StartPage.img_MainBtn_LG.setIcon(StartPage.on_img_LG);
		}
		

		else if (e.getSource() == StartPage.img_MainBtn_skTelink) {
			StartPage.img_MainBtn_skTelink.setIcon(StartPage.on_img_skTelink);
		}
		else if (e.getSource() == StartPage.img_MainBtn_ktMmobile) {
			StartPage.img_MainBtn_ktMmobile.setIcon(StartPage.on_img_ktMmobile);
		}
		else if (e.getSource() == StartPage.img_MainBtn_lgUmobi) {
			StartPage.img_MainBtn_lgUmobi.setIcon(StartPage.on_img_lgUmobi);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		/*
		 * 이미지 교체 - 마우스 탈출
		 */
		if (e.getSource() == StartPage.img_MainBtn_SK) {
			StartPage.img_MainBtn_SK.setIcon(StartPage.img_SK);
		}
		else if (e.getSource() == StartPage.img_MainBtn_KT) {
			StartPage.img_MainBtn_KT.setIcon(StartPage.img_KT);
		}
		else if (e.getSource() == StartPage.img_MainBtn_LG) {
			StartPage.img_MainBtn_LG.setIcon(StartPage.img_LG);
		}
		

		else if (e.getSource() == StartPage.img_MainBtn_skTelink) {
			StartPage.img_MainBtn_skTelink.setIcon(StartPage.img_skTelink);
		}
		else if (e.getSource() == StartPage.img_MainBtn_ktMmobile) {
			StartPage.img_MainBtn_ktMmobile.setIcon(StartPage.img_ktMmobile);
		}
		else if (e.getSource() == StartPage.img_MainBtn_lgUmobi) {
			StartPage.img_MainBtn_lgUmobi.setIcon(StartPage.img_lgUmobi);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub]
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		// sound 효과
//		try{
//			File file = new File(".//sound//click.wav");
//			FileInputStream fis = new FileInputStream(file);
//			AudioStream as = new AudioStream(fis);
//			AudioPlayer.player.start(as);
//		}catch(Exception ex){
//			ex.printStackTrace();
//			System.out.println("sound exception");
//		}
		
		// SK 클릭
		if (e.getSource() == StartPage.img_MainBtn_SK) {
			
			Controller.startPage.setVisible(false);
			Controller.skPage.setVisible(true);
		} 
		else if (e.getSource() == StartPage.img_MainBtn_KT) {
			Controller.startPage.setVisible(false);
			Controller.ktPage.setVisible(true);
		}
		else if (e.getSource() == StartPage.img_MainBtn_LG) {
			Controller.startPage.setVisible(false);
			Controller.lgPage.setVisible(true);
		}

		else if (e.getSource() == StartPage.img_MainBtn_skTelink) {
			Controller.startPage.setVisible(false);
			Controller.telinkPage.setVisible(true);
			
		}
		else if (e.getSource() == StartPage.img_MainBtn_ktMmobile) {
			Controller.startPage.setVisible(false);
			Controller.mmobilePage.setVisible(true);
			
		}
		else if (e.getSource() == StartPage.img_MainBtn_lgUmobi) {
			Controller.startPage.setVisible(false);
			Controller.umobiPage.setVisible(true);			
		}
	}


}

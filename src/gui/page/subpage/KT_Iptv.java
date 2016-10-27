package gui.page.subpage;

import gui.constvalue.ConstV;
import gui.page.KT_Page;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.KTData;
import control.Controller;

@SuppressWarnings("serial")
public class KT_Iptv extends JFrame implements MouseMotionListener, MouseListener, KeyListener{
	private int tmpX, tmpY;
	private JLabel titleBar,
					iptvPanel,
					exitBtn;
	private JLabel select1, select2, select3, select4, select5, select6,
					select7, select8, select9; 
	
	public KT_Iptv() {
		// TODO Auto-generated constructor stub
		setUndecorated(true);
		setSize(684,392+20);
		setOpacity(0.98f);
		setLocation(
				(int) (ConstV.windowSizeX * 0.85 - 684 - 5),   	// 1088
				(int) (ConstV.windowSizeY * 0.4525)); 		// 370
		setVisible(true);
		setLayout(null);		
		setAlwaysOnTop(true);
		setFocusable(true);
		setComponent();
		setBackground(Color.black);
		addWindowListener(new EventHandler());
		addKeyListener(this);
		titleBar.addMouseMotionListener(this);
		titleBar.addMouseListener(this);
		
	}
	
	
	private void setComponent() {
		// TODO Auto-generated method stub
		/*
		 * 타이틀 바
		 */
		titleBar = new JLabel(new ImageIcon(Controller.loadKTImage.getIptvTitleImg()));
		this.add(titleBar);
		titleBar.setBounds(
				0, 
				0,
				684, 
				20); 
		
		
		
		/*
		 * cardPanel
		 */
		iptvPanel = new JLabel(new ImageIcon(Controller.loadKTImage.getIptvPanelImg()));
		this.add(iptvPanel);
		iptvPanel.setBounds(
				0, 
				20,
				684, 
				392); 
		

		/*
		 * 종료버튼
		 */
		exitBtn = new JLabel(new ImageIcon(Controller.loadCommonImage.getCardExitImg()));
		titleBar.add(exitBtn);
		exitBtn.setBounds(
				664, 
				0,
				18, 
				18); 
		exitBtn.addMouseListener(this);
		
		/*
		 * 선택버튼1
		 */
		if (KT_Page.isSel_Iptv_1)
			select1 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select1 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		iptvPanel.add(select1);
		select1.setBounds(250, 160, 31, 26); 
		select1.addMouseListener(this);
		
		
		/*
		 * 선택버튼2
		 */
		if (KT_Page.isSel_Iptv_2)
			select2 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select2 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		iptvPanel.add(select2);
		select2.setBounds(342, 160, 31, 26); 
		select2.addMouseListener(this);
		
		
		
		/*
		 * 선택버튼3
		 */
		if (KT_Page.isSel_Iptv_3)
			select3 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select3 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		iptvPanel.add(select3);
		select3.setBounds(435, 160, 31, 26); 
		select3.addMouseListener(this);
		
		
		/*
		 * 선택버튼4
		 */
		if (KT_Page.isSel_Iptv_4)
			select4 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select4 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		iptvPanel.add(select4);
		select4.setBounds(527, 160, 31, 26); 
		select4.addMouseListener(this);
		
		
		/*
		 * 선택버튼5
		 */
		if (KT_Page.isSel_Iptv_5)
			select5 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select5 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		iptvPanel.add(select5);
		select5.setBounds(621, 160, 31, 26); 
		select5.addMouseListener(this);

		
		/*
		 * 선택버튼6
		 */
		if (KT_Page.isSel_Iptv_6)
			select6 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select6 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		iptvPanel.add(select6);
		select6.setBounds(250, 353, 31, 26); 
		select6.addMouseListener(this);
		

		
		/*
		 * 선택버튼7
		 */
		if (KT_Page.isSel_Iptv_7)
			select7 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select7 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		iptvPanel.add(select7);
		select7.setBounds(342, 353, 31, 26); 
		select7.addMouseListener(this);
		

		
		/*
		 * 선택버튼8
		 */
		if (KT_Page.isSel_Iptv_8)
			select8 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select8 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		iptvPanel.add(select8);
		select8.setBounds(435, 353, 31, 26); 
		select8.addMouseListener(this);
		

		
		/*
		 * 선택버튼9
		 */
		if (KT_Page.isSel_Iptv_9)
			select9 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select9 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		iptvPanel.add(select9);
		select9.setBounds(527, 353, 31, 26); 
		select9.addMouseListener(this);
		
		
	}


	// event of exit
	class EventHandler implements WindowListener {
		public void windowClosed(WindowEvent we) {}
		public void windowIconified(WindowEvent we) {}
		public void windowOpened(WindowEvent we) {}
		public void windowDeiconified(WindowEvent we) {}
		public void windowActivated(WindowEvent we) {}
		public void windowDeactivated(WindowEvent we) {}
		public void windowClosing(WindowEvent we) {
			KT_Page.isOpenIPTV = false;
			dispose();
		}
	}

	
	/*
	 *  드레그를 위한 마우스 이벤트들 (non-Javadoc)
	 * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
	 */
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == titleBar) {
			int x = e.getXOnScreen() - tmpX;
			int y = e.getYOnScreen() - tmpY;
			this.setLocation(x, y);
		}
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == exitBtn) {
			KT_Page.isOpenIPTV = false;
			dispose();
		}
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
		if (arg0.getSource() == titleBar) {
			tmpX = arg0.getXOnScreen() - this.getX();
			tmpY = arg0.getYOnScreen() - this.getY();
		}
		
		/*
		 * 버튼 선택 이벤트 입니다.
		 */
		// 선택 버튼 1
		else if (arg0.getSource() == select1) {
			if (KT_Page.isSel_Iptv_1 == true) {
				sel1_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Iptv_2 == true) sel2_fromYes_toNo();
				if (KT_Page.isSel_Iptv_3 == true) sel3_fromYes_toNo();
				if (KT_Page.isSel_Iptv_4 == true) sel4_fromYes_toNo();
				if (KT_Page.isSel_Iptv_5 == true) sel5_fromYes_toNo();
				sel1_fromNo_toYes();
			}
		}
		// 선택 버튼 2
		else if (arg0.getSource() == select2) {
			if (KT_Page.isSel_Iptv_2 == true) {
				sel2_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Iptv_1 == true) sel1_fromYes_toNo();
				if (KT_Page.isSel_Iptv_3 == true) sel3_fromYes_toNo();
				if (KT_Page.isSel_Iptv_4 == true) sel4_fromYes_toNo();
				if (KT_Page.isSel_Iptv_5 == true) sel5_fromYes_toNo();
				sel2_fromNo_toYes();
			}
		}
		// 선택 버튼 3
		else if (arg0.getSource() == select3) {
			if (KT_Page.isSel_Iptv_3 == true) {
				sel3_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Iptv_1 == true) sel1_fromYes_toNo();
				if (KT_Page.isSel_Iptv_2 == true) sel2_fromYes_toNo();
				if (KT_Page.isSel_Iptv_4 == true) sel4_fromYes_toNo();
				if (KT_Page.isSel_Iptv_5 == true) sel5_fromYes_toNo();
				sel3_fromNo_toYes();
			}
		}
		// 선택 버튼 4
		else if (arg0.getSource() == select4) {
			if (KT_Page.isSel_Iptv_4 == true) {
				sel4_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Iptv_1 == true) sel1_fromYes_toNo();
				if (KT_Page.isSel_Iptv_2 == true) sel2_fromYes_toNo();
				if (KT_Page.isSel_Iptv_3 == true) sel3_fromYes_toNo();
				if (KT_Page.isSel_Iptv_5 == true) sel5_fromYes_toNo();
				sel4_fromNo_toYes();
			}
		}
		// 선택 버튼 5
		else if (arg0.getSource() == select5) {
			if (KT_Page.isSel_Iptv_5 == true) {
				sel5_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Iptv_1 == true) sel1_fromYes_toNo();
				if (KT_Page.isSel_Iptv_2 == true) sel2_fromYes_toNo();
				if (KT_Page.isSel_Iptv_3 == true) sel3_fromYes_toNo();
				if (KT_Page.isSel_Iptv_4 == true) sel4_fromYes_toNo();
				sel5_fromNo_toYes();
			}
		}
		// 선택 버튼 6
		else if (arg0.getSource() == select6) {
			if (KT_Page.isSel_Iptv_6 == true) {
				sel6_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Iptv_7 == true) sel7_fromYes_toNo();
				if (KT_Page.isSel_Iptv_8 == true) sel8_fromYes_toNo();
				if (KT_Page.isSel_Iptv_9 == true) sel9_fromYes_toNo();
				sel6_fromNo_toYes();
			}
		}
		// 선택 버튼 7
		else if (arg0.getSource() == select7) {
			if (KT_Page.isSel_Iptv_7 == true) {
				sel7_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Iptv_6 == true) sel6_fromYes_toNo();
				if (KT_Page.isSel_Iptv_8 == true) sel8_fromYes_toNo();
				if (KT_Page.isSel_Iptv_9 == true) sel9_fromYes_toNo();
				sel7_fromNo_toYes();
			}
		}
		// 선택 버튼 8
		else if (arg0.getSource() == select8) {
			if (KT_Page.isSel_Iptv_8 == true) {
				sel8_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Iptv_6 == true) sel6_fromYes_toNo();
				if (KT_Page.isSel_Iptv_7 == true) sel7_fromYes_toNo();
				if (KT_Page.isSel_Iptv_9 == true) sel9_fromYes_toNo();
				sel8_fromNo_toYes();
			}
		}
		// 선택 버튼 9
		else if (arg0.getSource() == select9) {
			if (KT_Page.isSel_Iptv_9 == true) {
				sel9_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Iptv_6 == true) sel6_fromYes_toNo();
				if (KT_Page.isSel_Iptv_7 == true) sel7_fromYes_toNo();
				if (KT_Page.isSel_Iptv_8 == true) sel8_fromYes_toNo();
				sel9_fromNo_toYes();
			}
		}
		
		// 수식 대입
		Controller.ktData.calculData();
	}

	/*
	 * Click - 1
	 */
	private void sel1_fromNo_toYes() {
		select1.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][13].getText());
			price = price - 1100;
			KTData.dataLabel[i][13].setText(price + "");
		}
		KT_Page.isSel_Iptv_1 = true;	
	}
	private void sel1_fromYes_toNo() {	
		select1.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][13].getText());
			price = price + 1100;
			KTData.dataLabel[i][13].setText(price + "");
		}
		KT_Page.isSel_Iptv_1 = false;
	}

	/*
	 * Click - 2
	 */
	private void sel2_fromNo_toYes() {
		select2.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][13].getText());
			price = price - 3300;
			KTData.dataLabel[i][13].setText(price + "");
		}
		KT_Page.isSel_Iptv_2 = true;	
	}
	private void sel2_fromYes_toNo() {	
		select2.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][13].getText());
			price = price + 3300;
			KTData.dataLabel[i][13].setText(price + "");
		}
		KT_Page.isSel_Iptv_2 = false;
	}

	/*
	 * Click - 3
	 */
	private void sel3_fromNo_toYes() {
		select3.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][13].getText());
			price = price - 5500;
			KTData.dataLabel[i][13].setText(price + "");
		}
		KT_Page.isSel_Iptv_3 = true;	
	}
	private void sel3_fromYes_toNo() {	
		select3.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][13].getText());
			price = price + 5500;
			KTData.dataLabel[i][13].setText(price + "");
		}
		KT_Page.isSel_Iptv_3 = false;
	}

	/*
	 * Click - 4
	 */
	private void sel4_fromNo_toYes() {
		select4.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][13].getText());
			price = price - 7700;
			KTData.dataLabel[i][13].setText(price + "");
		}
		KT_Page.isSel_Iptv_4 = true;	
	}
	private void sel4_fromYes_toNo() {	
		select4.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][13].getText());
			price = price + 7700;
			KTData.dataLabel[i][13].setText(price + "");
		}
		KT_Page.isSel_Iptv_4 = false;
	}

	/*
	 * Click - 5
	 */
	private void sel5_fromNo_toYes() {
		select5.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][13].getText());
			price = price - 11000;
			KTData.dataLabel[i][13].setText(price + "");
		}
		KT_Page.isSel_Iptv_5 = true;	
	}
	private void sel5_fromYes_toNo() {	
		select5.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][13].getText());
			price = price + 11000;
			KTData.dataLabel[i][13].setText(price + "");
		}
		KT_Page.isSel_Iptv_5 = false;
	}

	/*
	 * Click - 6
	 */
	private void sel6_fromNo_toYes() {
		select6.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][14].getText());
			price = price - 3300;
			KTData.dataLabel[i][14].setText(price + "");
		}
		KT_Page.isSel_Iptv_6 = true;	
	}
	private void sel6_fromYes_toNo() {	
		select6.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][14].getText());
			price = price + 3300;
			KTData.dataLabel[i][14].setText(price + "");
		}
		KT_Page.isSel_Iptv_6 = false;
	}

	/*
	 * Click - 7
	 */
	private void sel7_fromNo_toYes() {
		select7.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][14].getText());
			price = price - 5500;
			KTData.dataLabel[i][14].setText(price + "");
		}
		KT_Page.isSel_Iptv_7 = true;	
	}
	private void sel7_fromYes_toNo() {	
		select7.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][14].getText());
			price = price + 5500;
			KTData.dataLabel[i][14].setText(price + "");
		}
		KT_Page.isSel_Iptv_7 = false;
	}

	/*
	 * Click - 8
	 */
	private void sel8_fromNo_toYes() {
		select8.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][14].getText());
			price = price - 8800;
			KTData.dataLabel[i][14].setText(price + "");
		}
		KT_Page.isSel_Iptv_8 = true;	
	}
	private void sel8_fromYes_toNo() {	
		select8.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][14].getText());
			price = price + 8800;
			KTData.dataLabel[i][14].setText(price + "");
		}
		KT_Page.isSel_Iptv_8 = false;
	}

	/*
	 * Click - 9
	 */
	private void sel9_fromNo_toYes() {
		select9.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][14].getText());
			price = price - 11000;
			KTData.dataLabel[i][14].setText(price + "");
		}
		KT_Page.isSel_Iptv_9 = true;	
	}
	private void sel9_fromYes_toNo() {	
		select9.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][14].getText());
			price = price + 11000;
			KTData.dataLabel[i][14].setText(price + "");
		}
		KT_Page.isSel_Iptv_9 = false;
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == 27) {
			// esc
			KT_Page.isOpenIPTV = false;
			dispose();
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
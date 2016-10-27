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
public class KT_Card extends JFrame implements MouseMotionListener, MouseListener, KeyListener{
	private int tmpX, tmpY;
	private JLabel titleBar,
					cardPanel,
					exitBtn;
	private JLabel select1, select2, select3, select4, select5,
					select6, select7, select8;
	
	public KT_Card() {
		// TODO Auto-generated constructor stub
		setUndecorated(true);
		setOpacity(0.98f);
		setSize(892,274);
		setLocation(
				(int) (ConstV.windowSizeX * 0.85 - 892-5),   	// 1088
				(int) (ConstV.windowSizeY * 0.2525)); 			// 370
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
		titleBar = new JLabel(new ImageIcon(Controller.loadKTImage.getCardTitleImg()));
		this.add(titleBar);
		titleBar.setBounds(
				0, 
				0,
				892, 
				20); 
		
		/*
		 * cardPanel
		 */
		cardPanel = new JLabel(new ImageIcon(Controller.loadKTImage.getCardPanelImg()));
		this.add(cardPanel);
		cardPanel.setBounds(
					0, 
					20,
					892, 
					254); 
		

		/*
		 * 종료버튼
		 */
		exitBtn = new JLabel(new ImageIcon(Controller.loadCommonImage.getCardExitImg()));
		titleBar.add(exitBtn);
		exitBtn.setBounds(
				872, 
				0,
				18, 
				18); 
		exitBtn.addMouseListener(this);
		
		
		

		/*
		 * 선택버튼1
		 */
		if (KT_Page.isSel_Card_1)
			select1 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select1 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(select1);
		select1.setBounds(286, 88, 31, 26); 
		select1.addMouseListener(this);
		

		/*
		 * 선택버튼2
		 */
		if (KT_Page.isSel_Card_2)
			select2 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select2 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(select2);
		select2.setBounds(286, 131, 31, 26); 
		select2.addMouseListener(this);
		
		

		/*
		 * 선택버튼3
		 */
		if (KT_Page.isSel_Card_3)
			select3 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select3 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(select3);
		select3.setBounds(286, 174, 31, 26); 
		select3.addMouseListener(this);
		
		
		/*
		 * 선택버튼4
		 */
		if (KT_Page.isSel_Card_4)
			select4 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select4 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(select4);
		select4.setBounds(474, 88, 31, 26); 
		select4.addMouseListener(this);
		
		
		/*
		 * 선택버튼5
		 */
		if (KT_Page.isSel_Card_5)
			select5 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select5 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(select5);
		select5.setBounds(474, 131, 31, 26); 
		select5.addMouseListener(this);
		
		
		/*
		 * 선택버튼6
		 */
		if (KT_Page.isSel_Card_6)
			select6 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select6 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(select6);
		select6.setBounds(660, 88, 31, 26); 
		select6.addMouseListener(this);
		
		

		/*
		 * 선택버튼7
		 */
		if (KT_Page.isSel_Card_7)
			select7 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select7 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(select7);
		select7.setBounds(846, 131, 31, 26); 
		select7.addMouseListener(this);
		
		
		/*
		 * 선택버튼8
		 */
		if (KT_Page.isSel_Card_8)
			select8 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select8 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(select8);
		select8.setBounds(846, 217, 31, 26); 
		select8.addMouseListener(this);
		
		
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
			KT_Page.isOpenCard = false;
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
			KT_Page.isOpenCard = false;
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
		

		// 선택 버튼 1
		else if (arg0.getSource() == select1) {
			if (KT_Page.isSel_Card_1 == true) {
				sel1_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Card_2 == true) sel2_fromYes_toNo();
				if (KT_Page.isSel_Card_3 == true) sel3_fromYes_toNo();
				sel1_fromNo_toYes();
			}
		}
		
		// 선택 버튼 2
		else if (arg0.getSource() == select2) {
			if (KT_Page.isSel_Card_2 == true) {
				sel2_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Card_1 == true) sel1_fromYes_toNo();
				if (KT_Page.isSel_Card_3 == true) sel3_fromYes_toNo();
				sel2_fromNo_toYes();
			}
		}
		
		// 선택 버튼 3
		else if (arg0.getSource() == select3) {
			if (KT_Page.isSel_Card_3 == true) {
				sel3_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Card_1 == true) sel1_fromYes_toNo();
				if (KT_Page.isSel_Card_2 == true) sel2_fromYes_toNo();
				sel3_fromNo_toYes();
			}
		}
		
		// 선택 버튼 4
		else if (arg0.getSource() == select4) {
			if (KT_Page.isSel_Card_4 == true) {
				sel4_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Card_5 == true) sel5_fromYes_toNo();
				if (KT_Page.isSel_Card_6 == true) sel6_fromYes_toNo();
				if (KT_Page.isSel_Card_7 == true) sel7_fromYes_toNo();
				if (KT_Page.isSel_Card_8 == true) sel8_fromYes_toNo();
				sel4_fromNo_toYes();
			}
		}
		
		// 선택 버튼 5
		else if (arg0.getSource() == select5) {
			if (KT_Page.isSel_Card_5 == true) {
				sel5_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Card_4 == true) sel4_fromYes_toNo();
				if (KT_Page.isSel_Card_6 == true) sel6_fromYes_toNo();
				if (KT_Page.isSel_Card_7 == true) sel7_fromYes_toNo();
				if (KT_Page.isSel_Card_8 == true) sel8_fromYes_toNo();
				sel5_fromNo_toYes();
			}
		}
		
		// 선택 버튼 6
		else if (arg0.getSource() == select6) {
			if (KT_Page.isSel_Card_6 == true) {
				sel6_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Card_4 == true) sel4_fromYes_toNo();
				if (KT_Page.isSel_Card_5 == true) sel5_fromYes_toNo();
				if (KT_Page.isSel_Card_7 == true) sel7_fromYes_toNo();
				if (KT_Page.isSel_Card_8 == true) sel8_fromYes_toNo();
				sel6_fromNo_toYes();
			}
		}
		
		// 선택 버튼 7
		else if (arg0.getSource() == select7) {
			if (KT_Page.isSel_Card_7 == true) {
				sel7_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Card_4 == true) sel4_fromYes_toNo();
				if (KT_Page.isSel_Card_5 == true) sel5_fromYes_toNo();
				if (KT_Page.isSel_Card_6 == true) sel6_fromYes_toNo();
				if (KT_Page.isSel_Card_8 == true) sel8_fromYes_toNo();
				sel7_fromNo_toYes();
			}
		}
		
		// 선택 버튼 8
		else if (arg0.getSource() == select8) {
			if (KT_Page.isSel_Card_8 == true) {
				sel8_fromYes_toNo();
			} else {
				if (KT_Page.isSel_Card_4 == true) sel4_fromYes_toNo();
				if (KT_Page.isSel_Card_5 == true) sel5_fromYes_toNo();
				if (KT_Page.isSel_Card_6 == true) sel6_fromYes_toNo();
				if (KT_Page.isSel_Card_7 == true) sel7_fromYes_toNo();
				sel8_fromNo_toYes();
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
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price - 7000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_1 = true;
	}	
	private void sel1_fromYes_toNo() {
		select1.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price + 7000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_1 = false;
	}
	
	/*
	 * Click - 2
	 */
	private void sel2_fromNo_toYes() {
		select2.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price - 7000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_2 = true;
	}	
	private void sel2_fromYes_toNo() {
		select2.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price + 7000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_2 = false;
	}
	
	/*
	 * Click - 3
	 */
	private void sel3_fromNo_toYes() {
		select3.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price - 15000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_3 = true;
	}	
	private void sel3_fromYes_toNo() {
		select3.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price + 15000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_3 = false;
	}
	
	/*
	 * Click - 4
	 */
	private void sel4_fromNo_toYes() {
		select4.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price - 3000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_4 = true;
	}	
	private void sel4_fromYes_toNo() {
		select4.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price + 3000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_4 = false;
	}
	
	/*
	 * Click - 5
	 */
	private void sel5_fromNo_toYes() {
		select5.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price - 5000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_5 = true;
	}	
	private void sel5_fromYes_toNo() {
		select5.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price + 5000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_5 = false;
	}
	
	/*
	 * Click - 6
	 */
	private void sel6_fromNo_toYes() {
		select6.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price - 7000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_6 = true;
	}	
	private void sel6_fromYes_toNo() {
		select6.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price + 7000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_6 = false;
	}
	
	/*
	 * Click - 7
	 */
	private void sel7_fromNo_toYes() {
		select7.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price - 10000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_7 = true;
	}	
	private void sel7_fromYes_toNo() {
		select7.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price + 10000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_7 = false;
	}
	
	/*
	 * Click - 8
	 */
	private void sel8_fromNo_toYes() {
		select8.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price - 30000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_8 = true;
	}	
	private void sel8_fromYes_toNo() {
		select8.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<8; i++) {
			int price = Integer.parseInt(KTData.dataLabel[i][12].getText());
			price = price + 30000;
			KTData.dataLabel[i][12].setText(price + "");
		}
		KT_Page.isSel_Card_8 = false;
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
			KT_Page.isOpenCard = false;
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

package gui.page.subpage;

import gui.constvalue.ConstV;
import gui.page.LG_Page;

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

import model.LGData;
import control.Controller;

@SuppressWarnings("serial")
public class LG_Card extends JFrame implements MouseMotionListener, MouseListener, KeyListener{
	private int tmpX, tmpY;
	private JLabel titleBar,
					cardPanel,
					exitBtn;
	private JLabel preSelect1, preSelect2, preSelect3, preSelect4, preSelect5;
	
	public LG_Card() {
		// TODO Auto-generated constructor stub
		setUndecorated(true);
		setOpacity(0.98f);
		setSize(1156,361);
		setLocation(
				(int) (ConstV.windowSizeX * 0.85 - 1156-5),   	// 1088
				(int) (ConstV.windowSizeY * 0.2525)); 	// 370
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
		titleBar = new JLabel(new ImageIcon(Controller.loadLGImage.getCardTitleImg()));
		this.add(titleBar);
		titleBar.setBounds(
				0, 
				0,
				1156, 
				20); 
		
		/*
		 * cardPanel
		 */
		cardPanel = new JLabel(new ImageIcon(Controller.loadLGImage.getCardPanelImg()));
		this.add(cardPanel);
		cardPanel.setBounds(
					0, 
					20,
					1156, 
					341); 
		

		/*
		 * 종료버튼
		 */
		exitBtn = new JLabel(new ImageIcon(Controller.loadCommonImage.getCardExitImg()));
		titleBar.add(exitBtn);
		exitBtn.setBounds(
				1136, 
				0,
				18, 
				18); 
		exitBtn.addMouseListener(this);
		
		
		

		/*
		 * Pre 선택버튼1
		 */
		if (LG_Page.isSel_Card_1)
			preSelect1 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			preSelect1 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(preSelect1);
		preSelect1.setBounds(130, 303, 31, 26); 
		preSelect1.addMouseListener(this);
		
		
		/*
		 * Pre 선택버튼2
		 */
		if (LG_Page.isSel_Card_2)
			preSelect2 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			preSelect2 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(preSelect2);
		preSelect2.setBounds(338, 303, 31, 26); 
		preSelect2.addMouseListener(this);
		
		

		/*
		 * Pre 선택버튼3
		 */
		if (LG_Page.isSel_Card_3)
			preSelect3 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			preSelect3 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(preSelect3);
		preSelect3.setBounds(553, 303, 31, 26); 
		preSelect3.addMouseListener(this);
		
		

		/*
		 * Pre 선택버튼4
		 */
		if (LG_Page.isSel_Card_4)
			preSelect4 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			preSelect4 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(preSelect4);
		preSelect4.setBounds(765, 303, 31, 26); 
		preSelect4.addMouseListener(this);
		
		
		/*
		 * Pre 선택버튼5
		 */
		if (LG_Page.isSel_Card_5)
			preSelect5 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			preSelect5 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(preSelect5);
		preSelect5.setBounds(965, 303, 31, 26); 
		preSelect5.addMouseListener(this);
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
			LG_Page.isOpenCard = false;
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
			LG_Page.isOpenCard = false;
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
		

		// Pre 선택 버튼 1
		else if (arg0.getSource() == preSelect1) {
			if (LG_Page.isSel_Card_1 == true) {
				sel1_fromYes_toNo();
			} else {
				if (LG_Page.isSel_Card_2 == true) sel2_fromYes_toNo();
				if (LG_Page.isSel_Card_3 == true) sel3_fromYes_toNo();
				if (LG_Page.isSel_Card_4 == true) sel4_fromYes_toNo();
				if (LG_Page.isSel_Card_5 == true) sel5_fromYes_toNo();
				sel1_fromNo_toYes();
			}
		}
		
		
		// Pre 선택 버튼 2
		else if (arg0.getSource() == preSelect2) {
			if (LG_Page.isSel_Card_2 == true) {
				sel2_fromYes_toNo();
			} else {
				if (LG_Page.isSel_Card_1 == true) sel1_fromYes_toNo();
				if (LG_Page.isSel_Card_3 == true) sel3_fromYes_toNo();
				if (LG_Page.isSel_Card_4 == true) sel4_fromYes_toNo();
				if (LG_Page.isSel_Card_5 == true) sel5_fromYes_toNo();
				sel2_fromNo_toYes();
			}
		}
		
		
		// Pre 선택 버튼 3
		else if (arg0.getSource() == preSelect3) {
			if (LG_Page.isSel_Card_3 == true) {
				sel3_fromYes_toNo();
			} else {
				if (LG_Page.isSel_Card_1 == true) sel1_fromYes_toNo();
				if (LG_Page.isSel_Card_2 == true) sel2_fromYes_toNo();
				if (LG_Page.isSel_Card_4 == true) sel4_fromYes_toNo();
				if (LG_Page.isSel_Card_5 == true) sel5_fromYes_toNo();
				sel3_fromNo_toYes();
			}
		}
		
		
		
		// Pre 선택 버튼 4
		else if (arg0.getSource() == preSelect4) {
			if (LG_Page.isSel_Card_4 == true) {
				sel4_fromYes_toNo();
			} else {
				if (LG_Page.isSel_Card_1 == true) sel1_fromYes_toNo();
				if (LG_Page.isSel_Card_2 == true) sel2_fromYes_toNo();
				if (LG_Page.isSel_Card_3 == true) sel3_fromYes_toNo();
				if (LG_Page.isSel_Card_5 == true) sel5_fromYes_toNo();
				sel4_fromNo_toYes();
			}
		}
		
		
		
		// Pre 선택 버튼 5
		else if (arg0.getSource() == preSelect5) {
			if (LG_Page.isSel_Card_5 == true) {
				sel5_fromYes_toNo();
			} else {
				if (LG_Page.isSel_Card_1 == true) sel1_fromYes_toNo();
				if (LG_Page.isSel_Card_2 == true) sel2_fromYes_toNo();
				if (LG_Page.isSel_Card_3 == true) sel3_fromYes_toNo();
				if (LG_Page.isSel_Card_4 == true) sel4_fromYes_toNo();
				sel5_fromNo_toYes();
			}
		}
		
		
		// 수식 대입
		Controller.lgData.calculData();
	}

	/*
	 * Click - 1
	 */
	private void sel1_fromNo_toYes() {
		preSelect1.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<11; i++) {
			int price = Integer.parseInt(LGData.dataLabel[i][13].getText());
			price = price - 9000;
			LGData.dataLabel[i][13].setText(price + "");
		}
		LG_Page.isSel_Card_1 = true;
	}	
	private void sel1_fromYes_toNo() {
		preSelect1.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<11; i++) {
			int price = Integer.parseInt(LGData.dataLabel[i][13].getText());
			price = price + 9000;
			LGData.dataLabel[i][13].setText(price + "");
		}
		LG_Page.isSel_Card_1 = false;
	}
	
	/*
	 * Click - 2
	 */
	private void sel2_fromNo_toYes() {
		preSelect2.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<11; i++) {
			int price = Integer.parseInt(LGData.dataLabel[i][13].getText());
			price = price - 12000;
			LGData.dataLabel[i][13].setText(price + "");
		}
		LG_Page.isSel_Card_2 = true;
	}	
	private void sel2_fromYes_toNo() {
		preSelect2.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<11; i++) {
			int price = Integer.parseInt(LGData.dataLabel[i][13].getText());
			price = price + 12000;
			LGData.dataLabel[i][13].setText(price + "");
		}
		LG_Page.isSel_Card_2 = false;
	}
	
	/*
	 * Click - 3
	 */
	private void sel3_fromNo_toYes() {
		preSelect3.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<11; i++) {
			int price = Integer.parseInt(LGData.dataLabel[i][13].getText());
			price = price - 15000;
			LGData.dataLabel[i][13].setText(price + "");
		}
		LG_Page.isSel_Card_3 = true;
	}	
	private void sel3_fromYes_toNo() {
		preSelect3.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<11; i++) {
			int price = Integer.parseInt(LGData.dataLabel[i][13].getText());
			price = price + 15000;
			LGData.dataLabel[i][13].setText(price + "");
		}
		LG_Page.isSel_Card_3 = false;
	}
	
	/*
	 * Click - 4
	 */
	private void sel4_fromNo_toYes() {
		preSelect4.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<11; i++) {
			int price = Integer.parseInt(LGData.dataLabel[i][13].getText());
			price = price - 18000;
			LGData.dataLabel[i][13].setText(price + "");
		}
		LG_Page.isSel_Card_4 = true;
	}	
	private void sel4_fromYes_toNo() {
		preSelect4.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<11; i++) {
			int price = Integer.parseInt(LGData.dataLabel[i][13].getText());
			price = price + 18000;
			LGData.dataLabel[i][13].setText(price + "");
		}
		LG_Page.isSel_Card_4 = false;
	}
	
	/*
	 * Click - 5
	 */
	private void sel5_fromNo_toYes() {
		preSelect5.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<11; i++) {
			int price = Integer.parseInt(LGData.dataLabel[i][13].getText());
			price = price - 21000;
			LGData.dataLabel[i][13].setText(price + "");
		}
		LG_Page.isSel_Card_5 = true;
	}	
	private void sel5_fromYes_toNo() {
		preSelect5.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<11; i++) {
			int price = Integer.parseInt(LGData.dataLabel[i][13].getText());
			price = price + 21000;
			LGData.dataLabel[i][13].setText(price + "");
		}
		LG_Page.isSel_Card_5 = false;
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
			LG_Page.isOpenCard = false;
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

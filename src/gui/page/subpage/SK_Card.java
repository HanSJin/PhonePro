package gui.page.subpage;

import gui.constvalue.ConstV;
import gui.page.SK_Page;

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

import model.SKData;
import control.Controller;

@SuppressWarnings("serial")
public class SK_Card extends JFrame implements MouseMotionListener, MouseListener, KeyListener{
	private int tmpX, tmpY;
	private JLabel titleBar,
					cardPanel,
					exitBtn;
	private JLabel preSelect1, preSelect2, preSelect3, preSelect4, preSelect5;
	private JLabel postSelect1, PostSelect2, postSelect3, postSelect4; // 1-5000, 2-10000, 3-15000, 4,10000
	
	public SK_Card() {
		// TODO Auto-generated constructor stub
		setUndecorated(true);
		setOpacity(0.98f);
		setSize(1052,282);
		setLocation(
				(int) (ConstV.windowSizeX * 0.85 - 1052-5),   	// 1088
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
		titleBar = new JLabel(new ImageIcon(Controller.loadSKImage.getCardTitleImg()));
		this.add(titleBar);
		titleBar.setBounds(
				0, 
				0,
				1052, 
				20); 
		
		/*
		 * cardPanel
		 */
		cardPanel = new JLabel(new ImageIcon(Controller.loadSKImage.getCardPanelImg()));
		this.add(cardPanel);
		cardPanel.setBounds(
					0, 
					20,
					1052, 
					262); 
		

		/*
		 * 종료버튼
		 */
		exitBtn = new JLabel(new ImageIcon(Controller.loadCommonImage.getCardExitImg()));
		titleBar.add(exitBtn);
		exitBtn.setBounds(
				1032, 
				0,
				18, 
				18); 
		exitBtn.addMouseListener(this);
		
		
		/*
		 * 선택버튼1
		 */
		if (SK_Page.isSel_Card_1)
			postSelect1 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			postSelect1 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(postSelect1);
		postSelect1.setBounds(819, 77, 31, 26); 
		postSelect1.addMouseListener(this);
		
		
		/*
		 * 선택버튼2
		 */
		if (SK_Page.isSel_Card_2)
			PostSelect2 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			PostSelect2 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(PostSelect2);
		PostSelect2.setBounds(819, 146, 31, 26); 
		PostSelect2.addMouseListener(this);
		
		
		
		/*
		 * 선택버튼3
		 */
		if (SK_Page.isSel_Card_3)
			postSelect3 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			postSelect3 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(postSelect3);
		postSelect3.setBounds(819, 215, 31, 26); 
		postSelect3.addMouseListener(this);
		
		
		
		/*
		 * 선택버튼4
		 */
		if (SK_Page.isSel_Card_4)
			postSelect4 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			postSelect4 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(postSelect4);
		postSelect4.setBounds(1005, 146, 31, 26); 
		postSelect4.addMouseListener(this);
		
		
		/*
		 * Pre 선택버튼1
		 */
		if (SK_Page.isSel_Card_pre_1)
			preSelect1 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			preSelect1 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(preSelect1);
		preSelect1.setBounds(130, 223, 31, 26); 
		preSelect1.addMouseListener(this);
		
		
		/*
		 * Pre 선택버튼2
		 */
		if (SK_Page.isSel_Card_pre_2)
			preSelect2 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			preSelect2 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(preSelect2);
		preSelect2.setBounds(237, 223, 31, 26); 
		preSelect2.addMouseListener(this);
		
		

		/*
		 * Pre 선택버튼3
		 */
		if (SK_Page.isSel_Card_pre_3)
			preSelect3 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			preSelect3 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(preSelect3);
		preSelect3.setBounds(346, 223, 31, 26); 
		preSelect3.addMouseListener(this);
		
		

		/*
		 * Pre 선택버튼4
		 */
		if (SK_Page.isSel_Card_pre_4)
			preSelect4 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			preSelect4 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(preSelect4);
		preSelect4.setBounds(458, 223, 31, 26); 
		preSelect4.addMouseListener(this);
		
		
		/*
		 * Pre 선택버튼5
		 */
		if (SK_Page.isSel_Card_pre_5)
			preSelect5 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			preSelect5 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		cardPanel.add(preSelect5);
		preSelect5.setBounds(570, 223, 31, 26); 
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
			SK_Page.isOpenCard = false;
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
			SK_Page.isOpenCard = false;
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
		else if (arg0.getSource() == postSelect1) {
			if (SK_Page.isSel_Card_1 == true) {
				post1_fromYes_toNo();
			} else {
				if (SK_Page.isSel_Card_2 == true) post2_fromYes_toNo();
				if (SK_Page.isSel_Card_3 == true) post3_fromYes_toNo();
				if (SK_Page.isSel_Card_4 == true) post4_fromYes_toNo();
				post1_fromNo_toYes();
			}
		}
		
		// 선택 버튼 2
		else if (arg0.getSource() == PostSelect2) {
			if (SK_Page.isSel_Card_2 == true) {
				post2_fromYes_toNo();
			} else {
				if (SK_Page.isSel_Card_1 == true) post1_fromYes_toNo();
				if (SK_Page.isSel_Card_3 == true) post3_fromYes_toNo();
				if (SK_Page.isSel_Card_4 == true) post4_fromYes_toNo();
				post2_fromNo_toYes();
			}
		}
		
		
		// 선택 버튼 3
		else if (arg0.getSource() == postSelect3) {
			if (SK_Page.isSel_Card_3 == true) {
				post3_fromYes_toNo();
			} else {
				if (SK_Page.isSel_Card_1 == true) post1_fromYes_toNo();
				if (SK_Page.isSel_Card_2 == true) post2_fromYes_toNo();
				if (SK_Page.isSel_Card_4 == true) post4_fromYes_toNo();
				post3_fromNo_toYes();
			}
		}
		
		// 선택 버튼 4
		else if (arg0.getSource() == postSelect4) {
			if (SK_Page.isSel_Card_4 == true) {
				post4_fromYes_toNo();
			} else {
				if (SK_Page.isSel_Card_1 == true) post1_fromYes_toNo();
				if (SK_Page.isSel_Card_2 == true) post2_fromYes_toNo();
				if (SK_Page.isSel_Card_3 == true) post3_fromYes_toNo();
				post4_fromNo_toYes();
			}
		}
		
		
		// Pre 선택 버튼 1
		else if (arg0.getSource() == preSelect1) {
			if (SK_Page.isSel_Card_pre_1 == true) {
				pre1_fromYes_toNo();
			} else {
				if (SK_Page.isSel_Card_pre_2 == true) pre2_fromYes_toNo();
				if (SK_Page.isSel_Card_pre_3 == true) pre3_fromYes_toNo();
				if (SK_Page.isSel_Card_pre_4 == true) pre4_fromYes_toNo();
				if (SK_Page.isSel_Card_pre_5 == true) pre5_fromYes_toNo();
				pre1_fromNo_toYes();
			}
		}
		
		
		// Pre 선택 버튼 2
		else if (arg0.getSource() == preSelect2) {
			if (SK_Page.isSel_Card_pre_2 == true) {
				pre2_fromYes_toNo();
			} else {
				if (SK_Page.isSel_Card_pre_1 == true) pre1_fromYes_toNo();
				if (SK_Page.isSel_Card_pre_3 == true) pre3_fromYes_toNo();
				if (SK_Page.isSel_Card_pre_4 == true) pre4_fromYes_toNo();
				if (SK_Page.isSel_Card_pre_5 == true) pre5_fromYes_toNo();
				pre2_fromNo_toYes();
			}
		}
		
		
		// Pre 선택 버튼 3
		else if (arg0.getSource() == preSelect3) {
			if (SK_Page.isSel_Card_pre_3 == true) {
				pre3_fromYes_toNo();
			} else {
				if (SK_Page.isSel_Card_pre_1 == true) pre1_fromYes_toNo();
				if (SK_Page.isSel_Card_pre_2 == true) pre2_fromYes_toNo();
				if (SK_Page.isSel_Card_pre_4 == true) pre4_fromYes_toNo();
				if (SK_Page.isSel_Card_pre_5 == true) pre5_fromYes_toNo();
				pre3_fromNo_toYes();
			}
		}
		
		
		
		// Pre 선택 버튼 4
		else if (arg0.getSource() == preSelect4) {
			if (SK_Page.isSel_Card_pre_4 == true) {
				pre4_fromYes_toNo();
			} else {
				if (SK_Page.isSel_Card_pre_1 == true) pre1_fromYes_toNo();
				if (SK_Page.isSel_Card_pre_2 == true) pre2_fromYes_toNo();
				if (SK_Page.isSel_Card_pre_3 == true) pre3_fromYes_toNo();
				if (SK_Page.isSel_Card_pre_5 == true) pre5_fromYes_toNo();
				pre4_fromNo_toYes();
			}
		}
		
		
		
		// Pre 선택 버튼 5
		else if (arg0.getSource() == preSelect5) {
			if (SK_Page.isSel_Card_pre_5 == true) {
				pre5_fromYes_toNo();
			} else {
				if (SK_Page.isSel_Card_pre_1 == true) pre1_fromYes_toNo();
				if (SK_Page.isSel_Card_pre_2 == true) pre2_fromYes_toNo();
				if (SK_Page.isSel_Card_pre_3 == true) pre3_fromYes_toNo();
				if (SK_Page.isSel_Card_pre_4 == true) pre4_fromYes_toNo();
				pre5_fromNo_toYes();
			}
		}
		
		
		
		// 수식 대입
		Controller.skData.calculData();
	}
	
	

	/*
	 * Post Click - 1
	 */
	private void post1_fromNo_toYes() {
		postSelect1.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price - 5000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_1 = true;
	}	
	private void post1_fromYes_toNo() {
		postSelect1.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price + 5000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_1 = false;
	}
	
	/*
	 * Post Click - 2
	 */
	private void post2_fromNo_toYes() {
		PostSelect2.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price - 10000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_2 = true;
	}	
	private void post2_fromYes_toNo() {
		PostSelect2.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price + 10000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_2 = false;
	}
	
	/*
	 * Post Click - 3
	 */
	private void post3_fromNo_toYes() {
		postSelect3.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price - 15000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_3 = true;
	}	
	private void post3_fromYes_toNo() {
		postSelect3.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price + 15000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_3 = false;
	}
	
	/*
	 * Post Click - 4
	 */
	private void post4_fromNo_toYes() {
		postSelect4.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price - 10000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_4 = true;
	}	
	private void post4_fromYes_toNo() {
		postSelect4.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price + 10000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_4 = false;
	}
	
	

	/*
	 * Pre Click - 1
	 */
	private void pre1_fromNo_toYes() {
		preSelect1.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price - 9000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_pre_1 = true;
	}	
	private void pre1_fromYes_toNo() {
		preSelect1.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price + 9000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_pre_1 = false;
	}


	/*
	 * Pre Click - 2
	 */
	private void pre2_fromNo_toYes() {
		preSelect2.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price - 12000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_pre_2 = true;
	}	
	private void pre2_fromYes_toNo() {
		preSelect2.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price + 12000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_pre_2 = false;
	}
	
	/*
	 * Pre Click - 3
	 */
	private void pre3_fromNo_toYes() {
		preSelect3.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price - 15000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_pre_3 = true;
	}	
	private void pre3_fromYes_toNo() {
		preSelect3.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price + 15000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_pre_3 = false;
	}
	
	/*
	 * Pre Click - 4
	 */
	private void pre4_fromNo_toYes() {
		preSelect4.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price - 18000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_pre_4 = true;
	}	
	private void pre4_fromYes_toNo() {
		preSelect4.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price + 18000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_pre_4 = false;
	}
	
	/*
	 * Pre Click - 5
	 */
	private void pre5_fromNo_toYes() {
		preSelect5.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price - 21000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_pre_5 = true;
	}	
	private void pre5_fromYes_toNo() {
		preSelect5.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<9; i++) {
			int price = Integer.parseInt(SKData.dataLabel[i][13].getText());
			price = price + 21000;
			SKData.dataLabel[i][13].setText(price + "");
		}
		SK_Page.isSel_Card_pre_5 = false;
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
			SK_Page.isOpenCard = false;
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

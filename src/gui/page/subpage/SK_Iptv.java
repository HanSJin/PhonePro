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
public class SK_Iptv extends JFrame implements MouseMotionListener, MouseListener, KeyListener{
	private int tmpX, tmpY;
	private JLabel titleBar,
					iptvPanel,
					exitBtn;
	private JLabel select1; // 1-인터넷, 2-iptv
	
	public SK_Iptv() {
		// TODO Auto-generated constructor stub
		setUndecorated(true);
		setSize(772,262+20);
		setOpacity(0.98f);
		setLocation(
				(int) (ConstV.windowSizeX * 0.85 - 772 - 5),   	// 1088
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
		titleBar = new JLabel(new ImageIcon(Controller.loadSKImage.getIptvTitleImg()));
		this.add(titleBar);
		titleBar.setBounds(
				0, 
				0,
				772, 
				20); 
		
		
		
		/*
		 * cardPanel
		 */
		iptvPanel = new JLabel(new ImageIcon(Controller.loadSKImage.getIptvPanelImg()));
		this.add(iptvPanel);
		iptvPanel.setBounds(
				0, 
				20,
				772, 
				262); 
		

		/*
		 * 종료버튼
		 */
		exitBtn = new JLabel(new ImageIcon(Controller.loadCommonImage.getCardExitImg()));
		titleBar.add(exitBtn);
		exitBtn.setBounds(
				752, 
				0,
				18, 
				18);
		exitBtn.addMouseListener(this);
		
		/*
		 * 선택버튼1
		 */
		if (SK_Page.isSel_Iptv_1)
			select1 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select1 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		iptvPanel.add(select1);
		select1.setBounds(724, 13, 31, 26); 
		select1.addMouseListener(this);
		
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
			SK_Page.isOpenIPTV = false;
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
			SK_Page.isOpenIPTV = false;
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
			if (SK_Page.isSel_Iptv_1 == true) {
				// 선택되어 있음
				select1.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
				for (int i=1; i<9; i++) {
					int price = Integer.parseInt(SKData.dataLabel[i][14].getText());
					price = price + 2000;
					SKData.dataLabel[i][14].setText(price + "");
				}
				SK_Page.isSel_Iptv_1 = false;
			} else {
				// 선택안되어 있음
				select1.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
				for (int i=1; i<9; i++) {
					int price = Integer.parseInt(SKData.dataLabel[i][14].getText());
					price = price - 2000;
					SKData.dataLabel[i][14].setText(price + "");
				}
				SK_Page.isSel_Iptv_1 = true;
			}
		}
		
//		// 선택 버튼 2
//		else if (arg0.getSource() == select2) {
//			if (SK_Page.isSel_Iptv_2 == true) {
//				// 선택되어 있음
//				select2.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
//				for (int i=1; i<9; i++) {
//					int price = Integer.parseInt(SKData.dataLabel[i][14].getText());
//					price = price + 2200;
//					SKData.dataLabel[i][14].setText(price + "");
//				}
//				SK_Page.isSel_Iptv_2 = false;
//			} else {
//				// 선택안되어 있음
//				select2.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
//				for (int i=1; i<9; i++) {
//					int price = Integer.parseInt(SKData.dataLabel[i][14].getText());
//					price = price - 2200;
//					SKData.dataLabel[i][14].setText(price + "");
//				}
//				SK_Page.isSel_Iptv_2 = true;
//			}
//		}
		
		// 수식 대입
		Controller.skData.calculData();
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
			SK_Page.isOpenIPTV = false;
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
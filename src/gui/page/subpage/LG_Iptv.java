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
public class LG_Iptv extends JFrame implements MouseMotionListener, MouseListener, KeyListener{
	private int tmpX, tmpY;
	private JLabel titleBar,
					iptvPanel,
					exitBtn;
	private JLabel select1, select2, select3; 
	
	public LG_Iptv() {
		// TODO Auto-generated constructor stub
		setUndecorated(true);
		setSize(711,263+20);
		setOpacity(0.98f);
		setLocation(
				(int) (ConstV.windowSizeX * 0.85 - 711 - 5),   	// 1088
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
		 * Ÿ��Ʋ ��
		 */
		titleBar = new JLabel(new ImageIcon(Controller.loadLGImage.getIptvTitleImg()));
		this.add(titleBar);
		titleBar.setBounds(
				0, 
				0,
				711, 
				20); 
		
		
		
		/*
		 * cardPanel
		 */
		iptvPanel = new JLabel(new ImageIcon(Controller.loadLGImage.getIptvPanelImg()));
		this.add(iptvPanel);
		iptvPanel.setBounds(
				0, 
				20,
				711, 
				263); 
		

		/*
		 * �����ư
		 */
		exitBtn = new JLabel(new ImageIcon(Controller.loadCommonImage.getCardExitImg()));
		titleBar.add(exitBtn);
		exitBtn.setBounds(
				691, 
				0,
				18, 
				18); 
		exitBtn.addMouseListener(this);
		
		/*
		 * ���ù�ư1
		 */
		if (LG_Page.isSel_Iptv_1)
			select1 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select1 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		iptvPanel.add(select1);
		select1.setBounds(660, 70, 31, 26); 
		select1.addMouseListener(this);
		
		
		/*
		 * ���ù�ư2
		 */
		if (LG_Page.isSel_Iptv_2)
			select2 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select2 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		iptvPanel.add(select2);
		select2.setBounds(660, 123, 31, 26); 
		select2.addMouseListener(this);
		
		
		
		/*
		 * ���ù�ư3
		 */
		if (LG_Page.isSel_Iptv_3)
			select3 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		else 
			select3 = new JLabel(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		
		iptvPanel.add(select3);
		select3.setBounds(660, 177, 31, 26); 
		select3.addMouseListener(this);
		
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
			LG_Page.isOpenIPTV = false;
			dispose();
		}
	}

	
	/*
	 *  �巹�׸� ���� ���콺 �̺�Ʈ�� (non-Javadoc)
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
			LG_Page.isOpenIPTV = false;
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
		 * ��ư ���� �̺�Ʈ �Դϴ�.
		 */
		// ���� ��ư 1
		else if (arg0.getSource() == select1) {
			if (LG_Page.isSel_Iptv_1 == true) {
				sel1_fromYes_toNo();
			} else {
				if (LG_Page.isSel_Iptv_2 == true) sel2_fromYes_toNo();
				if (LG_Page.isSel_Iptv_3 == true) sel3_fromYes_toNo();
				sel1_fromNo_toYes();
			}
		}
		
		// ���� ��ư 2
		else if (arg0.getSource() == select2) {
			if (LG_Page.isSel_Iptv_2 == true) {
				sel2_fromYes_toNo();
			} else {
				if (LG_Page.isSel_Iptv_1 == true) sel1_fromYes_toNo();
				if (LG_Page.isSel_Iptv_3 == true) sel3_fromYes_toNo();
				sel2_fromNo_toYes();
			}
		}
		
		
		// ���� ��ư 3
		else if (arg0.getSource() == select3) {
			if (LG_Page.isSel_Iptv_3 == true) {
				sel3_fromYes_toNo();
			} else {
				if (LG_Page.isSel_Iptv_1 == true) sel1_fromYes_toNo();
				if (LG_Page.isSel_Iptv_2 == true) sel2_fromYes_toNo();
				sel3_fromNo_toYes();
			}
		}
		
		// ���� ����
		Controller.lgData.calculData();
	}

	
	/*
	 * Click - 1
	 */
	private void sel1_fromNo_toYes() {
		select1.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<11; i++) {
			if (i==3 || (i>6 && i<11)) {
				int price = Integer.parseInt(LGData.dataLabel[i][14].getText());
				price = price - 8800;
				LGData.dataLabel[i][14].setText(price + "");
			}
		}
		LG_Page.isSel_Iptv_1 = true;
	}	
	private void sel1_fromYes_toNo() {
		select1.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<11; i++) {
			if (i==3 || (i>6 && i<11)) {
				int price = Integer.parseInt(LGData.dataLabel[i][14].getText());
				price = price + 8800;
				LGData.dataLabel[i][14].setText(price + "");
			}
		}
		LG_Page.isSel_Iptv_1 = false;
	}
	
	/*
	 * Click - 2
	 */
	private void sel2_fromNo_toYes() {
		select2.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<11; i++) {
			if (i==1 || i==2 || i==4 || i==5 || i==6) {
				int price = Integer.parseInt(LGData.dataLabel[i][14].getText());
				price = price - 5500;
				LGData.dataLabel[i][14].setText(price + "");
			}
		}
		LG_Page.isSel_Iptv_2 = true;
	}	
	private void sel2_fromYes_toNo() {
		select2.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<11; i++) {
			if (i==1 || i==2 || i==4 || i==5 || i==6) {
				int price = Integer.parseInt(LGData.dataLabel[i][14].getText());
				price = price + 5500;
				LGData.dataLabel[i][14].setText(price + "");
			}
		}
		LG_Page.isSel_Iptv_2 = false;
	}
	
	/*
	 * Click - 3
	 */
	private void sel3_fromNo_toYes() {
		select3.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectYesImg()));
		for (int i=1; i<11; i++) {
			int price = Integer.parseInt(LGData.dataLabel[i][15].getText());
			price = price - 2200;
			LGData.dataLabel[i][15].setText(price + "");
		}
		LG_Page.isSel_Iptv_3 = true;
	}	
	private void sel3_fromYes_toNo() {
		select3.setIcon(new ImageIcon(Controller.loadSelectImage.getSelectNoImg()));
		for (int i=1; i<11; i++) {
			int price = Integer.parseInt(LGData.dataLabel[i][15].getText());
			price = price + 2200;
			LGData.dataLabel[i][15].setText(price + "");
		}
		LG_Page.isSel_Iptv_3 = false;
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
			LG_Page.isOpenIPTV = false;
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
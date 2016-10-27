package gui;

import gui.constvalue.ConstV;
import gui.constvalue.MyFont;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import control.Controller;

public class MainFrame {
	private JFrame mainFrame;
	public static JLabel loadLabel;
	public static JProgressBar proBar;
	public MainFrame() {
		// TODO Auto-generated constructor stub
		mainFrame = new JFrame("한 눈에 보는 스마트폰 요금계산기");
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice gd = ge.getDefaultScreenDevice();
		mainFrame.setUndecorated(true);
		
		mainFrame.setLocation(0,0);
		mainFrame.setSize(ConstV.windowSizeX, ConstV.windowSizeY);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img = toolkit.getImage(".//image//clubt_icon.png");
		mainFrame.setIconImage(img);
		gd.getFullScreenWindow();
		mainFrame.setVisible(true);
		mainFrame.setLayout(null);
		mainFrame.setFocusable(true);
		mainFrame.setBackground(Color.white);
		mainFrame.addWindowListener(new EventHandler());
		mainFrame.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				mainFrame.setLocation(0, 0);
			}
		});
		setProgressbar();

		
	}
	
	private void setProgressbar() {
		// TODO Auto-generated method stub
		loadLabel = new JLabel("Now Loading...");
		Font godicFont_B_25 = new Font("맑은 고딕", Font.BOLD, 25);
		loadLabel.setFont(godicFont_B_25);
		loadLabel.setHorizontalAlignment(JLabel.CENTER);
		loadLabel.setVerticalAlignment(JLabel.CENTER);
		loadLabel.setBounds((ConstV.windowSizeX-300)/2, (ConstV.windowSizeY-30)/2-60, 300, 40);
		mainFrame.add(loadLabel);
		
		proBar = new JProgressBar();
		mainFrame.add(proBar);
		proBar.setBounds((ConstV.windowSizeX-800)/2, (ConstV.windowSizeY-30)/2, 800, 30);
		proBar.setMaximum(10);
	}
	
	public JFrame getFrame() {
		return mainFrame;
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
			System.exit(0);
		}
	}	
	
	
}

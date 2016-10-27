package gui;

import gui.constvalue.ConstV;
import gui.event.FrameBtnEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import control.Controller;

public class MainPanel {
	private JPanel panel;
	
	public static JLabel imgTopBtn_minimal
						, imgTopBtn_exit;

	public static JLabel img_Main_AvderArea1
						, img_Main_AvderArea2
						, img_Main_AvderArea3
						, img_Main_AvderArea4;
	public MainPanel() {
		// TODO Auto-generated constructor stub
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(ConstV.WHITE_COLOR);
		setTopBtn();
		setBottomAdver();
	}


	private void setBottomAdver() {
		// TODO Auto-generated method stub
		/*
		 * 메인 패널 광고영역 1
		 */
		img_Main_AvderArea1 = new JLabel(new ImageIcon(Controller.loadAdverImage.getMainAdverAreaImg1()));
		panel.add(img_Main_AvderArea1);
		img_Main_AvderArea1.setBounds(
					(int) (ConstV.windowSizeX * 0.01), 		// 12
					(int) (ConstV.windowSizeY * 0.91),		// 728
					(int) (ConstV.windowSizeX * 0.23), 	// 305
					(int) (ConstV.windowSizeY * 0.08));	// 65
		
		/*
		 * 메인 패널 광고영역 2
		 */
		img_Main_AvderArea2 = new JLabel(new ImageIcon(Controller.loadAdverImage.getMainAdverAreaImg2()));
		panel.add(img_Main_AvderArea2);
		img_Main_AvderArea2.setBounds(
					(int) (ConstV.windowSizeX * (0.01*2 + 0.2382)), // 12 + 2x
					(int) (ConstV.windowSizeY * 0.91),		// 728
					(int) (ConstV.windowSizeX * 0.23), 	// 305
					(int) (ConstV.windowSizeY * 0.08));	// 65
		
		/*
		 * 메인 패널 광고영역 3
		 */
		img_Main_AvderArea3 = new JLabel(new ImageIcon(Controller.loadAdverImage.getMainAdverAreaImg3()));
		panel.add(img_Main_AvderArea3);
		img_Main_AvderArea3.setBounds(
					(int) (ConstV.windowSizeX * (0.01*3 + 0.2382*2)), // 12 + 3x
					(int) (ConstV.windowSizeY * 0.91),		// 728
					(int) (ConstV.windowSizeX * 0.23), 	// 305
					(int) (ConstV.windowSizeY * 0.08));	// 65
		
		/*
		 * 메인 패널 광고영역 4
		 */
		img_Main_AvderArea4 = new JLabel(new ImageIcon(Controller.loadAdverImage.getMainAdverAreaImg4()));
		panel.add(img_Main_AvderArea4);
		img_Main_AvderArea4.setBounds(
					(int) (ConstV.windowSizeX * (0.01*4 + 0.2382*3)), // 12 + 3x
					(int) (ConstV.windowSizeY * 0.91),		// 728
					(int) (ConstV.windowSizeX * 0.23), 	// 305
					(int) (ConstV.windowSizeY * 0.08));	// 65
		
	}


	private void setTopBtn() {
	/*
	 * Top Btn - Minimal
	 */
		imgTopBtn_minimal = new JLabel(new ImageIcon(Controller.loadImage.getMinimalImg()));
		panel.add(imgTopBtn_minimal);
		imgTopBtn_minimal.setBounds(
				ConstV.windowSizeX - ConstV.frameTopBtnSizeX*2-20, 
				5, 
				ConstV.frameTopBtnSizeX, 
				ConstV.frameTopBtnSizeY);
		imgTopBtn_minimal.addMouseListener(new FrameBtnEvent());
		
		

		/*
		 * Top Btn - Exit
		 */
		imgTopBtn_exit = new JLabel(new ImageIcon(Controller.loadImage.getExitImg()));
		panel.add(imgTopBtn_exit);
		imgTopBtn_exit.setBounds(
				ConstV.windowSizeX - ConstV.frameTopBtnSizeX*1-10, 
				5, 
				ConstV.frameTopBtnSizeX, 
				ConstV.frameTopBtnSizeY);
		imgTopBtn_exit.addMouseListener(new FrameBtnEvent());
	}
	

	
	public JPanel getMainPanel() {
		return panel;
	}
}

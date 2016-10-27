package gui.page;

import gui.constvalue.ConstV;
import gui.event.StartPageEvent;

import java.awt.Button;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import control.Controller;

public class StartPage {
	public static JPanel startPage;
	public static Button btn1, btn2, btn3;
	public static JLabel img_MainPanelTitle
						, img_MainBtn_SK
						, img_MainBtn_KT
						, img_MainBtn_LG
						, img_MainBtn_skTelink
						, img_MainBtn_ktMmobile
						, img_MainBtn_lgUmobi;
	
	public static ImageIcon  img_SK
						, img_KT
						, img_LG
						, img_skTelink
						, img_ktMmobile
						, img_lgUmobi
						, on_img_SK
						, on_img_KT
						, on_img_LG
						, on_img_skTelink
						, on_img_ktMmobile
						, on_img_lgUmobi;
						
	public StartPage() {
		// TODO Auto-generated constructor stub
		startPage = new JPanel();
		startPage.setLayout(null);
		startPage.setBackground(ConstV.WHITE_COLOR);
		Controller.mainPanel.add(startPage);
		startPage.setBounds(ConstV.pageStartX
				, ConstV.pageStartY
				, ConstV.windowSizeX - ConstV.pageStartX
				, ConstV.windowSizeY - ConstV.pageStartY);
		startPage.setVisible(false);

		img_SK = new ImageIcon(Controller.loadImage.getMainBtnSKImg());
		img_KT = new ImageIcon(Controller.loadImage.getMainBtnKTImg());
		img_LG = new ImageIcon(Controller.loadImage.getMainBtnLGImg());
		img_skTelink = new ImageIcon(Controller.loadImage.getMainBtn_telink_Img());
		img_ktMmobile = new ImageIcon(Controller.loadImage.getMainBtn_Mmobile_Img());
		img_lgUmobi = new ImageIcon(Controller.loadImage.getMainBtn_Umobi_Img());
		
		on_img_SK = new ImageIcon(Controller.loadImage.getMainBtnSK_ClickImg());
		on_img_KT = new ImageIcon(Controller.loadImage.getMainBtnKT_ClickImg());
		on_img_LG = new ImageIcon(Controller.loadImage.getMainBtnLG_ClickImg());
		on_img_skTelink = new ImageIcon(Controller.loadImage.getMainBtn_telink_Click_Img());
		on_img_ktMmobile = new ImageIcon(Controller.loadImage.getMainBtn_Mmobile_Click_Img());
		on_img_lgUmobi = new ImageIcon(Controller.loadImage.getMainBtn_Umobi_Click_Img());
		
		component();
	}
	
	private void component() {
		// TODO Auto-generated constructor stub

		/*
		 * 메인 패널에 타이틀 이미지
		 */
		img_MainPanelTitle = new JLabel(new ImageIcon(Controller.loadImage.getMainTitleImg()));
		startPage.add(img_MainPanelTitle);
		img_MainPanelTitle.setBounds(
					(int) (ConstV.windowSizeX * 0.26), 	// 240
					0,										// 0
					(int) (ConstV.windowSizeX * 0.5), 	// 800
					(int) (ConstV.windowSizeY * 0.07)); 	// 70
		

		/*
		 * 메인 패널 SK 버튼
		 */
		img_MainBtn_SK = new JLabel(img_SK);
		startPage.add(img_MainBtn_SK);
		img_MainBtn_SK.setBounds(
					(int) (ConstV.windowSizeX * 0.1), 		// 128
					(int) (ConstV.windowSizeY * 0.1625),	// 130
					(int) (ConstV.windowSizeX * 0.2111), 	// 270
					(int) (ConstV.windowSizeY * 0.3375));	// 270
		img_MainBtn_SK.addMouseListener(new StartPageEvent());
		
		/*
		 * 메인 패널 KT 버튼
		 */
		img_MainBtn_KT = new JLabel(img_KT);
		startPage.add(img_MainBtn_KT);
		img_MainBtn_KT.setBounds(
					(int) (ConstV.windowSizeX * 0.4), 		// 512
					(int) (ConstV.windowSizeY * 0.1625),	// 130
					(int) (ConstV.windowSizeX * 0.2111), 	// 270
					(int) (ConstV.windowSizeY * 0.3375));	// 270
		img_MainBtn_KT.addMouseListener(new StartPageEvent());
		

		/*
		 * 메인 패널 LG 버튼
		 */
		img_MainBtn_LG = new JLabel(img_LG);
		startPage.add(img_MainBtn_LG);
		img_MainBtn_LG.setBounds(
					(int) (ConstV.windowSizeX * 0.7), 		// 896
					(int) (ConstV.windowSizeY * 0.1625),	// 130
					(int) (ConstV.windowSizeX * 0.2111), 	// 270
					(int) (ConstV.windowSizeY * 0.3375));	// 270
		img_MainBtn_LG.addMouseListener(new StartPageEvent());
		
		
		
		/*
		 * 메인 패널 SK telink 버튼
		 */
		img_MainBtn_skTelink = new JLabel(img_skTelink);
		startPage.add(img_MainBtn_skTelink);
		img_MainBtn_skTelink.setBounds(
					(int) (ConstV.windowSizeX * 0.125), 	// 160
					(int) (ConstV.windowSizeY * 0.575),		// 460
					(int) (ConstV.windowSizeX * 0.1562), 	// 200
					(int) (ConstV.windowSizeY * 0.2375));	// 190
		img_MainBtn_skTelink.addMouseListener(new StartPageEvent());
		
		
		/*
		 * 메인 패널 KT M mobile 버튼
		 */
		img_MainBtn_ktMmobile = new JLabel(img_ktMmobile);
		startPage.add(img_MainBtn_ktMmobile);
		img_MainBtn_ktMmobile.setBounds(
				(int) (ConstV.windowSizeX * 0.428), 	// 540
				(int) (ConstV.windowSizeY * 0.575),		// 460
				(int) (ConstV.windowSizeX * 0.1562), 	// 200
				(int) (ConstV.windowSizeY * 0.2375));	// 190
		img_MainBtn_ktMmobile.addMouseListener(new StartPageEvent());
		
		
		/*
		 * 메인 패널 SK telink 버튼
		 */
		img_MainBtn_lgUmobi = new JLabel(img_lgUmobi);
		startPage.add(img_MainBtn_lgUmobi);
		img_MainBtn_lgUmobi.setBounds(
					(int) (ConstV.windowSizeX * 0.7265), 	// 930
					(int) (ConstV.windowSizeY * 0.575),		// 460
					(int) (ConstV.windowSizeX * 0.1562), 	// 200
					(int) (ConstV.windowSizeY * 0.2375));	// 190
		img_MainBtn_lgUmobi.addMouseListener(new StartPageEvent());
		


		
	}
	
	public JPanel getStartPanel() {
		// TODO Auto-generated method stub
		return startPage;
	}

}

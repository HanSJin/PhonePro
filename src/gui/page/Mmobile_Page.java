package gui.page;

import gui.component.TLabel;
import gui.constvalue.ConstV;
import gui.event.Mmobile_PageEvent;
import gui.event.Mmobile_PageFocusEvent;
import gui.event.Mmobile_PageKeyEvent;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Main;
import control.Controller;

public class Mmobile_Page {
	private JPanel mmobilePage, borderPrice, borderPrice2;;;
	public static JLabel table
				, mmobileTitle
				, priceImg
				, priceText
				
				, goMain
				// 요금 테이블
				, mmobile_table;
	public static TLabel check;
	public static JLabel last_Prices;
	public static JTextField tf_Price1, tf_Price2, tf_Price3;
	public static JFrame mmobile_card, mmobile_iptv;
	public static JComboBox combo;
	private DefaultComboBoxModel comboModel;
	
	
	public Mmobile_Page() {
		// TODO Auto-generated constructor stub
		mmobilePage = new JPanel();
		mmobilePage.setLayout(null);
		mmobilePage.setBackground(ConstV.WHITE_COLOR);
		Controller.mainPanel.add(mmobilePage);
		mmobilePage.setBounds(ConstV.pageStartX, ConstV.pageStartY
				, ConstV.windowSizeX - ConstV.pageStartX
				, ConstV.windowSizeY - ConstV.pageStartY);
		mmobilePage.setVisible(false);
		component();		
		
		// 표 채우기
		if (Main.isDebug_Mmobile) {
			Controller.mmobileData.setData(mmobile_table);
			Controller.mmobileData.calculData();
		}
		
	}

	private void component() {
		// TODO Auto-generated method stub
		// 페이지 로고
		mmobileTitle = new JLabel(new ImageIcon(Controller.loadMmobileImage.getMmobileLogoImg()));
		mmobilePage.add(mmobileTitle);
		mmobileTitle.setBounds(
				(int) (ConstV.windowSizeX * 0.01), 	// 12
				10,		// 0
				143,  	// 143
				58); 	// 55
		
		/*
		 * 할부 원금
		 */
		priceImg = new JLabel(new ImageIcon(Controller.loadCommonImage.getPriceImg()));
		mmobilePage.add(priceImg);
		priceImg.setBounds(
				(int) (ConstV.windowSizeX * 0.82), 	// 1088
				(int) (ConstV.windowSizeY * 0.1),		// 130
				(int) (ConstV.windowSizeX * 0.0818), 	// 156
				(int) (ConstV.windowSizeY * 0.1225)); 	// 35
		
		/*
		 * 1- 출고가
		 */
		tf_Price1 = new JTextField();
		mmobilePage.add(tf_Price1);
		tf_Price1.setBounds(
				(int) (ConstV.windowSizeX * 0.905), 		// 1088
				(int) (ConstV.windowSizeY * 0.102),		// 130
				(int) (ConstV.windowSizeX * 0.07), 	// 156
				(int) (ConstV.windowSizeY * 0.025)); 	// 35
		tf_Price1.setHorizontalAlignment(JTextField.CENTER);
		tf_Price1.setFont(Controller.myFont.godicFont_22);
		tf_Price1.addKeyListener(new Mmobile_PageKeyEvent());
		tf_Price1.addFocusListener(new Mmobile_PageFocusEvent());
		

		/*
		 * 2- 공시지원금
		 */
		tf_Price2 = new JTextField();
		mmobilePage.add(tf_Price2);
		tf_Price2.setBounds(
				(int) (ConstV.windowSizeX * 0.905), 		// 1088
				(int) (ConstV.windowSizeY * 0.132),		// 130
				(int) (ConstV.windowSizeX * 0.07), 	// 156
				(int) (ConstV.windowSizeY * 0.025)); 	// 35
		tf_Price2.setHorizontalAlignment(JTextField.CENTER);
		tf_Price2.setFont(Controller.myFont.godicFont_22);
		tf_Price2.addKeyListener(new Mmobile_PageKeyEvent());
		tf_Price2.addFocusListener(new Mmobile_PageFocusEvent());
		

		/*
		 * 3- 제휴할인
		 */
		tf_Price3 = new JTextField();
		mmobilePage.add(tf_Price3);
		tf_Price3.setBounds(
				(int) (ConstV.windowSizeX * 0.905), 		// 1088
				(int) (ConstV.windowSizeY * 0.162+1),		// 130
				(int) (ConstV.windowSizeX * 0.07), 	// 156
				(int) (ConstV.windowSizeY * 0.025)); 	// 35
		tf_Price3.setHorizontalAlignment(JTextField.CENTER);
		tf_Price3.setFont(Controller.myFont.godicFont_22);
		tf_Price3.addKeyListener(new Mmobile_PageKeyEvent());
		tf_Price3.addFocusListener(new Mmobile_PageFocusEvent());
		
		// 할부 원금
		borderPrice = new JPanel();
		borderPrice.setLayout(null);
		borderPrice.setBackground(Color.BLACK);
		mmobilePage.add(borderPrice);
		borderPrice.setBounds(
				(int) (ConstV.windowSizeX * 0.905) -1, 		// 1088
				(int) (ConstV.windowSizeY * 0.192) -1+3,		// 130
				(int) (ConstV.windowSizeX * 0.07) +2, 	// 156
				(int) (ConstV.windowSizeY * 0.025) +2); 	// 35

		borderPrice2 = new JPanel();
		borderPrice2.setLayout(null);
		borderPrice2.setBackground(Color.white);
		borderPrice.add(borderPrice2);
		borderPrice2.setBounds(
				1 , 		// 1088
				1 ,		// 130
				(int) (ConstV.windowSizeX * 0.07), 	// 156
				(int) (ConstV.windowSizeY * 0.025)); 	// 35
		
		last_Prices = new JLabel("0");
		last_Prices.setOpaque(true);
		borderPrice2.add(last_Prices);
		last_Prices.setHorizontalAlignment(JLabel.CENTER);
		last_Prices.setVerticalAlignment(JLabel.CENTER);
		last_Prices.setFont(Controller.myFont.godicFont_B_25);
		last_Prices.setBackground(Color.white);
		last_Prices.setForeground(Color.black);
		last_Prices.setBounds(
				0, 		// 1088
				0,		// 130
				(int) (ConstV.windowSizeX * 0.07), 	// 156
				(int) (ConstV.windowSizeY * 0.025)); 	// 35
		

		/*
		 * 우측 버튼 3
		 */
		goMain = new JLabel(new ImageIcon(Controller.loadCommonImage.getRightBtn_3_Img()));
		mmobilePage.add(goMain);
		goMain.setBounds(
				(int) (ConstV.windowSizeX * 0.82),   	// 1088
				(int) (ConstV.windowSizeY * 0.30), 	// 530
				(int) (ConstV.windowSizeX * 0.15), 	// 150
				(int) (ConstV.windowSizeY * 0.14)); 	// 150
		goMain.addMouseListener(new Mmobile_PageEvent());
		
		
		/*
		 * 요금 테이블
		 */
		mmobile_table = new JLabel(new ImageIcon(Controller.loadMmobileImage.getPriceTableImg()));
		mmobilePage.add(mmobile_table);
		mmobile_table.setBounds(
				(int) (ConstV.windowSizeX * 0.01),   	// 1088
				(int) (ConstV.windowSizeY * 0.1),	// 130
				(int) (ConstV.windowSizeX * 0.7898), 	// 1020
				(int) (ConstV.windowSizeY * 0.5842)); 	// 580
		
		
		// 할부개월 체크박스
		String[] month = new String[]{"36", "30", "24"}; 
		comboModel = new DefaultComboBoxModel(month);
		combo = new JComboBox(comboModel); 
		combo.setBackground(Color.white);
		mmobile_table.add(combo);
		combo.setBounds(
				(int) (mmobile_table.getWidth() * 0.1649)-20, 		// 
				(int) (mmobile_table.getHeight() * 6/14),		// 
				(int) (20), 									// 156
				(int) (mmobile_table.getHeight() * 1/14)); 			// 
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String select = (String) comboModel.getSelectedItem();
				if (select.equals("36")) {
					Controller.mmobileData.dataLabel[0][6].setText("할부개월36");
				} else if (select.equals("30")) {
					Controller.mmobileData.dataLabel[0][6].setText("할부개월30");					
				} else {
					Controller.mmobileData.dataLabel[0][6].setText("할부개월24");					
				}
				Controller.mmobileData.calculData();
			}
		});
	}
	
	public JPanel getMmobilePage() {
		return mmobilePage;
	}
	
}

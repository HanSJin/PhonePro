package gui.page;

import gui.component.TLabel;
import gui.constvalue.ConstV;
import gui.event.SK_PageEvent;
import gui.event.SK_PageFocusEvent;
import gui.event.SK_PageIndexPageEvent;
import gui.event.SK_PageKeyEvent;
import gui.event.SK_PageEvent;
import gui.event.SK_PageKeyEvent;

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

public class SK_Page {
	private JPanel skPage, borderPrice, borderPrice2;
	public static JLabel skTitle
				, priceImg
				, priceText
				// ���� ��ư 3��
				, iptvDisct
				, cardDisct
				, goMain
				// ��� ���̺�
				, sk_table , sk_table_2, sk_table_3;
	public static TLabel check;
	public static JLabel last_Prices;
	public static JTextField tf_Price1, tf_Price2, tf_Price3;
	public static boolean isOpenCard, isOpenIPTV;
	public static JFrame sk_card, sk_iptv;
	public static JComboBox combo;
	private DefaultComboBoxModel comboModel;
	public static int clickedIndex;
	
	
	// SK ������ 1, 2, 3
	public static JLabel pNum1, pNum2, pNum3;
	
	// ���� ������(IPTV) ���ù�ư 1,2
	public static boolean isSel_Iptv_1, isSel_Iptv_2,
			isSel_Card_1, isSel_Card_2, isSel_Card_3, isSel_Card_4,
			isSel_Card_pre_1, isSel_Card_pre_2, isSel_Card_pre_3, isSel_Card_pre_4, isSel_Card_pre_5;
	
	public SK_Page() {
		// TODO Auto-generated constructor stub
		skPage = new JPanel();
		skPage.setLayout(null);
		skPage.setBackground(ConstV.WHITE_COLOR);
		Controller.mainPanel.add(skPage);
		skPage.setBounds(ConstV.pageStartX, ConstV.pageStartY
				, ConstV.windowSizeX - ConstV.pageStartX
				, ConstV.windowSizeY - ConstV.pageStartY);
		skPage.setVisible(false);
		isOpenCard = false;
		isOpenIPTV = false;
		component();		
		
		if (Main.isDebug_SK) {
			// ǥ ä���
			Controller.skData.setData(sk_table);
			Controller.skData.calculData();
			Controller.skData2.setData(sk_table_2);
			Controller.skData2.calculData();
			Controller.skData3.setData(sk_table_3);
			Controller.skData3.calculData();
		}
		
		// ���� ������ 
		isSel_Iptv_1 = false;
		isSel_Iptv_2 = false;
		isSel_Card_1 = false;
		isSel_Card_2 = false;
		isSel_Card_3 = false;
		isSel_Card_4 = false;
		isSel_Card_pre_1 = false;
		isSel_Card_pre_2 = false;
		isSel_Card_pre_3 = false;
		isSel_Card_pre_4 = false;
		isSel_Card_pre_5 = false;
		
		clickedIndex = 1;
	}

	private void component() {
		// TODO Auto-generated method stub
		// ������ �ΰ�
		skTitle = new JLabel(new ImageIcon(Controller.loadSKImage.getSKLogoImg()));
		skPage.add(skTitle);
		skTitle.setBounds(
				(int) (ConstV.windowSizeX * 0.01), 	// 12
				10,		// 0
				143, 	// 143
				55); 	// 55


		/*
		 * �Һ� ����
		 */
		priceImg = new JLabel(new ImageIcon(Controller.loadCommonImage.getPriceImg()));
		skPage.add(priceImg);
		priceImg.setBounds(
				(int) (ConstV.windowSizeX * 0.82), 	// 1088
				(int) (ConstV.windowSizeY * 0.1),		// 130
				(int) (ConstV.windowSizeX * 0.0818), 	// 156
				(int) (ConstV.windowSizeY * 0.1225)); 	// 35
		
		
		/*
		 * 1- ���
		 */
		tf_Price1 = new JTextField();
		skPage.add(tf_Price1);
		tf_Price1.setBounds(
				(int) (ConstV.windowSizeX * 0.905), 		// 1088
				(int) (ConstV.windowSizeY * 0.102),		// 130
				(int) (ConstV.windowSizeX * 0.07), 	// 156
				(int) (ConstV.windowSizeY * 0.025)); 	// 35
		tf_Price1.setHorizontalAlignment(JTextField.CENTER);
		tf_Price1.setFont(Controller.myFont.godicFont_22);
		tf_Price1.addKeyListener(new SK_PageKeyEvent());
		tf_Price1.addFocusListener(new SK_PageFocusEvent());
		

		/*
		 * 2- ����������
		 */
		tf_Price2 = new JTextField();
		skPage.add(tf_Price2);
		tf_Price2.setBounds(
				(int) (ConstV.windowSizeX * 0.905), 		// 1088
				(int) (ConstV.windowSizeY * 0.132),		// 130
				(int) (ConstV.windowSizeX * 0.07), 	// 156
				(int) (ConstV.windowSizeY * 0.025)); 	// 35
		tf_Price2.setHorizontalAlignment(JTextField.CENTER);
		tf_Price2.setFont(Controller.myFont.godicFont_22);
		tf_Price2.addKeyListener(new SK_PageKeyEvent());
		tf_Price2.addFocusListener(new SK_PageFocusEvent());
		

		/*
		 * 3- ��������
		 */
		tf_Price3 = new JTextField();
		skPage.add(tf_Price3);
		tf_Price3.setBounds(
				(int) (ConstV.windowSizeX * 0.905), 		// 1088
				(int) (ConstV.windowSizeY * 0.162+1),		// 130
				(int) (ConstV.windowSizeX * 0.07), 	// 156
				(int) (ConstV.windowSizeY * 0.025)); 	// 35
		tf_Price3.setHorizontalAlignment(JTextField.CENTER);
		tf_Price3.setFont(Controller.myFont.godicFont_22);
		tf_Price3.addKeyListener(new SK_PageKeyEvent());
		tf_Price3.addFocusListener(new SK_PageFocusEvent());
		
		// �Һ� ����
		borderPrice = new JPanel();
		borderPrice.setLayout(null);
		borderPrice.setBackground(Color.BLACK);
		skPage.add(borderPrice);
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
		 * ���� ��ư 1
		 */
		iptvDisct = new JLabel(new ImageIcon(Controller.loadCommonImage.getRightBtn_1_Img()));
		skPage.add(iptvDisct);
		iptvDisct.setBounds(
				(int) (ConstV.windowSizeX * 0.82),   	// 1088
				(int) (ConstV.windowSizeY * 0.45), 	// 210
				(int) (ConstV.windowSizeX * 0.15), 	// 150
				(int) (ConstV.windowSizeY * 0.14)); 	// 150
		iptvDisct.addMouseListener(new SK_PageEvent());
		
		

		/*
		 * ���� ��ư 2
		 */
		cardDisct = new JLabel(new ImageIcon(Controller.loadCommonImage.getRightBtn_2_Img()));
		skPage.add(cardDisct);
		cardDisct.setBounds(
				(int) (ConstV.windowSizeX * 0.82),   	// 1088
				(int) (ConstV.windowSizeY * 0.27), 	// 370
				(int) (ConstV.windowSizeX * 0.15), 	// 150
				(int) (ConstV.windowSizeY * 0.14)); 	// 150
		cardDisct.addMouseListener(new SK_PageEvent());
		

		/*
		 * ���� ��ư 3
		 */
		goMain = new JLabel(new ImageIcon(Controller.loadCommonImage.getRightBtn_3_Img()));
		skPage.add(goMain);
		goMain.setBounds(
				(int) (ConstV.windowSizeX * 0.82),   	// 1088
				(int) (ConstV.windowSizeY * 0.63), 	// 530
				(int) (ConstV.windowSizeX * 0.15), 	// 150
				(int) (ConstV.windowSizeY * 0.14)); 	// 150
		goMain.addMouseListener(new SK_PageEvent());
		
		
		/*
		 * ��� ���̺�
		 */
		sk_table = new JLabel(new ImageIcon(Controller.loadSKImage.getPriceTableImg()));
		skPage.add(sk_table);
		sk_table.setBounds(
				(int) (ConstV.windowSizeX * 0.01),   	// 1088
				(int) (ConstV.windowSizeY * 0.1),	// 130
				(int) (ConstV.windowSizeX * 0.7692), 	// 1020
				(int) (ConstV.windowSizeY * 0.7092)); 	// 580
		
		
		sk_table_2 = new JLabel(new ImageIcon(Controller.loadSKImage.getPriceTable2Img()));
		skPage.add(sk_table_2);
		sk_table_2.setBounds(
				(int) (ConstV.windowSizeX * 0.01),   	// 1088
				(int) (ConstV.windowSizeY * 0.1),	// 130
				(int) (ConstV.windowSizeX * 0.7692), 	// 1020
				(int) (ConstV.windowSizeY * 0.6259)); 	// 580
		sk_table_2.setVisible(false);
		
		sk_table_3 = new JLabel(new ImageIcon(Controller.loadSKImage.getPriceTable3Img()));
		skPage.add(sk_table_3);
		sk_table_3.setBounds(
				(int) (ConstV.windowSizeX * 0.01),   	// 1088
				(int) (ConstV.windowSizeY * 0.1),	// 130
				(int) (ConstV.windowSizeX * 0.7692), 	// 1020
				(int) (ConstV.windowSizeY * 0.75)); 	// 580
		sk_table_3.setVisible(false);
		
		
		// �Һΰ��� üũ�ڽ�
		String[] month = new String[]{"36", "30", "24"}; 
		comboModel = new DefaultComboBoxModel(month);
		combo = new JComboBox(comboModel); 
		combo.setBackground(Color.white);
		sk_table.add(combo);
		combo.setBounds(
				(int) (sk_table.getWidth() * 0.1285)-20-1, 		// 
				(int) (sk_table.getHeight() * 6/17 + 1),		// 
				(int) (20), 									// 156
				(int) (sk_table.getHeight() * 1/17-1)); 			// 
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String select = (String) comboModel.getSelectedItem();
				if (select.equals("36")) {
					Controller.skData.dataLabel[0][6].setText("�Һΰ���36");
				} else if (select.equals("30")) {
					Controller.skData.dataLabel[0][6].setText("�Һΰ���30");					
				} else {
					Controller.skData.dataLabel[0][6].setText("�Һΰ���24");					
				}
				Controller.skData.calculData();
			}
		});

		/* 
		 * sk ������
		 */
		pNum1 = new JLabel(new ImageIcon(Controller.loadSKImage.getPricePageNumOn_1_Img()));
		pNum2 = new JLabel(new ImageIcon(Controller.loadSKImage.getPricePageNum_2_Img()));
		pNum3 = new JLabel(new ImageIcon(Controller.loadSKImage.getPricePageNum_3_Img()));
		skPage.add(pNum1);
		skPage.add(pNum2);
		skPage.add(pNum3);
		pNum1.setBounds(
				sk_table.getX() + sk_table.getWidth() - 145, 		// 1088
				sk_table.getY() - 50,
				50, 	// 156
				45); 	// 35
		pNum2.setBounds(
				sk_table.getX() + sk_table.getWidth() - 95, 		// 1088
				sk_table.getY() - 50,
				50, 	// 156
				45); 	// 35
		pNum3.setBounds(
				sk_table.getX() + sk_table.getWidth() - 45, 		// 1088
				sk_table.getY() - 50,
				50, 	// 156
				45); 	// 35
		pNum1.addMouseListener(new SK_PageIndexPageEvent());
		pNum2.addMouseListener(new SK_PageIndexPageEvent());
		pNum3.addMouseListener(new SK_PageIndexPageEvent());
	}

	public JPanel getSkPage() {
		return skPage;
	}
	
}

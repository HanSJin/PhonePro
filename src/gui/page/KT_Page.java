package gui.page;

import gui.component.TLabel;
import gui.constvalue.ConstV;
import gui.event.KT_PageEvent;
import gui.event.KT_PageFocusEvent;
import gui.event.KT_PageKeyEvent;

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

public class KT_Page {
	private JPanel ktPage, borderPrice, borderPrice2;;
	public static JLabel table
				, ktTitle
				, priceImg
				, priceText
				// ���� ��ư 3��
				, iptvDisct
				, cardDisct
				, goMain
				// ��� ���̺�
				, kt_table;
	public static TLabel check;
	public static JLabel last_Prices;
	public static JTextField tf_Price1, tf_Price2, tf_Price3;
	public static boolean isOpenCard, isOpenIPTV;
	public static JFrame kt_card, kt_iptv;
	public static JComboBox combo;
	private DefaultComboBoxModel comboModel;
	
	// ���� ������(IPTV) ���ù�ư 1,2
	public static boolean isSel_Iptv_1, isSel_Iptv_2, isSel_Iptv_3,
			isSel_Iptv_4, isSel_Iptv_5, isSel_Iptv_6,
			isSel_Iptv_7, isSel_Iptv_8, isSel_Iptv_9,
			
			isSel_Card_1, isSel_Card_2, isSel_Card_3, isSel_Card_4, isSel_Card_5,
			isSel_Card_6, isSel_Card_7, isSel_Card_8;
	
	public KT_Page() {
		// TODO Auto-generated constructor stub
		ktPage = new JPanel();
		ktPage.setLayout(null);
		ktPage.setBackground(ConstV.WHITE_COLOR);
		Controller.mainPanel.add(ktPage);
		ktPage.setBounds(ConstV.pageStartX, ConstV.pageStartY
				, ConstV.windowSizeX - ConstV.pageStartX
				, ConstV.windowSizeY - ConstV.pageStartY);
		ktPage.setVisible(false);
		isOpenCard = false;
		isOpenIPTV = false;
		component();		
		
		// ǥ ä���
		if (Main.isDebug_KT) {
			Controller.ktData.setData(kt_table);
			Controller.ktData.calculData();
		}
		
		// ���� ������ 
		isSel_Iptv_1 = false;
		isSel_Iptv_2 = false;
		isSel_Iptv_3 = false;
		isSel_Iptv_4 = false;
		isSel_Iptv_5 = false;
		isSel_Iptv_6 = false;
		isSel_Iptv_7 = false;
		isSel_Iptv_8 = false;
		isSel_Iptv_9 = false;
		
		isSel_Card_1 = false;
		isSel_Card_2 = false;
		isSel_Card_3 = false;
		isSel_Card_4 = false;
		isSel_Card_5 = false;
		isSel_Card_6 = false;
		isSel_Card_7 = false;
		isSel_Card_8 = false;
	}

	private void component() {
		// TODO Auto-generated method stub
		// ������ �ΰ�
		ktTitle = new JLabel(new ImageIcon(Controller.loadKTImage.getKTLogoImg()));
		ktPage.add(ktTitle);
		ktTitle.setBounds(
				(int) (ConstV.windowSizeX * 0.01), 	// 12
				10,		// 0
				159, 	// 143
				61); 	// 55

		/*
		 * �Һ� ����
		 */
		priceImg = new JLabel(new ImageIcon(Controller.loadCommonImage.getPriceImg()));
		ktPage.add(priceImg);
		priceImg.setBounds(
				(int) (ConstV.windowSizeX * 0.82), 	// 1088
				(int) (ConstV.windowSizeY * 0.1),		// 130
				(int) (ConstV.windowSizeX * 0.0818), 	// 156
				(int) (ConstV.windowSizeY * 0.1225)); 	// 35
		
		
		/*
		 * 1- ���
		 */
		tf_Price1 = new JTextField();
		ktPage.add(tf_Price1);
		tf_Price1.setBounds(
				(int) (ConstV.windowSizeX * 0.905), 		// 1088
				(int) (ConstV.windowSizeY * 0.102),		// 130
				(int) (ConstV.windowSizeX * 0.07), 	// 156
				(int) (ConstV.windowSizeY * 0.025)); 	// 35
		tf_Price1.setHorizontalAlignment(JTextField.CENTER);
		tf_Price1.setFont(Controller.myFont.godicFont_22);
		tf_Price1.addKeyListener(new KT_PageKeyEvent());
		tf_Price1.addFocusListener(new KT_PageFocusEvent());
		

		/*
		 * 2- ����������
		 */
		tf_Price2 = new JTextField();
		ktPage.add(tf_Price2);
		tf_Price2.setBounds(
				(int) (ConstV.windowSizeX * 0.905), 		// 1088
				(int) (ConstV.windowSizeY * 0.132),		// 130
				(int) (ConstV.windowSizeX * 0.07), 	// 156
				(int) (ConstV.windowSizeY * 0.025)); 	// 35
		tf_Price2.setHorizontalAlignment(JTextField.CENTER);
		tf_Price2.setFont(Controller.myFont.godicFont_22);
		tf_Price2.addKeyListener(new KT_PageKeyEvent());
		tf_Price2.addFocusListener(new KT_PageFocusEvent());
		

		/*
		 * 3- ��������
		 */
		tf_Price3 = new JTextField();
		ktPage.add(tf_Price3);
		tf_Price3.setBounds(
				(int) (ConstV.windowSizeX * 0.905), 		// 1088
				(int) (ConstV.windowSizeY * 0.162+1),		// 130
				(int) (ConstV.windowSizeX * 0.07), 	// 156
				(int) (ConstV.windowSizeY * 0.025)); 	// 35
		tf_Price3.setHorizontalAlignment(JTextField.CENTER);
		tf_Price3.setFont(Controller.myFont.godicFont_22);
		tf_Price3.addKeyListener(new KT_PageKeyEvent());
		tf_Price3.addFocusListener(new KT_PageFocusEvent());
		
		// �Һ� ����
		borderPrice = new JPanel();
		borderPrice.setLayout(null);
		borderPrice.setBackground(Color.BLACK);
		ktPage.add(borderPrice);
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
		ktPage.add(iptvDisct);
		iptvDisct.setBounds(
				(int) (ConstV.windowSizeX * 0.82),   	// 1088
				(int) (ConstV.windowSizeY * 0.46), 	// 210
				(int) (ConstV.windowSizeX * 0.15), 	// 150
				(int) (ConstV.windowSizeY * 0.14)); 	// 150
		iptvDisct.addMouseListener(new KT_PageEvent());
		
		

		/*
		 * ���� ��ư 2
		 */
		cardDisct = new JLabel(new ImageIcon(Controller.loadCommonImage.getRightBtn_2_Img()));
		ktPage.add(cardDisct);
		cardDisct.setBounds(
				(int) (ConstV.windowSizeX * 0.82),   	// 1088
				(int) (ConstV.windowSizeY * 0.27), 	// 370
				(int) (ConstV.windowSizeX * 0.15), 	// 150
				(int) (ConstV.windowSizeY * 0.14)); 	// 150
		cardDisct.addMouseListener(new KT_PageEvent());
		

		/*
		 * ���� ��ư 3
		 */
		goMain = new JLabel(new ImageIcon(Controller.loadCommonImage.getRightBtn_3_Img()));
		ktPage.add(goMain);
		goMain.setBounds(
				(int) (ConstV.windowSizeX * 0.82),   	// 1088
				(int) (ConstV.windowSizeY * 0.63), 	// 530
				(int) (ConstV.windowSizeX * 0.15), 	// 150
				(int) (ConstV.windowSizeY * 0.14)); 	// 150
		goMain.addMouseListener(new KT_PageEvent());
		
		
		/*
		 * ��� ���̺�
		 */
		kt_table = new JLabel(new ImageIcon(Controller.loadKTImage.getPriceTableImg()));
		ktPage.add(kt_table);
		kt_table.setBounds(
				(int) (ConstV.windowSizeX * 0.01),   	// 1088
				(int) (ConstV.windowSizeY * 0.1),	// 130
				(int) (ConstV.windowSizeX * 0.7898), 	// 1020
				(int) (ConstV.windowSizeY * 0.7509)); 	// 580
		
		
		// �Һΰ��� üũ�ڽ�
		String[] month = new String[]{"36", "30", "24"}; 
		comboModel = new DefaultComboBoxModel(month);
		combo = new JComboBox(comboModel); 
		combo.setBackground(Color.white);
		kt_table.add(combo);
		combo.setBounds(
				(int) (kt_table.getWidth() * 0.1285)-20-1, 		// 
				(int) (kt_table.getHeight() * 6/18),			// 
				(int) (20), 									// 156
				(int) (kt_table.getHeight() * 1/18)); 			// 
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String select = (String) comboModel.getSelectedItem();
				if (select.equals("36")) {
					Controller.ktData.dataLabel[0][6].setText("�Һΰ���36");
				} else if (select.equals("30")) {
					Controller.ktData.dataLabel[0][6].setText("�Һΰ���30");					
				} else {
					Controller.ktData.dataLabel[0][6].setText("�Һΰ���24");					
				}
				Controller.ktData.calculData();
			}
		});
	}
	
	public JPanel getKTPage() {
		return ktPage;
	}
}

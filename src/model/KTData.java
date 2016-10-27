package model;

import gui.page.KT_Page;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import control.Controller;

public class KTData {
	private Workbook workbook;
	private Sheet sheet;
	private String[][] ktData;
	public static JLabel[][] dataLabel;
	private int rowCount;
	private int colCount;
	
	public KTData() throws Exception {
		// TODO Auto-generated constructor stub
		File file = new File(".//data//data.xls");
		
		try {
			workbook = Workbook.getWorkbook(file);
			sheet = workbook.getSheet("KT");
			
			rowCount = 9;
			colCount = 18;
			if (rowCount <= 0) {
				throw new Exception("Excel Read Error Occur!");
			}
			
			ktData = new String[rowCount][colCount];
			
			Cell cell = null;

			for (int i=0; i<rowCount; i++) {
				for (int j=0; j<colCount; j++) {
					cell = sheet.getCell(i,j);
					if (cell == null) continue;
					ktData[i][j] = cell.getContents().trim();
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				if (workbook != null) workbook.close();
			} catch (Exception ee) {
				ee.printStackTrace();
			}
		}
	}
	
	public void setData(JLabel table) {
		int tableX = table.getSize().width;
		int tableY = table.getSize().height;
		
		int col1 = (int) (tableX * 0.1285);
		int col2to9 = (tableX - col1) / (rowCount-1); 
		int row = tableY/colCount;
		
		dataLabel = new JLabel[rowCount][colCount];

		for (int i=0; i<rowCount; i++) {
			for (int j=0; j<colCount; j++) {
				dataLabel[i][j] = new JLabel(ktData[i][j]);
				table.add(dataLabel[i][j]);
				dataLabel[i][j].setBounds(col1 + col2to9*(i-1)+i/2, row*j+1, col2to9-1, row-1);
				dataLabel[i][j].setHorizontalAlignment(JLabel.CENTER);
				dataLabel[i][j].setVerticalAlignment(JLabel.CENTER);
				dataLabel[i][j].setFont(Controller.myFont.godicFont_18);
				dataLabel[i][j].setForeground(Color.black);
				
				// 세로줄
				if (i==0) {
					dataLabel[i][j].setBounds(0, row*j, col1, row);
					dataLabel[i][j].setFont(Controller.myFont.godicFont_B_18);
				} 
				else if (i==5) {
					dataLabel[i][j].setForeground(Color.white);
					dataLabel[i][j].setFont(Controller.myFont.godicFont_B_18);
				}
				else if (i==7 || i==8) {
					dataLabel[i][j].setForeground(Color.yellow);
					dataLabel[i][j].setFont(Controller.myFont.godicFont_B_18);					
				}
				
				// 가로
				if (j==0)
					if (i==0)
						dataLabel[i][j].setBounds(0, row*j, col1, row*2);
					else 
						dataLabel[i][j].setBounds(col1 + col2to9*(i-1)+i/2, row*j+1, (col2to9-1), (row-1)*2);
				else if (i==1 && j==2)
					dataLabel[i][j].setBounds(col1 + col2to9*(i-1)+i/2, row*j+1, (col2to9-1)*8, row-1);
				else if (j==16) {
					dataLabel[i][j].setForeground(Color.black);
					dataLabel[i][j].setFont(Controller.myFont.godicFont_15);
					if (i==0) 
						dataLabel[i][j].setBounds(0, row*j, col1, (row-1)*2);
					else 
						dataLabel[i][j].setBounds(col1 + col2to9*(i-1)+i/2, row*j+1, (col2to9-1), (row-1)*2);						
				}
					
				
				// 가로 & 세로
				if (i==4 && j==3)
					dataLabel[i][j].setBounds(col1 + col2to9*(i-1)+i/2, row*j+1, (col2to9-1)*5, (row-1)*2);
				
				if (i==0 && j==12) {
					dataLabel[i][j].setFont(Controller.myFont.godicFont_B_13);
					dataLabel[i][j].setForeground(Color.white);
				}
				if (i==0 && (j==13 || j==14)) {
					dataLabel[i][j].setFont(Controller.myFont.godicFont_B_13);
					dataLabel[i][j].setForeground(Color.yellow);
				}
				else if (i==0 && j==15) {
					dataLabel[i][j].setForeground(Color.white);	
					dataLabel[i][j].setFont(Controller.myFont.godicFont_B_20);
				}
				if (j==15)
					dataLabel[i][j].setFont(Controller.myFont.godicFont_B_22);
				
				// Label 이벤트 달기
				if (i>=1 && i<=8 && j>=3 && j<=16) {
					dataLabel[i][j].addMouseListener(new LabelMouseEvent());
				}
				
				// 값 채우기
				if (i!=0 && j==6)
					dataLabel[i][j].setText("0");
				if (i!=0 && j==7) 
					dataLabel[i][j].setText(dataLabel[i][j-1].getText());
				if (i!=0 && j==12)
					dataLabel[i][j].setText("0");
				if (i!=0 && j==13)
					dataLabel[i][j].setText("0");
				if (i!=0 && j==14)
					dataLabel[i][j].setText("0");
			}
		}
	}
	
	/*
	 * 수식 부
	 */
	public void calculData() {
		// 할부 원금 떼우기
		int price1 = 0, price2 = 0, price3 = 0;
		int resultPrice;
		String priceS1 = KT_Page.tf_Price1.getText();
		String priceS2 = KT_Page.tf_Price2.getText();
		String priceS3 = KT_Page.tf_Price3.getText();

		if (priceS1.equals("")) {
			price1 = 0;
			KT_Page.tf_Price1.setText("0");
		} else 
			price1 = Integer.parseInt(priceS1);

		if (priceS2.equals("")) {
			price2 = 0;
			KT_Page.tf_Price2.setText("0");
		} else 
			price2 = Integer.parseInt(priceS2);

		if (priceS3.equals("")) {
			KT_Page.tf_Price3.setText("0");
			price3 = 0;
		} else 
			price3 = Integer.parseInt(priceS3);
		
		resultPrice = price1 - price2 - price3;
		
		if (resultPrice < 0) return;
		if (resultPrice > Integer.MAX_VALUE) return;
		if (resultPrice < Integer.MIN_VALUE) return;
		KT_Page.last_Prices.setText(resultPrice+"");
		
		// 24 / 30 / 36 개월일 경우 이자, 가격		
		if (dataLabel[0][6].getText().equals("할부개월36")) {
			for (int i=1; i<rowCount; i++) {
				dataLabel[i][6].setText((int) (resultPrice/36) + "");
				dataLabel[i][10].setText((int) (resultPrice*0.0025) + "");
			}
		} else if (dataLabel[0][6].getText().equals("할부개월30")) {
			for (int i=1; i<rowCount; i++) {
				dataLabel[i][6].setText((int) (resultPrice/30) + "");
				dataLabel[i][10].setText((int) (resultPrice*0.0025) + "");
			}
		} else if (dataLabel[0][6].getText().equals("할부개월24")) {
			for (int i=1; i<rowCount; i++) {
				dataLabel[i][6].setText((int) (resultPrice/24) + "");
				dataLabel[i][10].setText((int) (resultPrice*0.0025) + "");
			}
		} 

		for (int i=1; i<rowCount; i++) {
			dataLabel[i][7].setText(
					Integer.parseInt(dataLabel[i][6].getText()) + "");
		}
		

		try {
			// 청구 금액 셋팅
			for (int i=1; i<rowCount; i++) {
				dataLabel[i][11].setText(
						Integer.parseInt(dataLabel[i][11-4].getText())
						+ Integer.parseInt(dataLabel[i][11-3].getText())
						+ Integer.parseInt(dataLabel[i][11-2].getText())
						+ Integer.parseInt(dataLabel[i][11-1].getText())
						+ "" );
			}
			
			// 총 금액 셋팅
			for (int i=1; i<rowCount; i++) {
				dataLabel[i][15].setText(
					Integer.parseInt(dataLabel[i][15-4].getText())
					+ Integer.parseInt(dataLabel[i][15-3].getText())
					+ Integer.parseInt(dataLabel[i][15-2].getText())
					+ Integer.parseInt(dataLabel[i][15-1].getText())
					+ "" ); 
			}
		} catch (NumberFormatException ne) {
			JOptionPane.showMessageDialog(Controller.startPage
					, "Data Loading Failed. \nPlz check data.xls file.", "Error", JOptionPane.ERROR_MESSAGE);
			ne.printStackTrace();
			System.exit(1);
		}
		
	}
	
	class LabelMouseEvent implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
			// 마우스 눌렀을 때 세로 1줄 노란색으로 배치
//			int x = 0;
//			for (int i=1; i<=8; i++) 
//				for (int j=2; j<=15; j++) {
//					if (e.getSource() == dataLabel[i][j]) {
//						x = i;
//						break;
//				}
//			}
//			if (x<=3 && x>=1) {
//				for (int j=3; j<=15; j++) {
//					if (dataLabel[x][j].getForeground().getRGB() == Color.black.getRGB()) {
//						dataLabel[x][j].setOpaque(true);
//						dataLabel[x][j].setBackground(Color.yellow);
//						dataLabel[x][j].setForeground(Color.red);
//					} else if (dataLabel[x][j].getForeground().getRGB() == Color.red.getRGB()) {
//						dataLabel[x][j].setOpaque(false);
//						dataLabel[x][j].setForeground(Color.black);
//					} 
//				}
//			} else {
//				for (int j=5; j<=15; j++) {
//					if (dataLabel[x][j].getForeground().getRGB() == Color.black.getRGB()) {
//						dataLabel[x][j].setOpaque(true);
//						dataLabel[x][j].setBackground(Color.yellow);
//						dataLabel[x][j].setForeground(Color.red);
//					} else if (dataLabel[x][j].getForeground().getRGB() == Color.red.getRGB()) {
//						dataLabel[x][j].setOpaque(false);
//						dataLabel[x][j].setForeground(Color.black);
//					} 
//				}
//			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}

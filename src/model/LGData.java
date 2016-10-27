package model;

import gui.page.LG_Page;

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

public class LGData {
	private Workbook workbook;
	private Sheet sheet;
	private String[][] lgData;
	public static JLabel[][] dataLabel;
	private int rowCount;
	private int colCount;
	
	public LGData() throws Exception {
		// TODO Auto-generated constructor stub
		File file = new File(".//data//data.xls");
		
		try {
			workbook = Workbook.getWorkbook(file);
			sheet = workbook.getSheet("LG");
			
			rowCount = 11;
			colCount = 18;
			if (rowCount <= 0) {
				throw new Exception("Excel Read Error Occur!");
			}
			
			lgData = new String[rowCount][colCount];
			
			Cell cell = null;

			for (int i=0; i<rowCount; i++) {
				for (int j=0; j<colCount; j++) {
					cell = sheet.getCell(i,j);
					if (cell == null) continue;
					lgData[i][j] = cell.getContents().trim();
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
		int row = tableY/colCount+1;
		
		dataLabel = new JLabel[rowCount][colCount];

		for (int i=0; i<rowCount; i++) {
			for (int j=0; j<colCount; j++) {
				dataLabel[i][j] = new JLabel(lgData[i][j]);
				table.add(dataLabel[i][j]);
				dataLabel[i][j].setBounds(col1 + col2to9*(i-1) + (i/2), row*j-(i/3), col2to9-1, row-1);
				dataLabel[i][j].setHorizontalAlignment(JLabel.CENTER);
				dataLabel[i][j].setVerticalAlignment(JLabel.CENTER);
				dataLabel[i][j].setFont(Controller.myFont.godicFont_18);
				dataLabel[i][j].setForeground(Color.black);
				
				// 세로줄
				if (i==0) {
					dataLabel[i][j].setBounds(0, row*j, col1, row);
					dataLabel[i][j].setFont(Controller.myFont.godicFont_B_18);
				} 
				else if (i==3) {
					dataLabel[i][j].setForeground(Color.white);
				}
				else if (i==7) {
					dataLabel[i][j].setForeground(Color.white);
				}
				// 가로줄
				if (j==0) {
					dataLabel[i][j].setFont(Controller.myFont.godicFont_B_18);
					dataLabel[i][j].setBounds(col1 + col2to9*(i-1), 0, col2to9, row*2);
				}
				else if (j==2 && i>=4) // 가로 병합처리
					dataLabel[i][j].setBounds(col1 + col2to9*(i-1)+1, row*j+1, col2to9*7, row-1);
				else if (j==16)
					dataLabel[i][j].setFont(Controller.myFont.godicFont_B_22);
				else if (j==17) {
					dataLabel[i][j].setFont(Controller.myFont.godicFont_13);
				}
				
				// 세로 && 가로
				if (i==0 && j==13)
					dataLabel[i][j].setForeground(Color.white);
				else if (i==0 && j==14)
					dataLabel[i][j].setForeground(Color.white);
				else if (i==0 && j==15)
					dataLabel[i][j].setForeground(Color.white);	
				else if (i==0 && j==16)
					dataLabel[i][j].setForeground(Color.white);	
				else if (i==0 && j==0) {
					dataLabel[i][j].setBounds(0, 0, col1, row*2);
				}
				else if (j==2 && (i==1 || i==2 || i==3)) {
					dataLabel[i][j].setBounds(col1 + col2to9*(i-1) + (i/2), row*j+1, col2to9, row*2);
				}
				else if (j==3 && (i==4 || i==5 || i==6)) {
					dataLabel[i][j].setBounds(col1 + col2to9*(i-1) + (i/2), row*j+1, col2to9, row*2);
				}
					
				
				// 값 채우기
				if (i!=0 && j==6)
					dataLabel[i][j].setText("0");
				if (i!=0 && j==8) 
					dataLabel[i][j].setText(dataLabel[i][j-1].getText());
				if (i!=0 && j==13)
					dataLabel[i][j].setText("0");
				if (i!=0 && j==14)
					dataLabel[i][j].setText("0");
				if (i!=0 && j==15)
					dataLabel[i][j].setText("0");
				
				// Label 이벤트 달기
				if (i>=1 && i<=10 && j>=3 && j<=15) {
					dataLabel[i][j].addMouseListener(new LabelMouseEvent());
				}
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
		String priceS1 = LG_Page.tf_Price1.getText();
		String priceS2 = LG_Page.tf_Price2.getText();
		String priceS3 = LG_Page.tf_Price3.getText();

		if (priceS1.equals("")) {
			price1 = 0;
			LG_Page.tf_Price1.setText("0");
		} else 
			price1 = Integer.parseInt(priceS1);

		if (priceS2.equals("")) {
			price2 = 0;
			LG_Page.tf_Price2.setText("0");
		} else 
			price2 = Integer.parseInt(priceS2);

		if (priceS3.equals("")) {
			LG_Page.tf_Price3.setText("0");
			price3 = 0;
		} else 
			price3 = Integer.parseInt(priceS3);
		
		resultPrice = price1 - price2 - price3;
		
		if (resultPrice < 0) return;
		if (resultPrice > Integer.MAX_VALUE) return;
		if (resultPrice < Integer.MIN_VALUE) return;
		LG_Page.last_Prices.setText(resultPrice+"");
		
		// 24 / 30 / 36 개월일 경우 이자, 가격
		if (dataLabel[0][6].getText().equals("할부개월36")) {
			for (int i=1; i<rowCount; i++) {
				dataLabel[i][6].setText((int) (resultPrice/36) + "");
				dataLabel[i][11].setText((int) (resultPrice/36*0.09135) + "");
			}
		} else if (dataLabel[0][6].getText().equals("할부개월30")) {
			for (int i=1; i<rowCount; i++) {
				dataLabel[i][6].setText((int) (resultPrice/30) + "");
				dataLabel[i][11].setText((int) (resultPrice/30*0.07802) + "");
			}
		} else if (dataLabel[0][6].getText().equals("할부개월24")) {
			for (int i=1; i<rowCount; i++) {
				dataLabel[i][6].setText((int) (resultPrice/24) + "");
				dataLabel[i][11].setText((int) (resultPrice/24*0.06261) + "");
			}
		} 

		for (int i=1; i<rowCount; i++) {
			dataLabel[i][8].setText(
					Integer.parseInt(dataLabel[i][6].getText())
					+ Integer.parseInt(dataLabel[i][7].getText()) + "");
		}
		

		try {
			// 청구 금액 셋팅
			for (int i=1; i<rowCount; i++) {
				dataLabel[i][12].setText(
						Integer.parseInt(dataLabel[i][12-4].getText())
						+ Integer.parseInt(dataLabel[i][12-3].getText())
						+ Integer.parseInt(dataLabel[i][12-2].getText())
						+ Integer.parseInt(dataLabel[i][12-1].getText())
						+ "" );
			}
			
			// 총 금액 셋팅
			for (int i=1; i<rowCount; i++) {
				dataLabel[i][16].setText(
					Integer.parseInt(dataLabel[i][15-3].getText())
					+ Integer.parseInt(dataLabel[i][15-2].getText())
					+ Integer.parseInt(dataLabel[i][15-1].getText())
					+ "" ); 
			}
		} catch (NumberFormatException ne) {
			JOptionPane.showMessageDialog(Controller.startPage
					, "Data Loading Failed. \nPlz check data.xls file.", "Error", JOptionPane.ERROR_MESSAGE);
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
//			for (int i=1; i<=10; i++) 
//				for (int j=2; j<=15; j++) {
//					if (e.getSource() == dataLabel[i][j]) {
//						x = i;
//						System.out.println(x);
//						break;
//				}
//			}
//			for (int j=3; j<=16; j++) {
//				if (dataLabel[x][j].getForeground().getRGB() == Color.black.getRGB()) {
//					dataLabel[x][j].setOpaque(true);
//					dataLabel[x][j].setBackground(Color.yellow);
//					dataLabel[x][j].setForeground(Color.red);
//					if (x==1 || x==2 || x==3) {
//						dataLabel[x][2].setOpaque(true);
//						dataLabel[x][2].setBackground(Color.yellow);
//						dataLabel[x][2].setForeground(Color.red);
//					}
//				} else if (dataLabel[x][j].getForeground().getRGB() == Color.red.getRGB()) {
//					dataLabel[x][j].setOpaque(false);
//					dataLabel[x][j].setForeground(Color.black);
//					if (x==1 || x==2 || x==3) {
//						dataLabel[x][2].setOpaque(false);
//						dataLabel[x][2].setForeground(Color.black);
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

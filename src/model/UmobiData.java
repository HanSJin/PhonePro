package model;

import gui.page.Umobi_Page;

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

public class UmobiData {
	private Workbook workbook;
	private Sheet sheet;
	private String[][] umobiData;
	public static JLabel[][] dataLabel;
	private int rowCount;
	private int colCount;
	
	public UmobiData() throws Exception {
		// TODO Auto-generated constructor stub
		File file = new File(".//data//data.xls");
		
		try {
			workbook = Workbook.getWorkbook(file);
			sheet = workbook.getSheet("umobi");
			
			rowCount = 8;
			colCount = 13;
			if (rowCount <= 0) {
				throw new Exception("Excel Read Error Occur!");
			}
			
			umobiData = new String[rowCount][colCount];
			
			Cell cell = null;

			for (int i=0; i<rowCount; i++) {
				for (int j=0; j<colCount; j++) {
					cell = sheet.getCell(i,j);
					if (cell == null) continue;
					umobiData[i][j] = cell.getContents().trim();
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
		
		int col1 = (int) (tableX * 0.1364);
		int col2to9 = (tableX - col1) / 7;
		int row = tableY/13;
		
		JLabel dump = new JLabel("음성");
		dump.setBounds(0, row*2, col1-130, row*2);
		dump.setHorizontalAlignment(JLabel.CENTER);
		dump.setVerticalAlignment(JLabel.CENTER);
		dump.setFont(Controller.myFont.godicFont_B_20);
		dump.setForeground(Color.black);
		table.add(dump);
		
		dataLabel = new JLabel[rowCount][colCount];
		
		for (int i=0; i<rowCount; i++) {
			for (int j=0; j<colCount; j++) {
				dataLabel[i][j] = new JLabel(umobiData[i][j]);
				table.add(dataLabel[i][j]);
				dataLabel[i][j].setBounds(col1 + col2to9*(i-1)+i/2, row*j+1, col2to9-1, row-1);
				dataLabel[i][j].setHorizontalAlignment(JLabel.CENTER);
				dataLabel[i][j].setVerticalAlignment(JLabel.CENTER);
				dataLabel[i][j].setFont(Controller.myFont.godicFont_20);
				dataLabel[i][j].setForeground(Color.black);
				
				// 세로줄
				if (i==0) {
					dataLabel[i][j].setBounds(0, row*j, col1, row);
					dataLabel[i][j].setFont(Controller.myFont.godicFont_B_20);
					if (j==12) {
						dataLabel[i][j].setForeground(Color.white);
					}
				}
				
				// 가로줄 
				if (j==12) {
					dataLabel[i][j].setFont(Controller.myFont.godicFont_B_22);
				}
				
				if (j==0 || j==1) 
					dataLabel[i][j].setFont(Controller.myFont.godicFont_B_20);
				
				if ((j==0 || j==1) && (i>=1 && i<=6))
					dataLabel[i][j].setForeground(Color.white);
				
				// setBound!!
				if (i==1 && j==0)
					dataLabel[i][j].setBounds(col1 + col2to9*(i-1)+i/2, row*j+1, col2to9*6-1, row-1);
				if (i==0 && j==0)
					dataLabel[i][j].setBounds(0, row*j, col1, row*2);
				if (i==0 && (j==2 || j==3))
					dataLabel[i][j].setBounds(80, row*j, col1-80, row);
				if (j==2 && (i==1 || i==2 || i==3))
					dataLabel[i][j].setBounds(col1 + col2to9*(i-1)+i/2, row*j+1, col2to9-1, (row-1)*2);
				if ((j==2 || j==4) && i==4)
					dataLabel[i][j].setBounds(col1 + col2to9*(i-1)+i/2, row*j+1, col2to9*3-1, row-1);
				if (j==2 && i==7)
					dataLabel[i][j].setBounds(col1 + col2to9*(i-1)+i/2, row*j+1, col2to9-1, row*4-1);
			}
		}
	}
	
	/*
	 * 수식 부
	 */
	public void calculData() {
		int price1 = 0, price2 = 0, price3 = 0;
		int resultPrice;
		String priceS1 = Umobi_Page.tf_Price1.getText();
		String priceS2 = Umobi_Page.tf_Price2.getText();
		String priceS3 = Umobi_Page.tf_Price3.getText();

		if (priceS1.equals("")) {
			price1 = 0;
			Umobi_Page.tf_Price1.setText("0");
		} else 
			price1 = Integer.parseInt(priceS1);

		if (priceS2.equals("")) {
			price2 = 0;
			Umobi_Page.tf_Price2.setText("0");
		} else 
			price2 = Integer.parseInt(priceS2);

		if (priceS3.equals("")) {
			Umobi_Page.tf_Price3.setText("0");
			price3 = 0;
		} else 
			price3 = Integer.parseInt(priceS3);
		
		resultPrice = price1 - price2 - price3;
		
		if (resultPrice < 0) return;
		if (resultPrice > Integer.MAX_VALUE) return;
		if (resultPrice < Integer.MIN_VALUE) return;
		Umobi_Page.last_Prices.setText(resultPrice+"");
		
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
			// 총 금액 셋팅
			for (int i=1; i<rowCount; i++) {
				dataLabel[i][12].setText(
					Integer.parseInt(dataLabel[i][12-4].getText())
					+ Integer.parseInt(dataLabel[i][12-3].getText())
					+ Integer.parseInt(dataLabel[i][12-2].getText())
					+ Integer.parseInt(dataLabel[i][12-1].getText())
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
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}

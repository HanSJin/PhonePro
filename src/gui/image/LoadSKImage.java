package gui.image;

import gui.constvalue.ConstV;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LoadSKImage {
	/*
	 * SK 로고
	 */
	public Image getSKLogoImg() {
		File imageFile = new File(".//image//sk//sk_logo.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				143, 55, 
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	
	/*
	 * 카드 프레임 - 타이틀바
	 */
	public Image getCardTitleImg() {
		File imageFile = new File(".//image//sk//card_titlebar.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				1052, 20,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	/*
	 * 카드 프레임 - 패널
	 */
	public Image getCardPanelImg() {
		File imageFile = new File(".//image//sk//cardPanel.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				1052, 262,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 * IPTV 프레임 - 타이틀바
	 */
	public Image getIptvTitleImg() {
		File imageFile = new File(".//image//sk//iptv_titlebar.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				772, 20,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	
	/*
	 * IPTV 프레임 - 패널
	 */
	public Image getIptvPanelImg() {
		File imageFile = new File(".//image//sk//iptvPanel.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				772, 262,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	
	
	
	/*
	 * 요금표 
	 */
	public Image getPriceTableImg() {
		File imageFile = new File(".//image//sk//sk_table.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.7692), 	// 1020
				(int) (ConstV.windowSizeY * 0.7092), 	// 580
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	/*
	 * 요금표 2
	 */
	public Image getPriceTable2Img() {
		File imageFile = new File(".//image//sk//sk_table_2.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.7692), 	// 1020
				(int) (ConstV.windowSizeY * 0.6259), 	// 580
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	/*
	 * 요금표 3
	 */
	public Image getPriceTable3Img() {
		File imageFile = new File(".//image//sk//sk_table_3.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.7692), 	// 1020
				(int) (ConstV.windowSizeY * 0.75), 	// 580
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 * SK - Page 1
	 */
	public Image getPricePageNum_1_Img() {
		File imageFile = new File(".//image//sk//sk_page_num_1.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				50, 
				45,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	/*
	 * SK - Page 2
	 */
	public Image getPricePageNum_2_Img() {
		File imageFile = new File(".//image//sk//sk_page_num_2.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				50, 
				45,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	/*
	 * SK - Page 3
	 */
	public Image getPricePageNum_3_Img() {
		File imageFile = new File(".//image//sk//sk_page_num_3.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				50, 
				45,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	

	/*
	 * SK - Page 1 : On
	 */
	public Image getPricePageNumOn_1_Img() {
		File imageFile = new File(".//image//sk//sk_page_num_on_1.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				50, 
				45,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	/*
	 * SK - Page 2 : On
	 */
	public Image getPricePageNumOn_2_Img() {
		File imageFile = new File(".//image//sk//sk_page_num_on_2.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				50, 
				45,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	/*
	 * SK - Page 3 : On
	 */
	public Image getPricePageNumOn_3_Img() {
		File imageFile = new File(".//image//sk//sk_page_num_on_3.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				50, 
				45,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
}

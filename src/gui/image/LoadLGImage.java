package gui.image;

import gui.constvalue.ConstV;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LoadLGImage {
	/*
	 * SK 로고
	 */
	public Image getLGLogoImg() {
		File imageFile = new File(".//image//lg//lg_logo.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				60, 50, 
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	
	/*
	 * 카드 프레임 - 타이틀바
	 */
	public Image getCardTitleImg() {
		File imageFile = new File(".//image//lg//card_titlebar.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				1156, 20,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	/*
	 * 카드 프레임 - 패널
	 */
	public Image getCardPanelImg() {
		File imageFile = new File(".//image//lg//cardPanel.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				1156, 341,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	
	
	/*
	 * IPTV 프레임 - 타이틀바
	 */
	public Image getIptvTitleImg() {
		File imageFile = new File(".//image//lg//iptv_titlebar.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				711, 20,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	
	/*
	 * IPTV 프레임 - 패널
	 */
	public Image getIptvPanelImg() {
		File imageFile = new File(".//image//lg//iptvPanel.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				711, 263,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	
	
	
	/*
	 * 요금표 
	 */
	public Image getPriceTableImg() {
		File imageFile = new File(".//image//lg//lg_table.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.7898), 	// 1020
				(int) (ConstV.windowSizeY * 0.7490), 	// 580
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
}

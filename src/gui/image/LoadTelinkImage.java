package gui.image;

import gui.constvalue.ConstV;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LoadTelinkImage {
	/*
	 * SK 로고
	 */
	public Image getTelinkLogoImg() {
		File imageFile = new File(".//image//lowprice//telink_logo.png");
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
	 * 요금표 
	 */
	public Image getPriceTableImg() {
		File imageFile = new File(".//image//lowprice//telink_table.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.7898), 	// 1020
				(int) (ConstV.windowSizeY * 0.5842), 	// 580
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
}

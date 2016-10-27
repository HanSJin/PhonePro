package gui.image;

import gui.constvalue.ConstV;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class LoadCommonImage {

	/*
	 * 우측 버튼 1
	 */
	public Image getRightBtn_1_Img() {
		File imageFile = new File(".//image//common//rightBtn1.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.15), 	// 150
				(int) (ConstV.windowSizeY * 0.14), 	// 150
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 * 우측 버튼 2
	 */
	public Image getRightBtn_2_Img() {
		File imageFile = new File(".//image//common//rightBtn2.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.15), 	// 150
				(int) (ConstV.windowSizeY * 0.14), 	// 150
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 * 우측 버튼 3
	 */
	public Image getRightBtn_3_Img() {
		File imageFile = new File(".//image//common//rightBtn3.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.15), 	// 150
				(int) (ConstV.windowSizeY * 0.14), 	// 150
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	

	/*
	 * 할부원금 이미지
	 */
	public Image getPriceImg() {
		File imageFile = new File(".//image//common//priceImg.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.0818), 	// 156
				(int) (ConstV.windowSizeY * 0.1225), 	// 35
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	/*
	 * 서브 프레임 - 종료
	 */
	public Image getCardExitImg() {
		File imageFile = new File(".//image//common//sub_exit.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				20, 20,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
}

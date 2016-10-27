package gui.image;

import gui.constvalue.ConstV;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LoadAdverImage {
	/*
	 * 메인 페이지 광고 이미지1
	 */
	public Image getMainAdverAreaImg1() {
		File imageFile = new File(".//image//adver//adver1.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.23), 	// 305
				(int) (ConstV.windowSizeY * 0.08),	// 65
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 * 메인 페이지 광고 이미지2
	 */
	public Image getMainAdverAreaImg2() {
		File imageFile = new File(".//image//adver//adver2.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.23), 	// 305
				(int) (ConstV.windowSizeY * 0.08),	// 65
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 * 메인 페이지 광고 이미지3
	 */
	public Image getMainAdverAreaImg3() {
		File imageFile = new File(".//image//adver//adver3.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.23), 	// 305
				(int) (ConstV.windowSizeY * 0.08),	// 65
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 * 메인 페이지 광고 이미지4
	 */
	public Image getMainAdverAreaImg4() {
		File imageFile = new File(".//image//adver//adver4.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.23), 	// 305
				(int) (ConstV.windowSizeY * 0.08),	// 65
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
}

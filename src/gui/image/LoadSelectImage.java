package gui.image;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LoadSelectImage {
	/*
	 * 선택 버튼 No
	 */
	public Image getSelectNoImg() {
		File imageFile = new File(".//image//common//select_no.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				31, 26, 
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 *  선택 버튼 Yes
	 */
	public Image getSelectYesImg() {
		File imageFile = new File(".//image//common//select_yes.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				31, 26, 
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
}

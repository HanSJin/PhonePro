package gui.image;

import gui.constvalue.ConstV;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LoadImage {

	public LoadImage() {
		// TODO Auto-generated constructor stub
	}	

	/*
	 * ���� ������ ��� Exit ��ư
	 */
	public Image getExitImg() {
		File imageFile = new File(".//image//main//exit.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				ConstV.frameTopBtnSizeX,
				ConstV.frameTopBtnSizeY,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}

	/*
	 * ���� ������ ��� Minimal ��ư
	 */
	public Image getMinimalImg() {
		File imageFile = new File(".//image//main//minimal.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				ConstV.frameTopBtnSizeX,
				ConstV.frameTopBtnSizeY,
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	

	
	/*
	 * ���� ������ ��� Ÿ��Ʋ �̹���
	 */
	public Image getMainTitleImg() {
		File imageFile = new File(".//image//main//mainTitle.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.5), 	// 800
				(int) (ConstV.windowSizeY * 0.07),	// 70
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}

	/*
	 * ���� ������ SK ��ư �̹���
	 */
	public Image getMainBtnSKImg() {
		File imageFile = new File(".//image//main//mainBtn_SK.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.2111), 	// 270
				(int) (ConstV.windowSizeY * 0.3375),	// 270
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	/*
	 * ���� ������ SK ��ư Ŭ�� �̹���
	 */
	public Image getMainBtnSK_ClickImg() {
		File imageFile = new File(".//image//main//mainBtn_SK_Click.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.2111), 	// 270
				(int) (ConstV.windowSizeY * 0.3375),	// 270
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 * ���� ������ KT ��ư �̹���
	 */
	public Image getMainBtnKTImg() {
		File imageFile = new File(".//image//main//mainBtn_KT.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.2111), 	// 270
				(int) (ConstV.windowSizeY * 0.3375),	// 270
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}

	
	/*
	 * ���� ������ KT ��ư Ŭ�� �̹���
	 */
	public Image getMainBtnKT_ClickImg() {
		File imageFile = new File(".//image//main//mainBtn_KT_Click.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.2111), 	// 270
				(int) (ConstV.windowSizeY * 0.3375),	// 270
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 * ���� ������ LG ��ư �̹���
	 */
	public Image getMainBtnLGImg() {
		File imageFile = new File(".//image//main//mainBtn_LG.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.2111), 	// 270
				(int) (ConstV.windowSizeY * 0.3375),	// 270
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 * ���� ������ KT ��ư Ŭ�� �̹���
	 */
	public Image getMainBtnLG_ClickImg() {
		File imageFile = new File(".//image//main//mainBtn_LG_Click.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.2111), 	// 270
				(int) (ConstV.windowSizeY * 0.3375),	// 270
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 * ���� ������ SK telink ��ư �̹���
	 */
	public Image getMainBtn_telink_Img() {
		File imageFile = new File(".//image//main//mainBtn_telink.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.1562), 	// 200
				(int) (ConstV.windowSizeY * 0.2375),	// 190
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 * ���� ������ KT M mobile ��ư �̹���
	 */
	public Image getMainBtn_Mmobile_Img() {
		File imageFile = new File(".//image//main//mainBtn_Mmobile.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.1562), 	// 200
				(int) (ConstV.windowSizeY * 0.2375),	// 190
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 * ���� ������ SK telink ��ư �̹���
	 */
	public Image getMainBtn_Umobi_Img() {
		File imageFile = new File(".//image//main//mainBtn_Umobi.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.1562), 	// 200
				(int) (ConstV.windowSizeY * 0.2375),	// 190
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	/*
	 * ���� ������ SK telink Click ��ư �̹���
	 */
	public Image getMainBtn_telink_Click_Img() {
		File imageFile = new File(".//image//main//mainBtn_telink_Click.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.1562), 	// 200
				(int) (ConstV.windowSizeY * 0.2375),	// 190
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 * ���� ������ KT M mobile Click ��ư �̹���
	 */
	public Image getMainBtn_Mmobile_Click_Img() {
		File imageFile = new File(".//image//main//mainBtn_Mmobile_Click.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.1562), 	// 200
				(int) (ConstV.windowSizeY * 0.2375),	// 190
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	
	/*
	 * ���� ������ SK telink Click ��ư �̹���
	 */
	public Image getMainBtn_Umobi_Click_Img() {
		File imageFile = new File(".//image//main//mainBtn_Umobi_Click.png");
		Image PictureImg = null;
		Image setSizeImg = null;
		try {
			PictureImg = ImageIO.read(new File(imageFile.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSizeImg = PictureImg.getScaledInstance(
				(int) (ConstV.windowSizeX * 0.1562), 	// 200
				(int) (ConstV.windowSizeY * 0.2375),	// 190
				Image.SCALE_SMOOTH);
		return setSizeImg;
	}
	
	

	
}

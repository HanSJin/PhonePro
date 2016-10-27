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
	 * 메인 페이지 상단 Exit 버튼
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
	 * 메인 페이지 상단 Minimal 버튼
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
	 * 메인 페이지 상단 타이틀 이미지
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
	 * 메인 페이지 SK 버튼 이미지
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
	 * 메인 페이지 SK 버튼 클릭 이미지
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
	 * 메인 페이지 KT 버튼 이미지
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
	 * 메인 페이지 KT 버튼 클릭 이미지
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
	 * 메인 페이지 LG 버튼 이미지
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
	 * 메인 페이지 KT 버튼 클릭 이미지
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
	 * 메인 페이지 SK telink 버튼 이미지
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
	 * 메인 페이지 KT M mobile 버튼 이미지
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
	 * 메인 페이지 SK telink 버튼 이미지
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
	 * 메인 페이지 SK telink Click 버튼 이미지
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
	 * 메인 페이지 KT M mobile Click 버튼 이미지
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
	 * 메인 페이지 SK telink Click 버튼 이미지
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

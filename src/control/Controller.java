package control;

import gui.MainFrame;
import gui.MainPanel;
import gui.constvalue.ConstV;
import gui.constvalue.MyFont;
import gui.image.LoadAdverImage;
import gui.image.LoadCommonImage;
import gui.image.LoadImage;
import gui.image.LoadKTImage;
import gui.image.LoadLGImage;
import gui.image.LoadMmobileImage;
import gui.image.LoadSKImage;
import gui.image.LoadSelectImage;
import gui.image.LoadTelinkImage;
import gui.image.LoadUmobiImage;
import gui.page.KT_Page;
import gui.page.LG_Page;
import gui.page.Mmobile_Page;
import gui.page.SK_Page;
import gui.page.StartPage;
import gui.page.Telink_Page;
import gui.page.Umobi_Page;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.Main;
import model.KTData;
import model.LGData;
import model.MmobileData;
import model.SK2Data;
import model.SK3Data;
import model.SKData;
import model.TelinkData;
import model.UmobiData;

public class Controller {
	public static JFrame mainFrame;
	public static JPanel mainPanel,
						startPage, 
						skPage,
						ktPage,
						lgPage,
						telinkPage,
						mmobilePage,
						umobiPage;
	
	public static LoadImage loadImage;
	
	public static LoadSKImage loadSKImage;
	public static LoadKTImage loadKTImage;
	public static LoadLGImage loadLGImage;
	public static LoadTelinkImage loadTelinkImage;
	public static LoadMmobileImage loadMmobileImage;
	public static LoadUmobiImage loadUmobiImage;
	
	public static LoadSelectImage loadSelectImage;
	public static LoadAdverImage loadAdverImage;
	public static LoadCommonImage loadCommonImage;
	
	public static MyFont myFont;

	public static SKData skData;
	public static SK2Data skData2;
	public static SK3Data skData3;
	public static KTData ktData;
	public static LGData lgData;
	public static TelinkData telinkData;
	public static MmobileData mmobileData;
	public static UmobiData umobiData;
	
	public Controller() {
		// TODO Auto-generated method stub
		setConstValue();
		loadImage = new LoadImage();
		loadSKImage = new LoadSKImage();
		loadKTImage = new LoadKTImage();
		loadLGImage = new LoadLGImage();
		loadSelectImage = new LoadSelectImage();
		loadAdverImage = new LoadAdverImage();
		loadCommonImage = new LoadCommonImage();
		loadTelinkImage = new LoadTelinkImage();
		loadMmobileImage = new LoadMmobileImage();
		loadUmobiImage = new LoadUmobiImage();
		
		// 프레임, 패널 생성
		loadFrame();
		loadPanel();
		MainFrame.proBar.setValue(1);
		
		// 로딩 완료 대기
		mainPanel.setVisible(false);
		
		myFont = new MyFont();

		MainFrame.proBar.setValue(2);
		try {
			if (Main.isDebug_SK) skData = new SKData();
			if (Main.isDebug_SK) skData2 = new SK2Data();
			if (Main.isDebug_SK) skData3 = new SK3Data();
			
			if (Main.isDebug_LG) lgData = new LGData();
			if (Main.isDebug_KT) ktData = new KTData();
			if (Main.isDebug_Telink) telinkData = new TelinkData();
			if (Main.isDebug_Mmobile) mmobileData = new MmobileData();
			if (Main.isDebug_Umobi) umobiData = new UmobiData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MainFrame.proBar.setValue(3);
		mainFrame.add(mainPanel);

		MainFrame.proBar.setValue(4);
		mainPanel.setBounds(0, 0, ConstV.windowSizeX, ConstV.windowSizeX);
		
		loadPage();
		

		MainFrame.proBar.setValue(11);
		
		mainPanel.add(startPage);
		startPage.setBounds(
				ConstV.pageStartX
				, ConstV.pageStartY
				, ConstV.windowSizeX - ConstV.pageStartX
				, ConstV.windowSizeY - ConstV.pageStartY);

		MainFrame.proBar.setValue(12);
		
		// 로딩 완료
		MainFrame.proBar.setVisible(false);
		MainFrame.loadLabel.setVisible(false);
		mainPanel.setVisible(true);
	}
	
	private void setConstValue() {
		// TODO Auto-generated method stub
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		
		ConstV.windowSizeX = (int) screenSize.getWidth();
		ConstV.windowSizeY = (int) screenSize.getHeight();
		
		// Table 크기
		ConstV.tableStartX = 10;
		ConstV.tableStartY = 100;
		ConstV.tableSizeX = (int) (ConstV.windowSizeX * 0.8);
		ConstV.tableSizeY = (int) (ConstV.windowSizeY * 0.8);
	}

	private void loadPage() {
		// TODO Auto-generated method stub
		startPage = new StartPage().getStartPanel();
		startPage.setVisible(true);
		MainFrame.proBar.setValue(5);
		
		if (Main.isDebug_SK)
			skPage = new SK_Page().getSkPage();
		MainFrame.proBar.setValue(6);
		
		if (Main.isDebug_LG)
			lgPage = new LG_Page().getLGPage();
		MainFrame.proBar.setValue(7);
		
		if (Main.isDebug_KT)
			ktPage = new KT_Page().getKTPage();
		MainFrame.proBar.setValue(8);
		
		if (Main.isDebug_Telink)
			telinkPage = new Telink_Page().getTelinkPage();
		MainFrame.proBar.setValue(9);

		if (Main.isDebug_Mmobile)
			mmobilePage = new Mmobile_Page().getMmobilePage();
		MainFrame.proBar.setValue(10);

		if (Main.isDebug_Umobi)
			umobiPage = new Umobi_Page().getUmobiPage();
		MainFrame.proBar.setValue(11);
		
	}

	
	private void loadPanel() {
		// TODO Auto-generated method stub
		MainPanel panel = new MainPanel();
		mainPanel = panel.getMainPanel();
	}

	private void loadFrame() {
		// TODO Auto-generated method stub
		MainFrame frame = new MainFrame();
		mainFrame = frame.getFrame();	
	}
}

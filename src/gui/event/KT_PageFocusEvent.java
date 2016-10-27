package gui.event;

import gui.page.KT_Page;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class KT_PageFocusEvent implements FocusListener{

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == KT_Page.tf_Price1)
			if (KT_Page.tf_Price1.getText().equals("0")) 
				KT_Page.tf_Price1.setText("");
		if (e.getSource() == KT_Page.tf_Price2)	
			if (KT_Page.tf_Price2.getText().equals("0")) 
				KT_Page.tf_Price2.setText("");
		if (e.getSource() == KT_Page.tf_Price3)
			if (KT_Page.tf_Price3.getText().equals("0")) 
				KT_Page.tf_Price3.setText("");
	
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

}

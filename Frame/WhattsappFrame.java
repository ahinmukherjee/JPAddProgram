import java.awt.*;
import javax.swing.*;

public class WhattsappFrame{
	public static void main(String args[]){
		SampleFrame sf = new SampleFrame();
		sf.setVisible(true);
		sf.setDefaultCloseOperation(3);
	}
}

class SampleFrame extends JFrame{
	public SampleFrame(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension scrsize = kit.getScreenSize();
		int w= scrsize.width;
 		int h= scrsize.height;
		setSize(300, 500); // width , height
		setLocation(w/4, h/4);
		setTitle("Whattsapp frame");
		setResizable(false);
	}
}


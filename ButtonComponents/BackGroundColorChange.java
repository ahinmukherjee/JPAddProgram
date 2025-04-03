import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BackGroundColorChange {
    public static void main(String args[]){
        FrameSample st= new FrameSample();
        st.setVisible(true);
        st.setDefaultCloseOperation(3);
    }
}

class FrameSample extends JFrame{
	public FrameSample(){
	    Toolkit kit =Toolkit.getDefaultToolkit();
	    Dimension scrsize= kit.getScreenSize();
	    int w= scrsize.width;
	    int h= scrsize.height;
	    setSize(w/2,h/2);
	    setLocation(w/4,h/4);
	    setTitle("Hello");
	    setResizable(false);
	    MyPanel mp = new MyPanel();
	    add(mp);
	}
}

class MyPanel extends JPanel{
	JButton yellowButton, greenButton, blueButton, redButton;
	public MyPanel(){
		yellowButton = new JButton("Yellow");
		greenButton = new JButton("Green");
		blueButton = new JButton("Blue");
		redButton = new JButton("Red");

		add(yellowButton);
		add(greenButton);
		add(blueButton);
		add(redButton);
		
	    ColorAction yellowAction = new ColorAction(Color.yellow);
	    ColorAction greenAction = new ColorAction(Color.green);
	    ColorAction blueAction = new ColorAction(Color.blue);
	    ColorAction redAction = new ColorAction(Color.red);

	    yellowButton.addActionListener(yellowAction);
	    greenButton.addActionListener(greenAction);
	    blueButton.addActionListener(blueAction);
	    redButton.addActionListener(redAction);
		
	}


    class ColorAction implements ActionListener{
		public ColorAction(Color c){
			bgcolor= c;
		}
		public void actionPerformed(ActionEvent ae){
			setBackground(bgcolor);
		}
		Color bgcolor;
	}
}




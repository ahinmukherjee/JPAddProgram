import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextChangeWithButtonPerformed {
	public static void main(String args[]){
        FramesSampled st= new FramesSampled();
        st.setVisible(true);
        st.setDefaultCloseOperation(0);
        }
}

class FramesSampled extends JFrame{
	public FramesSampled(){
	Toolkit kit =Toolkit.getDefaultToolkit();
	Dimension scrsize= kit.getScreenSize();
	int w= scrsize.width;
	int h= scrsize.height;
	setSize(w/2,h/2);
	setLocation(w/4,h/4);
	setTitle("Hello");
	setResizable(false);
	MyPanels mp = new MyPanels();
	add(mp);
	}
}

class MyPanels extends JPanel {
    JButton yellowButton, greenButton, blueButton, redButton, exitButton;
    JLabel label;

    public MyPanels() {
        yellowButton = new JButton("Yellow");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");
        redButton = new JButton("Red");
        exitButton = new JButton("Exit");

        label = new JLabel("Welcome in Frame");
        add(label);

        add(yellowButton);
        add(greenButton);
        add(blueButton);
        add(redButton);
        add(exitButton);

        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ColorAction greenAction = new ColorAction(Color.GREEN);
        ColorAction blueAction = new ColorAction(Color.BLUE);
        ColorAction redAction = new ColorAction(Color.RED);

        yellowButton.addActionListener(yellowAction);
        greenButton.addActionListener(greenAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);

        TextAction textYellowButton = new TextAction("Hello");
        yellowButton.addActionListener(textYellowButton);

 		TextAction textGreenButton = new TextAction("Hello dear");
        greenButton.addActionListener(textGreenButton);

 		TextAction textBlueButton = new TextAction("Hii");
       	blueButton.addActionListener(textBlueButton);

        ExitAction ea = new ExitAction();
        exitButton.addActionListener(ea);
    }

    class ColorAction implements ActionListener {
        Color bgcolor;

        public ColorAction(Color c) {
            bgcolor = c;
        }

        public void actionPerformed(ActionEvent ae) {
            setBackground(bgcolor);
        }
    }

    class TextAction implements ActionListener {
        String bgstring;

        public TextAction(String s) {
            bgstring = s;
        }

        public void actionPerformed(ActionEvent ae) {
            label.setText(bgstring);
        }
    }
}

class ExitAction implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
            System.exit(0);
    }
}



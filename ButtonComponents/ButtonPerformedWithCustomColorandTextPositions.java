import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonPerformedWithCustomColorandTextPositions{
	public static void main(String args[]){
		SampleFrame sf= new SampleFrame();
		sf.setVisible(true);
		sf.setDefaultCloseOperation(3);	
	}
}

class SampleFrame extends JFrame{
	public SampleFrame(){
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension srcSize= kit.getScreenSize();
		int w= srcSize.width;
		int h= srcSize.height;
		setSize(w/2, h/2);
		setLocation(w/5, h/6);
		setResizable(false);
		FramePanel fp = new FramePanel();
        	add(fp);
	}
}

class FramePanel extends JPanel{
	public void paintComponent(Graphics g){
        	super.paintComponent(g);
		setBackground(Color.white);
		Font f1 = new Font("Viner Hand",Font.BOLD+Font.ITALIC,30);
		setFont(f1);
		g.drawString("Welcome in Frame",150,250);
		g.setColor(Color.blue);

		Font f2 = new Font("serif",Font.BOLD,30);
		setFont(f2);
		g.drawString("Frame in new string",120,290);
		g.setColor(Color.green);
		
	}

	JButton clickMeButton, yellowButton, greenButton, blueButton, redButton, customColorButton;
	FramePanel(){
		clickMeButton = new JButton("Click me!");
		clickMeButton.setBackground(Color.black);
		clickMeButton.setForeground(Color.white);
		add(clickMeButton);

		yellowButton = new JButton("Yellow");
		yellowButton.setBackground(Color.yellow);
		yellowButton.setForeground(Color.black);
		add(yellowButton);

        	greenButton = new JButton("Green");
		greenButton.setBackground(Color.green);
		greenButton.setForeground(Color.blue);
		add(greenButton);

        	blueButton = new JButton("Blue");
		blueButton.setBackground(Color.blue);
		blueButton.setForeground(Color.white);
		add(blueButton);

        	redButton = new JButton("Red");
		redButton.setBackground(Color.red);
		redButton.setForeground(Color.orange);
        	add(redButton);

		ColorAction yellowAction = new ColorAction(Color.YELLOW);
        	ColorAction greenAction = new ColorAction(Color.GREEN);
        	ColorAction blueAction = new ColorAction(Color.BLUE);
        	ColorAction redAction = new ColorAction(Color.RED);
		ColorAction customAction = new ColorAction(new Color(45, 30, 33));

        	yellowButton.addActionListener(yellowAction);
        	greenButton.addActionListener(greenAction);
        	blueButton.addActionListener(blueAction);
        	redButton.addActionListener(redAction);
		customColorButton.addActionListener(customAction);

        	TextAction textYellowButton = new TextAction("Hello");
        	yellowButton.addActionListener(textYellowButton);

 		TextAction textGreenButton = new TextAction("Hello dear");
        	greenButton.addActionListener(textGreenButton);

 		TextAction textBlueButton = new TextAction("Hii");
       		blueButton.addActionListener(textBlueButton);

        	ExitAction ea = new ExitAction();
        	clickMeButton.addActionListener(ea);
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

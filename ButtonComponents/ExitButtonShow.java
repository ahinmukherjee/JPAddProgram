import java.awt.*;
import javax.swing.*;

public class ExitButtonShow {
    public static void main(String args[]){
        FrameTest ft= new FrameTest();
        ft.setVisible(true);
        ft.setDefaultCloseOperation(3);
    }	
} 
    
class FrameTest extends JFrame{
    public FrameTest(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension scrsize = kit.getScreenSize();
        int w = scrsize.width;
        int h = scrsize.height;
        setSize(w/2, h/2);
        setLocation(w/4, h/4);
        setTitle("Welcome in Frame");
        setResizable(false);
        FramePanel fp = new FramePanel();
        add(fp);
    }
} 
    
class FramePanel extends JPanel{
       JButton exitButton;
    public FramePanel(){
        exitButton = new JButton("Exit");
        add(exitButton);
    }
}

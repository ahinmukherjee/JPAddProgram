import java.awt.*;
import javax.swing.*;

public class FrameTest {
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
	}
}

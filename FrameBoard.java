import java.awt.event.*;
import javax.swing.JFrame;
public class FrameBoard extends JFrame {

	GraphicBoard graphic1 = new GraphicBoard();
	
	public FrameBoard()
	{
	
		this.setSize(800,800);
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(graphic1);
		this.setVisible(true);
		this.addKeyListener(this);
	}
	

}

import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;

public class GameRunner extends JFrame    implements MouseListener ,KeyListener 
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;


	
	
	public GameRunner() 
	{
		super("GameRunner");
		

		this.setSize(WIDTH,HEIGHT);

		//add VisualBlob to the content pane
	//	this.getContentPane().add(new Board2());
		this.getContentPane().add(new Board());
		
		
		
		this.setVisible(true);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 addMouseListener(this);	
		    addKeyListener(this);
	}
		
	
	
	
	
	
	public static void main( String args[] )
	{
		GameRunner run = new GameRunner();
	//	Sorrykey skey = new Sorrykey();
			
	}
	
	
}
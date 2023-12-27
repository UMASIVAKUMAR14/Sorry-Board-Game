
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;

public class Sorryrunner  extends JFrame   // implements MouseListener ,KeyListener 
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	JFrame gameframe;
//	Gamepanel gamepanel;
	
	Graphics window;
	
	
	public Sorryrunner() 
	{
	//	super("Sorry Game Board");
		
		gameframe = new JFrame("Sorry game board");
		gameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameframe.setVisible(true);
	//	gameframe.setLayout(null);    
		gameframe.setSize(1480,1480);
		gameframe.getContentPane().add(new Board2());

		// gameframe.add(Blue1);

		//add VisualBlob to the content pane
		
		
		// repaint();
		// Sorrykey skey   = new Sorrykey();
		
	//	this.getContentPane().add(new NewBoard());
	//	Board2 gameboard = new Board2();
	//	gamepanel = new Gamepanel();
	//	this.add(gamepanel);
	//	this.pack();
		
	
		
		// gameframe.addMouseListener();	
	//     gameframe.addKeyListener();
		
		
		JFrame framer = new JFrame("instructions");
		final JTextArea tex = new JTextArea();
		tex.setBounds(50,50, 650,400);
	//	tex.setBounds(50,50, 650,400);
		JButton ton = new JButton ("Click to see Instructions");
	//	ton.setBounds(5050,5470,5450,5030);
		ton.setBounds(50,470,450,30);
	

		ton.addActionListener(new ActionListener() 
		{
			public void actionPerformed (ActionEvent e) 
			{
				String instruct[] = 
						{
						"Close this screen to see the game.",
						"Decide which person is which color and who goes first.",
						"Click the button in the middle of the board to draw a card",
						"To move a piece, push the button on the keyboard of the letter that corresponds with that piece, then click the mouse to where you want that piece to move.",
						"You can only move a piece from start if you draw a 1 or 2",
						"If you draw a sorry card, you can take a person from your start, put it on the square of another player's piece, and send that piece back to the players start",
						"Move the pieces around the edge of the board with each turn. After getting a card, you can choose which of your 4 pieces to move.",
						"If you land on a triangle, move down the slide to the circle.",
						"You can only turn into the safety zone that corresponds with your color",
						"Once a piece is in the safety zone, it cannot be targeted by a sorry card.",
						"The ultimate goal of the game is to get all of your pieces into your home first.",
						"Play with integrity and most importantly, have fun!"
						};
				for (int a=0; a<instruct.length;a++) 
				{
					tex.append(instruct[a]);
					tex.append("/n");
				}
			
			}
			
		});
		framer.add(ton);
		framer.add(tex);
		//framer.setAlwaysOnTop(true);
		
		
	}
		
		
	public static void main( String args[] )
	{
		Sorryrunner run = new Sorryrunner();
		
		
		
			
	}
}

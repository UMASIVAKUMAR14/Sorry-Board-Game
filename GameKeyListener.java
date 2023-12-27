
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameKeyListener extends GameRunner implements KeyListener {
	
	JLabel label;
	
	GameKeyListener(){
	//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//  this.setSize(80,80);
	//	this.setLayout(null);
		
		this.addKeyListener(this);
		label = new JLabel();
		
		 setFocusable(true);
		 setFocusTraversalKeysEnabled(false);
		    
		label.setBounds(0,0,80,80);
		label.setOpaque(true);
		label.setBackground(Color.red);
	//	label.setText("a");
		
		this.add(label);
		this.add(new Board());
		System.out.println("IN GAMEKL");
		
	}
	
	public void paintComponent(Graphics g)
	{
	//	super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		g.fillOval(20, 20, 10, 10);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}
	
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar())
		{
		case 'a':label.setLocation(label.getX()-10, label.getY());
		break;
		
		case 'w':label.setLocation(label.getX(), label.getY()-10);
		break;
		
		case 's':label.setLocation(label.getX(), label.getY()+10);
		break;
		
		case 'd':label.setLocation(label.getX()+10, label.getY());
		break;
		
		}
		repaint();
		
	}
	
	public void keyPressed(KeyEvent e) {
		
	}

	
	public void keyReleased(KeyEvent e)
	{
		System.out.println(e.getKeyChar());
	}


public static void main( String args[] )
{
	
	GameKeyListener kl = new GameKeyListener();
}
}

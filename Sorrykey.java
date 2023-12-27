import java.awt.*; 
import javax.swing.Timer;
import javafx.scene.control.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Sorrykey extends Sorryrunner implements MouseListener ,KeyListener

{
	
	
	boolean movingblue;
	boolean movingyellow;
	boolean movingred;
	boolean movinggreen;
	
//	 JCheckBox Blue1 = new JCheckBox("Blue1"); 
	    
	int x,y;
	int xg,xr,xw,xb;
	int yg,yr,yb,yw;
	int velX=0;
    int	velY=0;
   // JFrame framekey = new JFrame();
    
   
    
    
    public Sorrykey() 
    {
    	/*
    	 JCheckBox Blue1 = new JCheckBox("Blue1"); 
    	 ActionListener actionListener = new ActionListener() {
 	        public void actionPerformed(ActionEvent actionEvent) {
 	          AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
 	          boolean selected = abstractButton.getModel().isSelected();
 	          System.out.println(selected);
 	        }
 	    };
 	          Blue1.addActionListener(actionListener);
 	          
 	        */ 
   
   
    
    }
    
    public static void main( String args[] )
	{
		Sorrykey skey = new Sorrykey();
	}	
		
		
			
	
	public void actionPerformed(ActionEvent e)
	{
	//	B1.setLocation(e.getX(), e.getY());
		
		
		if (x < 0)
		{
			velX = 0;
			x=0;
		}
		else if (x > 1480)
		{
			velX = 0;
			x=1480;
		}
		if (y < 0)
		{
			velY= 0;
			y=0;
		}
		if (y>1480)
		{
			velY=0;
			y=1480;
		}
		
	/*	x=x+velX;
		y=y+velY;
		
		xb=xb+velX;
		yb=yb+velY;
	
		xw=xw+velX;
		yw=yw+velY;
		
		xr=xr+velX;
		yr=yr+velY;*/
		
	/*	if (Blue1.isSelected() == true)
		{
			movingblue = true;
			System.out.println("Blue pawn selected");
		}*/
		
	//	x=x+velX;
	//	y=y+velY;
		
	//	repaint();
	}
	
	
	
	
	
	
	public void keyTyped(KeyEvent e) {	
		
		/*{
			xw = e.getX();
			yw = e.getY();
			break;
		}*/
		
		/*if (e.getKeyChar()='b')
		{
			xb = e.getX();
			yb = e.getY();
			this.isFocusOwner()=true;
		}
		else
		{
		x = e.getX();
		y = e.getY();
		this.isFocusOwner()=true;
		}*/
		
		/*switch(e.getKeyChar())
		{
		case 'a':label.setLocation(label.getX()-10, label.getY());
		break;
		
		case 'w':label.setLocation(label.getX(), label.getY()-10);
		break;
		
		case 's':label.setLocation(label.getX(), label.getY()+10);
		break;
		
		case 'd':label.setLocation(label.getX()+10, label.getY());
		break;
		
		}*/
		
		
	//	repaint();
	}
	
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyChar());
		/*switch(e.getKeyChar())
		{
		case 'b':movingblue = true;
		break;
		/*{
			xb = e.getX();
			yb = e.getY();
			break;
		}*/
		/*case 'w':movingyellow = true;
		break;
		case 'g': movinggreen = true;
		break;
		case 'r': movingred = true;
		break;
		}*/
		//if (e.getKeyChar()='a')
		//	X=xw;
		//	Y=yw;
		
		
		int c=e.getKeyCode();
		if (c == KeyEvent.VK_LEFT)
		{
			velX= -80;
			velY=0;
		}
		if (c == KeyEvent.VK_RIGHT)
		{
			velX= 80;
			velY=0;
		}
		if (c == KeyEvent.VK_UP)
		{
			velX= 0;
			velY=-80;
		}
			
		if (c == KeyEvent.VK_DOWN)
		{
			velX= 0;
			velY=80;
		}
		
	}

	
	public void keyReleased(KeyEvent e)
	{
		System.out.println(e.getKeyChar());
	}
	
	
	

	
	
	
	public void mouseClicked(MouseEvent e) 
	{
		//nothing to do here
		//grabbing the mouse click
		//getting the x and y
		Component selected = e.getComponent();
		System.out.println(selected);
		if (selected==getComponentAt(xw, yw) 
		
		
		{
			System.out.println("yellow");
			xw = e.getX();
			yw = e.getY();
		}
	         	else if (selected==getComponentAt(xr, yr))
	
		{
			System.out.println("red");
			xr = e.getX();
			yr = e.getY();
		}
		else if (selected==getComponentAt(x, y))
	
			{
			System.out.println("green");
			x = e.getX();
			y = e.getY();
			}
		else if (selected==getComponentAt(xb, yb) 
	//		else if (movingblue == true)
		//	if (Blue1.isSelected() == true)
			{
			System.out.println("blue");
			xb = e.getX();
			yb = e.getY();
			}
		
			repaint();
	}
	
		
	/*Component selected = e.getComponent();
	if (selected==getComponentAt(xb, yb))
	{
		xb = e.getX();
		yb = e.getY();
		}
	else if (selected==getComponentAt(xr, yr))
	{
		xr = e.getX();
		yr = e.getY();
		}
	
		else*/
		
	/*	this.getComponentAt(e.getX(),e.getY());
	//	if (this.isFocusOwner()==true)
	//	if (e.getKeyChar()='b')
		if (xb == e.getX() && yb == e.getY())
		{
			xb = e.getX();
			yb = e.getY();
		}*/
		
	//	window.setColor(Color.MAGENTA);
	//	window.fillRect(x,y,40,40);
		//moveCoin(x,y);
	
		
		// code from another project:
//		int rLoc = x/(SCALE); //+ OFFSET);
//		int cLoc = y/(SCALE); //+ OFFSET);
//		//int rLoc = ((y-100)/SCALE);
//		//int cLoc = ((x-100)/SCALE);	
//		
//		//change changeBlob
//		//to recursively remove a blob
//		//if a blob is present at current loc
//		changeBlob(rLoc,cLoc);
//
//
//		//leave this alone
//		repaint();
//	}
	

	
	
	
	
	//these methods are part of the MouseListener interface as we are implementing the MouseListener interface 
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e) {}	

}

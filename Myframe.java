import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.*;
import java.awt.Desktop.Action;

import javafx.scene.control.*;
import java.awt.geom.AffineTransform;

import java.util.Collections;
import java.awt.event.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Color;



public class Myframe extends JFrame {
	
private int[][] grid;	
private int x;
private int y;
ArrayList<Image> deck = new ArrayList<Image>();
public static final int SCALE = 80;


int xg,xr,xw,xb;
int yg,yr,yb,yw;
int velX=0;
int	velY=0;
//JPanel mypanel;

JLabel blue1;

//implementing key binding to move pawns 
/*Action upAction;
Action downAction;
Action leftAction;
Action rightAction;*/

	
	Myframe(){
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1480, 1480);
		this.setLocationRelativeTo(null);
		
		
	//	JPanel mypanel = new JPanel();
	//	this.add(mypanel);
	//	this.setGlassPane(mypanel);
	//	this.getGlassPane().setVisible(true);
		
		this.setVisible(true);
		
		
		
		//Adding JLabel blue1 as a pawn 
	/*	blue1 = new JLabel();
		blue1.setBackground(Color.MAGENTA);
		
		blue1.setBounds(100, 810, 50, 50);
	//	blue1.setLocation(40, 890);
		blue1.setOpaque(true);
		blue1.setForeground(Color.MAGENTA);
		blue1.setFocusable(true);
		
		mypanel.add(blue1);*/
	//	add(mypanel);
	//	mypanel.repaint();
		
		//implementing key binding to move pawns
	/*	upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();

		blue1.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
		blue1.getActionMap().put("upAction", upAction);
		
	
		
		blue1.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "down");
		blue1.getActionMap().put("down", downAction);
		blue1.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "left");
		blue1.getActionMap().put("left", leftAction);
		blue1.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "right");
		blue1.getActionMap().put("right", rightAction);
		*/
		
		
		JButton button = new JButton();
		
	//	int q=(int)(Math.random() * 12);
	//	ImageIcon icon = new ImageIcon(deck.get(q));
	//	button.setIcon(icon);
		button.setVisible(true);
		Box box = Box.createHorizontalBox();
		box.add(button);
		box.setLocation(400, 400);
		box.setVisible(true);
		box.setEnabled(true);
		
		
		//testing
	//	this.add(box);
		
		
		JFrame frame1 = new JFrame();
		frame1.add(box);
		//frame1.setBackground(bgColor);
		frame1.setSize(400,400);
	//	frame1.setBounds(500, 500, 450, 500);	
		frame1.setBounds(350, 560, 600, 420);
		
		
		
	//	frame1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
	//	frame1.setUndecorated(true);
		frame1.setAlwaysOnTop(true);
		
		
		JButton advance = new JButton();
		advance.setVisible(true);
		advance.getForeground();
		advance.setText("CLICK FOR NEXT CARD");
		 Box box1 = Box.createHorizontalBox();
	//	 box1.add(advance);
		 box.add(advance);
		
		
		 
		advance.addActionListener(new ActionListener()
				{
					
					
					public void actionPerformed(ActionEvent e)
						{
							//advanceImage();
						int i=(int)(Math.random() * 12);
					//	i = i + 1;
					//	for (int i = 1; i < deck.size(); i++) 
						{
							ImageIcon icon = new ImageIcon(deck.get(i));
							 button.setIcon(icon);
							 
						}
						}
				});
		
		
		

				
				
		}
	
	
	
	
	
	public static void main( String args[] )
	{
		Myframe mf = new Myframe();
	}
	
	
	/*
	 //CLASSES TO IMPLEMENT KEY BINDINGS
	
	public class UpAction extends AbstractAction{
		
		public void actionPerformed(ActionEvent e) {
			
			blue1.setLocation(blue1.getX(), blue1.getY()-80);
		
		
		}
	}
	
	public class DownAction extends AbstractAction{
		
		public void actionPerformed(ActionEvent e) {
			
			
			blue1.setLocation(blue1.getX(), blue1.getY()+80);
		
		}
	}

	public class LeftAction extends AbstractAction{
	
	public void actionPerformed(ActionEvent e) {
		
		blue1.setLocation(blue1.getX()-80, blue1.getY());
	
	
	}
	}
	public class RightAction extends AbstractAction{
	
	public void actionPerformed(ActionEvent e) {
		
		blue1.setLocation(blue1.getX()+80, blue1.getY());
	
	
	}
	}

*/

	

	public void paint( Graphics window )
	{
		

//      pass in a Graphics and a color
		drawGrid(window,Color.BLACK);
		
		 x=1120;
		    y=360;
		    
		    xg=1240;
		    yg=200;
		    
		    xr=840;
		    yr = 1240;
		    
		    xw=360;
		    yw=40;
		    
		    xb=40;
		    yb=890;
		    
		    int velX=0;
		    int	velY=0;
		
	}
	
	
	
	
	
	public void drawGrid( Graphics window, Color col )
	{
		//draw the squares 
		window.setColor(col);
		
			int u = 0;
			int v = 0;
				
		for (int m = 0; m < 16; m++) 
		{
			for (int n = 0; n < 16; n++) 
			{
				window.drawRect(u,v,SCALE,SCALE);
				v = v + SCALE ;//+ OFFSET;
			}
			v = 0;
			u = u + SCALE ;//+ OFFSET;
		
		}
		window.setColor(Color.LIGHT_GRAY);
		window.fillRect(81, 81, 1119, 1119);
		
		Graphics2D d=(Graphics2D) window;
		AffineTransform at = new AffineTransform();
		
		
		
		
		String sorr = "Sorry!";
		Font nice = new Font("Serif",Font.BOLD,150);
		d.setFont(nice);
		window.setColor(Color.BLACK);
		window.drawString(sorr, 440, 440);
		window.drawString(sorr, 448, 440);
		window.drawString(sorr, 444, 444);
		window.drawString(sorr, 444, 436);
		window.setColor(Color.ORANGE);
		window.drawString(sorr, 444, 440);
		
		//draw the safety zones
		
		for (int a = 80; a < 481; a=a + 80) {
			window.setColor(Color.YELLOW);
			window.fillRect(160, a, 80, 80);
			window.setColor(Color.BLACK);
			window.drawRect(160, a, 80, 80);
		}
		
		for (int a = 720; a < 1121; a=a + 80) {
			window.setColor(Color.RED);
			window.fillRect(1040, a, 80, 80);
			window.setColor(Color.BLACK);
			window.drawRect(1040, a, 80, 80);
		}
		
		for (int a = 80; a < 481; a=a + 80) {
			window.setColor(Color.BLUE);
			window.fillRect(a, 1040, 80, 80);
			window.setColor(Color.BLACK);
			window.drawRect(a, 1040, 80, 80);
		}
		
		for (int a = 720; a < 1121; a=a + 80) {
			window.setColor(Color.GREEN);
			window.fillRect(a, 160, 80, 80);
			window.setColor(Color.BLACK);
			window.drawRect(a, 160, 80, 80);
		}
		
		//draw the starts
		
		window.setColor(Color.YELLOW);
		window.fillOval(240,80,240,240);
		window.setColor(Color.BLACK);
		window.drawOval(240,80,240,240);
		
		window.setColor(Color.RED);
		window.fillOval(800,960,240,240);
		window.setColor(Color.BLACK);
		window.drawOval(800,960,240,240);
		
		window.setColor(Color.BLUE);
		window.fillOval(80,800,240,240);
		window.setColor(Color.BLACK);
		window.drawOval(80,800,240,240);
		
		window.setColor(Color.GREEN);
		window.fillOval(960,240,240,240);
		window.setColor(Color.BLACK);
		window.drawOval(960,240,240,240);
		
		//draw the homes
		
		window.setColor(Color.YELLOW);
		window.fillOval(80,550,240,240);
		window.setColor(Color.BLACK);
		window.drawOval(80,550,240,240);
			//window.fillRect(120, 40,10 ,320);
		
		String stry = "HOME";
		String strys = "START";
		Font f = new Font("Serif",Font.BOLD,50);
		at.setToRotation(Math.PI);
		Font rotatedFont = f.deriveFont(at);
		d.setFont(rotatedFont);
		window.drawString(stry, 300, 650);
		window.drawString(strys, 420,200);
		
			//d.setStroke(new BasicStroke(10));
		
		
		window.setColor(Color.RED);
		window.fillOval(960,490,240,240);
		window.setColor(Color.BLACK);
		window.drawOval(960,490,240,240);
		
			//at.setToRotation(Math.PI);
			//Font rotatedFont = f.deriveFont(at);
		d.setFont(f);
		window.drawString(stry, 1000, 630);
		window.drawString(strys, 840,1100);
		
		window.setColor(Color.BLUE);
		window.fillOval(550,960,240,240);
		window.setColor(Color.BLACK);
		window.drawOval(550,960,240,240);
		
		at.setToRotation(Math.PI/2);
		rotatedFont = f.deriveFont(at);
		d.setFont(rotatedFont);
		window.drawString(stry, 660, 980);
		window.drawString(strys, 180,860);
		
		window.setColor(Color.GREEN);
		window.fillOval(490,80,240,240);
		window.setColor(Color.BLACK);
		window.drawOval(490,80,240,240);
		
		at.setToRotation((Math.PI/2)*3);
		rotatedFont = f.deriveFont(at);
		d.setFont(rotatedFont);
		window.drawString(stry, 600, 280);
		window.drawString(strys, 1080,460);
		
		
		//draw slides
		
		window.setColor(Color.BLUE);
		window.fillRect(30, 200,20 ,320);
		window.setColor(Color.BLACK);
		window.drawRect(30, 200,20 ,320);
		window.setColor(Color.BLUE);
		window.fillOval(20, 180, 40, 40);
		int[] xPoints1 = {40,10,70};  
		int[] yPoints1 = {510,530,530};                   
		window.fillPolygon(xPoints1,yPoints1,3);
		window.setColor(Color.BLACK);
		window.drawOval(20, 180, 40, 40);                   
		window.drawPolygon(xPoints1,yPoints1,3);
		
		window.setColor(Color.BLUE);
		window.fillRect(30, 760,20 ,320);
		window.setColor(Color.BLACK);
		window.drawRect(30, 760,20 ,320);
		window.setColor(Color.BLUE);
		window.fillOval(20, 740, 40, 40);  
		int[] yPoints2 = {1070,1090,1090};                   
		window.fillPolygon(xPoints1,yPoints2,3);
		window.setColor(Color.BLACK);
		window.drawOval(20, 740, 40, 40);                   
		window.drawPolygon(xPoints1,yPoints2,3);
		
		window.setColor(Color.GREEN);
		window.fillRect(1230, 200,20 ,320);
		window.setColor(Color.BLACK);
		window.drawRect(1230, 200,20 ,320);
		window.setColor(Color.GREEN);
		window.fillOval(1220, 500, 40, 40);
		int[] xPoints2 = {1240,1210,1270};    
		int[] yPoints3 = {210, 190, 190};
		window.fillPolygon(xPoints2,yPoints3,3);
		window.setColor(Color.BLACK);
		window.drawOval(1220, 500, 40, 40);                   
		window.drawPolygon(xPoints2,yPoints3,3);
		
		window.setColor(Color.GREEN);
		window.fillRect(1230, 760,20 ,320);
		window.setColor(Color.BLACK);
		window.drawRect(1230, 760,20 ,320);
		window.setColor(Color.GREEN);
		window.fillOval(1220, 1060, 40, 40);    
		int[] yPoints4 = {770, 750, 750};
		window.fillPolygon(xPoints2,yPoints4,3);
		window.setColor(Color.BLACK);
		window.drawOval(1220, 1060, 40, 40);                   
		window.drawPolygon(xPoints2,yPoints4,3);
		
		window.setColor(Color.YELLOW);
		window.fillRect(200, 30,320 ,20);
		window.setColor(Color.BLACK);
		window.drawRect(200, 30,320 ,20);
		window.setColor(Color.YELLOW);
		window.fillOval(500, 20, 40, 40);
		int[] xPoints3 = {210,190,190};
		int[] yPoints5 = {40,10,70};                     
		window.fillPolygon(xPoints3,yPoints5,3);
		window.setColor(Color.BLACK);
		window.drawOval(500, 20, 40, 40);                   
		window.drawPolygon(xPoints3,yPoints5,3);
		
		window.setColor(Color.YELLOW);
		window.fillRect(760, 30,320 ,20);
		window.setColor(Color.BLACK);
		window.drawRect(760, 30,320 ,20);
		window.setColor(Color.YELLOW);
		window.fillOval(1060, 20, 40, 40);
		int[] xPoints4 = {770,750,750};                                        
		window.fillPolygon(xPoints4,yPoints5,3);
		window.setColor(Color.BLACK);
		window.drawOval(1060, 20, 40, 40);                   
		window.drawPolygon(xPoints4,yPoints5,3);
		
		window.setColor(Color.RED);
		window.fillRect(200, 1230,320 ,20);
		window.setColor(Color.BLACK);
		window.drawRect(200, 1230,320 ,20);
		window.setColor(Color.RED);
		window.fillOval(180, 1220, 40, 40);
		int[] xPoints5 = {510,530,530};
		int[] yPoints6 = {1240,1210,1270};                     
		window.fillPolygon(xPoints5,yPoints6,3);
		window.setColor(Color.BLACK);
		window.drawOval(180, 1220, 40, 40);                   
		window.drawPolygon(xPoints5,yPoints6,3);
		
		window.setColor(Color.RED);
		window.fillRect(760, 1230,320 ,20);
		window.setColor(Color.BLACK);
		window.drawRect(760, 1230,320 ,20);
		window.setColor(Color.RED);
		window.fillOval(740, 1220, 40, 40);
		int[] xPoints6 = {1070,1090,1090};                                        
		window.fillPolygon(xPoints6,yPoints6,3);
		window.setColor(Color.BLACK);
		window.drawOval(740, 1220, 40, 40);                   
		window.drawPolygon(xPoints6,yPoints6,3);
		
		
		//cards play
		getnextcard();
		
	//	keyTyped(e);
		
	
	
		
		
		//end cards play
		
		
	//	frame1.setAlwaysOnTop(true);
	
		//pawn with outline
		window.setColor(Color.GREEN);
		window.fillOval(x-20,y-20,40,40);
		window.setColor(Color.BLACK);
		window.drawOval(x-20, y-20, 40, 40);
		
	//	window.setColor(Color.GREEN);
	//	window.fillOval(xg,yg,40,40);
		
		window.setColor(Color.BLUE);
		window.fillOval(xb,yb,40,40);
		window.setColor(Color.BLACK);
		window.drawOval(xb, yb, 40, 40);
		
		window.setColor(Color.RED);
		window.fillOval(xr,yr,40,40);
		window.setColor(Color.BLACK);
		window.drawOval(xr, yr, 40, 40);
		
		window.setColor(Color.YELLOW);
		window.fillOval(xw,yw,40,40);
		window.setColor(Color.BLACK);
		window.drawOval(xw, yw, 40, 40);
		
		//added pawn as a JButton....not displaying on frame still
	/*	JButton BP1 = new JButton();
		BP1.setVisible(true);
		BP1.setBounds(880, 100, 80, 80);
		BP1.setForeground(Color.CYAN);
		BP1.getForeground();
		BP1.setText("BP1");
		
		BP1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) 
				{
					// TODO Auto-generated method stub
					super.mousePressed(e);
					int bpawnposx = e.getX();
					int bpawnposy = e.getY();
					System.out.println("TEST");
				}
		});
		Box boxb = Box.createHorizontalBox();
		
		boxb.add(BP1);
		boxb.setLocation(100, 400);
		boxb.setVisible(true);
		boxb.setEnabled(true);
		
		
		this.add(boxb);*/
		
	}
	
	
	public void getnextcard() //throws IOException
	{
		
	
		BufferedImage image1 = null;
	//	System.out.println("in get card");
		//	j.setCurrentDirectory(new File(System.getProperty("user.dir")));
		
		for (int m=0; m <= 12; m++)
		{
			
		
		File Selectfile = new File("D:/Sorry/src/deck/"+m+".PNG");
		
		try {
			image1 = ImageIO.read(Selectfile);
		//	System.out.println("in get card"+Selectfile+"   "+image1);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Card image File not found");
			e1.printStackTrace();
		}
		
	
		
	
		Image imagemin = image1.getScaledInstance(300, 300,java.awt.Image.SCALE_SMOOTH);
		deck.add(imagemin);
		imagemin = null;
		}  //end for reading all 12 images
		
	
	}

	//END CARD SELECTION
	//******************
	
	
	
											
}




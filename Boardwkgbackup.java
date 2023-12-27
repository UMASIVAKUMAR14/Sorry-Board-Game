
import java.awt.*; 
import javafx.scene.control.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;



public class Boardwkgbackup extends Canvas implements MouseListener ,KeyListener
{
	private int[][] grid;	
	private int x;
	private int y;
	ArrayList<Image> deck = new ArrayList<Image>();
	//ArrayList<BufferedImage> deck = new ArrayList<BufferedImage>();
	JLabel label;
	JLabel B1;
	Action movebluepawn;
	
	boolean movingblue;
	boolean movingyellow;
	boolean movingred;
	boolean movinggreen;
	
	 JCheckBox Blue1 = new JCheckBox("Blue1"); 
	    
	
	int xg,xr,xw,xb;
	int yg,yr,yb,yw;
	
	int velXG=0;
    int	velYG=0;
    
    int velXR=0;
    int	velYR=0;
    
    int velXW=0;
    int	velYW=0;
    
    int velXB=0;
    int	velYB=0;
    
    Boolean pawnselected = false;
	Boolean movepawn = false;
	String pawncolortomove;
    
    
	
	public static final int SCALE = 80;
	//public static final int OFFSET = 10;

	public Board( )
	{
		setBackground(Color.WHITE);
		
		//size grid to 10 x 10
		grid = new int[10][10];
		
		//load grid with random numbers
		//use 0 or 1 as the numbers
		//must use Math.random()
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				grid[i][j] = (int)(Math.random()*2);
			}
		}
		
	//	JFrame f = (JFrame) SwingUtilities.getRoot(getParent());
	//	 System.out.println("frame   "+f);
		 
		 
		//leave this alone
		addMouseListener( this );	
	    addKeyListener(this);
	    
	    
	   
	    
	    
	 /*   ActionListener actionListener = new ActionListener() {
	        public void actionPerformed(ActionEvent actionEvent) {
	          AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
	          boolean selected = abstractButton.getModel().isSelected();
	          System.out.println(selected);
	        }
	    };
	          Blue1.addActionListener(actionListener);
	          
	      //    f.add(Blue1);
	    
	    
	      label = new JLabel();
		label.setBounds(0,0,80,80);
		label.setOpaque(true);
		
		label.setBackground(Color.CYAN);
	    
	    //begin add 
	    label.setFocusable(true);*/
	//    setFocusTraversalKeysEnabled(false);
	    
	    x=1120;
	    y=360;
	    
	    xg=1160;
	    yg=360;
	    
	    xr=920;
	    yr =1140;
	    
	    xw=320;
	    yw=120;
	    
	    xb=120;
	    yb=890;
	    
	    int velX=0;
	    int	velY=0;
	}  
	  
		
		

	
	
	
	
	
	
	

	public void paint( Graphics window )
	{
//		window.setColor(Color.BLACK);
//		window.drawString("Visual Blob ", 50, 40);
//		call drawGrid
//      pass in a Graphics and a color
		drawGrid(window,Color.BLACK);
		
		
		
//		int rLoc = ((y-100)/40);
//		int cLoc = ((x-100)/40);
//		window.drawString("" + rLoc + "  " + cLoc, 50, 80);
	}
	
	
	
	
	
	public void drawGrid( Graphics window, Color col )
	{
		addMouseListener(this);	
	    addKeyListener(this);
	    
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
		
		//new add
	/*	label = new JLabel();
		label.setBounds(300,50,80,80);
		label.setOpaque(true);
		
		label.setBackground(Color.CYAN);*/
		
		//end new add
		
		
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
		
	
		
		JButton button = new JButton();
		int q=(int)(Math.random() * 12);
		ImageIcon icon = new ImageIcon(deck.get(q));
		
		button.setIcon(icon);
		button.setVisible(true);
		Box box = Box.createHorizontalBox();
		box.add(button);
		//testing
		
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
		
		
		//end cards play
		
		
		frame1.setAlwaysOnTop(true);
	
		//pawn with outline
		window.setColor(Color.GREEN);
		window.fillOval(xg-20,yg-20,40,40);
		window.setColor(Color.BLACK);
		window.drawOval(xg-20, yg-20, 40, 40);
		addKeyListener(this);
		addMouseListener(this);
		
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
		
	//	window.fillOval(v, v, width, height);
		//add buttons as pawns
		
	//	JButton redpawn= new JButton("R");
		//redpawn.setBounds(1480, 640, 5, 5);
		//window.drawOval(v, v, width, height);
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
	
	
	
	
	
//	public void moveCoin(Graphics window, int xLoc, int yLoc) {
		
//		window.drawOval(xLoc, yLoc, 50,50);
		
//		
//		
//	}
	
											
	
	
	public void actionPerformed(ActionEvent e)
	{

	
		// make sure pawns stay inside the board
		//GREEN
		if (xg < 0)
		{
			velXG = 0;
			xg=0;
		}
		else if (xg > 1480)
		{
			velXG = 0;
			xg=1480;
		}
		if (yg < 0)
		{
			velYG= 0;
			yg=0;
		}
		if (yg>1480)
		{
			velYG=0;
			yg=1480;
		}
		
		//RED
		if (xr < 0)
		{
			velXR = 0;
			xr=0;
		}
		else if (xr > 1480)
		{
			velXR = 0;
			xr=1480;
		}
		if (yr < 0)
		{
			velYR= 0;
			yr=0;
		}
		if (yr>1480)
		{
			velYR=0;
			yr=1480;
		}
		
		
		//BLUE
				if (xb < 0)
				{
					velXB = 0;
					xb=0;
				}
				else if (xb > 1480)
				{
					velXB = 0;
					xb=1480;
				}
				if (yb < 0)
				{
					velYB= 0;
					yb=0;
				}
				if (yb>1480)
				{
					velYB=0;
					yb=1480;
				}
				
				
				//YELLOW
				if (xw < 0)
				{
					velXW = 0;
					xw=0;
				}
				else if (xw > 1480)
				{
					velXW = 0;
					xw=1480;
				}
				if (yw < 0)
				{
					velYW= 0;
					yw=0;
				}
				if (yw>1480)
				{
					velYW=0;
					yw=1480;
				}
				
		xg=xg+velXG;
		yg=yg+velYG;
		
		xb=xb+velXB;
		yb=yb+velYB;
	
		xw=xw+velXW;
		yw=yw+velYW;
		
		xr=xr+velXR;
		yr=yr+velYR;
		
		/*if (Blue1.isSelected() == true)
		{
			movingblue = true;
			System.out.println("Blue pawn selected");
		}*/
		repaint();
	}
	
	
	public void keyTyped(KeyEvent e) {
		
		System.out.println("in key typed"+e.getKeyChar());
		
		
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
		
	/*	switch(e.getKeyChar())
		{
		case 'a':label.setLocation(label.getX()-10, label.getY());
		break;
		
		case 'w':label.setLocation(label.getX(), label.getY()-10);
		break;
		
		case 'z':label.setLocation(label.getX(), label.getY()+10);
		break;
		
		case 's':label.setLocation(label.getX()+10, label.getY());
		break;
		
		}*/
		
		
	//	repaint();
	}
	
	public void keyPressed(KeyEvent e) {
		System.out.println("in key pressed"+e.getKeyChar());
		/*switch(e.getKeyChar())
		{
		case 'b':movingblue = true;
		break;
		/*{
			xb = e.getX();
			yb = e.getY();
			break;
		}*/
	/*	case 'w':movingyellow = true;
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
			velXR= -80;
			velYR=0;
		}
		if (c == KeyEvent.VK_RIGHT)
		{
			velXR= 80;
			velYR=0;
		}
		if (c == KeyEvent.VK_UP)
		{
			velXR= 0;
			velYR=-80;
		}
			
		if (c == KeyEvent.VK_DOWN)
		{
			velXR= 0;
			velYR=80;
		}
		
	
	}

	
	public void keyReleased(KeyEvent e)
	{
		System.out.println("in key released  "+e.getKeyChar());
	}
	
	
	
	
	
	
	
	public void mouseClicked(MouseEvent e) 
	{
		//nothing to do here
		//grabbing the mouse click
		//getting the x and y
		
		
	/*	System.out.println("Mouse clicked on pawn at  "+e.getPoint());
		System.out.println("Yellow pawn at  "+xw+"  "+yw);
		System.out.println("red pawn at  "+xr+"  "+yr);
		System.out.println("blue pawn at  "+xb+"  "+yb);
		System.out.println("green pawn at  "+xg+"  "+yg);
		*/
		
		
		//GENERAL for all pawns
		if (pawnselected == false)
		{
		if ((e.getPoint().getX() > xw-40) && (e.getPoint().getX() < xw+40)  && (e.getPoint().getY() > yw-40)&& (e.getPoint().getY() < yw+40))
		{
		//	System.out.println("yellow");
			pawncolortomove = "YELLOW";
		}
		else if ((e.getPoint().getX() > xr-40) && (e.getPoint().getX() < xr+40)  && (e.getPoint().getY() > yr-40)&& (e.getPoint().getY() < yr+40))
			
		{
			//System.out.println("red");
				pawncolortomove = "RED";
		}
		else if ((e.getPoint().getX() > xg-40) && (e.getPoint().getX() < xg+40)  && (e.getPoint().getY() > yg-40)&& (e.getPoint().getY() < yg+40))
			
		{
			//System.out.println("green");
			pawncolortomove = "GREEN";
		}
		else if ((e.getPoint().getX() > xb-40) && (e.getPoint().getX() < xb+40)  && (e.getPoint().getY() > yb-40)&& (e.getPoint().getY() < yb+40))
			
		{
			//System.out.println("blue");
			pawncolortomove = "BLUE";
		}
		pawnselected = true;
		}
		
		// IF PAWN HAS BEEN SELECTED FOR MOVING	
		else if (pawnselected = true )
		{
			movepawn = true;
			if ( pawncolortomove == "YELLOW")
			{
				xw = e.getX();
				yw = e.getY();
			}
			else if (pawncolortomove == "RED")
			{
			
				xr = e.getX();
				yr = e.getY();
			}
			else if (pawncolortomove == "GREEN")
			{
			
				xg = e.getX();
				yg = e.getY();
			}
			else if (pawncolortomove == "BLUE")
			{
			
				xb = e.getX();
				yb = e.getY();
			}
			pawnselected = false;
			pawncolortomove = "";
	}
		
		
		
		
		//*********************		
	
		
			repaint();
	}
	
		
	
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
	
	
	
//	public void changeBlob( int r, int c )
//	{
//		//base case to make sure r and c are in bounds
//		//also check to see if the current pos is a 1
//
//			//change current pos to 0
//	
//			//recursive calls
//			//up
//			//down
//			//left
//			//right
//		
//		if (r >= 0 && r < 10 && c >= 0 && c < 10 && grid[r][c] == 1)
//		{
//			grid[r][c] = 0;
//			changeBlob(r,c+1);
//			changeBlob(r,c-1);
//			changeBlob(r-1,c);
//			changeBlob(r+1,c);
//		}
//		
//		
//	}
	
	
	
	
	
	//these methods are part of the MouseListener interface
	//as we are implementing the MouseListener interface
	//we must override and implement all of the interface methods
	//even though we are only using the mouseClicked method
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e) {}	
}
}
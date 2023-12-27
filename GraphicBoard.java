import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class GraphicBoard extends JPanel implements ActionListener {
	

	Timer timer = new Timer(1,this);

	int seconds = 10;
	

	public GraphicBoard()
	{
		
	
		timer.start();

	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		repaint();
		
		seconds++;
	
	}

	public void paintComponent(Graphics g)
	{
		int[] xPoints1 = {200,150,250};                   
		int[] yPoints1 = {100,200,200};                    
		int nPoints1 = xPoints1.length;
		
		int[] xPoints2 = {100,200,300};                    
		int[] yPoints2 = {350,200,350};                    
		int nPoints2 = xPoints2.length;
		
		int[] xPoints3 = {50, 200,350};                    
		int[] yPoints3 = {600,350,600};                    
		int nPoints3 = xPoints3.length;
		
		
		int[] xPoints6 = {590,630,670,630}; 
		int[] yPoints6 = {630,590,630,670}; 
		
		
		super.paintComponent(g);
		GradientPaint paint2 = new GradientPaint(0,0,Color.WHITE,750,750,Color.YELLOW);
	
		Color colorme = new Color(250,230,200);
		this.setBackground(colorme);
		
		Graphics2D d=(Graphics2D) g;
		
		GradientPaint paint = new GradientPaint(0,0,Color.WHITE,750,750,Color.CYAN);
	
		
		Color mynewcolor = new Color(80, 30,10);
		d.setColor(mynewcolor);
		d.fillRect(0, 550, 800, 400);
		
		d.setColor(Color.WHITE);
		d.setStroke(new BasicStroke(20));
		
		
		// night sky
		boolean lights_on = false;
		d.setColor(Color.BLACK);
		d.fillRect(60,60,700,120);
		
		if (seconds%2 == 0)
		{
			lights_on = true;
			
		}
		
		//MAPS and STACKS
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		int a=50;
		for (int i=0; i<30; i++)
		{	
			map.put(i, a);
			a=a+100;
		}
		
		
		if (lights_on)
		{
		
			int rnd = (int)(Math.random()* 6)+2; 
			
			Stack<Integer> stack2 = new Stack<Integer>();
			
			for (int j=1; j<8;j++)
			{
				stack2.push(j*100);
				
				d.setColor(Color.WHITE);
				if (rnd%2 == 0)
				{
					d.fillArc((Integer)stack2.pop(),80,rnd,rnd,0,360);
				}
				else
				{
					d.fillArc((Integer)stack2.pop(),100,rnd,rnd,0,360);
				}
			}
			
		}
	
		
		for (int i=1; i < 7;i++)
		{
			if (i%2 == 0)
				d.fillArc(map.get(i), 80, 5, 5, 0, 360);
			else
				d.fillArc(map.get(i), 100, 5, 5, 0, 360);
		}
	
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int j=150; j<800;j=j+100)
		{
			stack.push(j);
			if (j%2 ==0)
			{
			d.fillArc((Integer)stack.pop(), 130, 5, 5, 0, 360);
			}
			else
			d.fillArc((Integer)stack.pop(), 110, 5, 5, 0, 360);
		}
			
		
		
	//	}
		
		d.setColor(Color.RED);
		Stack<Integer> stack4 = new Stack<Integer>();
		
		
		/*	stack4.push(60);
			stack4.push(200);
			stack4.push(340);
			stack4.push(480);
			stack4.push(620);
			
			while (stack4.pop() != null)
			{
			d.fillArc((Integer)stack4.pop(),105,140,140,180,180);
			} */
			
		d.fillArc( 60,105,140,140,180,180);
		d.fillArc(200,105,140,140,180,180);
		d.fillArc(340,105,140,140,180,180);
		d.fillArc(480,105,140,140,180,180);
		d.fillArc(620,105,140,140,180,180);
		
		Color colormy = new Color(200,0,0);
		d.setColor(colormy);
		d.fillRect( 60,175,30, 140);
		d.fillRect(185,175,30, 140);
		d.fillRect(325,175,30, 140);
		d.fillRect(465,175,30, 140);
		d.fillRect(605,175,30, 140);
		d.fillRect(730,175,30, 140);
		
	// 	BEGIN CHRISTMAS TREE
		//christmas tree
		d.setColor(Color.GREEN);
		d.setStroke(new BasicStroke(10));
		d.drawLine(150, 200, 250, 200);
		d.drawLine(150, 200, 200, 100);
		d.drawLine(250, 200, 200, 100);
		d.fillPolygon(xPoints1,yPoints1,3);
		
		
	//	d.setStroke(new BasicStroke(30));
		d.drawLine(100, 350, 300, 350);
		d.drawLine(100, 350, 200, 200);
		d.drawLine(300, 350, 200, 200);
		d.fillPolygon(xPoints2,yPoints2,3);
		
	//	d.setColor(Color.green);
	//
		d.drawLine(50, 600, 350, 600);
		d.drawLine(50, 600, 200, 350);
		d.drawLine(350, 600, 200, 350);
		d.fillPolygon(xPoints3,yPoints3,3);
		
		d.setStroke(new BasicStroke(10));
		Color mycolor = new Color (165,42,42);
		d.setColor(mycolor);
		
		d.fillRect(180, 605, 40, 80);      
		
		//draw ornaments
		boolean lights_on2 = false;
		
		if (seconds%15 == 0)
		{
			lights_on2 = true;
			
		}
		d.setColor(Color.RED);
	
	//	d.drawArc(180, 160, 10, 10, 0, 360);
		
		Colorbulbs bon = new Colorbulbs(10,10,0,360);
		d.drawArc(180,160,bon.w,bon.h,bon.sa,bon.ca);
		d.drawArc(190, 220, bon.w,bon.h,bon.sa,bon.ca);
		d.drawArc(250, 300, bon.w,bon.h,bon.sa,bon.ca);
		d.drawArc(130, 320, bon.w,bon.h,bon.sa,bon.ca);
		d.drawArc(140, 460, bon.w,bon.h,bon.sa,bon.ca);
		d.drawArc(180, 550, bon.w,bon.h,bon.sa,bon.ca);
		d.drawArc(230, 420, bon.w,bon.h,bon.sa,bon.ca);
			
		
			
		
		d.setColor(Color.BLUE);
		d.drawArc(200, 300, 10, 10, 0, 360);
		d.drawArc(210, 480, 10, 10, 0, 360);
		d.drawArc(260, 560, 10, 10, 0, 360);
		
		
		if (lights_on2)
		{
		
		
		d.setColor(Color.YELLOW);
		d.drawArc(200, 120, 10, 10, 0, 360);
		d.drawArc(200, 400, 10, 10, 0, 360);
		d.drawArc(180, 250, 10, 10, 0, 360);
		d.drawArc(120, 570, 10, 10, 0, 360);
		d.drawArc(270, 540, 10, 10, 0, 360);
		
		
		}  //end lights on
	
	  //end CHRISTMAS TREE	
	
	  // box
	
		Color mycolor2 = new Color (21,96,189);
		d.setColor(mycolor2);
		
		d.fillRect(500,500,250,250);
	
		d.setColor(Color.BLACK);
		d.fillArc(580,580,100,100,0,360);
		d.setColor(mycolor2);
	
		 d.setStroke(new BasicStroke(5));
	
	
		d.fillPolygon(xPoints6,yPoints6,4);
		d.setColor(Color.BLACK);
		d.fillArc(618,618,25,25,0,360);
		d.drawLine(630,630,675,630);
		d.setColor(mycolor2);
		d.drawLine(630,635,685,635);
		
		
		
		
		
		 d.setStroke(new BasicStroke(40));
		
		if ((seconds > 100 && seconds < 200) || (seconds > 400 && seconds < 600) || seconds > 800) 
	//	if (seconds % 50 == 0)
		{
			d.setColor(mycolor2);
			//lift lid of gift box
		d.drawLine(500,500,600,300);
		// minion pops out
		d.setColor(Color.YELLOW);
		d.fillArc(590,330,150,150,0,360);
		d.drawLine(612,440,718,440);
		 
		d.drawLine(612,480,718,480);
		d.setColor(Color.BLACK);
		d.setStroke(new BasicStroke(20));
		//eye
		d.fillArc(650,400,20,20,0,360);
		d.setColor(Color.WHITE);
		d.fillArc(660,400,5,5,0,360);
		d.setColor(Color.ORANGE);
		d.setStroke(new BasicStroke(10));
		d.drawArc(645,395,30,30,0,360);
		d.setColor(Color.WHITE);
		d.drawArc(635,385,45,45,0,360);
		
		d.setColor(Color.GRAY);
		d.drawArc(620,370,75,75,0,360);
		
		d.setColor(Color.BLACK);
		d.setStroke(new BasicStroke(20));
		d.drawLine(590,400,610,400);
		d.drawLine(708,400,735,400);
		
		d.setStroke(new BasicStroke(2));
		d.setColor(Color.ORANGE);
		d.drawArc(620,400,75,75,210,120);
		
		// end minion
		
		
	
		
		}
		
		
	
	}
	
	
	

}
